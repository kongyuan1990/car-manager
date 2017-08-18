<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 第一部分：样式文件 -->
<!-- 1.默认主题文件 -->
<link rel="stylesheet" type="text/css"
	href="${ctp}/themes/default/easyui.css" />

<!-- 2.图标的样式文件 -->
<link rel="stylesheet" type="text/css" href="${ctp}/themes/icon.css" />

<!-- 第二部分：JavaScript库文件 -->
<!-- 1.jQuery的库文件——一定要比EasyUI的库文件先引入 -->
<script type="text/javascript" src="${ctp}/js/jquery-2.1.1.min.js"></script>

<!-- 2.EasyUI的主体库文件 -->
<script type="text/javascript" src="${ctp}/js/jquery.easyui.min.js"></script>

<!-- 3.本地化文件 -->
<script type="text/javascript" src="${ctp}/js/easyui-lang-zh_CN.js"></script>

<script type="text/javascript">
	window.setInterval(function() {
		var today = new Date();
		$("#timeDiv").html("北京时间： " + today.toLocaleTimeString());
	}, 1000);

	$(function() {
		$('#rl').calendar({
			current : new Date()
		});
		//北，导航条数据显示
		var _date = new Date();
		var _time = _date.getHours();
		var _text = '';
		if(_time>=6&&_time<9)
			_text = '早上好!';
		else if(_time>=9&&_time<11)
			_text = '上午好!';
		else if(_time>=11&&_time<13)
			_text = '中午好!'
		else if(_time>=13&&_time<17)
			_text = '下午好!';
		else
			_text = '晚上好!';
		var northtitle = "${auth.name},"+_text +"&nbsp&nbsp<a href='${ctp}/exit'>退出</a>";
		$("#northDiv").panel({
			title:northtitle
		})
		var centertitle = "信息&nbsp&nbsp<a href='${ctp}/main.html'>回到主页</a>";
		$("#centerDiv").panel({
			title:centertitle
		})
		
		$('#aa').accordion({
			onSelect: function(title){
				if(title=="个人中心")
					window.location.href="${ctp}/main_auth";
				if(title=="车主认证中心")
					window.location.href="${ctp}/main_carowner";
				if(title=="雇主认证中心")
					window.location.href="${ctp}/main_carport";
				if(title=="欢迎")
					window.location.href="${ctp}/main.html";
				return false;
		  }
		});
	});
</script>