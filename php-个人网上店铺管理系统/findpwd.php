<?php
header ( "Content-type:text/html;charset=utf-8" );
$conn=mysqli_connect("localhost","root","root");
if (!$conn) {die('数据库连接失败'.$mysql_error());}
mysqli_select_db($conn,"class");
//接收 参数
$username=$_POST['username'];
//SQL语句主题
$query="select * from user where username = $username";
//执行查询
$result=mysqli_query($conn,$query);
if (!$result) {
    printf("Error: %s\n", mysqli_error($conn));
    exit();
}
//遍历结果
while($row=mysqli_fetch_array($result)){
    echo "您的密码为：".$row['password'];
}
?>