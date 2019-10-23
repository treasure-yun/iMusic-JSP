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
  String name=request.getParameter("username");
  String password=request.getParameter("userpwd");
  String sex=request.getParameter("sex");
  String birthday=request.getParameter("birthday");
  String mail=request.getParameter("mail");
  String phonenum=request.getParameter("phonenum");
  String str="select * from Users where username='"+name+"'";
  ResultSet rs=connDB.executeQuery(str);
  if(rs.next()){
	  %>
	  <script type="text/javascript">
	  alert("该用户名已经存在");
	  history.back();
	  </script>
<%
  }
  else{
	     try{
	    	 String strSql="insert into users values('"+name+"','"+password+"','"+
	    		        sex+"','"+birthday+"','"+phonenum+"','"+mail+"')";
	    	 int t=connDB.executeUpdate(strSql);
	    	 if(t==0){
	         %>
	         <script type="text/javascript">
	         alert("注册失败！");
	         history.back();
	         </script>
<%
	    	 }
	    	 else{
	    		 %>
		         <script type="text/javascript">
		         alert("注册成功！");
		         history.back();
		         </script>
<%
	    	 }
	     }
	     catch(Exception e){
	     System.err.println(e.getMessage());
	     }
	  }
%>
</body>
</html>