<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">

  <title>Document</title>

 </head>
 <body>

		<fieldset>
			<legend>id商品</legend>
			<form  action="${pageContext.request.contextPath}/GoodsServlet?action=findbyid" method="post">
				<label for="goodsname">请输入id</label>
				<input type="text" name="id"  />
				<input type="submit" name="submit" id="submit" value="提交" />
				<input type="reset" name="reset" id="reset" value="重置" />
			</form>
		</fieldset>

 </body>
</html>

