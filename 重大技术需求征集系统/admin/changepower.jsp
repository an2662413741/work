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
<%
	     Object power = request.getAttribute("power");
	     if(power!=null && !"".equals(power)){} 
%>
<title></title>
</head>
<body>
	<div align="center">	
	    <h1 style="color: red;">修改<a>${power.joker}</a>权限</h1>
        <h6>（“1”表示拥有此项权限；“0”表示未拥有此项权限）</h6>	
        <div hidden="true"><input id="joker" value="${power.joker}"></div>
		<table class="table table-hover table-striped table-bordered table-sm" id="resultshow">
			<tr>
				<td>权限名称</td>
				<td>权限状态</td>
				<td>修改状态</td>
			</tr>
			<tr>
				<td>需求征集</td>
				<td>${power.xqzj_qx}</td>
				<td>
				    <select id="xqzj_qx">
				        <option value="${power.xqzj_qx}"></option>
				        <option value='1'>1</option>
	        	        <option value='0'>0</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>需求管理</td>
				<td>${power.xqgl_qx}</td>
				<td>
				    <select id="xqgl_qx">
				        <option value="${power.xqgl_qx}"></option>
				        <option value='1'>1</option>
	        	        <option value='0'>0</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>用户信息</td>
				<td>${power.yhxx_qx}</td>
				<td>
				    <select id="yhxx_qx">
				        <option value="${power.yhxx_qx}"></option>
				        <option value='1'>1</option>
	        	        <option value='0'>0</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>修改密码</td>
				<td>${power.xgmm_qx}</td>
				<td>
				    <select id="xgmm_qx">
				        <option value="${power.xgmm_qx}"></option>
				        <option value='1'>1</option>
	        	        <option value='0'>0</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>统计需求</td>
				<td>${power.tjxq_qx}</td>
				<td>
				    <select id="tjxq_qx">
				        <option value="${power.tjxq_qx}"></option>
				        <option value='1'>1</option>
	        	        <option value='0'>0</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>形式审核</td>
				<td>${power.xssh_qx}</td>
				<td>
				    <select id="xssh_qx">
				        <option value="${power.xssh_qx}"></option>
				        <option value='1'>1</option>
	        	        <option value='0'>0</option>
				    </select>
				</td>
			</tr>
			<tr>
				<td>部门审核</td>
				<td>${power.bmsh_qx}</td>
				<td>
				    <select id="bmsh_qx">
				        <option value="${power.bmsh_qx}"></option>
				        <option value='1'>1</option>
	        	        <option value='0'>0</option>
				    </select>
				</td>
			</tr>
		</table>
		<div align="center"><input type="button" value="保存" onclick="change('${power.joker}')"></div>
	</div>
</body>
<script type="text/javascript">
		function change(joker) {	
			
			var joker = document.getElementById("joker").value;
			var xqzj_qx = document.getElementById("xqzj_qx").value;
			var xqgl_qx = document.getElementById("xqgl_qx").value;
			var yhxx_qx = document.getElementById("yhxx_qx").value;
			var xgmm_qx = document.getElementById("xgmm_qx").value;
			var tjxq_qx = document.getElementById("tjxq_qx").value;
			var xssh_qx = document.getElementById("xssh_qx").value;
			var bmsh_qx = document.getElementById("bmsh_qx").value;
			
			var url = "AdminServlet?method=changeThePower&joker=" + joker + "&xqzj_qx=" + xqzj_qx + "&xqgl_qx=" + xqgl_qx + "&yhxx_qx=" + yhxx_qx + "&xgmm_qx=" + xgmm_qx + "&tjxq_qx=" + tjxq_qx + "&xssh_qx=" + xssh_qx + "&bmsh_qx=" + bmsh_qx;

			if (confirm("确定要修改吗？")){
				window.location.href = url;
			}else{
				return false;
			}
		}
	</script>
</html>