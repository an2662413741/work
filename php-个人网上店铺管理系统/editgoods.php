<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改商品</title>
</head>
<body>
<?php
if(!empty($_GET['goodsid'])){
    //连接mysql数据库
    $conn=mysqli_connect("localhost","root","root");
    if (!$conn) {
        die('数据库连接失败'.$mysql_error());
    }
    mysqli_select_db($conn,"class");

    //查找id
    $goodsid=intval($_GET['goodsid']);
    $result=mysqli_query($conn,"SELECT * FROM goods WHERE goodsid=$goodsid");

    //获取结果数组
    $result_arr=mysqli_fetch_assoc($result);
}else{
    die('goodsid not define');
}
?>
<form action="editgoods_server.php" method="post">
    <input type="text" name="goodsid" value="<?php echo (int)$result_arr['goodsid']?>" hidden/><br>
    <label>商品名称：</label><input type="text" name="goodsname" value="<?php echo $result_arr['goodsname']?>"/><br>
    <input type="text" name="shopid" value="<?php echo $result_arr['shopid']?>" hidden/><br>
    <label>商品类型：</label><input type="text" name="goodstype" value="<?php echo $result_arr['goodstype']?>"/><br><br>
    <label>商品颜色：</label><input type="text" name="goodscolor" value="<?php echo $result_arr['goodscolor']?>"/><br><br>
    <label>商品型号：</label><input type="text" name="goodssize" value="<?php echo $result_arr['goodssize']?>"/><br><br>
    <input type="submit" value="提交修改">
</form>
</body>
</html>