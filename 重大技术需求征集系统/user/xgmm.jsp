<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function check(){
	var password = document.getElementById("password");
	
	if(password.value == ""){
		alert("新密码不能为空");
		return false;
	}
	if(password.value.length < 6 || password.value.length > 20){
		alert("新密码不能小于6位或大于20位");
		return false;
	}
	
	return true;
	
}

function ok(){
	if (confirm("确定要提交修改吗？")){
		return true;
	}else{
		return false;
	}
}
</script>

<%
	//接收servlet传过来的那个message的参数
	//alert是js语句中的弹出警示框，也就是弹出message中的参数
	Object message=request.getAttribute("message");
	if(!(message==null||message.equals("")))
	{
		%>
		<script type="text/javascript">alert('<%=message%>')</script>
		<%
		request.setAttribute("message", null);
	}
%>

<body>
<form action="../XGMMServlet" method="post" onsubmit="return ok()">
    <table border="1" align="center" width="500">
         <tr>
            <td><label>新密码：</label></td>
            <td><input type="text" name="password" id="password" placeholder="由6~20位字母或数字组成"></td>
            <td><input type="submit" value="提交修改" onClick="return check()"></td>
        </tr>            
    </table>
</form>
</body>
</html>