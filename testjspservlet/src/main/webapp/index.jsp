<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎页</title>
</head>
<body>
<p><a href="">刷新</a></p>
<p>222222222222222顶顶顶</p>
<p><a href="/servlet/hello?name=ppppp等等">helloServlet</a></p>
<form action="/servlet/hello" method="post">
	<input type="hidden" name="name" value="单独">
	<input type="submit" value="提交">
</form>
<%
	String maningbo = "马宁波";
	request.setAttribute("value1", "你好！");
%>
<%=maningbo %>，${value1 }
</body>
</html>