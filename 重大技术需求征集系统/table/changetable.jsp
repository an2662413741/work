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
    <script type="text/javascript">
function check(){
	//根据ID获取值
	var jgqc=document.getElementById("jgqc").value;
	var txdz=document.getElementById("txdz").value;
	var ssdy=document.getElementById("ssdy").value;
	var dzyx=document.getElementById("dzyx").value;
	var frdb=document.getElementById("frdb").value;
	var lxr=document.getElementById("lxr").value;
	var yddh=document.getElementById("yddh").value;

	if(jgqc==""){
		alert("机构全称不能为空");
		return false;
	}
	else if(txdz==""){
		alert("通讯地址不能为空");
		return false;
	}
	else if(szdy==""){
		alert("所在地域不能为空");
		return false;
	}
	else if(dzxx==""){
		alert("电子信箱不能为空");
		return false;
	}
	else if(frdb==""){
		alert("法人代表不能为空");
		return false;
	}
	else if(lxr==""){
		alert("联系人不能为空");
		return false;
	}
	if(sj==""){
		alert("手机不能为空");
		return false;
	}
	return true;
	// onsubmit="return check()"
}
</script>
</head>
<body>
<%
	     Object table = request.getAttribute("table");
	     if(table!=null && !"".equals(table)){} 
%>
<div class="title"><h2>河北省重大技术需求征集表</h2></div>
<form action="AdminServlet?method=changeTheTable" method="post">
    <table border="1" align="center" width="60%">
        <tr>
            <td hidden><input type="text" value="${table.wjid}" id="wjid" name="wjid" /></td>
            <td class="left">*机构全称</td>
            <td colspan="2" class="right"><input class="write" type="text" name="jgqc" id="jgqc" value="${table.jgqc}"></td>
            <td class="left">归口管理部门</td>
            <td colspan="2"><input class="write" type="text" name="gkglbm" id="gkglbm" value="${table.gkglbm}"></td>
        </tr>
        <tr>
            <td class="left">*通讯地址</td>
            <td colspan="2" class="right"><input class="write" type="text" name="txdz" id="txdz" value="${table.txdz}"></td>
            <td class="left">*所在地域</td>
            <td colspan="2"><input class="write" type="text" name="szdy" id="szdy" value="${table.szdy}"></td>
        </tr>
        <tr>
            <td class="left">网址</td>
            <td colspan="2" class="right"><input class="write" type="text" name="wz" id="wz" value="${table.wz}"></td>
            <td class="left">*电子信箱</td>
            <td colspan="2"><input class="write" type="text" name="dzxx" id="dzxx" value="${table.dzxx}"></td>
        </tr>
        <tr>
            <td class="left">*法人代表</td>
            <td colspan="2" class="right"><input class="write" type="text" name="frdb" id="frdb" value="${table.frdb}"></td>
            <td class="left">邮政编码</td>
            <td colspan="2"><input class="write" type="text" name="yzbm" id="yzbm" value="${table.yzbm}"></td>
        </tr>
        <tr>
            <td class="left">*联系人</td>
            <td class="right" colspan="2"><input class="write" type="text" name="lxr" id="lxr" value="${table.lxr}"></td>
            <td class="left">固定电话</td>
            <td colspan="2"><input class="write" type="text" name="gddh" id="gddh" value="${table.gddh}"></td>
        </tr>
        <tr>
            <td class="left">*手机</td>
            <td colspan="2"><input class="write" type="text" name="sj" id="sj" value="${table.sj}"></td>
            <td class="left">传真</td>
            <td colspan="2"><input class="write" type="text" name="cz" id="cz" value="${table.cz}"></td>
        </tr>
        <tr>
            <td class="left">*机构属性</td>
            <td class="right" colspan="5">
                <input type="radio" value="企业" name="jgsx" id="jgsx">企业
                <input type="radio" value="高等院校" name="jgsx" id="jgsx">高等院校
                <input type="radio" value="研究机构" name="jgsx" id="jgsx">研究机构
                <input type="radio" value="其他" name="jgsx" id="jgsx">其他
            </td>
        </tr>
        <tr>
            <td colspan="6" border="0">*机构简介（单位基本情况，研究基础等，限500字）</td>
        </tr>
        <tr>
            <td colspan="6" height="100px">
            <div class="formControls col-xs-8 col-sm-9">
			    <!-- 核心代码 start-->
			    <textarea name="jgjj" cols="100" rows="5" class="textarea" placeholder="" onKeyUp="Huitextarealength(this)">${table.jgjj}</textarea>
			    <p class="textarea-numberbar"><em class="textarea-length">0</em>/
			        <am>500</am>
			    </p>
			    <!-- 核心代码 end-->
			</div>
            </td>
        </tr>
        <tr>
            <td class="left">*技术需求名称</td>
            <td class="right" colspan="2"><input class="write" type="text" name="jsxqmc" value="${table.jsxqmc}"></td>
            <td class="left">*需求时限</td>
            <td class="right" colspan="2"><input class="write" type="text" name="qsxqsx" value="${table.qsxqsx}">年-<input class="write" type="text" name="jzxqsx" value="${table.jzxqsx}">年</td>
        </tr>
        <tr>
            <td colspan="6" border="0">*技术需求概述</td>
        </tr>
        <tr>
            <td colspan="6" height="150px">
            <div class="formControls col-xs-8 col-sm-9">
			    <!-- 核心代码 start-->
			    <textarea name="jsxqgs" cols="100" rows="5" class="textarea" placeholder="1、主要问题（需要解决的重大技术问题,限500字）
2、技术关键（所需的关键技术、主要指标,限500字）
3、预期目标（技术创新性、经济社会效益,限500字）"
			              onKeyUp="Huitextarealength(this)">${table.jsxqgs}</textarea>
			    <p class="textarea-numberbar"><em class="textarea-length">0</em>/
			        <am>500</am>
			    </p>
			    <!-- 核心代码 end-->
			</div>
            </td>
        </tr>
        <tr>
            <td class="left">关键字</td>
            <td class="right" colspan="1"><input class="write" type="text" name="gjza"onblur="checkGjz1()"id="gjz1"></td>
            <td class="right" colspan="1"><input class="write" type="text" name="gjzb"onblur="checkGjz2()"id="gjz2"disabled="disabled"></td>
            <td class="right" colspan="1"><input class="write" type="text" name="gjzc"onblur="checkGjz3()"id="gjz3"disabled="disabled"></td>
            <td class="right" colspan="1"><input class="write" type="text" name="gjzd"onblur="checkGjz4()"id="gjz4"disabled="disabled"></td>
            <td class="right" colspan="1"><input class="write" type="text" name="gjze"onblur="checkGjz5()"id="gjz5"disabled="disabled"></td>
        </tr>
        <tr>        
            <td class="left">拟投入金额总额</td>
            <td class="right" colspan="5"><input dir="rtl" style="width: 50%;border: 0" type="text" name="ntrjeze" id="ntrjeze" value="${table.ntrjeze}">万元</td>
        </tr>
        <tr>
            <td class="left" rowspan="2">*技术需求解决方式</td>
            <td class="right" colspan="5">
                <input type="radio" value="独立开发" name="jsxqjjfs">独立开发
                <input type="radio" value="合作研发" name="jsxqjjfs">合作研发
                <input type="radio" value="委托研发" name="jsxqjjfs">委托研发
                <input type="radio" value="其他方式" name="jsxqjjfs">其他方式
            </td>
        </tr>
        <tr>
            <td class="left" colspan="2">合作意向单位（选填）</td>
            <td class="right" colspan="3"><input  class="write" type="text" name="hzyxdw" value="${table.hzyxdw}"></td>
        </tr>
        <tr>
            <td class="left">*科技活动类型</td>
            <td class="right" colspan="5">
                <input type="radio" name="kjhdlx" onclick="type1()" value="基础研究">基础研究
                <input type="radio" name="kjhdlx" onclick="type2()" value="应用研究">应用研究
                <input type="radio" name="kjhdlx" onclick="type2()" value="试验发展">试验发展
                <input type="radio" name="kjhdlx" onclick="type2()" value="研究与试验发展成果应用">研究与试验发展成果应用
                <input type="radio" name="kjhdlx" onclick="type2()" value="技术推广与科技服务">技术推广与科技服务
                <input type="radio" name="kjhdlx" onclick="type2()" value="生产性活动项">生产性活动项
            </td>
        </tr>
        <tr id="type" align="center"></tr>
        <tr id="type1" align="center"></tr>
        <tr id="type2" align="center"></tr>
        <tr>
            <td class="left">形式审核状态</td> 
            <td class="right" colspan='5'><input class="write" type='text' name='xssh' value="${table.xssh}"></td>
        </tr>
        <tr>
            <td colspan="6">形式审核意见</td>
        </tr>
        <tr>
            <td colspan="6" height="150px">
            <div class="formControls col-xs-8 col-sm-9">
			    <textarea name="xsyj" cols="100" rows="5" class="textarea" placeholder="">${table.xsyj}</textarea>
			</div>
            </td>
        </tr>
        <tr>
            <td class="left">管理处室</td> 
            <td class="right" colspan='5'><input class="write" type='text' name='glcs' value="${table.glcs}"></td>
        </tr>
        <tr>
            <td class="left">部门审核状态</td> 
            <td class="right" colspan='5'><input class="write" type='text' name='bmsh' value="${table.bmsh}"></td>
        </tr>
        <tr>
            <td colspan="6">部门审核意见</td>
        </tr>
        <tr>
            <td colspan="6" height="150px">
            <div class="formControls col-xs-8 col-sm-9">
			    <textarea name="bmyj" cols="100" rows="5" class="textarea" placeholder="">${table.bmyj}</textarea>
			</div>
            </td>
        </tr>
        <tr>
            <td colspan="6"><div align="center"><input type="submit" value="保存" onclick="return check()"></div></td>
        </tr>
    </table>
</form>
</body>
<script type="text/javascript">
		function check() {
			if (confirm("点击保存后将不可再更改，你确认要提交吗？")){
				return true;
			}else{
				return false;
			}
		}
</script>
<script type="text/javascript">

function checkGjz1(){
    var gjz1 = document.getElementById("gjz1").value;
    var docGjz2 = document.getElementById("gjz2");
    var docGjz3 = document.getElementById("gjz3");
    var docGjz4 = document.getElementById("gjz4");
    var docGjz5 = document.getElementById("gjz5");

    if(gjz1 =='' || typeof(gjz1) == 'undefined' ){
    	//Action for not checked
		document.getElementById('gjz2').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方
		jQuery('#gjz2').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		
		//Action for not checked
		document.getElementById('gjz3').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz3').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		
		//Action for not checked
		document.getElementById('gjz4').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz4').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		
		//Action for not checked
		document.getElementById('gjz5').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz5').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		docGjz2.value="";
		docGjz3.value="";
		docGjz4.value="";
		docGjz5.value="";
    	
    return false;
    }
    else{  	 	
        document.getElementById('gjz2').removeAttribute('disabled') // 删除指定element的属性，使用原生JS方法
    	jQuery('#gjz2').removeAttr('disabled')  // 删除指定element的属性，使用jQuery方法  	
    }
}
function checkGjz2(){
    var gjz2 = document.getElementById("gjz2").value;
    var docGjz3 = document.getElementById("gjz3");
    var docGjz4 = document.getElementById("gjz4");
    var docGjz5 = document.getElementById("gjz5");

    if(gjz2 =='' || typeof(gjz2) == 'undefined' ){
		
		//Action for not checked
		document.getElementById('gjz3').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz3').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		document.getElementById('gjz4').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz4').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		document.getElementById('gjz5').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz5').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		docGjz3.value="";
		docGjz4.value="";
		docGjz5.value="";	
    return false;
    }
    else
    	{
    	document.getElementById('gjz3').removeAttribute('disabled') // 删除指定element的属性，使用原生JS方法
    	jQuery('#gjz3').removeAttr('disabled')  // 删除指定element的属性，使用jQuery方法	
    	}
}
function checkGjz3(){
    var gjz3 = document.getElementById("gjz3").value;
    var docGjz4 = document.getElementById("gjz4");
    var docGjz5 = document.getElementById("gjz5");

    if(gjz3 =='' || typeof(gjz3) == 'undefined' ){
			
		//Action for not checked
		document.getElementById('gjz4').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz4').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		document.getElementById('gjz5').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz5').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		docGjz4.value="";
		docGjz5.value="";
    	
    return false;
    }
    else
    	{
    	
    	
    	document.getElementById('gjz4').removeAttribute('disabled') // 删除指定element的属性，使用原生JS方法
    	jQuery('#gjz4').removeAttr('disabled')  // 删除指定element的属性，使用jQuery方法
    	
    	}
}
function checkGjz4(){
    var gjz4 = document.getElementById("gjz4").value;
    var docGjz4 = document.getElementById("gjz4");
    var docGjz5 = document.getElementById("gjz5");

    if(gjz4 =='' || typeof(gjz4) == 'undefined' ){
						
		//Action for not checked
		document.getElementById('gjz5').setAttribute('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用原生JS方法
		jQuery('#gjz5').attr('disabled', 'disabled')
		//  为指定的element添加指定的属性，使用jQuery方法
		docGjz5.value="";
    	
    return false;
    }
    else
    	{	
    	document.getElementById('gjz5').removeAttribute('disabled') // 删除指定element的属性，使用原生JS方法
    	jQuery('#gjz5').removeAttr('disabled')  // 删除指定element的属性，使用jQuery方法
    	}
}

//字数限制：
var Huitextarealength = function (obj){
    var html = $(obj).parent();
    var tatal = html.find('am').html();
    var sets = $(obj).val().length;
 
    if(sets*1>tatal*1){
        var str = '<div style="width: auto;position: absolute; right: 4%;color: red;">字数超出限制</div>';
        $(obj).after(str);
        html.find('em').css({color:'red'});
    }else {
        $(obj).parent().find('div').remove();
        html.find('em').css({color:'black'});
    }
    //设置已输入数量
    html.find('em').html(sets);
}

    function type1(){
        var htmltext="<td>学科分类（限基础研究填写）</td>"
        +"<td colspan='5'>"
        +"<select name=\"one\" id=\"one\" class=login_text_input onchange=\"set_two(this, document.getElementById('two'), document.getElementById('xkfl'));\">"
        +"<option value=0>请选择</option>"
        +"<option value=数学>数学</option>"
        +"<option value=信息科学与系统科学>信息科学与系统科学</option>"
        +"<option value=力学>力学</option>"
        +"<option value=物理学>物理学</option>"
        +"<option value=化学>化学</option>"
        +"</select> - " 
        +"<select id=\"two\" class=login_text_input name=\"two\" onchange=\"set_three(this,document.getElementById('xkfl'));\">"
        +"<option value=0>请选择</option>"
        +"</select> - " 
        +"<select id=\"xkfl\" class=login_text_input name=\"xkfl\">"
        +"<option value=无>请选择</option>"
        +"</select>"
        +"</td>";
        $("#type").html(htmltext);
        $("#type1").html("");
        $("#type2").html("");
    }
    function type2(){
        var htmltext="<td class='left'>需求技术所属领域（非基础研究填写）</td><td class='right' colspan='5'>"
            +"<input type='checkbox' name='xqjsssly' value='电子信息技术'>电子信息技术"
            +"<input type='checkbox' name='xqjsssly' value='光机电一体化'>光机电一体化"
            +"<input type='checkbox' name='xqjsssly' value='生物制药技术'>生物制药技术"
            +"<input type='checkbox' name='xqjsssly' value='新材料及应用'>新材料及应用"
            +"<input type='checkbox' name='xqjsssly' value='现代农业'>现代农业"
            +"<input type='checkbox' name='xqjsssly' value='新能源与高效节能'>新能源与高效节能"
            +"<input type='checkbox' name='xqjsssly' value='资源与环境'>资源与环境"
            +"<input type='checkbox' name='xqjsssly' value='高技术服务业'>高技术服务业"
            +"<input type='checkbox' name='xqjsssly' value='海洋'>海洋"
            +"<input type='checkbox' name='xqjsssly' value='社会公共事业'>社会公共事业"
            +"<input type='checkbox' name='xqjsssly' value='医疗卫生'>医疗卫生"
            +"<input type='checkbox' name='xqjsssly' value='其他技术'>其他技术</td>";
        var htmltext1="<td>其他技术</td> <td colspan='5'><input class='write' type='text' name='qtjs' value='${table.qtjs}'></td>";
        var htmltext2="<td>需求技术应用行业（参见国民经济行业分类，非基础研究填写）</td> <td colspan='5'><input class='write' type='text' name='xqjsyyhy' value='${table.xqjsyyhy}'></td>";
        $("#type").html(htmltext);
        $("#type1").html(htmltext1);
        $("#type2").html(htmltext2);
    }
    

    twos = new Object();
    threes = new Object();

    twos['数学']=new Array('数学史','数理逻辑与数学基础','数论');
    threes['数学史']=new Array('数学史');
    threes['数理逻辑与数学基础']=new Array('演绎逻辑学','证明论','递归论');
    threes['数论']=new Array('初等数论','解析数论','代数数论');

    twos['信息科学与系统科学']=new Array('信息科学与系统科学基础','系统学','控制理论');
    threes['信息科学与系统科学基础']=new Array('信息论','控制论','系统论');
    threes['系统学']=new Array('混沌','一般系统论','耗散结构理论');
    threes['控制理论']=new Array('大系统理论','系统辨识','状态估计');

    twos['力学']=new Array('基础力学','固体力学','振动与波');
    threes['基础力学']=new Array('理论力学','理性理学','非线性力学');
    threes['固体力学']=new Array('弹性力学','塑性力学','粘弹性、粘塑性力学');
    threes['振动与波']=new Array('线性振动力学','非线性振动力学','弹性体振动力学');

    twos['物理学']=new Array('物理学史','理论物理学');
    threes['物理学史']=new Array('物理学史');
    threes['理论物理学']=new Array('数学物理','电磁场理论','经典场论');

    twos['化学']=new Array('化学史','无机化学','有机化学');
    threes['化学史']=new Array('化学史');
    threes['无机化学']=new Array('元素化学','配位化学','同位素化学');
    threes['有机化学']=new Array('元素有机化学','天然产物有机化学','有机固体化学');
    
    function set_two(aone, atwo, athree){
        var sone, stwo, sthree;
        var i, ii;
        sone=aone.value;
        stwo=atwo.value;
        sthree=athree.value;
        atwo.length=1;
        athree.length=1;

        if(sone=='0') 
        	return;
        if(typeof(twos[sone])=='undefined') 
        	return;
        for(i=0; i<twos[sone].length; i++)
        {
        	ii = i+1;
        	atwo.options[ii] = new Option();
    	    atwo.options[ii].text = twos[sone][i];
    	    atwo.options[ii].value = twos[sone][i];
        }
    }

    function set_three(atwo, athree)
    {
        var stwo, sthree;
        var i, ii;
        stwo=atwo.value;
        sthree=athree.value;
        athree.length=1;

        if(stwo=='0') 
    	    return;
        if(typeof(threes[stwo])=='undefined') 
        	return;
        for(i=0; i<threes[stwo].length; i++)
        {
    	ii = i+1;
    	    athree.options[ii] = new Option();
    	    athree.options[ii].text = threes[stwo][i];
    	    athree.options[ii].value = threes[stwo][i];
        }
    }
  
</script>
</html>