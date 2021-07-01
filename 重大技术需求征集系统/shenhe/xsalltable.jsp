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

<script>
    i = 1;
    function insert() {
        if (i<12){
        	var j=i;
            i++;
            var newtr = tbl.insertRow();
            var newTd0 = newtr.insertCell();
            var newTd1 = newtr.insertCell();
            var newTd2 = newtr.insertCell();
            var newTd3 = newtr.insertCell();
            newTd0.innerHTML="<select name='yhf'>" +
                "<option value='binghan'>并含</option>" +
                "<option value='huohan'>或含</option>" +
                "<option value='buhan'>不含</option>" +
                "</select>";
            newTd1.innerHTML="<select name='name'>" +
                "<option value='jgqc'>机构全称</option>" +
                "<option value='gkglbm'>归口管理部门</option>" +
                "<option value='szdy'>所在地域</option>" +
                "<option value='frdb'>法人代表</option>" +
                "<option value='lxr'>联系人</option>" +
                "<option value='jgsx'>机构属性</option>" +
                "<option value='jsxqmc'>技术需求名称</option>" +
                "<option value='gjz'>关键字</option>" +
                "<option value='ntrjeze'>拟投入金额总额</option>" +
                "<option value='jsxqjjfs'>技术需求解决方式</option>" +
                "<option value='kjhdlx'>科技活动类型</option>" +
                "<option value='xkfl'>学科分类</option>" +
                "<option value='xqjsssly'>需求技术所属领域</option>" +
                "<option value='xqjsyyhy'>需求技术应用行业</option>" +
                "<option value='glch'>管理处室</option>" +
                ">";
            newTd2.innerHTML="<input type='text'name='value'>";
            newTd3.innerHTML="<select name='jingmo'>" +
                "<option value='jingque'>精确</option>" +
                "<option value='mohu'>模糊</option>" +
                ">";
        }
    }
    function deltr() {
        if (i!=1){
            tbl.deleteRow(i+1);
            i--;
        }
    }
    
</script>

<title></title>
</head>
<body>
<form action="SelectServlet"  method="post">
    <table  id="tbl">
        <tr>
            <td></td>
        </tr>
        <tr>
            <td>
                <input type="button" onclick="insert()" value="添加" />
            </td>
            <td>
                <input type="button" onclick="deltr()" value="删除" />
            </td>
        </tr>
        <tr>
	        <td>
	        	<select name='yhf'>
	        	    <option value='binghan'>并含</option>
	        	    <option value='buhan'>不含</option>
	        	</select>
	        </td>
	        <td>
		        <select name='name'>
	                <option value='jgqc'>机构全称</option>
	                <option value='gkglbm'>归口管理部门</option>
	                <option value='szdy'>所在地域</option>
	                <option value='frdb'>法人代表</option>
	                <option value='lxr'>联系人</option>
	                <option value='jgsx'>机构属性</option>
	               	<option value='jsxqmc'>技术需求名称</option>
	                <option value='gjz'>关键字</option>
	                <option value='ntrjeze'>拟投入金额总额</option>
	                <option value='jsxqjjfs'>技术需求解决方式</option>
	                <option value='kjhdlx'>科技活动类型</option>
	                <option value='xkfl'>学科分类</option>
	                <option value='xqjsssly'>需求技术所属领域</option>
	                <option value='xqjsyyhy'>需求技术应用行业</option>
	                <option value='glch'>管理处室</option>
	            </select>
	        </td>
	        <td>
	            <input type='text'name='value'>
	        </td>
	        <td>
		        <select name='jingmo'>
		        	<option value='jingque'>精确</option>
	                <option value='mohu'>模糊</option>
	            </select>
	        </td>
        </tr>
    </table>
    <input type="submit" value="查询">
</form>
	<div align="center">
		<table class="table table-hover table-striped table-bordered table-sm" id="resultshow">
			<tr>
				<td>技术需求名称</td>
				<td>形式审核状态</td>
				<td>部门审核状态</td>
				<td>形式审核</td>
			</tr>
			<c:forEach items="${table}" var="item">
				<tr>
					<td><a href="AdminServlet?method=getTheTableById&id=${item.wjid}">${item.jsxqmc}</a></td>
					<td>${item.xssh}</td>
					<td>${item.bmsh}</td>
					<td><a href="XSSHServlet?method=XSTheTableById&id=${item.wjid}" onclick="return check('${item.xssh}')">审核</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
<script type="text/javascript">
		function check(xssh) {
			if (xssh=="未审核"){
				return true;
			}else{
				alert("该需求已被审核");
				return false;
			}
		}
</script>
</html>