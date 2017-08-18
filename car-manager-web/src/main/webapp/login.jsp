<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>主页模型1</title>

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${ctp }/css/bootstrap.min.css">
<link href="${ctp }/css/signin.css" rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${ctp }/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${ctp }/js/bootstrap.min.js"></script>
<script src="${ctp }/js/jquery.validate.js"></script>

</head>
<body>
	<div class="container">

      <form id="signupForm" class="form-signin" action="${ctp }/login" method="post">
        <h4 class="form-signin-heading">欢迎登陆智能泊车后台</h4><br>
        <span style="color: red;">${msg}</span>
        <label for="inputName" class="sr-only">账号</label>
        <input type="name" id="inputName" name="name" class="form-control" placeholder="输入账号" required>
        <br>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="输入密码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me">记住我
          </label>
        </div>
        <button id="loginBtn" class="btn btn-lg btn-primary btn-block" type="submit">确认</button>
      </form>
      <p class="form-signin">账号密码有误？<a id="aBtn">请联系管理员</a></p>
    </div>
	<script type="text/javascript">
		$("#aBtn").click(function(){
			alert("管理员联系方式：\n电话：15171478650\nQQ:89898901");
			return false;
		});
	</script>
</body>

</html>