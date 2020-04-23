<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="css/indexstyle.css" rel="stylesheet" type="text/css">
<link href="css/denglu.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="top">
 <div class="topBox"> <img class="logo" src="images/logo.png">  
</div>
<div class="nav">
  <div class="navBox"> 
	  <a href="index.html">首页</a>
	  <a href="hanfu.html">汉服</a>
	  <a href="minsu.html">民俗</a></div>
	  <span class="nav_r">
	  <a href="regis.html">注册</a></span>
</div>
</div>
<div class="bg">
	<div class="bg">
	 <div class="zhong">
  <form  action="RegServlet" method="get" >
	<label for="username">用户名：</label>
	<input  type="text" name="username" id="username" placeholder="请输入用户名" /><br>
	<label for="password">密码：</label><br>
	<input type="password" name="password" id="password" placeholder="请输入密码，1-16个字符" /><br>
	<input type="submit" value="提交" /><br>
	<input type="reset" value="重置" /><br>
  </form>
 </div>
</div>

</body>
</html>