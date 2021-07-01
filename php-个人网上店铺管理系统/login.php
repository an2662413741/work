<meta charset="utf-8">
<?php
/**
 * 接受用户登陆时提交的验证码
 */
session_start();
//1. 获取到用户提交的验证码
$captcha = $_POST["captcha"];
//2. 将session中的验证码和用户提交的验证码进行核对,当成功时提示验证码正确，并销毁之前的session值,不成功则重新提交
if(strtolower($_SESSION["captcha"]) == strtolower($captcha)){
    $password = $_POST['password'];
    $_SESSION["captcha"] = "";
}else{
    $password = 0;
}
$conn = mysqli_connect('localhost','root','root','dbtrain') or die('数据库连接失败');
$conn->query("SET NAMES 'UTF8'");

$username = $_POST['username'];

$sql="SELECT * FROM student where sid='{$username}' and spwd='{$password}'";

$result=$conn->query($sql);
$row = mysqli_num_rows($result);
//若表中存在输入的账号和密码，row=1；若表中用户名不存在或密码错误，则row=0

if($row == 1){
    echo $row['username']."登陆成功!";
}
else{
    echo"密码或验证码错误，请重新登录！";
}