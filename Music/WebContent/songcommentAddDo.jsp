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
    String username=(String)session.getAttribute("username");
    String songid = request.getParameter("songid"); 
    String strSql="";
    String userid="";
    if(username!="")
		strSql="select userid from Users where username='"+username+"'"; 
	ResultSet rs=connDB.executeQuery(strSql);//查询
	while(rs.next())
		userid=rs.getString("userid");
    String content = request.getParameter("songComment");
	Date date=new Date(System.currentTimeMillis());
    try {
        String str = "insert into SongComment values('"+Integer.valueOf(userid)+"','"+Integer.valueOf(songid)+"','"+content+"','"+date.toString()+"')";
        int t = connDB.executeUpdate(str);
        if (t == 0) {
%>
<script type="text/javascript">
    alert("评论失败");
    history.back();
</script>
<% } else {
	%>
	<script type="text/javascript">
	    alert("评论成功");
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