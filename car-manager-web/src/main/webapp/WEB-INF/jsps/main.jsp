<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎</title>
<%@include file="/WEB-INF/common/common-main.jsp"%>
<script type="text/javascript">
	$(function() {
		$("#pp").panel({
			noheader : true
		})
	});
</script>
</head>
<body class="easyui-layout">

	<div id="northDiv"
		data-options="region:'north',title:'智能生活，停车无忧',split:true"
		style="width: 100%;height: 100px; background-image: url(${ctp}/image/3.jpg)">
		<p style="text-align: center; font-size: 20px;">智能泊车管理中心
		<p>
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
			<div id="Title3" title="雇主认证中心"></div>
			<div id="Title4" title="其他"></div>
		</div>
	</div>

	<div id="centerDiv" data-options="region:'center',title:'信息'"
		style="background: #eee;">
		<div id="pp" class="easyui-panel" title="My Panel"
			style="width: 100%; height: 100%; padding: 10px; background: #fafafa; background-image: url(${ctp}/image/1.jpg)">
			<p style="text-align: center; font-size: 30px; font: '宋';">欢迎登陆智能泊车后台系统</p>
			<p style="text-align: center; font-size: 15px;">您上次登陆时间为：${lasttime }</p>
			<p style="text-align: center; font-size: 15px;">本次登陆时间为：${logintime }</p>
			<br><br>
			<p style="text-align: center; font-size: 15px;">智能生活，停车无忧</p>
		</div>
	</div>
</body>
</html>