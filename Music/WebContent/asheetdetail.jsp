<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<jsp:useBean id="connDB1" scope="page" class="conn.Conn"/>
<jsp:useBean id="connDB2" scope="page" class="conn.Conn"/>
<jsp:useBean id="connDB3" scope="page" class="conn.Conn"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
a:hover{text-decoration: none;}
.tag{
    border: 1px;
    display: inline-block;
    padding: 5px 15px;
    border-radius: 4px;
    background-color: grey;
    color: #fff;
    cursor: pointer;
	text-decoration:none;
}
.btn{
    display: inline-block;
    margin-top: 10px;
    padding: 10px 24px;
    border-radius: 4px;
    background-color: #63b7ff;
    color: #fff;
    cursor: pointer;
}
#music{
display:none;
}
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
             <input type="button" name="" id="" class="btnn">
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
<table align="center" width="1000px" border="0">
		<%
			try{
				request.setCharacterEncoding("UTF-8");
				String sheetid = request.getParameter("sheetid"); 
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Sheet where id='"+sheetid+"'";
				rs=connDB.executeQuery(strSql);//查询
				while(rs.next()){
					String id=rs.getString("id");
					String sheetname=rs.getString("name");
					String userid=rs.getString("userid");
					String date=rs.getString("date");
					String introduction=rs.getString("introduction");
					String picture=rs.getString("picture");
					String cnum=rs.getString("cnum");
	    %>
	<tr>
		<td rowspan="5" width="300px"><img src="picture/<%=picture %>" width="200px" height="200px"></td>
		<td><img src="picture/sheet.png">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="5"><%=sheetname %></font></td>
	</tr>
	<%
			try{
				request.setCharacterEncoding("UTF-8");
				String strSql1="";
				ResultSet rs1=null;
				strSql1="select * from Users where userid='"+userid+"'";
				rs1=connDB1.executeQuery(strSql1);//查询
				while(rs1.next()){
					String username=rs1.getString("username");
	    %>
	    <tr>
	       <td><%=username %><img src="picture/xx.png">&nbsp;&nbsp;<%=date %>&nbsp;创建</td>
	    </tr>
	    <%
			    }
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
	    <tr><td>标签：
	    <%
			try{
				request.setCharacterEncoding("UTF-8");
				String strSql2="";
				ResultSet rs2=null;
				strSql2="select * from SheetTag where sheetid='"+sheetid+"'";
				rs2=connDB2.executeQuery(strSql2);//查询
				while(rs2.next()){
					String tagid=rs2.getString("tagid");
	    %>
	    <%
			try{
				request.setCharacterEncoding("UTF-8");
				String strSql3="";
				ResultSet rs3=null;
				strSql3="select * from Tag where id='"+tagid+"'";
				rs3=connDB3.executeQuery(strSql3);//查询
				while(rs3.next()){
					String tagname=rs3.getString("name");
	    %>
	    <a href="" target="_parent" class="tag"><%=tagname %></a>
	    <%
			    }
			}catch(SQLException e){
				out.print(e.getMessage());
			}  }
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
	    </td>
	    </tr>
	    <tr>
	    <td>介绍：<%=introduction %></td>
	    </tr>
        <%
			    }
			}catch(SQLException e){
			}
		%>
</table>
<hr width="1000px" color="white" size="6">
<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;歌曲列表</h2>
<hr width="1000px" color="red" size="2">
<table align="center" width="1000px" border="0">
        <tr>
			<th bgcolor="#A9D0F5" scope="col">歌曲标题</th>
			<th bgcolor="#A9D0F5" scope="col">歌手</th>
			<th bgcolor="#A9D0F5" scope="col">专辑</th>
		</tr>
    <%
			try{
				request.setCharacterEncoding("UTF-8");
				String sheetid = request.getParameter("sheetid"); 
				String strSql="";
				ResultSet rs=null;
				strSql="select * from SongSheet where sheetid='"+sheetid+"'";
				rs=connDB.executeQuery(strSql);//查询
				while(rs.next()){
					String songid=rs.getString("songid");
	    %>
	    <%
			try{
				request.setCharacterEncoding("UTF-8");
				String strSql1="";
				ResultSet rs1=null;
				strSql1="select * from Song where songid='"+songid+"'";
				rs1=connDB1.executeQuery(strSql1);//查询
				while(rs1.next()){
					String name=rs1.getString("name");
					String singer=rs1.getString("singer");
					String album=rs1.getString("album");
	    %>
	    <tr>
			<td height="22" align="center"><a href="asongdetail.jsp?songid=<%=songid %>"><%=name %></a></td>
			<td height="22" align="center"><%=singer %></td>
			<td height="22" align="center"><%=album %></td>
		</tr>
	    <%
			    }
			}catch(SQLException e){
				out.print(e.getMessage());
			}}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>
</table>
<hr width="1000px" color="white" size="6">
<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评论</h2>
<hr width="1000px" color="red" size="2">
<%
try{
	request.setCharacterEncoding("UTF-8");
	String sheetid = request.getParameter("sheetid"); 
	String strSql="";
	ResultSet rs=null;
	strSql="select * from SheetComment where sheetid='"+sheetid+"'";
	rs=connDB.executeQuery(strSql);//查询
	while(rs.next()){
		String id=rs.getString("id");
		String userid=rs.getString("userid");
		String content=rs.getString("content");
		String date=rs.getString("date");
		try{
			String strSql1="";
			ResultSet rs1=null;
			strSql1="select * from Users where userid='"+userid+"'";
			rs1=connDB.executeQuery(strSql1);//查询
			while(rs1.next()){
				String username=rs1.getString("username");
		%>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="3" color="blue"><%=username %></font>
		<font size="3" color="black">:<%=content %></font><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="3" color="grey"><%=date %></font>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="sheetcommentDel.jsp?id=<%=id %>">删除</a>
		<%}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
				}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		%>

 <embed  src="" id="music"> </embed>
</body>
</html>