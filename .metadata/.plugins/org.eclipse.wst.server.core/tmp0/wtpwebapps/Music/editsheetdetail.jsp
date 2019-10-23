<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<jsp:useBean id="connDB" scope="page" class="conn.Conn"/>
<jsp:useBean id="connDB1" scope="page" class="conn.Conn"/>
<jsp:useBean id="connDB2" scope="page" class="conn.Conn"/>
<jsp:useBean id="connDB3" scope="page" class="conn.Conn"/>
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
  String sheetid=request.getParameter("sheetid");
  String sheetname=request.getParameter("sheetname");
  String picture=request.getParameter("file");
  String introduction=request.getParameter("introduction");
  String[] tagname=request.getParameterValues("tag");
  String strSql="";
  String userid="";
  if(username!="")
		strSql="select userid from Users where username='"+username+"'"; 
	ResultSet rs=connDB.executeQuery(strSql);//查询
	while(rs.next())
		userid=rs.getString("userid");
	try{
  String str = "update Sheet set name='"+sheetname+"',introduction='"+introduction+"',picture='"+picture+"' where userid='"+userid+"' and id='"+sheetid+"'";
int t = connDB.executeUpdate(str);
  if (t == 0) {
%>
<script type="text/javascript">
  alert("保存失败");
  history.back();
</script>
<% } else {
	%>
	<script type="text/javascript">
	    alert("保存成功");
	    history.back();
	</script>
	<%
}
} catch (Exception e) {
  System.out.println(e.getMessage());
}
	try{
		String str="delete from SheetTag where sheetid='"+sheetid+"'";
		int t = connDB.executeUpdate(str);
	}catch (Exception e) {
		  System.out.println(e.getMessage());
	}
	int length=tagname.length;
	int i=0;
	if(i<length&&i<3){
			request.setCharacterEncoding("UTF-8");
			String strSql1="";
			if(tagname[i]!="")
				strSql1="select id from Tag where name='"+tagname[i]+"'"; 
			try{
			ResultSet rs1=connDB1.executeQuery(strSql1);//查询
			while(rs1.next()){
				String tagid=rs1.getString("id");
				try{
					String str = "insert into SheetTag values('"+Integer.valueOf(sheetid)+"','"+Integer.valueOf(tagid)+"')";
					int t = connDB1.executeUpdate(str);
					  if (t == 0) {
					%>
					<script type="text/javascript">
					  alert("保存失败");
					  history.back();
					</script>
					<% } else {
						%>
						<script type="text/javascript">
						    alert("保存成功");
						    history.back();
						</script>
						<%
					}
					} catch (Exception e) {
					  System.out.println(e.getMessage());
					}
			}} catch (Exception e) {
				  System.out.println(e.getMessage());
				}
		}
			i++;
			if(i<length&&i<3){
				request.setCharacterEncoding("UTF-8");
				String strSql2="";
				if(tagname[i]!="")
					strSql2="select id from Tag where name='"+tagname[i]+"'"; 
				try{
				ResultSet rs2=connDB2.executeQuery(strSql2);//查询
				while(rs2.next()){
					String tagid=rs2.getString("id");
					try{
						String str = "insert into SheetTag values('"+Integer.valueOf(sheetid)+"','"+Integer.valueOf(tagid)+"')";
						int t = connDB2.executeUpdate(str);
						  if (t == 0) {
						%>
						<script type="text/javascript">
						  alert("保存失败");
						  history.back();
						</script>
						<% } else {
							%>
							<script type="text/javascript">
							    alert("保存成功");
							    history.back();
							</script>
							<%
						}
						} catch (Exception e) {
						  System.out.println(e.getMessage());
						}
				}} catch (Exception e) {
					  System.out.println(e.getMessage());
					}
			}
			i++;
			if(i<length&&i<3){
				request.setCharacterEncoding("UTF-8");
				String strSql3="";
				if(tagname[i]!="")
					strSql3="select id from Tag where name='"+tagname[i]+"'"; 
				try{
				ResultSet rs3=connDB3.executeQuery(strSql3);//查询
				while(rs3.next()){
					String tagid=rs3.getString("id");
					try{
						String str = "insert into SheetTag values('"+Integer.valueOf(sheetid)+"','"+Integer.valueOf(tagid)+"')";
						int t = connDB3.executeUpdate(str);
						  if (t == 0) {
						%>
						<script type="text/javascript">
						  alert("保存失败");
						  history.back();
						</script>
						<% } else {
							%>
							<script type="text/javascript">
							    alert("保存成功");
							    history.back();
							</script>
							<%
						}
						} catch (Exception e) {
						  System.out.println(e.getMessage());
						}
				}} catch (Exception e) {
					  System.out.println(e.getMessage());
					}
			}
%>
</body>
</html>