<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页模型1</title>
<%@include file="/WEB-INF/common/common-js.jsp" %>
<%@include file="/WEB-INF/common/common-css.jsp" %>
</head>
<body class="easyui-layout">   
	<div data-options="region:'west',title:'West',split:true" style="width: 250px;">

		<div id="leftBtn" class="easyui-accordion"
			style="width: 100%; height: 100%;">
			<div title="Num1" data-options="iconCls:'icon-save'"
				style="overflow: auto; padding: 0;">
				
				<a id="btn1" class="easyui-linkbutton"
				data-options="iconCls:'icon-search'"
				
				 style="width: 100%;color: red;background: gray;">tab1</a><br/>
				<a id="btn2" class="easyui-linkbutton" 
				
				data-options="iconCls:'icon-search'"
				style="width: 100%;color: blue;background: gray;">tab2</a><br/>
				<a id="btn3" class="easyui-linkbutton" 
				data-options="iconCls:'icon-search'"
				style="width: 100%;color: green;background: gray;">tab3</a><br/>
				
			</div>
			
			<div title="Num2"
				data-options="iconCls:'icon-reload'"
				style="padding: 10px;">content2</div>
				
			<div title="Num3" data-options="iconCls:'icon-help'"
				style="padding: 10px;">content3</div>
		</div>


	</div>
	<div data-options="region:'center',title:'center title'" style="background:#eee;">
		<div id="tabs" class="easyui-tabs" data-options="fit:true,selected:0">   
		    <div title="Tab1" data-options="loadingMessage: '正在加载数据......'" >   
		        <table id="pageData"> </table>    
		    </div>   
		    <div title="Tab2"  data-options="loadingMessage: '正在加载数据......'" style="font-size: 30px;font-family:华文楷体;">   
		        tab2    
		    </div>   
		    <div title="Tab3" data-options="loadingMessage:'正在加载数据......'" style="font-size: 50px;">   
		        <table id="simpleData"> </table>   
		    </div>   
		</div> 
	</div>  
</body> 

</html>