/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2019-05-11 11:20:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>在线音乐网站</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
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
      out.write("    .btn{\r\n");
      out.write("    width: 24px;\r\n");
      out.write("    height: 24px;\r\n");
      out.write("    top: 7px;\r\n");
      out.write("    left: 150px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    border: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    background: url(\"../picture/search.png\");\r\n");
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
      out.write("   }  \r\n");
      out.write("     ul{ \r\n");
      out.write("     list-style:none;\r\n");
      out.write("     }\r\n");
      out.write("      .slider{\r\n");
      out.write("       width:1000px;\r\n");
      out.write("       border: 0px #708090 solid; \r\n");
      out.write("       padding:0px 0px;\r\n");
      out.write("       height: 350px;\r\n");
      out.write("       margin:auto;\r\n");
      out.write("       position: relative;\r\n");
      out.write("       cursor: pointer; \r\n");
      out.write("       }\r\n");
      out.write("      .slider_pic{ \r\n");
      out.write("      width: 800px;\r\n");
      out.write("      margin:auto;\r\n");
      out.write("      overflow: hidden;\r\n");
      out.write("      height: 350px;\r\n");
      out.write("      position: relative;\r\n");
      out.write("      }\r\n");
      out.write("      .prev,.next{\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      width: 20px;\r\n");
      out.write("      height: 20px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      top:150px;\r\n");
      out.write("      background-color: #daa520; \r\n");
      out.write("      text-align: center;\r\n");
      out.write("      line-height: 20px;\r\n");
      out.write("      font-weight: bold;\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      }\r\n");
      out.write("      .next{\r\n");
      out.write("      right: 20px;\r\n");
      out.write("      }\r\n");
      out.write("      .topp{\r\n");
      out.write("      border-bottom:2px solid red;\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"1250\" height=\"50\" border=\"0\" style=\"background:#404040\">\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td width=\"100\"></td>\r\n");
      out.write("      <td width=\"150\" align=\"center\">\r\n");
      out.write("         <img src=\"../picture/icon.png\" height=\"50\"/></td>\r\n");
      out.write("      <td width=\"200\" align=\"center\" class=\"top\">\r\n");
      out.write("         <a href=\"../index2.jsp\">发现音乐</a>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td width=\"100\" align=\"center\" class=\"top\">\r\n");
      out.write("         <a href=\"../mymusic.jsp\">我的音乐</a>\r\n");
      out.write("      </td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <div class=\"container\" style=\"position:absolute;left:900px;top:15px;\">\r\n");
      out.write("         <form action=\"../searchsong.jsp\" class=\"parent\" method=\"post\" accept-charset=\"utf-8\" onsubmit=\"document.charset='utf-8'\">\r\n");
      out.write("             <input type=\"text\" name=\"songname\" class=\"search\" placeholder=\"音乐\">\r\n");
      out.write("             <input type=\"button\" name=\"\" id=\"\" class=\"btn\">\r\n");
      out.write("         </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("        <div class=\"dropdown\" style=\"float:right\">\r\n");
      out.write("         <button type=\"button\" class=\"dropbtn\">");
      out.print((String)session.getAttribute("username") );
      out.write("</button> \r\n");
      out.write("        <div class=\"dropdown-content\">          \r\n");
      out.write("            <a href=\"../mymusic.jsp\" target=\"_parent\"><img src=\"../picture/my.png\">&nbsp;我的主页</a>\r\n");
      out.write("            <a href=\"../Logout.jsp\"><img src=\"../picture/back.png\">&nbsp;退出</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<hr size=\"1\" color=\"white\" width=\"1000px\">\r\n");
      out.write("<div class=\"slider\">\r\n");
      out.write("     <span class=\"prev\" id=\"prev\" onclick=\"prev()\"><<</span>\r\n");
      out.write("     <span class=\"next \" id=\"next\" onclick=\"next()\">>></span>\r\n");
      out.write("        <div class=\"slider_pic\">\r\n");
      out.write("         <a id=\"aa\" href=\"../SongDetail.jsp?songid=1\"><img id=\"img1\" src=\"../picture/mzt.png\" width=\"100%\" height=\"100%\" /></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div> \r\n");
      out.write("<table class=\"topp\" width=\"1000px\" align=\"center\">\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td width=\"30px\"><img src=\"../picture/red.png\"/></td>\r\n");
      out.write("     <td width=\"200px\"><h2>热门推荐</h2></td>\r\n");
      out.write("     <td width=\"650px\"> <a href=\"../TagDetail.jsp?tagid=1\" target=\"_parent\">华语</a> |<a href=\"../TagDetail.jsp?tagid=6\" target=\"_parent\">流行</a> |\r\n");
      out.write("      <a href=\"../TagDetail.jsp?tagid=7\" target=\"_parent\">摇滚</a> | <a href=\"../TagDetail.jsp?tagid=11\" target=\"_parent\">爵士</a> | \r\n");
      out.write("      <a href=\"../TagDetail.jsp?tagid=8\" target=\"_parent\">电子</a> </td>\r\n");
      out.write("     <td><a href=\"../allSheet.jsp\" target=\"_parent\">更多>></a></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table align=\"center\" width=\"1000px\" align=\"center\">\r\n");
      out.write("\t\t<tr height=\"50\">\r\n");
      out.write("\t\t");

			try{
				request.setCharacterEncoding("UTF-8");
				String id="";
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Sheet order by cnum desc";
				rs=connDB.executeQuery(strSql);//查询
				int i=0;
				while(rs.next()){
					String sheetid=rs.getString("id");
					String name=rs.getString("name");
					String userid=rs.getString("userid");
					String date=rs.getString("date");
					String introduction=rs.getString("introduction");
					String picture=rs.getString("picture");
					String cnum=rs.getString("cnum");
			i++;
			if(i<=8){
            
      out.write("\r\n");
      out.write("\t\t\t\t<td width=\"30\" align=\"center\">\r\n");
      out.write("\t\t\t\t<a href=\"../SheetDetail.jsp?sheetid=");
      out.print(sheetid );
      out.write("\" target=\"_parent\"><img src=\"../picture/");
      out.print(picture );
      out.write("\" width=\"200px\" height=\"200px\"></a></br>\r\n");
      out.write("\t\t\t<a href=\"../SheetDetail.jsp?sheetid=");
      out.print(sheetid );
      out.write("\" target=\"_parent\">");
      out.print(name );
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t");

						if(i%4==0){
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"50\">\r\n");
      out.write("\t\t\t\t\t\t\t");
 
						}
					}else{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t");
	
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t");
}
					}catch(SQLException e){
						out.print(e.getMessage());
					}
				
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("<table class=\"topp\" width=\"1000px\" align=\"center\">\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td width=\"30px\"><img src=\"../picture/red.png\"/></td>\r\n");
      out.write("     <td width=\"200px\"><h2>新歌上架</h2></td>\r\n");
      out.write("     <td width=\"650px\"> </td>\r\n");
      out.write("     <td><a href=\"../allSong.jsp\" target=\"_parent\">更多>></a></td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table align=\"center\" width=\"1000px\" align=\"center\">\r\n");
      out.write("\t\t<tr height=\"50\">\r\n");
      out.write("\t\t");

			try{
				request.setCharacterEncoding("UTF-8");
				String id="";
				String strSql="";
				ResultSet rs=null;
				strSql="select * from Song order by date desc";
				rs=connDB.executeQuery(strSql);//查询
				int i=0;
				while(rs.next()){
					String songid=rs.getString("songid");
					String name=rs.getString("name");
					String singer=rs.getString("singer");
					String album=rs.getString("album");
					String picture=rs.getString("picture");
					String fujian=rs.getString("fujian");
					String date=rs.getString("date");
					i++;
					if(i<=8){
		            
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"../SongDetail.jsp?songid=");
      out.print(songid );
      out.write("\" target=\"_parent\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"../picture/");
      out.print(picture );
      out.write("\" width=\"200px\" height=\"200px\"></a>\r\n");
      out.write("\t\t\t\t\t\t<br><a href=\"../SongDetail.jsp?songid=");
      out.print(songid );
      out.write("\" target=\"_parent\">");
      out.print(name );
      out.write("</a><br>");
      out.print(singer );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t");

						if(i%4==0){
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"50\">\r\n");
      out.write("\t\t\t\t\t\t\t");
 
						}
					}else{
					
      out.write("\r\n");
      out.write("\t\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t\t");
	
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t");
}
					}catch(SQLException e){
						out.print(e.getMessage());
					}
				
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("<script>\r\n");
      out.write("\t\tvar a=new Array(\"mzt.png\",\"ban.png\",\"xl.png\",\"pmig.png\");\r\n");
      out.write("\t    i=0;\r\n");
      out.write("\t    function prev(){\r\n");
      out.write("\t    \tif(i==0)\r\n");
      out.write("\t    \t\ti=3;\r\n");
      out.write("\t    \telse if(i>0)\r\n");
      out.write("\t    \t\ti--;\r\n");
      out.write("\t    \tdocument.getElementById(\"img1\").src=\"../picture/\"+a[i];\r\n");
      out.write("\t    \tj=i+1;\r\n");
      out.write("\t    \tdocument.getElementById(\"aa\").href=\"../SongDetail.jsp?songid=\"+j;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    function next(){\r\n");
      out.write("\t    \tif(i==3)\r\n");
      out.write("\t    \t\ti=0;\r\n");
      out.write("\t    \telse if(i<3)\r\n");
      out.write("\t    \t\ti++;\r\n");
      out.write("\t    \tdocument.getElementById(\"img1\").src=\"../picture/\"+a[i];\r\n");
      out.write("\t    \tj=i+1;\r\n");
      out.write("\t    \tdocument.getElementById(\"aa\").href=\"../SongDetail.jsp?songid=\"+j;\r\n");
      out.write("\t    }\r\n");
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
