<?php
//首先进行非空排错
if(!isset($_POST['goodsname'])){
    die('商品名称不能为空');
}
if(!isset($_POST['shopid'])){
    die('所属店铺不能为空');
}
if(!isset($_POST['goodstype'])){
    die('商品类型不能为空');
}
if(!isset($_POST['goodscolor'])){
    die('商品颜色不能为空');
}
if(!isset($_POST['goodssize'])){
    die('商品型号不能为空');
}
$goodsname=$_POST['goodsname'];
$shopid=$_POST['shopid'];
$goodstype=$_POST['goodstype'];
$goodscolor=$_POST['goodscolor'];
$goodssize=$_POST['goodssize'];

if(count($_FILES) > 0) {
    if (is_uploaded_file($_FILES['img']['tmp_name'])) {
        // 转成二进制
        $imgBlob = addslashes(file_get_contents($_FILES['img']['tmp_name']));
    }
}

//连接数据库
$conn=mysqli_connect("localhost","root","root");
if (!$conn) {
    die('数据库连接失败'.$mysql_error());
}
mysqli_select_db($conn,"class");



//插入数据
mysqli_query($conn,"INSERT INTO goods(goodsname,shopid,goodstype,goodscolor,goodssize,goodsphoto) VALUES ('{$goodsname}','{$shopid}','{$goodstype}','{$goodscolor}','{$goodssize}','{$imgBlob}')");

//返回列表页面
if(mysqli_error()){
    echo mysqli_error();
}else{
    header("Location:allgoods.php");
}