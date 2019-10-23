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
  request.setCharacterEncoding("UTF-8");
  String songid=request.getParameter("songid");
  String songname=request.getParameter("songname");
  String singer=request.getParameter("singer");
  String album=request.getParameter("album");
  String picture=request.getParameter("file");
  String fujian=request.getParameter("fujian");
  System.out.println(fujian);
  Date date=new Date(System.currentTimeMillis());
	try{
  String str = "insert into Song values('"+songname+"','"+singer+"','"+album+"','"+picture+"','"+fujian+"','"+date.toString()+"')";
int t = connDB.executeUpdate(str);
  if (t == 0) {
%>
<script type="text/javascript">
  alert("增加失败");
  history.back();
</script>
<% } else {
	%>
	<script type="text/javascript">
	    alert("增加成功");
	    history.back();
	</script>
	<%
}
} catch (Exception e) {
  System.out.println(e.getMessage());
}
%>
</body>
</html>