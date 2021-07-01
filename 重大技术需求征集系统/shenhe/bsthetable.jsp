<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <title></title>
    <style type="text/css">
        .title{
            width:100%;
            text-align:center;
            margin-top:20px;
        }
        .left{
            width:10%;
            text-align:center;
            top:50%;
        }
        .right{
            width:30%;
            broder:1px solid;
            text-align:center;
            top:50%;
        }
        .write{
            border: 0;
            width: 100%;
            height: 100%;
            margin: 0;
            padding: 0;
        }
    </style>
</head>
<body>
<%
	     Object table = request.getAttribute("table");
	     if(table!=null && !"".equals(table)){} 
%>
<div class="title"><h2>河北省重大技术需求征集表</h2></div>
<form action="BMSHServlet?method=BSTheTable" method="post">
    <table border="1" align="center" width="60%">
        <tr>
            <td hidden><input type="text" id="wjid" name="wjid" value="${table.wjid}"></td>
        </tr>
        <tr>
            <td class="left">*机构全称</td>
            <td colspan="2" class="right"><input class="write" type="text" name="jgqc" id="jgqc" value="${table.jgqc}" readonly></td>
            <td class="left">归口管理部门</td>
            <td colspan="2"><input class="write" type="text" name="gkglbm" id="gkglbm" value="${table.gkglbm}" readonly></td>
        </tr>
        <tr>
            <td class="left">*通讯地址</td>
            <td colspan="2" class="right"><input class="write" type="text" name="txdz" id="txdz" value="${table.txdz}" readonly></td>
            <td class="left">*所在地域</td>
            <td colspan="2"><input class="write" type="text" name="szdy" id="szdy" value="${table.szdy}" readonly></td>
        </tr>
        <tr>
            <td class="left">网址</td>
            <td colspan="2" class="right"><input class="write" type="text" name="wz" id="wz" value="${table.wz}" readonly></td>
            <td class="left">*电子信箱</td>
            <td colspan="2"><input class="write" type="text" name="dzxx" id="dzxx" value="${table.dzxx}" readonly></td>
        </tr>
        <tr>
            <td class="left">*法人代表</td>
            <td colspan="2" class="right"><input class="write" type="text" name="frdb" id="frdb" value="${table.frdb}" readonly></td>
            <td class="left">邮政编码</td>
            <td colspan="2"><input class="write" type="text" name="yzbm" id="yzbm" value="${table.yzbm}"  readonly></td>
        </tr>
        <tr>
            <td class="left">*联系人</td>
            <td class="right" colspan="2"><input class="write" type="text" name="lxr" id="lxr" value="${table.lxr}" readonly></td>
            <td class="left">固定电话</td>
            <td colspan="2"><input class="write" type="text" name="gddh" id="gddh" value="${table.gddh}"  readonly></td>
        </tr>
        <tr>
            <td class="left">*手机</td>
            <td colspan="2"><input class="write" type="text" name="sj" id="sj" value="${table.sj}" readonly></td>
            <td class="left">传真</td>
            <td colspan="2"><input class="write" type="text" name="cz" id="cz" value="${table.cz}"  readonly></td>
        </tr>
        <tr>
            <td class="left">*机构属性</td>
            <td class="right" colspan="5"><input class="write" type="text" name="jgsx" id="jgsx" value="${table.jgsx}" readonly></td>
        </tr>
        <tr>
            <td colspan="6">*机构简介</td>
        </tr>
        <tr>
            <td colspan="6" height="100px">
            <div class="formControls col-xs-8 col-sm-9">
			    <textarea name="jgjj" id="jgjj" cols="100" rows="5" class="textarea" placeholder="${table.jgjj}" readonly></textarea>
			</div>
            </td>
        </tr>
        <tr>
            <td class="left">*技术需求名称</td>
            <td class="right" colspan="2"><input class="write" type="text" name="jsxqmc" value="${table.jsxqmc}" readonly></td>
            <td class="left">*需求时限</td>
            <td class="right" colspan="2"><input class="write" type="text" name="qsxqsx" value="${table.qsxqsx}" readonly>年-<input class="write" type="text" name="jzxqsx" value="${table.jzxqsx}" readonly>年</td>
        </tr>
        <tr>
            <td colspan="6">*技术需求概述</td>
        </tr>
        <tr>
            <td colspan="6" height="150px">
            <div class="formControls col-xs-8 col-sm-9">
			    <textarea name="jsxqgs" cols="100" rows="5" class="textarea" placeholder="${table.jsxqgs}" readonly></textarea>
			</div>
            </td>
        </tr>
        <tr>
            <td class="left">关键字</td>
            <td class="right" colspan="5"><input class="write" type="text" name="gjz" id="gjz" value="${table.gjz}" readonly></td>
        </tr>
        <tr>        
            <td class="left">拟投入金额总额</td>
            <td class="right" colspan="5"><input dir="rtl" style="width: 50%;border: 0" type="text" name="ntrjeze" id="ntrjeze" value="${table.ntrjeze}" readonly>万元</td>
        </tr>
        <tr>
            <td class="left" rowspan="2">*技术需求解决方式</td>
            <td class="right" colspan="5"><input class="write" type="text" name="jsxqjjfs" value="${table.jsxqjjfs}" readonly></td>
        </tr>
        <tr>
            <td class="left" colspan="2">合作意向单位（选填）</td>
            <td class="right" colspan="3"><input class="write" type="text" name="hzyxdw" value="${table.hzyxdw}" readonly></td>
        </tr>
        <tr>
            <td class="left">*科技活动类型</td>
            <td class="right" colspan="5"><input class="write" type="text" name="kjhdlx" value="${table.kjhdlx}" readonly></td>
        </tr>
        <tr>
            <td class="left">学科分类</td>
            <td class="right" colspan="5"><input class="write" type="text" name="xkfl" value="${table.xkfl}" readonly></td>
        </tr>
        <tr>
            <td class="left">需求技术所属领域</td>
            <td class="right" colspan="5"><input class="write" type="text" name="xqjsssly" value="${table.xqjsssly}" readonly></td>
        </tr>
        <tr>
            <td class="left">其他技术</td> 
            <td class="right" colspan='5'><input class="write" type='text' name='qtjs' value='${table.qtjs}' readonly></td>
        </tr>
        <tr>
            <td class="left">需求技术应用行业</td> 
            <td class="right" colspan='5'><input class="write" type='text' name='xqjsyyhy' value="${table.xqjsyyhy}" readonly></td>
        </tr>
        <tr>
            <td class="left">部门审核状态</td> 
            <td class="right" colspan='5'>
                <input type="radio" name="bmsh" value="通过"> 通过
                <input type="radio" name="bmsh" value="不通过"> 不通过         
            </td>
        </tr>
        <tr>
            <td colspan="6">部门审核意见</td>
        </tr>
        <tr>
            <td colspan="6" height="150px">
            <div class="formControls col-xs-8 col-sm-9">
			    <textarea name="bmyj" cols="100" rows="5" class="textarea"></textarea>
			</div>
            </td>
        </tr>  
        <tr>
            <td colspan="6"><div align="center"><input type="submit" value="完成" onclick="return check()"></div></td>
        </tr>     
    </table>
</form>
</body>
<script type="text/javascript">
		function check() {
			if (confirm("确认审核已完成？")){
				return true;
			}else{
				return false;
			}
		}
</script>
</html>