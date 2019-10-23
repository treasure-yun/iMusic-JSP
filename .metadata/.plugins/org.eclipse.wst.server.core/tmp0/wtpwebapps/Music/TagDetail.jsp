<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<jsp:useBean id="connDB1" scope="page" class="conn.Conn"/>
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
    .btnn{
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
a:hover{text-decoration: none;}
</style>
<body>
<table width="1250" height="50" border="0" style="background:#404040">
   <tr>
      <td width="100"></td>
      <td width="150" align="center">
         <img src="picture/icon.png" height="50"/></td>
      <td width="200" align="center" class="top">
        <%
           if(session.getAttribute("username")==null){
        %>
         <a href="index.jsp">发现音乐</a>
         <%}else{ %>
         <a href="index2.jsp">发现音乐</a>
         <%} %>
      </td>
      <td width="100" align="center" class="top">
         <a href="mymusic.jsp">我的音乐</a>
      </td>
      <td>
        <div class="container" style="position:absolute;left:900px;top:15px;">
         <form action="searchsong.jsp" class="parent" method="post" accept-charset="utf-8" onsubmit="document.charset='utf-8'">
             <input type="text" name="songname" class="search" placeholder="音乐">
             <input type="button" name="" id="" class="btnn">
         </form>
        </div>
        </td>
        <td>
        <%
           if(session.getAttribute("username")==null)
           {
        %>
        <div class="dropdown" style="float:right">
         <button type="button" class="dropbtn">登录</button> 
        <div class="dropdown-content">          
            <a href="javascript:void(0)" onclick="userlogin()"><img src="picture/user.png">&nbsp;&nbsp;&nbsp;用户登录</a>
            <a href="adminLogin.jsp"><img src="picture/admin.png">&nbsp;管理员登录</a>
        </div></div>
        <%
           }else{
        %>
        <div class="dropdown" style="float:right">
         <button type="button" class="dropbtn"><%=(String)session.getAttribute("username") %></button> 
        <div class="dropdown-content">          
            <a href="mymusic.jsp" target="_parent"><img src="picture/my.png">&nbsp;我的主页</a>
            <a href="index.jsp" target="_parent"><img src="picture/back.png">&nbsp;退出</a>
        </div>
        </div><%} %>
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
<table width="1000px" align="center">
<tr><td width="100px">
<%
			try{
				request.setCharacterEncoding("UTF-8");
				String tagid = request.getParameter("tagid"); 
				String id="";
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Tag where id='"+tagid+"'";
				rs=connDB.executeQuery(strSql);//查询
				int i=0;
				while(rs.next()){
					String tagname=rs.getString("name");
%>
<h2>&nbsp;&nbsp;<%=tagname %></h2></td><td>
			<% }}catch(SQLException e){
					out.print(e.getMessage());
				}
			%>
<div class="dropdown" style="float:right">
        <button type="button" class="dropbtn">选择分类</button> 
        <div class="dropdown-content">   
           <table width="730px" align="center">
           <tr> 
           <td width="90px">&nbsp;&nbsp;&nbsp;&nbsp;语种    |</td>      
            <td width="80px"><a href="TagDetail.jsp?tagid=1" target="_parent">华语</a></td>
            <td width="80px"><a href="TagDetail.jsp?tagid=2" target="_parent">欧美</a></td>          
            <td width="80px"><a href="TagDetail.jsp?tagid=3" target="_parent">日韩</a></td>         
            <td width="80px"><a href="TagDetail.jsp?tagid=4" target="_parent">粤语</a></td>  
            <td width="80px"><a href="TagDetail.jsp?tagid=5" target="_parent">小语种</a></td> 
           </tr>  
           <tr>  
           <td>&nbsp;&nbsp;&nbsp;&nbsp;风格    |</td>     
            <td><a href="TagDetail.jsp?tagid=6" target="_parent">流行</a></td> 
            <td><a href="TagDetail.jsp?tagid=7" target="_parent">摇滚</a></td>     
            <td><a href="TagDetail.jsp?tagid=8" target="_parent">电子</a></td> 
            <td><a href="TagDetail.jsp?tagid=9" target="_parent">古风</a></td>     
            <td><a href="TagDetail.jsp?tagid=10" target="_parent">民族</a></td> 
            <td width="80px"><a href="TagDetail.jsp?tagid=11" target="_parent">爵士</a></td> 
            <td width="80px"><a href="TagDetail.jsp?tagid=12" target="_parent">舞曲</a></td> 
            <td width="80px"><a href="TagDetail.jsp?tagid=13" target="_parent">轻音乐</a></td> 
            </tr>
            <tr>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;情感    |</td>
            <td><a href="TagDetail.jsp?tagid=14" target="_parent">怀旧</a></td> 
            <td><a href="TagDetail.jsp?tagid=15" target="_parent">清新</a></td> 
            <td><a href="TagDetail.jsp?tagid=16" target="_parent">伤感</a></td> 
            <td><a href="TagDetail.jsp?tagid=17" target="_parent">快乐</a></td> 
            <td><a href="TagDetail.jsp?tagid=18" target="_parent">治愈</a></td> 
            <td><a href="TagDetail.jsp?tagid=19" target="_parent">放松</a></td> 
            <td><a href="TagDetail.jsp?tagid=20" target="_parent">安静</a></td> 
            <td><a href="TagDetail.jsp?tagid=21" target="_parent">思念</a></td> 
            </tr>
            <tr>
           <td>&nbsp;&nbsp;&nbsp;&nbsp;主题    |</td>
            <td><a href="TagDetail.jsp?tagid=22" target="_parent">影视原声</a></td> 
            <td><a href="TagDetail.jsp?tagid=23" target="_parent">经典</a></td> 
            <td><a href="TagDetail.jsp?tagid=24" target="_parent">校园</a></td> 
            <td><a href="TagDetail.jsp?tagid=25" target="_parent">翻唱</a></td> 
            </tr>
            </table>
        </div>
        </div></td></tr></table>
<hr width="1000px" color="red" size="3">
<table align="center" width="1000px" align="center">
		<tr height="50">
		<%
			try{
				request.setCharacterEncoding("UTF-8");
				String tagid = request.getParameter("tagid"); 
				String strSql="";
				ResultSet rs=null;
				strSql="select * from SheetTag where tagid='"+tagid+"'";
				rs=connDB.executeQuery(strSql);//查询
				int i=0;
				while(rs.next()){
					String sheetid=rs.getString("sheetid");
					try{
						request.setCharacterEncoding("UTF-8");
						String strSql1="";
						ResultSet rs1=null;
						strSql1="select * from Sheet where id='"+sheetid+"'";
						rs1=connDB1.executeQuery(strSql1);//查询
						while(rs1.next()){
							String sheetname=rs1.getString("name");
							String userid=rs1.getString("userid");
							String date=rs1.getString("date");
							String introduction=rs1.getString("introduction");
							String picture=rs1.getString("picture");
							String cnum=rs1.getString("cnum");
		%>
			<td width="30" align="center">
			<a href="SheetDetail.jsp?sheetid=<%=sheetid %>" target="_parent">
			<img src="picture/<%=picture %>" width="200px" height="200px"></a><br><a><%=sheetname %></a>
			</td>
			<%
			i++;
			if(i==4){
				%>
				</tr>
				<tr height="50">
				<% 
				i=0;
			}
			%>
		<%}
			}catch(SQLException e){
				out.print(e.getMessage());
			}}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
		</tr>
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
</script>
</body>
</html>