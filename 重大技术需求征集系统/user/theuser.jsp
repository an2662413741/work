<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册界面</title>

<script type="text/javascript">

</script>

</head>
<body>

<%
	     Object user = request.getAttribute("user");
	     if(user!=null && !"".equals(user)){} 
%>

    <table border="1" align="center" width="500">
        <tr>
            <td><label>用户名</label></td>
            <td><input type="text" name="username" id="username" value="${user.username}" readonly></td>
        </tr>

        <tr>
            <td><label>密码</label></td>
            <td><input type="text" name="password" id="password" value="${user.password}" readonly></td>
        </tr>
        
        <tr>
            <td><label>角色</label></td>
            <td><input type="text" name="joker" id="joker" value="${user.joker}" readonly></td>
        </tr>

        <tr>
            <td><label for="name">姓名</label></td>
            <td><input type="text" name="name" id="name" value="${user.name}" readonly></td>
        </tr>

        <tr>
            <td><label>身份证号</label></td>
            <td><input type="text" name="ssz" id="ssz" value="${user.ssz}" readonly></td>
        </tr>
        
        <tr>
            <td><label>性别</label></td>
            <td><input type="text" name="sex" id="sex" value="${user.sex}" readonly></td>
        </tr>
        
        <tr>
            <td><label>省</label></td>
            <td><input type="text" name="sheng" id="sheng" value="${user.sheng}" readonly></td>
        </tr>
        <tr>
            <td><label>市</label></td>
            <td><input type="text" name="shi" id="shi" value="${user.shi}" readonly></td>
        </tr> 
                   
        <tr>
            <td><label>机构全称</label></td>
            <td><input type="text" name="jgmc" id="jgmc" value="${user.jgmc}" readonly></td>
        </tr>
        
        <tr>
            <td><label>组织机构代码</label></td>
            <td><input type="text" name="zzjgdm" id="zzjgdm" value="${user.zzjgdm}" readonly></td>
        </tr>
        
        <tr>
            <td><label>专业方向</label></td>
            <td><input type="text" name="zyfx" id="zyfx" value="${user.zyfx}" readonly></td>
        </tr>
        
        <tr>
            <td><label>所在行业</label></td>
            <td><input type="text" name="szhy" id="szhy" value="${user.szhy}" readonly></td>
        </tr>
        
        <tr>
            <td><label>教育程度</label></td>
            <td><input type="text" name="jycd" id="jycd" value="${user.jycd}" readonly></td>
        </tr>
        
        <tr>
            <td><label>职称</label></td>
            <td><input type="text" name="zc" id="zc" value="${user.zc}" readonly></td>
        </tr>
        
        <tr>
            <td><label>通讯地址</label></td>
            <td><input type="text" name="txdz" id="txdz" value="${user.txdz}" readonly></td>
        </tr>
        
        <tr>
            <td><label>邮政编码</label></td>
            <td><input type="text" name="yzbm" id="yzbm" value="${user.yzbm}" readonly></td>
        </tr>

        <tr>
            <td><label>手机</label></td>
            <td><input type="text" name="sj" id="sj" value="${user.sj}" readonly></td>
        </tr>
        
        <tr>
            <td><label>固定电话</label></td>
            <td><input type="text" name="gddh" id="gddh" value="${user.gddh}" readonly></td>
        </tr>
        
        <tr>
            <td><label>邮箱</label></td>
            <td><input type="email" name="yx" id="yx" value="${user.yx}" readonly></td>
        </tr>
        
        <tr>
            <td><label>QQ</label></td>
            <td><input type="text" name="qq" id="qq" value="${user.qq}" readonly></td>
        </tr>

    </table>
    
</body>
</html>