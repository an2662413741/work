<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册用户</title>
</head>
<body>
<?php
session_start();
$username=$_POST["username"];
$name = $_POST['name'];
$password = $_POST['password'];
$email=$_POST['email'];
$power = $_POST['power'];
$phone = $_POST['phone'];
$power2 = (int)$power;

$conn=mysqli_connect("localhost","root","root");
if (!$conn) {
    die('数据库连接失败'.$mysql_error());
}
mysqli_select_db($conn,"class");

$dbusername=null;
$result=mysqli_query($conn,"select * from user where username ='{$username}'");
if (!$result) {
    printf("Error: %s\n", mysqli_error($conn));
    exit();
}
while ($row=mysqli_fetch_array($result)) {
    $dbusername=$row["username"];

}
if(!is_null($dbusername)){
    ?>
    <script type="text/javascript">
        alert("用户已存在");
        window.location.href="register.html";
    </script>
    <?php
}
mysqli_query($conn,"insert into user (username,name,password,email,power,phone) values('{$username}','{$name}','{$password}','{$email}','{$power}','{$phone}')") or die("存入数据库失败".mysqli_error()) ;

if ($power2 == 1){
    mysqli_query($conn,"insert into shop (shopid,username) values('{$username}','{$username}')") or die("存入数据库失败".mysqli_error());
}

mysqli_close($conn);
?>
<script type="text/javascript">
    alert("注册成功");
    window.location.href="login.html";
</script>
</body>
</html>