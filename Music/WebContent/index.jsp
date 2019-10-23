<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>在线音乐网站</title>
</head>

<style>
    body{
    overflow-x:hidden;
    overflow-y:auto;
    }
    .top a:link{
	font-weight: bold;
	color: #E3E3E3;
	text-decoration: none;
	font-size: 20px;
    }
    .top a:visited{
	font-weight: bold;
	color: #FFF;
	text-decoration: none;
	background: black;
	font-size: 20px;
    }
    .top a:hover{
	font-weight: bold;
	color: #FFF;
	text-decoration: none;
	background: black;
	font-size: 20px;
    }
    .container{
    height: 35px;
    width: 800px;
    margin: 0px auto 0 auto;
    }
    .parent {
    position: relative;
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
    /* 容器 <div> - 需要定位下拉内容 */    
    .dropdown{    
    position:relative;    
    display:inline-block;    
    }    
    /* 下拉菜单内容，设置为隐藏 */    
    .dropdown-content{    
    min-width:150px;    
    background-color:#F5F5F5;    
    position:absolute;    
    right:0;    
    display:none;    
    box-shadow:0px 8px 15px 0px rgba(0,0,0,0.2);    
    }    
    /* 下拉按钮样式 */    
    .dropbtn{    
    color:white;    
    font-size:16px;    
    padding:15px;    
    border:none;    
    background-color:#00CD66;    
    cursor:pointer;    
    }    
    /* 下拉菜单链接的样式 */    
    .dropdown-content a{    
    color:black;    
    text-decoration:none;    
    font-size:16px;
    display:block;    
    }     
    /* 鼠标移入后显示下拉菜单 */    
    .dropdown:hover .dropdown-content{    
    display:block;    
    }    
    /* 鼠标移入后修改链接的背景色 */    
    .dropdown-content a:hover{    
    background-color:#E8E8E8;    
   }     
   /* 下拉菜单显示后修改下拉按钮的背景色 */    
   .dropdown:hover .dropbtn{    
   background-color:#008B00;    
   }  
   /*弹出层*/
   #popBox {
   display: none;
   background-color: #FFFFFF;
   z-index: 11;
   width: 400px;
   height: 200px;
   position:fixed;
   top:0;
   right:0;
   left:0;
   bottom:0;
   margin:auto;
   border: 1px solid grey;
   }
   .row1{
   background-color: #404040;
   width: 400px;
   height: 30px;
   }
   .row1 a{
   display: block;
   position: absolute;
   top: 0.5%;
   right: 1%;
   }
   .row{
   height:50px;
   text-align: center;
   line-height:77px;
   padding:0px 0px;
   }
   #popRBox {
   display: none;
   background-color: #FFFFFF;
   z-index: 11;
   width: 400px;
   height: 300px;
   position:fixed;
   top:0;
   right:0;
   left:0;
   bottom:0;
   margin:auto;
   border: 1px solid grey;
   }
     ul{ 
     list-style:none;
     }
      .slider{
       width:1000px;
       border: 0px #708090 solid; 
       padding:0px 0px;
       height: 350px;
       margin:auto;
       position: relative;
       cursor: pointer; 
       }
       /*轮播图*/
      .slider_pic{ 
      width: 800px;
      margin:auto;
      overflow: hidden;
      height: 350px;
      position: relative;
      }
      /*轮播图左右按钮*/
      .prev,.next{
      position: absolute;
      width: 20px;
      height: 20px;
      cursor: pointer;
      top:150px;
      background-color: #daa520; 
      text-align: center;
      line-height: 20px;
      font-weight: bold;
      color: #fff;
      }
      .next{
      right: 20px;
      }
      .topp{
      border-bottom:2px solid red;
      }
      .musicc{
	  background-color:white;    
	  width:400px;
	  bottom:10px;
	  right:20px;
      position: absolute;
      }
</style>

<body>
<table width="1250" height="50" border="0" style="background:#404040">
   <tr>
      <td width="100"></td>
      <td width="150" align="center">
         <img src="picture/icon.png" height="50"/></td>
      <td width="200" align="center" class="top">
         <a href="index.jsp" target="_parent">发现音乐</a>
      </td>
      <td width="100" align="center" class="top">
         <a href="mymusic.jsp" target="_parent"">我的音乐</a>
      </td>
      <td>
        <div class="container" style="position:absolute;left:900px;top:15px;">
         <form action="searchsong.jsp" class="parent" method="post" accept-charset="utf-8" onsubmit="document.charset='utf-8'">
             <input type="text" name="songname" class="search" placeholder="音乐">
             <input type="button" name="" id="" class="btn">
         </form>
        </div>
        </td>
        <td>
        <div class="dropdown" style="float:right">
         <button type="button" class="dropbtn">登录</button> 
        <div class="dropdown-content">          
            <a href="javascript:void(0)" onclick="userlogin()"><img src="picture/user.png">&nbsp;&nbsp;&nbsp;用户登录</a>
            <a href="adminLogin.jsp"><img src="picture/admin.png">&nbsp;管理员登录</a>
        </div>
        </div>
        </td>
   </tr>
</table>
<div id="popBox">
    <div class="content">
        <div class="row1"><div style="color: white;position: absolute;top: 1%;left: 2%;">用户登录</div><div class="top">
        <a href="javascript:void(0)" onclick="closeBox()" title="关闭窗口">×</a></div>
        </div>
	    <form name="form1" method="post" action="servlet/Login" onsubmit="return checkForm(this);">
		   <table width="361" height="150"border="0" align="center">
		   <tr height="20"></tr>
		   <tr height="30">
		      <td width="40"></td>
		      <td width="46" align="center">用&nbsp;户&nbsp;名</td>
		      <td width="259" align="center"><input type="text" name="username">&nbsp;&nbsp;*</td>
		   </tr>
		   <tr height="30">
		      <td width="40"></td>
		      <td align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
		      <td align="center"><input type="password" name="password"/>&nbsp;&nbsp;*</td>
		   </tr>
		   <tr height="30">
		      <td colspan="3" align="center">
		      <input type="submit" name="submit" value="登录"/>
		      &nbsp;&nbsp;&nbsp;&nbsp;
		      <input type="reset" name="reset" value="重置"/></td>
		   </tr>
		   <tr height="20">
		   <tr>
		      <td colspan="3" align="right">
		      <a href="javascript:void(0)" onclick="register()" style="color:grey;text-decoration: none;font-size: 12px;">没有账号？免费注册></a>
		   </tr>
		   </table>
	    </form>
</div></div>
<div id="popRBox">
    <div class="content">
        <div class="row1"><div style="color: white;position: absolute;top: 1%;left: 2%;">用户登录</div><div class="top">
        <a href="javascript:void(0)" onclick="closeRBox()" title="关闭窗口">×</a></div>
        </div>
	    <form name="form1" action="doRegister.jsp" method="post" onSubmit="return check(this)">
		<table border="0" align="center">
		<tr height="30"></tr>
		  <tr>
		   <td width="80"  align="center">用&nbsp;户&nbsp;名</td>
		   <td width="226"  align="center"><input type="text" name="username">*</td></tr>
		<tr><td align="center">密&nbsp;&nbsp;码&nbsp;&nbsp;</td>
		   <td align="center"><input type="password" name="userpwd">*</td></tr>
		<tr><td align="center">密码确认</td>
		   <td align="center"><input type="password" name="userpwd1">*</td></tr>
		<tr>
		   <td align="center">性&nbsp;&nbsp;别&nbsp;&nbsp;</td>
		   <td align="center"><input type="radio" name="sex" checked value="男">男
		       <input type="radio" name="sex" value="女">女
		   </td></tr>
		<tr>
		   <td align="center">出生年月</td>
		   <td align="center"><input type="text" name="birthday" onBlur="checkDate()"></td></tr>
		<tr>
		   <td align="center">邮&nbsp;&nbsp;箱&nbsp;&nbsp;</td>
		   <td align="center"><input type="text" name="mail" onBlur="checkAddress()"></td></tr>
		<tr>
		   <td align="center">联系方式</td>
		   <td align="center"><input type="text" name="phonenum"></td></tr>
		<tr>
		   <td colspan="2" align="center">
		      <input type="submit" value="提交">
		      &nbsp;&nbsp;&nbsp;
		      <input type="reset" value="清除">
		   </td></tr>
		</table>
</form>
</div></div>
<hr size="1" color="white" width="1000px">
<div class="slider">
     <span class="prev" id="prev" onclick="prev()"><<</span>
     <span class="next " id="next" onclick="next()">>></span>
        <div class="slider_pic">
         <a id="aa" href="SongDetail.jsp?songid=1" target="_parent"><img id="img1" src="picture/mzt.png" width="100%" height="100%" /></a>
	</div>
</div> 
<table class="topp" width="1000px" align="center">
   <tr>
     <td width="30px"><img src="picture/red.png"/></td>
     <td width="200px"><h2>热门推荐</h2></td>
     <td width="650px"> <a href="TagDetail.jsp?tagid=1" target="_parent">华语</a> |<a href="TagDetail.jsp?tagid=6" target="_parent">流行</a> |
      <a href="TagDetail.jsp?tagid=7" target="_parent">摇滚</a> | <a href="TagDetail.jsp?tagid=11" target="_parent">爵士</a> | 
      <a href="TagDetail.jsp?tagid=8" target="_parent">电子</a> </td>
     <td><a href="allSheet.jsp" target="_parent">更多>></a></td>
   </tr>
</table>
<table align="center" width="1000px" align="center">
		<tr height="50">
		<%
			try{
				request.setCharacterEncoding("UTF-8");
				String id="";
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Sheet order by cnum desc";
				rs=connDB.executeQuery(strSql);//查询
				int i=0;
				while(rs.next()){
					String sheetid=rs.getString("id");
					String name=rs.getString("name");
					String userid=rs.getString("userid");
					String date=rs.getString("date");
					String introduction=rs.getString("introduction");
					String picture=rs.getString("picture");
					String cnum=rs.getString("cnum");
			i++;
			if(i<=8){
            %>
				<td width="30" align="center">
				<a href="SheetDetail.jsp?sheetid=<%=sheetid %>" target="_parent"><img src="picture/<%=picture %>" width="200px" height="200px"></a></br>
			<a href="SheetDetail.jsp?sheetid=<%=sheetid %>" target="_parent"><%=name %></a>
				</td>
				<%
				if(i%4==0){
					%>
					</tr>
					<tr height="50">
					<% 
				}
			}else{
			%>
			 </tr>
			<%	
			}
			%>
		<%}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
	</table>
<table class="topp" width="1000px" align="center">
   <tr>
     <td width="30px"><img src="picture/red.png"/></td>
     <td width="200px"><h2>新歌上架</h2></td>
     <td width="650px"> </td>
     <td><a href="allSong.jsp" target="_parent">更多>></a></td>
   </tr>
</table>
<table align="center" width="1000px" align="center">
		<tr height="50">
		<%
			try{
				request.setCharacterEncoding("UTF-8");
				String id="";
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Song order by date desc";
				rs=connDB.executeQuery(strSql);//查询
				int i=0;
				while(rs.next()){
					String songid=rs.getString("songid");
					String name=rs.getString("name");
					String singer=rs.getString("singer");
					String album=rs.getString("album");
					String picture=rs.getString("picture");
					String fujian=rs.getString("fujian");
					String date=rs.getString("date");
			i++;
			if(i<=8){
            %>
				<td width="30" align="center">
				<a href="SongDetail.jsp?songid=<%=songid %>" target="_parent">
				<img src="picture/<%=picture %>" width="200px" height="200px"></a>
				<br><a href="SongDetail.jsp?songid=<%=songid %>" target="_parent"><%=name %></a><br><%=singer %>
				</td>
				<%
				if(i%4==0){
					%>
					</tr>
					<tr height="50">
					<% 
				}
			}else{
			%>
			 </tr>
			<%	
			}
			%>
		<%}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
	</table>

<script>
    /*点击弹出按钮*/
    function userlogin() {
        var popBox = document.getElementById("popBox");
        popBox.style.display = "block";
    };
 
    /*点击关闭按钮*/
    function closeBox() {
        var popBox = document.getElementById("popBox");
        popBox.style.display = "none";
    }
    /*点击弹出按钮*/
    function register() {
        var popRBox = document.getElementById("popRBox");
        popRBox.style.display = "block";
    };
 
    /*点击关闭按钮*/
    function closeRBox() {
        var popRBox = document.getElementById("popRBox");
        popRBox.style.display = "none";
    }
    function checkForm(form){
    	if(form.username.value==""){
    		alert("用户名不能为空！");
    		form.username.focus();
    		return false;
    	}
    	if(form.userpwd.value==""){
    		alert("密码不能为空！");
    		form.password.focus();
    		return false;
    	}
    	return true;
    }
    function check(theform){		
		if(theform.username.value==""){
		   alert("用户名不能为空！");
		   theform.username.focus();
		   return false;
		 }
		 if(theform.userpwd.value==""){
		   alert("密码不能为空！");
		   theform.userpwd.focus();
		   return false;
		 }
	    if(theform.userpwd.value!=theform.userpwd1.value){
	       alert("两次密码不一致，请重新输入！");
	       theform.userpwd2.value="";
	       theform.userpwd2.focus();
	       return false;
	    }
            if(theform.mail.value==""){
		   alert("邮箱不能为空！");
		   theform.mail.focus();
		   return false;
            }
	}
    function checkAddress() {    
        var reg =  /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/;    
        if(!reg.test(document.form1.mail.value)){
	       alert("请填写正确的邮箱格式！");
           document.form1.mail.value="";
	       document.form1.mail.focus();
	       return false;
	    }
    }
    function checkDate() {    
        var reg = /^\d{4}(\-|\/|\.)\d{1,2}\1\d{1,2}$/ ;    
        if(!reg.test(document.form1.birthday.value)){
	       alert("请填写正确的日期格式！");
           document.form1.birthday.value="";
	       document.form1.birthday.focus();
	       return false;
	    }
    }
    var a=new Array("mzt.png","ban.png","xl.png","pmig.png");
    i=0;
    function prev(){
    	if(i==0)
    		i=3;
    	else if(i>0)
    		i--;
    	document.getElementById("img1").src="picture/"+a[i];
    	j=i+1;
    	document.getElementById("aa").href="SongDetail.jsp?songid="+j;
    }
    function next(){
    	if(i==3)
    		i=0;
    	else if(i<3)
    		i++;
    	document.getElementById("img1").src="picture/"+a[i];
    	j=i+1;
    	document.getElementById("aa").href="SongDetail.jsp?songid="+j;
    }
</script>
</body>
</html>