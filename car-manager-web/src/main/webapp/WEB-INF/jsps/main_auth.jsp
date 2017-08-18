<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人中心</title>
<%@include file="/WEB-INF/common/common-main.jsp"%>
<script type="text/javascript">

	$(function() {

		$("#ff").form({
			success : function() {
				$("#win").window("close");
				$("#dg01").datagrid("reload");
			}
		});
		
		$("#win").window({
			onClose : function() {
				$("#ff").form("clear");
			}
		});

		$("#linkbutton01").linkbutton({
			onClick : function() {
				$("#tt").tabs("select", "个人资料");
			}
		});

		$("#linkbutton02").linkbutton({
			onClick : function() {
				$("#tt").tabs("select", "员工列表");
			}
		});

		$("#dg01").datagrid({
				pageList : [ 10, 20, 30 ],
				loadFilter : function(data){
					$.each(data.rows,function(index,obj){
						if(obj.loginTime){
							//转换毫秒数
							var milliseconds = parseInt(obj.loginTime);
							//转换成日期
							var loginDate = new Date(milliseconds);
							//从新给loginTime赋值
							obj.loginTime = loginDate.toLocaleString();
						}else{
							obj.loginTime="未登录过";	
						}
					})
					return data;
				}
			});

		$("#saveBtn").linkbutton({
			onClick : function() {
				$("#ff").form("submit");
			}
		})
		
		$("#addAuthBtn").linkbutton({
			onClick : function(){
				$("#ff").form({
					url:"${ctp}/addAuth"
				});
				$("#win").window("open");
			}
		})
		
		$("#editAuthBtn").linkbutton({
			onClick : function(){
				var data = $("#dg01").datagrid("getSelected");
				if(data){
					$("#ff").form("load",data);
					$("#ff").form({
						url:"${ctp}/editAuth"
					});
					$("#win").window("open");
				}else{
					$.messager.alert("警告","请选择一条信息再进行此操作！")
				}
			}
		})
		
		$("#removeAuthBtn").linkbutton({
			onClick : function(){
				var data = $("#dg01").datagrid("getSelected");
				if(data){
					$.messager.confirm("您正在删除一天信息","您确定要删除员工"+data.name+"吗？",function(result){
						if(result){
							$.get("${ctp}/deleteAuth?id="+data.id,function(){
								$("#dg01").datagrid("reload");
							});
						}
					})
				}else{
					$.messager.alert("警告","请选择一条信息再进行此操作！")
				}
			}
		})
		
		$("#aBtn01").linkbutton({
			onClick : function(){
				$("#ff02").form("load",{id:${auth.id},name:"${auth.name}",password:"${auth.password}",email:"${auth.email}",phone:"${auth.phone}"});
				$("#ff02").form({
					url:"${ctp}/editAuthself"
				});
				$("#win02").window("open");
			}
		});
		
		$("#saveBtn02").linkbutton({
			onClick : function() {
				$("#ff02").form("submit");
			}
		})
		
		$("#ff02").form({
			success : function() {
				$("#win02").window("close");
				location.href = "${ctp}/main_auth";
			}
		});
		
		$('#ss').searchbox({ 
			searcher:function(value,name){ 
				$.ajax({
					url:"${ctp}/searchAuth?name="+name+"&value="+value,
					success: function(data){
						if(data.searchAuth){
							var total = $("#dg01").datagrid("getPager").pagination("options").total;
							
							$("#dg01").datagrid({
								queryParams:{pageNum:data.pageNum},
								onLoadSuccess:function(){
									if(data.row)
										$("#dg01").datagrid("selectRow",data.row);
								}
							});
							
							$("#dg01").datagrid("getPager").pagination("refresh",{
								total: total,
								pageNumber: data.pageNum
							});
							$("#dg01").datagrid("options").queryParams = null;
							console.log($("#dg01").datagrid("options").queryParams);
						}else{
							$.messager.alert("搜索结果","未找到符合条件的员工")
						}
					}
				})
			}
		});
		
	});
</script>

</head>
<body class="easyui-layout">
	
	<div id="northDiv"
		data-options="region:'north',title:'智能生活，停车无忧',split:true"
		style="height: 100px; background-image: url(${ctp}/image/3.jpg)">
		<p style="text-align: center; font-size: 20px;">智能泊车管理中心<p>
	</div>

	<div id="eastDiv" data-options="region:'east',title:'日历',split:true"
		style="width: 180px;">
		<div id="rl" style="width: 180px; height: 180px;"></div>
	</div>

	<div id="southDiv" data-options="region:'south',split:true"
		style="height: 40px;">
		<div style="text-align: center;">&copy;版权归智能泊车集团所有</div>
		<div id="timeDiv" style="float: right; padding-right: 10px;"></div>
	</div>

	<div id="westDiv" data-options="region:'west',title:'选项',split:true"
		style="width: 150px;">
		<div id="aa" class="easyui-accordion" data-options="fit:true">
			<div id="Title0" title="欢迎"></div>
			<div id="Title1" title="个人中心" selected="true">
				<a id="linkbutton01" title="个人资料" class="easyui-linkbutton" style="width: 100%;"
					data-options="iconCls:'icon-search'">个人资料</a><br /> 
				<a id="linkbutton02" title="员工列表" class="easyui-linkbutton" style="width: 100%;"
					data-options="iconCls:'icon-search'">员工列表</a>
			</div>
			<div id="Title2" title="车主认证中心"></div>
			<div id="Title3" title="雇主认证中心"></div>
			<div id="Title4" title="其他"></div>
		</div>
	</div>

	<div id="centerDiv" data-options="region:'center',title:'信息'"
		style="padding: 5px; background: #eee;">
		<div id="tt" class="easyui-tabs" data-options="fit:true">
			<div id="TableOneBtn" title="个人资料">
				<p style="text-align: left; font-size: 15px; font-family: '黑体'; padding-left: 10px; padding-bottom: 10px">编号：${auth.id}</p>
				<p style="text-align: left; font-size: 15px; font-family: '黑体'; padding-left: 10px; padding-bottom: 10px">姓名：${auth.name}</p>
				<p style="text-align: left; font-size: 15px; font-family: '黑体'; padding-left: 10px; padding-bottom: 10px">邮箱：${auth.email}</p>
				<p style="text-align: left; font-size: 15px; font-family: '黑体'; padding-left: 10px; padding-bottom: 10px">电话：${auth.phone}</p>
				<p style="text-align: left; font-size: 15px; font-family: '黑体'; padding-left: 10px; padding-bottom: 10px">
					个人资料有误？<a id="aBtn01" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
				</p>

			</div>
			<div id="TableTwoBtn" title="员工列表">
				<table id="dg01" class="easyui-datagrid"
					style="width: 400px; height: 250px"
					data-options="url:'${ctp}/getAuths',fit:true,fitColumns:true,singleSelect:true,pagination:true,
					toolbar:'#tb'">
					<thead>
						<tr>
							<th data-options="field:'id',align:'center'">编号</th>
							<th data-options="field:'name',align:'center'">姓名</th>
							<th data-options="field:'email',align:'center'">邮箱</th>
							<th data-options="field:'phone',align:'center'">电话</th>
							<th data-options="field:'loginTime',align:'center'">最后登陆时间</th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
	<div id="tb">
		<a id="addAuthBtn" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">增加</a> 
		<a>|</a>
		<a id="editAuthBtn" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
		<a>|</a>
		<a id="removeAuthBtn" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
		<a>|</a>
		<input id="ss" class="easyui-searchbox" style="width:150px" 
		data-options="prompt:'输入搜索条件',menu:'#mm'"></input> 
		<div id="mm" style="width:120px"> 
			<div data-options="name:'id'">编号</div> 
			<div data-options="name:'name'">姓名</div> 
			<div data-options="name:'email'">邮箱</div> 
			<div data-options="name:'phone'">电话</div> 
		</div> 
	</div>

	<!-- 	弹窗1 -->
	<div id="win" class="easyui-window"
		style="width: 400px; height: 280px; text-align: center; padding-top: 30px;"
		data-options="collapsible:false,minimizable:false,maximizable:false,closed:true,modal:true">
		<form id="ff" method="post">
			<div>
				<label for="id">编号:</label> <input readonly="readonly"
					class="easyui-validatebox" type="text" name="id" />
			</div>
			<br />
			<div>
				<label for="name">姓名:</label> <input class="easyui-validatebox"
					type="text" name="name" />
			</div>
			<br />
			<div>
				<label for="email">邮箱:</label> <input class="easyui-validatebox"
					type="text" name="email" />
			</div>
			<br />
			<div>
				<label for="phone">电话:</label> <input class="easyui-validatebox"
					type="text" name="phone" />
			</div>
			<br />
			<br /> <a id="saveBtn" class="easyui-linkbutton" style="width: 80px"
				data-options="iconCls:'icon-search'">确认</a>
		</form>

	</div>
	
	<!-- 	弹窗2 -->
	<div id="win02" class="easyui-window"
		style="width: 400px; height: 320px; text-align: center; padding-top: 30px;"
		data-options="collapsible:false,minimizable:false,maximizable:false,closed:true,modal:true">
		<form id="ff02" method="post">
			<div>
				<label for="id">编号:</label> <input readonly="readonly"
					class="easyui-validatebox" type="text" name="id" />
			</div>
			<br />
			<div>
				<label for="name">姓名:</label> <input class="easyui-validatebox"
					type="text" name="name" />
			</div>
			<br />
			<div>
				<label for="password">密码:</label> <input class="easyui-validatebox"
					type="text" name="password" />
			</div>
			<br />
			<div>
				<label for="email">邮箱:</label> <input class="easyui-validatebox"
					type="text" name="email" />
			</div>
			<br />
			<div>
				<label for="phone">电话:</label> <input class="easyui-validatebox"
					type="text" name="phone" />
			</div>
			<br />
			<br /> <a id="saveBtn02" class="easyui-linkbutton" style="width: 80px"
				data-options="iconCls:'icon-search'">确认</a>
		</form>

	</div>
</body>
</html>