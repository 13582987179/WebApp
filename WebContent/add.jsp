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
			<legend>商品添加</legend>
			<form  action="${pageContext.request.contextPath}/GoodsSerelet?action=add" method="post">
				<label for="goodsname">商品名</label>
				<input type="text" name="name" id="name" />
				<label for="price">价格</label>
				<input type="text" name="price" id="price" />
				<label for="category">种类</label>
				<input type="text" name="category" id="category" />
				<label for="pnum">数量</label>
				<input type="text" name="pnum" id="pnum" />
				<label for="imgurl">略缩图</label>
				<input type="text" name="imgurl" id="imgurl" />
				<label for="description">描述</label>
				<input type="text" name="description" id="description" />
				<input type="submit" name="submit" id="submit" value="添加" />
				<input type="reset" name="reset" id="reset" value="重置" />
			</form>
		</fieldset>

 </body>
</html>

