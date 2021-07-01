<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>店铺</title>
    <style>
        table{
            border-collapse: collapse;
        }
        th,td{
            border:1px solid #ccccff;
            padding: 5px;
        }
        td{
            text-align: center;
        }
    </style>
</head>
<body>
<br><div align="center"><a href="addgoods.html">添加商品</a></div><br>
<table align="center">
    <tr><th>商品编号</th><th>商品名称</th><th>所属店铺</th><th>商品类型</th><th>商品颜色</th><th>商品型号</th><th>商品样例</th><th>详情/删除</th></tr>
    <?php
    $conn=mysqli_connect("localhost","root","root");
    if (!$conn) {
        die('数据库连接失败'.$mysql_error());
    }
    mysqli_select_db($conn,"class");
    //查询数据表中的所有数据,并按照id降序排列
    $result=mysqli_query($conn,"SELECT * FROM goods where shopid = 4");
    //获取数据表的数据条数
    $dataCount=mysqli_num_rows($result);

    //打印输出所有数据
    for($i=0;$i<$dataCount;$i++){
        $result_arr=mysqli_fetch_assoc($result);
        $goodsid1=$result_arr['goodsid'];
        $goodsid=(int)$goodsid1;
        $goodsname=$result_arr['goodsname'];
        $shopid=$result_arr['shopid'];
        $goodstype=$result_arr['goodstype'];
        $goodscolor=$result_arr['goodscolor'];
        $goodssize=$result_arr['goodssize'];
        echo "<tr><td>$goodsid</td><td>$goodsname</td><td>$shopid</td><td>$goodstype</td><td>$goodscolor</td><td>$goodssize</td><td><img src=\"img_show.php?goodsid=$goodsid\" height='100' width='150'></td><td><a href='editgoods.php?goodsid=$goodsid'>修改</a> <a href='deletegoods.php?goodsid=$goodsid'>删除</a></td></tr>";
    }
    ?>
</table>
</body>
</html>