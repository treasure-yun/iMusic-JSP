<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台管理系统</title>
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
</head>
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
<table align="center" width="1000">
		<caption>
			<h2>所有用户信息</h2>
		</caption>
		<tr>
			<th bgcolor="#A9D0F5" scope="col">用户id</th>
			<th bgcolor="#A9D0F5" scope="col">用户名</th>
			<th bgcolor="#A9D0F5" scope="col">性别</th>
			<th bgcolor="#A9D0F5" scope="col">出生年月</th>
			<th bgcolor="#A9D0F5" scope="col">手机号</th>
			<th bgcolor="#A9D0F5" scope="col">邮箱</th>
		</tr>
		<%
			try{
				request.setCharacterEncoding("UTF-8");
				String id="";
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Users";
				rs=connDB.executeQuery(strSql);//查询
				while(rs.next()){
					String userid=rs.getString("userid");
					String username=rs.getString("username");
					String sex=rs.getString("sex");
					String birthday=rs.getString("birthday");
					String tel=rs.getString("tel");
					String email=rs.getString("email");
		%>
		
		<tr>
			<td height="22" align="center"><%=userid %></td>
			<td height="22" align="center"><%=username %></td>
			<td height="22" align="center"><%=sex %></td>
			<td height="22" align="center"><%=birthday %></td>
			<td height="22" align="center"><%=tel %></td>
			<td height="22" align="center"><%=email %></td>
		</tr>
		<%}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
	</table>
</body>
</html>