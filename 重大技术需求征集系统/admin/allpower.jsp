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
	    <h1 style="color: red;">权限信息总览</h1>
        <h6>（“1”表示拥有此项权限；“0”表示未拥有此项权限）</h6>	
		<table class="table table-hover table-striped table-bordered table-sm" id="resultshow">
			<tr>
				<td>角色名称</td>
				<td>需求征集</td>
				<td>需求管理</td>
				<td>用户信息</td>
				<td>修改密码</td>
				<td>统计需求</td>
				<td>形式审核</td>		
				<td>部门审核</td>			
				<td>修改</td>
			</tr>
			<c:forEach items="${power}" var="item">
				<tr>
					<td>${item.joker}</td>
                    <td>${item.xqzj_qx}</td>
                    <td>${item.xqgl_qx}</td>
                    <td>${item.yhxx_qx}</td>
                    <td>${item.xgmm_qx}</td>
                    <td>${item.tjxq_qx}</td>	
                    <td>${item.xssh_qx}</td>
                    <td>${item.bmsh_qx}</td>	
                    <td><a href="AdminServlet?method=changeThePowerByJoker&joker=${item.joker}">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>