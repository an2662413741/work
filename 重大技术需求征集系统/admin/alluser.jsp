<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>

<title></title>
</head>
<body>
	<div align="center">
		<h1 style="color: red;">用户信息总览</h1>
		<table class="table table-hover table-striped table-bordered table-sm" id="resultshow">
			<tr>
				<td>昵称</td>
				<td>姓名</td>
				<td>性别</td>
				<td>机构</td>
				<td>角色</td>
				<td>修改</td>
				<td>删除</td>
			</tr>
			<c:forEach items="${user}" var="item">
				<tr>
					<td><a href="AdminServlet?method=getTheUserById&id=${item.id}">${item.username}</a></td>
					<td>${item.name}</td>
					<td>${item.sex}</td>
					<td>${item.jgmc}</td>
					<td>${item.joker}</td>			
					<td><a href="AdminServlet?method=changeTheUserById&id=${item.id}">修改</a></td>
					<td><a onclick="return del()" href="AdminServlet?method=deleteTheUserById&id=${item.id}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
<script type="text/javascript">
		function del() {
			if (confirm("删除后数据将不可恢复，确定要删除吗？")){
				return true;
			}else{
				return false;
			}
		}
</script>
</html>