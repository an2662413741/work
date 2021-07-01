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
		<h1 style="color: red;">用户角色总览</h1>		
		<table class="table table-hover table-striped table-bordered table-sm" id="resultshow">
			<tr>
				<td>昵称</td>				
				<td>现用角色</td>
				<td>修改角色</td>
				<td></td>
			</tr>
			<c:forEach items="${user}" var="item">
		    <tr >
				<td><input type="text" id="username" value="${item.username}" readonly/></td>
				<td>${item.joker}</td>
				<td>
				    <select name="joker" id='${item.username}'>
				        <option value="${item.joker}">请选择</option>
				        <option value="管理员">管理员</option>
				        <option value="形审部门">形审部门</option>
				        <option value="部审部门">部审部门</option>
				        <option value="普通用户">普通用户</option>
				    </select>
				</td>
				<td><div align="center"><input type="button" value="保存" onclick="change('${item.username}')"></div></td>
			</tr>			
			</c:forEach>
		</table>
	</div>
</body>
<script type="text/javascript">
		function change(username) {
			var joker = document.getElementById(username).value;
			var url = "AdminServlet?method=changeTheJoker&username=" + username + "&joker=" + joker;
			if (confirm("确定要修改吗？")){
				window.location.href = url;
			}else{
				return false;
			}
		}
	</script>
</html>