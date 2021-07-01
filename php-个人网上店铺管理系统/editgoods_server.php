<?php
if(empty($_POST['goodsname'])){
    die('goodsname is empty');
}
if(empty($_POST['shopid'])){
    die('shopid is empty');
}
if(empty($_POST['goodstype'])){
    die('goodstype is empty');
}
if(empty($_POST['goodscolor'])){
    die('goodscolor is empty');
}
if(empty($_POST['goodssize'])){
    die('goodssize is empty');
}

$goodsid=$_POST['goodsid'];
$goodsname=$_POST['goodsname'];
$shopid=$_POST['shopid'];
$goodstype=$_POST['goodstype'];
$goodscolor=$_POST['goodscolor'];
$goodssize=$_POST['goodssize'];

//连接数据库
$conn=mysqli_connect("localhost","root","root");
if (!$conn) {
    die('数据库连接失败'.$mysql_error());
}
mysqli_select_db($conn,"class");

//修改指定数据
mysqli_query($conn,"UPDATE goods SET goodsname='$goodsname',shopid='$shopid',goodstype='$goodstype',goodscolor='$goodscolor',goodssize='$goodssize' WHERE goodsid=$goodsid");

//排错并返回
if(mysqli_error()){
    echo mysqli_error();
}else{
    header("Location:allgoods.php");
}