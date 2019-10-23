<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	try{
    request.setCharacterEncoding("UTF-8");
    String sheetid = request.getParameter("sheetid"); 
    String username=(String)session.getAttribute("username");
    String userid="";
	String strSql="";
	ResultSet rs=null;
	if(username!="")
		strSql="select userid from Users where username='"+username+"'"; 
	rs=connDB.executeQuery(strSql);//查询
	while(rs.next())
		userid=rs.getString("userid");
	int uid=Integer.parseInt(userid);
	int sid=Integer.parseInt(sheetid);
    String str = "insert into SheetCollection values('"+uid+"','"+sid+"')";
    int t = connDB.executeUpdate(str);
    if (t == 0) {
	%>
	<script type="text/javascript">
   	 	alert("增加失败");
    	history.back();
	</script>
<% 	}
	else{  %>
		<script type="text/javascript">
   	 	alert("增加成功");
    	history.back();
	</script>
	<%}
    }catch (Exception e) {
    System.out.println(e.getMessage());
	}
	%>
</body>
</html>