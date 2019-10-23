<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <%
        try {
            request.setCharacterEncoding("UTF-8");
            String id = request.getParameter("id");
            String str = "delete from SheetComent where id='" + id + "'";
            int t = connDB.executeUpdate(str);
        if(t==0){
    %>
        <script type="text/javascript">
            alert("删除失败");
            history.back();
        </script>
    <%
        }else{
        	%>
            <script type="text/javascript">
                alert("删除成功");
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