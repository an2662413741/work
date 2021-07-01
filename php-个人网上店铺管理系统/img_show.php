<?php
if(empty($_GET['goodsid'])){
    die('goodsid is empty');
}
$conn=mysqli_connect("localhost","root","root");
if (!$conn) {
    die('数据库连接失败'.$mysql_error());
}
mysqli_select_db($conn,"class");
$goodsid=intval($_GET['goodsid']);
$sql = "SELECT * FROM goods WHERE goodsid = $goodsid";
$result = mysqli_query($conn,$sql);
$row = mysqli_fetch_array($result);
header("Content-type".'png');
echo $row["goodsphoto"];
?>