/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2019-05-29 04:18:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class SongDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      conn.Conn connDB = null;
      connDB = (conn.Conn) _jspx_page_context.getAttribute("connDB", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (connDB == null){
        connDB = new conn.Conn();
        _jspx_page_context.setAttribute("connDB", connDB, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      conn.Conn connDB1 = null;
      connDB1 = (conn.Conn) _jspx_page_context.getAttribute("connDB1", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (connDB1 == null){
        connDB1 = new conn.Conn();
        _jspx_page_context.setAttribute("connDB1", connDB1, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>在线音乐网站</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"jquery/jquery-3.3.1/jquery-3.3.1.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\">\r\n");
      out.write("        function check(thefrom) {\r\n");
      out.write("            if (thefrom.sheetComment.value == \"\") {\r\n");
      out.write("                alert(\"评论内容不能为空！\");\r\n");
      out.write("                thefrom.sheetComment.focus();\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("    body{\r\n");
      out.write("    overflow-x:hidden;\r\n");
      out.write("    overflow-y:auto;\r\n");
      out.write("    }\r\n");
      out.write("    .top a:link{\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #E3E3E3;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .top a:visited{\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .top a:hover{\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #FFF;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tbackground: black;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .addsong a:link{\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .addsong a:visited{\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tbackground: grey;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .addsong a:hover{\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tbackground: grey;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .container{\r\n");
      out.write("    height: 35px;\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    margin: 0px auto 0 auto;\r\n");
      out.write("    }\r\n");
      out.write("    .parent {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    }\r\n");
      out.write("    .search{\r\n");
      out.write("    width: 170px;\r\n");
      out.write("    height: 35px;\r\n");
      out.write("    border-radius: 18px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    padding-left: 20px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    }\r\n");
      out.write("    .btnn{\r\n");
      out.write("    width: 24px;\r\n");
      out.write("    height: 24px;\r\n");
      out.write("    top: 7px;\r\n");
      out.write("    left: 150px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    background: url(\"picture/search.png\");\r\n");
      out.write("    }\r\n");
      out.write("    /* 容器 <div> - 需要定位下拉内容 */    \r\n");
      out.write("    .dropdown{    \r\n");
      out.write("    position:relative;    \r\n");
      out.write("    display:inline-block;    \r\n");
      out.write("    }    \r\n");
      out.write("    /* 下拉菜单内容，设置为隐藏 */    \r\n");
      out.write("    .dropdown-content{    \r\n");
      out.write("    min-width:150px;    \r\n");
      out.write("    background-color:#F5F5F5;    \r\n");
      out.write("    position:absolute;    \r\n");
      out.write("    right:0;    \r\n");
      out.write("    display:none;    \r\n");
      out.write("    box-shadow:0px 8px 15px 0px rgba(0,0,0,0.2);    \r\n");
      out.write("    }    \r\n");
      out.write("    /* 下拉按钮样式 */    \r\n");
      out.write("    .dropbtn{    \r\n");
      out.write("    color:white;    \r\n");
      out.write("    font-size:16px;    \r\n");
      out.write("    padding:15px;    \r\n");
      out.write("    border:none;    \r\n");
      out.write("    background-color:#00CD66;    \r\n");
      out.write("    cursor:pointer;    \r\n");
      out.write("    }    \r\n");
      out.write("    /* 下拉菜单链接的样式 */    \r\n");
      out.write("    .dropdown-content a{    \r\n");
      out.write("    color:black;    \r\n");
      out.write("    text-decoration:none;    \r\n");
      out.write("    font-size:16px;\r\n");
      out.write("    display:block;    \r\n");
      out.write("    }     \r\n");
      out.write("    /* 鼠标移入后显示下拉菜单 */    \r\n");
      out.write("    .dropdown:hover .dropdown-content{    \r\n");
      out.write("    display:block;    \r\n");
      out.write("    }    \r\n");
      out.write("    /* 鼠标移入后修改链接的背景色 */    \r\n");
      out.write("    .dropdown-content a:hover{    \r\n");
      out.write("    background-color:#E8E8E8;    \r\n");
      out.write("   }     \r\n");
      out.write("   /* 下拉菜单显示后修改下拉按钮的背景色 */    \r\n");
      out.write("   .dropdown:hover .dropbtn{    \r\n");
      out.write("   background-color:#008B00;    \r\n");
      out.write("   } \r\n");
      out.write("   /*弹出层*/\r\n");
      out.write("   #popBox {\r\n");
      out.write("   display: none;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   z-index: 11;\r\n");
      out.write("   width: 400px;\r\n");
      out.write("   height: 200px;\r\n");
      out.write("   position:fixed;\r\n");
      out.write("   top:0;\r\n");
      out.write("   right:0;\r\n");
      out.write("   left:0;\r\n");
      out.write("   bottom:0;\r\n");
      out.write("   margin:auto;\r\n");
      out.write("   border: 1px solid grey;\r\n");
      out.write("   }\r\n");
      out.write("   #poptBox {\r\n");
      out.write("   display: none;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   z-index: 11;\r\n");
      out.write("   width: 400px;\r\n");
      out.write("   height: 200px;\r\n");
      out.write("   position:fixed;\r\n");
      out.write("   top:0;\r\n");
      out.write("   right:0;\r\n");
      out.write("   left:0;\r\n");
      out.write("   bottom:0;\r\n");
      out.write("   margin:auto;\r\n");
      out.write("   border: 1px solid grey;\r\n");
      out.write("   }\r\n");
      out.write("   .row1{\r\n");
      out.write("   background-color: #404040;\r\n");
      out.write("   width: 400px;\r\n");
      out.write("   height: 30px;\r\n");
      out.write("   }\r\n");
      out.write("   .row1 a{\r\n");
      out.write("   display: block;\r\n");
      out.write("   position: absolute;\r\n");
      out.write("   top: 0.5%;\r\n");
      out.write("   right: 1%;\r\n");
      out.write("   }\r\n");
      out.write("   .row{\r\n");
      out.write("   height:50px;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("   line-height:77px;\r\n");
      out.write("   padding:0px 0px;\r\n");
      out.write("   }\r\n");
      out.write("   #popRBox {\r\n");
      out.write("   display: none;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   z-index: 11;\r\n");
      out.write("   width: 400px;\r\n");
      out.write("   height: 300px;\r\n");
      out.write("   position:fixed;\r\n");
      out.write("   top:0;\r\n");
      out.write("   right:0;\r\n");
      out.write("   left:0;\r\n");
      out.write("   bottom:0;\r\n");
      out.write("   margin:auto;\r\n");
      out.write("   border: 1px solid grey;\r\n");
      out.write("   }\r\n");
      out.write("   #popSBox {\r\n");
      out.write("   display: none;\r\n");
      out.write("   background-color: #FFFFFF;\r\n");
      out.write("   z-index: 11;\r\n");
      out.write("   width: 400px;\r\n");
      out.write("   height: 400px;\r\n");
      out.write("   position:fixed;\r\n");
      out.write("   top:0;\r\n");
      out.write("   right:0;\r\n");
      out.write("   left:0;\r\n");
      out.write("   bottom:0;\r\n");
      out.write("   margin:auto;\r\n");
      out.write("   border: 1px solid grey;\r\n");
      out.write("   }\r\n");
      out.write("a:hover{text-decoration: none;}\r\n");
      out.write(".btn{\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    padding: 10px 24px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    background-color: #63b7ff;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".tag{\r\n");
      out.write("    border: 1px;\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    color: #000;\r\n");
      out.write("}\r\n");
      out.write(".btn:hover{\r\n");
      out.write("    background-color: #99c6ff;\r\n");
      out.write("}\r\n");
      out.write(".bgbtn img{\r\n");
      out.write("    margin-bottom: -3px;\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("#music{\r\n");
      out.write("display:none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"1250\" height=\"50\" border=\"0\" style=\"background:#404040\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td width=\"100\"></td>\r\n");
      out.write("      <td width=\"150\" align=\"center\">\r\n");
      out.write("         <img src=\"picture/icon.png\" height=\"50\"/></td>\r\n");
      out.write("      <td width=\"200\" align=\"center\" class=\"top\">\r\n");
      out.write("        ");

           if(session.getAttribute("username")==null){
        
      out.write("\r\n");
      out.write("         <a href=\"index.jsp\">发现音乐</a>\r\n");
      out.write("         ");
}else{ 
      out.write("\r\n");
      out.write("         <a href=\"index2.jsp\">发现音乐</a>\r\n");
      out.write("         ");
} 
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"100\" align=\"center\" class=\"top\">\r\n");
      out.write("         <a href=\"mymusic.jsp\">我的音乐</a>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <div class=\"container\" style=\"position:absolute;left:900px;top:15px;\">\r\n");
      out.write("         <form action=\"searchsong.jsp\" class=\"parent\" method=\"post\" accept-charset=\"utf-8\" onsubmit=\"document.charset='utf-8'\">\r\n");
      out.write("             <input type=\"text\" name=\"songname\" class=\"search\" placeholder=\"音乐\">\r\n");
      out.write("             <input type=\"button\" name=\"\" id=\"\" class=\"btnn\">\r\n");
      out.write("         </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("        ");

           if(session.getAttribute("username")==null)
           {
        
      out.write("\r\n");
      out.write("        <div class=\"dropdown\" style=\"float:right\">\r\n");
      out.write("         <button type=\"button\" class=\"dropbtn\">登录</button> \r\n");
      out.write("        <div class=\"dropdown-content\">          \r\n");
      out.write("            <a href=\"javascript:void(0)\" onclick=\"userlogin()\"><img src=\"picture/user.png\">&nbsp;&nbsp;&nbsp;用户登录</a>\r\n");
      out.write("            <a href=\"adminLogin.jsp\"><img src=\"picture/admin.png\">&nbsp;管理员登录</a>\r\n");
      out.write("        </div></div>\r\n");
      out.write("        ");

           }else{
        
      out.write("\r\n");
      out.write("        <div class=\"dropdown\" style=\"float:right\">\r\n");
      out.write("         <button type=\"button\" class=\"dropbtn\">");
      out.print((String)session.getAttribute("username") );
      out.write("</button> \r\n");
      out.write("        <div class=\"dropdown-content\">          \r\n");
      out.write("            <a href=\"mymusic.jsp\" target=\"_parent\"><img src=\"picture/my.png\">&nbsp;我的主页</a>\r\n");
      out.write("            <a href=\"Logout.jsp\"><img src=\"picture/back.png\">&nbsp;退出</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>");
} 
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"popBox\">\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <div class=\"row1\"><div style=\"color: white;position: absolute;top: 1%;left: 2%;\">用户登录</div><div class=\"top\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" onclick=\"closeBox()\" title=\"关闭窗口\">×</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t    <form name=\"form1\" method=\"post\" action=\"servlet/Login\" onsubmit=\"return checkForm(this);\">\r\n");
      out.write("\t\t   <table width=\"361\" height=\"150\"border=\"0\" align=\"center\">\r\n");
      out.write("\t\t   <tr height=\"20\"></tr>\r\n");
      out.write("\t\t   <tr height=\"30\">\r\n");
      out.write("\t\t      <td width=\"40\"></td>\r\n");
      out.write("\t\t      <td width=\"46\" align=\"center\">用&nbsp;户&nbsp;名</td>\r\n");
      out.write("\t\t      <td width=\"259\" align=\"center\"><input type=\"text\" name=\"username\">&nbsp;&nbsp;*</td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   <tr height=\"30\">\r\n");
      out.write("\t\t      <td width=\"40\"></td>\r\n");
      out.write("\t\t      <td align=\"center\">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>\r\n");
      out.write("\t\t      <td align=\"center\"><input type=\"password\" name=\"password\"/>&nbsp;&nbsp;*</td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   <tr height=\"30\">\r\n");
      out.write("\t\t      <td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t      <input type=\"submit\" name=\"submit\" value=\"登录\"/>\r\n");
      out.write("\t\t      &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t      <input type=\"reset\" name=\"reset\" value=\"重置\"/></td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   <tr height=\"20\">\r\n");
      out.write("\t\t   <tr>\r\n");
      out.write("\t\t      <td colspan=\"3\" align=\"right\">\r\n");
      out.write("\t\t      <a href=\"javascript:void(0)\" onclick=\"register()\" style=\"color:grey;text-decoration: none;font-size: 12px;\">没有账号？免费注册></a>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   </table>\r\n");
      out.write("\t    </form>\r\n");
      out.write("</div></div>\r\n");
      out.write("<div id=\"popRBox\">\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <div class=\"row1\"><div style=\"color: white;position: absolute;top: 1%;left: 2%;\">用户登录</div><div class=\"top\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" onclick=\"closeRBox()\" title=\"关闭窗口\">×</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t    <form name=\"form1\" action=\"doRegister.jsp\" method=\"post\" onSubmit=\"return check(this)\">\r\n");
      out.write("\t\t<table border=\"0\" align=\"center\">\r\n");
      out.write("\t\t<tr height=\"30\"></tr>\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t   <td width=\"80\"  align=\"center\">用&nbsp;户&nbsp;名</td>\r\n");
      out.write("\t\t   <td width=\"226\"  align=\"center\"><input type=\"text\" name=\"username\">*</td></tr>\r\n");
      out.write("\t\t<tr><td align=\"center\">密&nbsp;&nbsp;码&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t   <td align=\"center\"><input type=\"password\" name=\"userpwd\">*</td></tr>\r\n");
      out.write("\t\t<tr><td align=\"center\">密码确认</td>\r\n");
      out.write("\t\t   <td align=\"center\"><input type=\"password\" name=\"userpwd1\">*</td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t   <td align=\"center\">性&nbsp;&nbsp;别&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t   <td align=\"center\"><input type=\"radio\" name=\"sex\" checked value=\"男\">男\r\n");
      out.write("\t\t       <input type=\"radio\" name=\"sex\" value=\"女\">女\r\n");
      out.write("\t\t   </td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t   <td align=\"center\">出生年月</td>\r\n");
      out.write("\t\t   <td align=\"center\"><input type=\"text\" name=\"birthday\" onBlur=\"checkDate()\"></td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t   <td align=\"center\">邮&nbsp;&nbsp;箱&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t   <td align=\"center\"><input type=\"text\" name=\"mail\" onBlur=\"checkAddress()\"></td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t   <td align=\"center\">联系方式</td>\r\n");
      out.write("\t\t   <td align=\"center\"><input type=\"text\" name=\"phonenum\"></td></tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t   <td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t      <input type=\"submit\" value=\"提交\">\r\n");
      out.write("\t\t      &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t      <input type=\"reset\" value=\"清除\">\r\n");
      out.write("\t\t   </td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div></div>\r\n");
      out.write("\r\n");
      out.write("<hr size=\"1\" color=\"white\" width=\"1000px\">\r\n");
      out.write("<table align=\"center\" width=\"1000px\" border=\"0\">\r\n");
      out.write("\t\t");

			try{
				request.setCharacterEncoding("UTF-8");
				String id = request.getParameter("songid"); 
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Song where songid='"+id+"'";
				rs=connDB.executeQuery(strSql);//查询
				while(rs.next()){
					String songid=rs.getString("songid");
					String name=rs.getString("name");
					String singer=rs.getString("singer");
					String album=rs.getString("album");
					String picture=rs.getString("picture");
					String fujian=rs.getString("fujian");
					String date=rs.getString("date");
		
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td rowspan=\"5\" width=\"300px\"><img src=\"picture/");
      out.print(picture );
      out.write("\" width=\"250px\" height=\"250px\"></td>\r\n");
      out.write("\t\t<td><img src=\"picture/song.png\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size=\"5\">");
      out.print(name );
      out.write("</font>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td >歌手：");
      out.print(singer );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td>所属专辑：");
      out.print(album );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t       <td>\r\n");
      out.write("\t           <a href=\"javascript:void(0)\" onclick=\"playmusic()\" class=\"bgbtn btn\">\r\n");
      out.write("\t             <img src=\"picture/bf.png\">播放\r\n");
      out.write("\t             <script>\r\n");
      out.write("\t             function playmusic(){\r\n");
      out.write("\t             \tdocument.getElementById(\"music\").src=\"CloudMusic/");
      out.print(fujian );
      out.write("\";\r\n");
      out.write("\t             \tvar music = document.getElementById(\"music\");\r\n");
      out.write("\t                 music.style.display = \"block\";\r\n");
      out.write("\t             }\r\n");
      out.write("\t             </script>\r\n");
      out.write("\t           </a>&nbsp;&nbsp;\r\n");
      out.write("\t           ");
  String username = (String)session.getAttribute("username"); 
	           if(username==null){
	           
      out.write("\r\n");
      out.write("\t           <a href=\"javascript:void(0)\" onclick=\"login()\" class=\"bgbtn btn\">\r\n");
      out.write("\t             <img src=\"picture/sc.png\">收藏\r\n");
      out.write("\t           </a>\r\n");
      out.write("\t           ");
 }else{
	           
      out.write("\r\n");
      out.write("\t           <a href=\"javascript:void(0)\" onclick=\"openSBox()\" class=\"bgbtn btn\">\r\n");
      out.write("\t             <img src=\"picture/sc.png\">收藏\r\n");
      out.write("\t           </a>\r\n");
      out.write("\t           ");
} 
      out.write("\r\n");
      out.write("\t       </td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t\t");

				}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr width=\"1000px\" color=\"white\" size=\"6\">\r\n");
      out.write("<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评论</h2>\r\n");
      out.write("<hr width=\"1000px\" color=\"red\" size=\"2\">\r\n");
      out.write("<form name=\"forml\" method=\"post\" action=\"songcommentAddDo.jsp?songid=");
      out.print(request.getParameter("songid") );
      out.write("\" onsubmit=\"return check(this)\">\r\n");
      out.write("<table width=\"1000px\" align=\"center\">\r\n");
      out.write("    <tr><td><textarea name=\"songComment\"  style=\"width:1000px;height:120px\"></textarea></td></tr>\r\n");
      out.write("    <tr><td align=\"right\">\r\n");
      out.write("        <input type=\"submit\" name=\"submit\" value=\"评论\">&nbsp;\r\n");
      out.write("    </td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<hr width=\"1000px\" color=\"white\" size=\"4\">\r\n");

			try{
				request.setCharacterEncoding("UTF-8");
				String songid = request.getParameter("songid"); 
				String strSql="";
				ResultSet rs=null;
				strSql="select * from SongComment where songid='"+songid+"'";
				rs=connDB.executeQuery(strSql);//查询
				while(rs.next()){
					String userid=rs.getString("userid");
					String content=rs.getString("content");
					String date=rs.getString("date");
					try{
						String strSql1="";
						ResultSet rs1=null;
						strSql1="select * from Users where userid='"+userid+"'";
						rs1=connDB1.executeQuery(strSql1);//查询
						while(rs1.next()){
							String username=rs1.getString("username");
		
      out.write("\r\n");
      out.write("\t\t<hr width=\"1000px\" color=\"grey\" size=\"2\">\r\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size=\"3\" color=\"blue\">");
      out.print(username );
      out.write("</font>\r\n");
      out.write("\t\t<font size=\"3\" color=\"black\">:");
      out.print(content );
      out.write("</font><br>\r\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size=\"3\" color=\"grey\">");
      out.print(date );
      out.write("</font>\r\n");
      out.write("\t\t");
}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
				}
			}catch(SQLException e){
				out.print(e.getMessage());
			}
		
      out.write("\r\n");
      out.write("\t\t<div id=\"popSBox\">\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <div class=\"row1\"><div style=\"color: white;position: absolute;top: 1%;left: 2%;\">添加到歌单</div><div class=\"top\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" onclick=\"closeSBox()\" title=\"关闭窗口\">×</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"addsong\">\r\n");
      out.write("\t\t   <table align=\"left\">\r\n");
      out.write("\t\t   <tr height=\"40\"><td width=\"20px\"></td><td colspan=\"2\">\r\n");
      out.write("           <a href=\"javascript:void(0)\" onclick=\"openBox1()\"><img src=\"picture/new.png\">&nbsp;&nbsp;<font size=\"4\">新歌单</font>&nbsp;&nbsp;</a></td></tr>\r\n");
      out.write("           ");

			try{
				request.setCharacterEncoding("UTF-8");
				String username = (String)session.getAttribute("username"); 
				String songid = (String)request.getParameter("songid"); 
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Users where username='"+username+"'";
				rs=connDB.executeQuery(strSql);//查询
				while(rs.next()){
					String userid=rs.getString("userid");
					try{
						request.setCharacterEncoding("UTF-8");
						String strSql1="";
						ResultSet rs1=null;
						strSql1="select * from Sheet where userid='"+userid+"'";
						rs1=connDB1.executeQuery(strSql1);//查询
						while(rs1.next()){
							String sheetid=rs1.getString("id");
							String sheetname=rs1.getString("name");
							String picture=rs1.getString("picture");
	    
      out.write("\r\n");
      out.write("\t    <tr height=\"40\"><td width=\"20px\"></td>\r\n");
      out.write("\t    <td width=\"50px\"><a href=\"songsheetAddDo.jsp?sheetid=");
      out.print(sheetid);
      out.write("&songid=");
      out.print(songid);
      out.write("\">\r\n");
      out.write("\t    <img src=\"picture/");
      out.print(picture );
      out.write("\" width=\"50px\" height=\"50px\"></a></td>\r\n");
      out.write("\t    <td><a href=\"songsheetAddDo.jsp?sheetid=");
      out.print(sheetid);
      out.write("&songid=");
      out.print(songid);
      out.write('"');
      out.write('>');
      out.print(sheetname );
      out.write("</a></td></tr>\r\n");
      out.write("\t    ");
	
			}}catch(SQLException e){
				out.print(e.getMessage());
			}}}catch(SQLException e){
				out.print(e.getMessage());
			}
		
      out.write("\r\n");
      out.write("\t\t   </table></div>\r\n");
      out.write("</div></div>\r\n");
      out.write("<div id=\"poptBox\">\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <div class=\"row1\"><div style=\"color: white;position: absolute;top: 1%;left: 2%;\">新建歌单</div><div class=\"top\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" onclick=\"closeBox1()\" title=\"关闭窗口\">×</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t    <form name=\"form2\" method=\"post\" action=\"sheetAddDo.jsp\" onsubmit=\"return check1(this)\">\r\n");
      out.write("\t\t   <table width=\"361\" height=\"150\"border=\"0\" align=\"center\">\r\n");
      out.write("\t\t   <tr height=\"20\"></tr>\r\n");
      out.write("\t\t   <tr height=\"30\">\r\n");
      out.write("\t\t      <td width=\"40\"></td>\r\n");
      out.write("\t\t      <td width=\"60\" align=\"center\">歌曲名:</td>\r\n");
      out.write("\t\t      <td width=\"259\" align=\"center\"><input type=\"text\" name=\"sheetname\"></td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   <tr height=\"30\">\r\n");
      out.write("\t\t      <td colspan=\"3\" align=\"center\"><font size=\"2\" color=\"grey\">可通过“收藏”将音乐添加到新歌单中</font></td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   <tr height=\"30\">\r\n");
      out.write("\t\t      <td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t      <input type=\"submit\" name=\"submit\" value=\"新建\"/>\r\n");
      out.write("\t\t      &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t      <input type=\"reset\" name=\"reset\" value=\"取消\"/></td>\r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   </table>\r\n");
      out.write("\t    </form>\r\n");
      out.write("</div></div>\r\n");
      out.write(" <embed  src=\"\" id=\"music\"> </embed>\r\n");
      out.write(" \r\n");
      out.write("<script>\r\n");
      out.write("/*点击弹出按钮*/\r\n");
      out.write("function userlogin() {\r\n");
      out.write("    var popBox = document.getElementById(\"popBox\");\r\n");
      out.write("    popBox.style.display = \"block\";\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("/*点击关闭按钮*/\r\n");
      out.write("function closeBox() {\r\n");
      out.write("    var popBox = document.getElementById(\"popBox\");\r\n");
      out.write("    popBox.style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("function login(){\r\n");
      out.write("\talert(\"请先登录！\");\r\n");
      out.write("}\r\n");
      out.write("function openSBox() {\r\n");
      out.write("\tvar popBox = document.getElementById(\"popSBox\");\r\n");
      out.write("\tpopBox.style.display = \"block\";\r\n");
      out.write("};\r\n");
      out.write("function closeSBox() {\r\n");
      out.write("    var popBox = document.getElementById(\"popSBox\");\r\n");
      out.write("    popBox.style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("/*点击弹出按钮*/\r\n");
      out.write("function register() {\r\n");
      out.write("    var popRBox = document.getElementById(\"popRBox\");\r\n");
      out.write("    popRBox.style.display = \"block\";\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("/*点击关闭按钮*/\r\n");
      out.write("function closeRBox() {\r\n");
      out.write("    var popRBox = document.getElementById(\"popRBox\");\r\n");
      out.write("    popRBox.style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("function openBox1() {\r\n");
      out.write("\tvar popBox = document.getElementById(\"popSBox\");\r\n");
      out.write("    popBox.style.display = \"none\";\r\n");
      out.write("    var popBox = document.getElementById(\"poptBox\");\r\n");
      out.write("    popBox.style.display = \"block\";\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("/*点击关闭按钮*/\r\n");
      out.write("function closeBox1() {\r\n");
      out.write("    var popBox = document.getElementById(\"poptBox\");\r\n");
      out.write("    popBox.style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("function checkForm(form){\r\n");
      out.write("\tif(form.username.value==\"\"){\r\n");
      out.write("\t\talert(\"用户名不能为空！\");\r\n");
      out.write("\t\tform.username.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(form.userpwd.value==\"\"){\r\n");
      out.write("\t\talert(\"密码不能为空！\");\r\n");
      out.write("\t\tform.password.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("function check(theform){\t\t\r\n");
      out.write("\tif(theform.username.value==\"\"){\r\n");
      out.write("\t   alert(\"用户名不能为空！\");\r\n");
      out.write("\t   theform.username.focus();\r\n");
      out.write("\t   return false;\r\n");
      out.write("\t }\r\n");
      out.write("\t if(theform.userpwd.value==\"\"){\r\n");
      out.write("\t   alert(\"密码不能为空！\");\r\n");
      out.write("\t   theform.userpwd.focus();\r\n");
      out.write("\t   return false;\r\n");
      out.write("\t }\r\n");
      out.write("    if(theform.userpwd.value!=theform.userpwd1.value){\r\n");
      out.write("       alert(\"两次密码不一致，请重新输入！\");\r\n");
      out.write("       theform.userpwd2.value=\"\";\r\n");
      out.write("       theform.userpwd2.focus();\r\n");
      out.write("       return false;\r\n");
      out.write("    }\r\n");
      out.write("        if(theform.mail.value==\"\"){\r\n");
      out.write("\t   alert(\"邮箱不能为空！\");\r\n");
      out.write("\t   theform.mail.focus();\r\n");
      out.write("\t   return false;\r\n");
      out.write("        }\r\n");
      out.write("}\r\n");
      out.write("function checkAddress() {    \r\n");
      out.write("    var reg =  /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.[a-zA-Z0-9_-])+/;    \r\n");
      out.write("    if(!reg.test(document.form1.mail.value)){\r\n");
      out.write("       alert(\"请填写正确的邮箱格式！\");\r\n");
      out.write("       document.form1.mail.value=\"\";\r\n");
      out.write("       document.form1.mail.focus();\r\n");
      out.write("       return false;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("function checkDate() {    \r\n");
      out.write("    var reg = /^\\d{4}(\\-|\\/|\\.)\\d{1,2}\\1\\d{1,2}$/ ;    \r\n");
      out.write("    if(!reg.test(document.form1.birthday.value)){\r\n");
      out.write("       alert(\"请填写正确的日期格式！\");\r\n");
      out.write("       document.form1.birthday.value=\"\";\r\n");
      out.write("       document.form1.birthday.focus();\r\n");
      out.write("       return false;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
