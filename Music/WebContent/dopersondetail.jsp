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
<body>
<%  request.setCharacterEncoding("UTF-8");
    String userid=request.getParameter("userid");
    int id=Integer.valueOf(userid);
    String name=request.getParameter("username");
    String sex=request.getParameter("sex");
    String birthday=request.getParameter("birthday");
    String tel=request.getParameter("tel");
    String email=request.getParameter("email");
    String sql="update Users set username='"+name+"',sex='"+sex+"',birthday='"+birthday+"',tel='"+tel+"',email='"+email+"' where userid='"+id+"'";
	int i=connDB.executeUpdate(sql);
	if(i==1){
%>
	<script type="text/javascript">
		alert("修改成功！");	
		history.back();
	</script>
	<%}else{ %>
	<script type="text/javascript">
		alert("修改失败！");	
		history.back();
	</script>
	<%} %>
</body>
</html>