/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2019-06-12 00:15:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class editsong_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"jquery/jquery-3.3.1/jquery-3.3.1.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("    .exitbtn{    \r\n");
      out.write("    color:white;    \r\n");
      out.write("    font-size:15px;    \r\n");
      out.write("    padding:10px;    \r\n");
      out.write("    border:none;    \r\n");
      out.write("    background-color:#00CD66;    \r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("    cursor:pointer;    \r\n");
      out.write("    }  \r\n");
      out.write("    .mainframe{\r\n");
      out.write("    position:fixed;\r\n");
      out.write("    margin:auto;\r\n");
      out.write("    left:0;\r\n");
      out.write("    right:0;\r\n");
      out.write("    }\r\n");
      out.write("    .container{\r\n");
      out.write("    height: 35px;\r\n");
      out.write("    width: 800px;\r\n");
      out.write("    margin: 0px auto 0 auto;\r\n");
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
      out.write("    .btn{\r\n");
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
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"1250\" height=\"50\" border=\"0\" style=\"background:#404040\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td width=\"100\"></td>\r\n");
      out.write("      <td width=\"150\" align=\"center\">\r\n");
      out.write("         <img src=\"picture/icon.png\" height=\"50\"/></td>\r\n");
      out.write("      <td width=\"200\" align=\"center\">\r\n");
      out.write("         <font size=\"5\" color=\"white\"><b>后台管理系统</b></font>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <div class=\"container\" style=\"position:absolute;left:900px;top:15px;\">\r\n");
      out.write("         <form action=\"asearchsong.jsp\" target=\"mainFrame\" class=\"parent\" method=\"post\" accept-charset=\"utf-8\" onsubmit=\"document.charset='utf-8'\">\r\n");
      out.write("             <input type=\"text\" name=\"songname\" class=\"search\" placeholder=\"音乐\">\r\n");
      out.write("             <input type=\"button\" name=\"\" id=\"\" class=\"btn\">\r\n");
      out.write("         </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </td>\r\n");
      out.write("      <td align=\"right\">\r\n");
      out.write("         <a class=\"exitbtn\" href=\"adminloginout.jsp\">退出</a>\r\n");
      out.write("      </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"1250\" height=\"50\" border=\"0\" style=\"background-color:#BCD2EE; \">\r\n");
      out.write("<tr><td width=\"100\"></td><td width=\"150\" align=\"center\"><a href=\"userAdmin.jsp\" target=\"_parent\">用户管理</a></td>\r\n");
      out.write("<td align=\"center\"><a href=\"sheetAdmin.jsp\" target=\"_parent\">歌单管理</a></td>\r\n");
      out.write("<td width=\"150\" align=\"center\"><a href=\"songAdmin.jsp\" target=\"_parent\">歌曲管理</a></td>\r\n");
      out.write("<td width=\"150\" align=\"center\"><a href=\"addsong.jsp\" target=\"_parent\">添加歌曲</a></td>\r\n");
      out.write("<td width=\"550\" align=\"center\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<form action=\"editsongdetail.jsp\" method=\"post\">\r\n");
      out.write("<table  border=\"0\" align=\"center\">\r\n");

		request.setCharacterEncoding("UTF-8");
	    String songid = request.getParameter("songid"); 
			  try{
					request.setCharacterEncoding("UTF-8");
					String strSql="";
					ResultSet rs=null;
					strSql="select * from Song where songid='"+songid+"'";
					rs=connDB.executeQuery(strSql);
					while(rs.next()){
						  String songname=rs.getString("name");
						  String singer=rs.getString("singer");
						  String album=rs.getString("album");
						  String picture=rs.getString("picture");
						  String fujian=rs.getString("fujian");

      out.write("\t\r\n");
      out.write("      <tr height=\"22\">\r\n");
      out.write("      <td align=\"right\"></td>\r\n");
      out.write("      <td align=\"left\"><input type=\"hidden\" name=\"songid\" value=");
      out.print(songid );
      out.write("></td>\r\n");
      out.write("      <td width=\"20px\">\r\n");
      out.write("      <td rowspan=\"5\">\r\n");
      out.write("            <img id=\"iimg\" src=\"picture/");
      out.print(picture );
      out.write("\" width=\"150px\" height=\"150px\"/>\r\n");
      out.write("            <br><table><form action=\"editsongpicture.jsp\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <tr><td><input type=\"hidden\" name=\"songid\" value=");
      out.print(songid );
      out.write("></td><td>\r\n");
      out.write("            <input type=\"file\" id=\"chooseImage\" name=\"file\" value=\"");
      out.print(picture );
      out.write("\"></td></tr></form></table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr height=\"25\">\r\n");
      out.write("      <td align=\"right\">歌曲名：</td>\r\n");
      out.write("      <td align=\"left\"><input type=\"text\" name=\"songname\" value=");
      out.print(songname );
      out.write("></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr height=\"25\">\r\n");
      out.write("      <td align=\"right\">歌手：</td>\r\n");
      out.write("      <td align=\"left\"><input type=\"text\" name=\"singer\" value=");
      out.print(singer );
      out.write("></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr height=\"25\">\r\n");
      out.write("      <td align=\"right\">所在专辑：</td>\r\n");
      out.write("      <td align=\"left\"><input type=\"text\" name=\"album\" value=");
      out.print(album );
      out.write("></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr height=\"25\">\r\n");
      out.write("      <td align=\"right\">附件路径：</td>\r\n");
      out.write("      <td align=\"left\"><input type=\"text\" name=\"fujian\" value=");
      out.print(fujian );
      out.write("></td>\r\n");
      out.write("      </tr>\r\n");
	  }}
	  catch(SQLException e){
		  out.println(e.getMessage());
	  }

      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("    <p align=\"center\">\r\n");
      out.write("        <input type=\"submit\" name=\"submit\" value=\"保存\">&nbsp;\r\n");
      out.write("        <input type=\"button\" name=\"cancel\" value=\"取消\">&nbsp;&nbsp;\r\n");
      out.write("    </p>\r\n");
      out.write("    </form>\r\n");
      out.write("<script>\r\n");
      out.write("$('#chooseImage').on('change',function(){\r\n");
      out.write("   \tvar filePath = $(this).val(),         //获取到input的value，里面是文件的路径\r\n");
      out.write("   \t\tfileFormat = filePath.substring(filePath.lastIndexOf(\".\")).toLowerCase(),\r\n");
      out.write("   \t\tsrc = window.URL.createObjectURL(this.files[0]); //转成可以在本地预览的格式\r\n");
      out.write("   \t// 检查是否是图片\r\n");
      out.write("   \tif( !fileFormat.match(/.png|.jpg|.jpeg/) ) {\r\n");
      out.write("   \t\terror_prompt_alert('上传错误,文件格式必须为：png/jpg/jpeg');\r\n");
      out.write("       \treturn;  \r\n");
      out.write("       }\r\n");
      out.write("       $('#iimg').attr('src',src);\r\n");
      out.write("});\r\n");
      out.write("$('#fujian').on('change',function(){\r\n");
      out.write("   \tvar filePath = $(this).val(),         //获取到input的value，里面是文件的路径\r\n");
      out.write("   \t\tfileFormat = filePath.substring(filePath.lastIndexOf(\".\")).toLowerCase(),\r\n");
      out.write("   \t\tsrc = window.URL.createObjectURL(this.files[0]); //转成可以在本地预览的格式\r\n");
      out.write("   \tif( !fileFormat.match(/.mp3/) ) {\r\n");
      out.write("   \t\terror_prompt_alert('上传错误,文件格式必须为：mp3');\r\n");
      out.write("       \treturn;  \r\n");
      out.write("       }\r\n");
      out.write("});\r\n");
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