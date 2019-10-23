package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import java.sql.*;

public class Login extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	String StrCon="";
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;

    public Login() {
        super();
    }
    public void destroy() {
    	super.destroy();
    	
    }
    public void init() throws ServletException{
    	try {
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	}
    	catch(ClassNotFoundException e) {
    	  e.printStackTrace();	
    	}
    }
public int queryUser(String sql) throws Exception{
	int message=0;
	try {
		StrCon="jdbc:sqlserver://localhost:1433;DatabaseName=Music";
		con=DriverManager.getConnection(StrCon,"sa","123456");
		stmt=con.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()) {
			message=rs.getInt(1);
			
		}
				
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return message;
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		
		String sql="select count(*) from Users where username='"+username+"'and password='"+password+"'";
		try {
			int message=queryUser(sql);
			if(message==1) {
				session.setAttribute("username",username);
				request.getRequestDispatcher("/index1.jsp").forward(request,response);}
			else {
				out.write("<script language='javascript'>alert('用户名或密码错误！');history.go(-1);</script>");
			}
			
	}
	catch (Exception e) {
		e.printStackTrace();
	}
  }
}


