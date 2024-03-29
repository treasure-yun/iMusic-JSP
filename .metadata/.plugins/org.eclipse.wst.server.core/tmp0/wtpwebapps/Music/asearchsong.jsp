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
    a:hover{text-decoration: none;}
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
<td width="150" align="center"><a href="ongAdmin.jsp" target="_parent">歌曲管理</a></td>
<td width="150" align="center"><a href="addsong.jsp" target="_parent">添加歌曲</a></td>
<td width="550" align="center"></td></tr>
</table>
<table align="center" width="1000px" border="0">
		<caption>
			<h2>歌曲搜索结果</h2>
		</caption>
		<tr>
			<th bgcolor="#A9D0F5" scope="col">歌曲id</th>
			<th bgcolor="#A9D0F5" scope="col">歌曲名称</th>
			<th bgcolor="#A9D0F5" scope="col">歌手</th>
			<th bgcolor="#A9D0F5" scope="col">所在专辑</th>
			<th bgcolor="#A9D0F5" scope="col">图片</th>
			<th bgcolor="#A9D0F5" scope="col">上架日期</th>
			<th bgcolor="#A9D0F5" scope="col"></th>
			<th bgcolor="#A9D0F5" scope="col"></th>
		</tr>
    <%
			try{
				request.setCharacterEncoding("UTF-8");
				String songname = request.getParameter("songname"); 
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Song where name like '%"+songname+"%'";
				rs=connDB.executeQuery(strSql);//查询
				while(rs.next()){
					String songid=rs.getString("songid");
					String name=rs.getString("name");
					String singer=rs.getString("singer");
					String album=rs.getString("album");
					String picture=rs.getString("picture");
					String date=rs.getString("date");
		%>
		
		<tr>
			<td align="center"><%=songid %></td>
			<td align="center"><%=name %></td>
			<td align="center"><%=singer %></td>
			<td align="center"><%=album %></td>
			<td align="center"><img src="picture/<%=picture %>" width="100px" height="100px"></td>
			<td align="center"><%=date %></td>
			<td align="center"><a href="asongdetail.jsp?songid=<%=songid %>" target="mainFrame">查看歌曲信息</a></td>
			<td align="center"><a href="songDel.jsp?songid=<%=songid %>">删除</a></td>
		</tr>
	    <%
			    }
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
</table>
</body>
</html>