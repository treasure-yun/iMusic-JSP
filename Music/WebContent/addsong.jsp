<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<script src="jquery/jquery-3.3.1/jquery-3.3.1.js"></script>
<style>
    .exitbtn{    
    color:white;    
    font-size:15px;    
    padding:10px;    
    border:none;    
    background-color:#00CD66;    
	text-decoration:none;
    cursor:pointer;    
    }  
    .mainframe{
    position:fixed;
    margin:auto;
    left:0;
    right:0;
    }
    .container{
    height: 35px;
    width: 800px;
    margin: 0px auto 0 auto;
    }
    .search{
    width: 170px;
    height: 35px;
    border-radius: 18px;
    outline: none;
    border: 1px solid #ccc;
    padding-left: 20px;
    position: absolute;
    }
    .btn{
    width: 24px;
    height: 24px;
    top: 7px;
    left: 150px;
    outline: none;
    border: none;
    position: absolute;
    cursor: pointer;
    background: url("picture/search.png");
    }
</style>
<body>
<table width="1250" height="50" border="0" style="background:#404040">
   <tr>
      <td width="100"></td>
      <td width="150" align="center">
         <img src="picture/icon.png" height="50"/></td>
      <td width="200" align="center">
         <font size="5" color="white"><b>后台管理系统</b></font>
      </td>
      <td>
        <div class="container" style="position:absolute;left:900px;top:15px;">
         <form action="asearchsong.jsp" target="mainFrame" class="parent" method="post" accept-charset="utf-8" onsubmit="document.charset='utf-8'">
             <input type="text" name="songname" class="search" placeholder="音乐">
             <input type="button" name="" id="" class="btn">
         </form>
        </div>
        </td>
      <td align="right">
         <a class="exitbtn" href="adminloginout.jsp">退出</a>
      </td>
   </tr>
</table>
<table width="1250" height="50" border="0" style="background-color:#BCD2EE; ">
<tr><td width="100"></td><td width="150" align="center"><a href="userAdmin.jsp" target="_parent">用户管理</a></td>
<td align="center"><a href="sheetAdmin.jsp" target="_parent">歌单管理</a></td>
<td width="150" align="center"><a href="songAdmin.jsp" target="_parent">歌曲管理</a></td>
<td width="150" align="center"><a href="addsong.jsp" target="_parent">添加歌曲</a></td>
<td width="550" align="center"></td></tr>
</table>
<form action="addsongdetail.jsp" method="post">
<table  border="0" align="center">	
      <tr height="22">
      <td align="right"></td>
      <td width="200px">
      <td rowspan="5">
            <img id="iimg" src="picture/" width="150px" height="150px"/>
            <br><form action="addsongdetail.jsp" method="post" enctype="multipart/form-data">
            <input type="file" id="chooseImage" name="file" mutiple="mutiple"></form></td>
      </tr>
      <tr height="25">
      <td align="right">歌曲名：</td>
      <td align="left"><input type="text" name="songname"></td>
      </tr>
      <tr height="25">
      <td align="right">歌手：</td>
      <td align="left"><input type="text" name="singer"></td>
      </tr>
      <tr height="25">
      <td align="right">所在专辑：</td>
      <td align="left"><input type="text" name="album"></td>
      </tr>
      <tr height="25">
      <td align="right">附件路径：</td>
      <td align="left"><input type="text" name="fujian"></td>
      </tr>
	</table>
    <p align="center">
        <input type="submit" name="submit" value="保存">&nbsp;
        <input type="button" name="cancel" value="取消">&nbsp;&nbsp;
    </p>
    </form>
<script>
$('#chooseImage').on('change',function(){
   	var filePath = $(this).val(),         //获取到input的value，里面是文件的路径
   		fileFormat = filePath.substring(filePath.lastIndexOf(".")).toLowerCase(),
   		src = window.URL.createObjectURL(this.files[0]); //转成可以在本地预览的格式
   	// 检查是否是图片
   	if( !fileFormat.match(/.png|.jpg|.jpeg/) ) {
   		error_prompt_alert('上传错误,文件格式必须为：png/jpg/jpeg');
       	return;  
       }
       $('#iimg').attr('src',src);
});
$('#fujian').on('change',function(){
   	var filePath = $(this).val(),         //获取到input的value，里面是文件的路径
   		fileFormat = filePath.substring(filePath.lastIndexOf(".")).toLowerCase(),
   		src = window.URL.createObjectURL(this.files[0]); //转成可以在本地预览的格式
   	if( !fileFormat.match(/.mp3/) ) {
   		error_prompt_alert('上传错误,文件格式必须为：mp3');
       	return;  
       }
});
</script>
</body>
</html>