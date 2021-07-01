<?php
//排空错误
if(empty($_GET['goodsid'])){
    die('goodsid is empty');
}
//连接数据库
$conn=mysqli_connect("localhost","root","root");
if (!$conn) {
    die('数据库连接失败'.$mysql_error());
}
mysqli_select_db($conn,"class");

$goodsid=intval($_GET['goodsid']);

//删除指定数据
mysqli_query($conn,"DELETE FROM goods WHERE goodsid=$goodsid");
//排错并返回页面
if(mysqli_error()){
    echo mysqli_error();
}else{
    header("Location:allgoods.php");
}