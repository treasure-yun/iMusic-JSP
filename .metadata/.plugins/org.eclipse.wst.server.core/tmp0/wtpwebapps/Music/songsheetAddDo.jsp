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
    String sheetid=request.getParameter("sheetid");
    String songid = request.getParameter("songid"); 
    try{
		request.setCharacterEncoding("UTF-8");
		String strSql="";
		ResultSet rs=null;
		strSql="select * from SongSheet where songid='"+songid+"'and sheetid='"+sheetid+"'";
		rs=connDB.executeQuery(strSql);//查询
		while(rs.next()){
%>
			<script type="text/javascript">
		    alert("该歌单中已经包含这首歌！请勿重复添加！");
		    history.back();
		   </script>
	<%}} catch (Exception e) {
		    System.out.println(e.getMessage());
		} %>
<%
    String strSql="";
    String userid="";
    try {
        String str = "insert into SongSheet values('"+Integer.valueOf(songid)+"','"+Integer.valueOf(sheetid)+"')";
        int t = connDB.executeUpdate(str);
        if (t == 0) {
%>
<script type="text/javascript">
    alert("收藏失败");
    history.back();
</script>
<% } else {
	%>
	<script type="text/javascript">
	    alert("收藏成功");
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