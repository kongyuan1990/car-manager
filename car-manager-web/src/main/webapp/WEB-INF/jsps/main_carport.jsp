<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="/WEB-INF/common/common-main.jsp" %>
<script type="text/javascript">

	$(function() {

		$("#linkbutton01").linkbutton({
			onClick : function() {
				$("#tt").tabs("select", "待认证雇主")
			}
		});

		$("#linkbutton02").linkbutton({
			onClick : function() {
				$("#tt").tabs("select", "已认证雇主")
			}
		});

		$("#linkbutton03").linkbutton({
			onClick : function() {
				$("#tt").tabs("select", "认证失败雇主")
			}
		});

		$("#dg01,#dg02,#dg03").datagrid(
		{
			ageList : [ 10, 20, 30 ],
			loadFilter : function(data){
				$.each(data.rows,function(index,obj){
					//转换毫秒数
					var milliseconds = parseInt(obj.createtime);
					//转换成日期
					var loginDate = new Date(milliseconds);
					//从新给loginTime赋值
					obj.createtime = loginDate.toLocaleString();
				});
				return data;
			}
		});

		$("#AuthBtn01").linkbutton({
			onClick:function(){
				var data = $("#dg01").datagrid("getSelected");
				if(data){
					$.messager.confirm("提示","确认雇主【"+data.name+"】认证成功吗?",function(result){
						if(result){
							$.ajax({
								url:"${ctp}/portSuccess?id="+data.id,
								success:function(){
									$("#dg01").datagrid("reload");
									$("#dg02").datagrid("reload");
								}
							})	
						}
					})
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
		$("#AuthBtn02").linkbutton({
			onClick:function(){
				var data = $("#dg01").datagrid("getSelected");
				if(data){
					$.messager.confirm("提示","确认雇主【"+data.name+"】认证失败吗?",function(result){
						if(result){
							$.ajax({
								url:"${ctp}/portFail?id="+data.id,
								success:function(){
									$("#dg01").datagrid("reload");
									$("#dg03").datagrid("reload");
								}
							})	
						}
					})
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
		
		
		$("#AuthBtn03").linkbutton({
			onClick:function(){
				var data = $("#dg02").datagrid("getSelected");
				if(data){
					$.messager.confirm("提示","确认雇主【"+data.name+"】认证失败吗?",function(result){
						if(result){
							$.ajax({
								url:"${ctp}/portFail?id="+data.id,
								success:function(){
									$("#dg02").datagrid("reload");
									$("#dg03").datagrid("reload");
								}
							})	
						}
					})
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
		$("#AuthBtn04").linkbutton({
			onClick:function(){
				var data = $("#dg03").datagrid("getSelected");
				if(data){
					$.messager.confirm("提示","确认雇主【"+data.name+"】认证成功吗?",function(result){
						if(result){
							$.ajax({
								url:"${ctp}/portSuccess?id="+data.id,
								success:function(){
									$("#dg03").datagrid("reload");
									$("#dg02").datagrid("reload");
								}
							})	
						}
					})
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
		$("#AuthBtn05").linkbutton({
			onClick:function(){
				var data = $("#dg03").datagrid("getSelected");
				if(data){
					$.messager.confirm("提示","确认删除雇主【"+data.name+"】吗?",function(result){
						if(result){
							$.ajax({
								url:"${ctp}/deletePort?id="+data.id,
								success:function(){
									$("#dg03").datagrid("reload");
									$("#dg02").datagrid("reload");
								}
							})	
						}
					})
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
		$("#AuthBtn06").linkbutton({
			onClick:function(){
				var data = $("#dg01").datagrid("getSelected");
				if(data){
					$("#pg").propertygrid({
						queryParams:{portownerId:data.id}
					})
					$("#win").window("open");
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
		$("#AuthBtn07").linkbutton({
			onClick:function(){
				var data = $("#dg02").datagrid("getSelected");
				if(data){
					$("#pg").propertygrid({
						queryParams:{portownerId:data.id}
					})
					$("#win").window("open");
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
		$("#AuthBtn08").linkbutton({
			onClick:function(){
				var data = $("#dg03").datagrid("getSelected");
				if(data){
					$("#pg").propertygrid({
						queryParams:{portownerId:data.id}
					})
					$("#win").window("open");
				}else{
					$.messager.alert("警告","请选择一位雇主进行操作");
				}
			}
		})
		
	});
	
	function genderFormatter(value,row,index){
		if(value == 0)
			return "女";
	    return "男";        
	}
	
	function imgFormatter(value,row,index){
	    var rvalue = "<img style='width:30px; height:30px;' src='" + value + "'/>";  
	    return rvalue;
	}
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
			<div id="Title1" title="个人中心"></div>
			<div id="Title2" title="车主认证中心"></div>
			<div id="Title3" title="雇主认证中心" selected="true">
				<a id="linkbutton01" class="easyui-linkbutton" style="width: 100%;"
					data-options="iconCls:'icon-search'">待认证雇主</a><br /> <a
					id="linkbutton02" class="easyui-linkbutton" style="width: 100%;"
					data-options="iconCls:'icon-search'">已认证雇主</a><br /> <a
					id="linkbutton03" class="easyui-linkbutton" style="width: 100%;"
					data-options="iconCls:'icon-search'">认证失败雇主</a>
			</div>
			<div id="Title4" title="其他"></div>
		</div>
	</div>

	<div id="centerDiv" data-options="region:'center',title:'信息'"
		style="padding: 5px; background: #eee;">
		<div id="tt" class="easyui-tabs" data-options="fit:true">
			<div id="TableOneBtn" title="待认证雇主">
				<table id="dg01" class="easyui-datagrid" style="width: 400px; height: 250px"
					data-options="url:'${ctp}/getunAuthPorts',fit:true,fitColumns:true,singleSelect:true,pagination:true,
					toolbar:'#tb01',rownumbers:true">
					<thead>
						<tr>
							<th data-options="field:'id'">编码</th>
							<th data-options="field:'name'">姓名</th>
							<th data-options="field:'gender',formatter:genderFormatter">性别</th>
							<th data-options="field:'email'">邮箱</th>
							<th data-options="field:'phoneNumber'">手机号</th>
							<th data-options="field:'createtime'">创建时间</th>
							<th data-options="field:'iconpath',align:'center',formatter:imgFormatter">头像预览</th> 
						</tr>
					</thead>
				</table>
			</div>
			<div id="TableTwoBtn" title="已认证雇主">
				<table id="dg02" class="easyui-datagrid" style="width: 400px; height: 250px"
					data-options="url:'${ctp}/getAuthPorts',fit:true,fitColumns:true,singleSelect:true,pagination:true,
					toolbar:'#tb02',rownumbers:true">
					<thead>
						<tr>
							<th data-options="field:'id'">编码</th>
							<th data-options="field:'name'">姓名</th>
							<th data-options="field:'gender',formatter:genderFormatter">性别</th>
							<th data-options="field:'email'">邮箱</th>
							<th data-options="field:'phoneNumber'">手机号</th>
							<th data-options="field:'createtime'">创建时间</th>
						</tr>
					</thead>
				</table>
			</div>
			<div id="TableThreeBtn" title="认证失败雇主">
				<table id="dg03" class="easyui-datagrid" style="width: 400px; height: 250px"
					data-options="url:'${ctp}/getfailedAuthPorts',fit:true,fitColumns:true,singleSelect:true,pagination:true,
					toolbar:'#tb03',rownumbers:true">
					<thead>
						<tr>
							<th data-options="field:'id'">编码</th>
							<th data-options="field:'name'">姓名</th>
							<th data-options="field:'gender',formatter:genderFormatter">性别</th>
							<th data-options="field:'email'">邮箱</th>
							<th data-options="field:'phoneNumber'">手机号</th>
							<th data-options="field:'createtime'">创建时间</th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
	
	<div id="tb01">
		<a id="AuthBtn01" class="easyui-linkbutton" data-options="iconCls:'icon-ok',plain:true">认证通过</a> 
		<a>|</a>
		<a id="AuthBtn02" class="easyui-linkbutton" data-options="iconCls:'icon-no',plain:true">认证不通过</a>
		<a>|</a>
		<a id="AuthBtn06" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true">查看用户停车场资料</a>
	</div>
	
	<div id="tb02">
		<a id="AuthBtn03" class="easyui-linkbutton" data-options="iconCls:'icon-no',plain:true">认证失败</a>
		<a>|</a>
		<a id="AuthBtn07" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true">查看用户停车场资料</a>
	</div>
	
	<div id="tb03">
		<a id="AuthBtn04" class="easyui-linkbutton" data-options="iconCls:'icon-ok',plain:true">认证成功</a>
		<a>|</a>
		<a id="AuthBtn05" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
		<a>|</a>
		<a id="AuthBtn08" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true">查看用户停车场资料</a>
	</div>

	<!-- 	弹窗1 -->
	<div id="win" class="easyui-window" title="车库信息预览"
		style="width: 400px; height: 350px; text-align: center;"
		data-options="collapsible:false,minimizable:false,maximizable:false,closed:true,modal:true">
		<table id="pg" class="easyui-propertygrid" style="width:100%;height: 100%"   
        data-options="url:'${ctp}/ownerport',showGroup:true"></table>  
	</div>
</body>
</html>