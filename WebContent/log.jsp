<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
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
	<div class="zhong">

  <form action="LoginServlet" method="get" name="">
	<img class="img1" src="images/head.png">
   <input class="us" type="text" name="username" id="username" placeholder="邮箱" ><br/>
    <input class="paw" type="password" name="password" id="password" placeholder="请输入密码" ><br/>
	<input type="submit"  value="登录" >
  </form>
	</div>
  </div>
	<div class="zh">软件二班刘建新</div>
</body>
</html>
