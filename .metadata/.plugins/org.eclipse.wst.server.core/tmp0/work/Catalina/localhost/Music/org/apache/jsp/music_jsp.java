/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2019-05-11 13:45:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class music_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <script src=\"js/jquery.min.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"/> \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap-theme.min.css\"/>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        *{\r\n");
      out.write("        \tmargin: 0 auto;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        #music-contain{\r\n");
      out.write("        \theight: 700px;\r\n");
      out.write("        \twidth: 100%;\r\n");
      out.write("        \toverflow: inherit;\r\n");
      out.write("        }\r\n");
      out.write("    \t#music-tittle{\r\n");
      out.write("    \t\theight: 150px;\r\n");
      out.write("    \t\tpadding: 20px;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t#music-tittle img{\r\n");
      out.write("    \t\tbackground-color: black;\r\n");
      out.write("    \t\theight: 90px;\r\n");
      out.write("    \t\twidth: 90px;\r\n");
      out.write("    \t\tborder-radius: 60%;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t#download-APP{\r\n");
      out.write("    \t\tmargin-top: 40px;\r\n");
      out.write("    \t\twidth:100%;\r\n");
      out.write("    \t\theight: 40px;\r\n");
      out.write("    \t\topacity: 0.8;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t#music-foot{\r\n");
      out.write("    \t\ttext-align: center;\r\n");
      out.write("    \t\tmargin-bottom: 40px;\r\n");
      out.write("    \t}\r\n");
      out.write("    \t.blur {\t\r\n");
      out.write("\t\t    filter: url(blur.svg#blur); /* FireFox, Chrome, Opera */\r\n");
      out.write("\t\t    background-position: center;\r\n");
      out.write("\t\t    background-size: cover;\t\t    \r\n");
      out.write("\t\t    width: 130%;\r\n");
      out.write("\t\t    -webkit-filter: blur(10px); /* Chrome, Opera */\r\n");
      out.write("\t\t       -moz-filter: blur(10px);\r\n");
      out.write("\t\t        -ms-filter: blur(10px);    \r\n");
      out.write("\t\t            filter: blur(10px);\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    filter: progid:DXImageTransform.Microsoft.Blur(PixelRadius=10, MakeShadow=false); /* IE6~IE9 */\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#disc{\r\n");
      out.write("\t\t\tbackground-image: url(img/bg4.png);\r\n");
      out.write("\t\t\tbackground-size: 100% 100%;\r\n");
      out.write("\t\t\t/*height: 300px;\r\n");
      out.write("\t\t\twidth: 300px;*/\r\n");
      out.write("\t\t\tmargin-bottom: 40px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#disc img{\r\n");
      out.write("\t\t\theight: 55%;\r\n");
      out.write("\t\t\twidth: 55%;\r\n");
      out.write("\t\t\tborder-radius: 60%;\r\n");
      out.write("\t\t\tmargin-top: 22.5%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#music-play{\r\n");
      out.write("\t\t\theight: 50px;\r\n");
      out.write("\t\t\tmargin: 0px 20px;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#play{/*é³ä¹æ­æ¾æé®*/\r\n");
      out.write("\t\t\theight: 30px;\r\n");
      out.write("\t\t    width: 30px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#music-play>div{\r\n");
      out.write("\t\t\tfloat: left;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#progress{\r\n");
      out.write("\t\t\twidth: 65%;\r\n");
      out.write("\t\t\theight: 30px;\r\n");
      out.write("\t\t\tpadding: 10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#music-time{\r\n");
      out.write("\t\t\tpadding: 5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("   </style>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("   \t$(function(){\r\n");
      out.write("   \t\t//è®¾ç½®discçæ ·å¼\r\n");
      out.write("   \t\tfunction setdisc(){\r\n");
      out.write("   \t\tvar hei=$(window).width();\r\n");
      out.write("            \t$(\"#disc\").css({\r\n");
      out.write("            \t\t'height': hei*0.8,\r\n");
      out.write("            \t\t'width':  hei*0.8\r\n");
      out.write("            \t});   \t\r\n");
      out.write("        } \r\n");
      out.write("        \r\n");
      out.write("            $(\"#play\").click(function(){\r\n");
      out.write("            \t var music = document.getElementById(\"music\"); \r\n");
      out.write("            \tif(music.paused){ \r\n");
      out.write("\t\t\t        music.play(); \r\n");
      out.write("\t\t\t        $(\"#play img\").attr('src','img/pause.png');\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t    }else{ \r\n");
      out.write("\t\t\t        music.pause(); \r\n");
      out.write("                    $(\"#play img\").attr('src','img/play.png');\t\t\t        \r\n");
      out.write("\t\t\t    } \r\n");
      out.write("\t\t\t   })\r\n");
      out.write("              function time(){\r\n");
      out.write("              \tsetInterval(function(){\r\n");
      out.write("              \t\tvar time1=parseInt(music.currentTime);/*é³ä¹çå½åæ¶é´*/\r\n");
      out.write("\t            \tvar time2=parseInt(music.duration);/*é³ä¹çæ»æ¶é´*/\r\n");
      out.write("\t            \tvar time11=parseInt(time1/60)+\":\"+time1%60;\r\n");
      out.write("\t            \tvar time22=parseInt(time2/60)+\":\"+time2%60;\r\n");
      out.write("\t            \tvar jing=time1/time2*100+\"%\";\r\n");
      out.write("\t            \t$(\".progress div\").css(\"width\",jing);\r\n");
      out.write("\t            \t$(\"#time1\").text(time11);\r\n");
      out.write("\t            \t$(\"#time2\").text(time22);\r\n");
      out.write("\t            \t//alert(time1+\" \"+time2);\r\n");
      out.write("              \t},1000);\r\n");
      out.write("              }\r\n");
      out.write("              time();\r\n");
      out.write("            if($(\"#music\").played)\r\n");
      out.write("               {\r\n");
      out.write("               \t   var time1=$(\"#music\").currentTime;/*é³ä¹çå½åæ¶é´*/\r\n");
      out.write("\t            \tvar time2=$(\"#music\").duration;/*é³ä¹çæ»æ¶é´*/\r\n");
      out.write("\t            \t$(\"#time1\").text(time1);\r\n");
      out.write("\t            \t$(\"#time2\").text(time2);\r\n");
      out.write("\t            \t//alert(time1+\" \"+time2);\r\n");
      out.write("               }\r\n");
      out.write("            else\r\n");
      out.write("               //alert(\"pause\");\r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("        setdisc();\r\n");
      out.write("         if(location.href.indexOf('#reloaded')==-1){\r\n");
      out.write("\t\t    location.href=location.href+\"#reloaded\";\r\n");
      out.write("\t\t    location.reload();\r\n");
      out.write("         }\r\n");
      out.write("   \t})\r\n");
      out.write("   </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \t$(function(){\r\n");
      out.write("    \t\txuanzhuan();//å¤´åæè½¬\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t/*è·åurlä¸­çåæ°*/\r\n");
      out.write("\t    \tfunction getQueryString(name) {\r\n");
      out.write("\t\t\t    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');\r\n");
      out.write("\t\t\t    var r = window.location.search.substr(1).match(reg);\r\n");
      out.write("\t\t\t    if (r != null) {\r\n");
      out.write("\t\t\t        return decodeURIComponent(r[2]);\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t    return null;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t// è¿æ ·è°ç¨ï¼\r\n");
      out.write("\t\t\tvar headImageUrl=getQueryString(\"headImageUrl\");//å¤´å\r\n");
      out.write("\t\t\tvar imageUrl=getQueryString(\"imageUrl\");//ä¸è¾å¤´ï¼è½¬çï¼\r\n");
      out.write("\t\t\tvar userName=getQueryString(\"userName\");//ä½èå§å\r\n");
      out.write("\t\t\tvar musicName=getQueryString(\"musicName\");//æ­æ²å\r\n");
      out.write("\t\t\tvar dataUrl=getQueryString(\"dataUrl\");//æ­æ²\r\n");
      out.write("\t\t\t/*è·åurlä¸­ç*/\r\n");
      out.write("    \t\tfunction xuanzhuan(){/*ä½èå¤´åä¸ç´æè½¬*/\r\n");
      out.write("    \t\t\tvar count=0;\r\n");
      out.write("    \t\t\tvar time=setInterval(function(){\r\n");
      out.write("    \t\t\t\tcount+=1;\r\n");
      out.write("    \t\t\t\tvar c=\"rotate(\"+parseInt(count)+\"deg)\";\r\n");
      out.write("                    $(\"#disc img\").css('transform',c);\r\n");
      out.write("    \t\t\t},100);\r\n");
      out.write("    \t\t}/*ä½èå¤´åä¸ç´æè½¬*/\r\n");
      out.write("    \t\t$(\"#download-APP button\").mousedown(function(){/*æ´æ¹ä¸è½½æé®çéæåº¦*/\r\n");
      out.write("    \t\t\t$(this).css('opacity','1');\r\n");
      out.write("    \t\t})\r\n");
      out.write("    \t\t/*è®¾ç½®ä½èååæ­æ²å*/\r\n");
      out.write("    \t\tchange();\r\n");
      out.write("            function change(){\r\n");
      out.write("            \t//$(\"#media-body\").find('h4').text(musicName);\r\n");
      out.write("                //$(\"#media-body\").find('span').text(userName);\r\n");
      out.write("                //$(\"#headImageUrl\").attr('src',headImageUrl);\r\n");
      out.write("                //$(\"#imageUrl\").attr('src',imageUrl);\r\n");
      out.write("               // $(\"audio\").attr('src',dataUrl);\r\n");
      out.write("                //http://127.0.0.1:8020/music/2.html?musicName=åå±±å&userName=åå¾·å\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("    \t})\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<img src=\"http://imgsrc.baidu.com/image/c0%3Dshijue1%2C0%2C0%2C294%2C40/sign=32c015eaf6039245b5b8e94ceffdceb7/d788d43f8794a4c28c10040c04f41bd5ad6e39e2.jpg\" class=\"blur navbar-fixed-top\" />\r\n");
      out.write("\t<div id=\"music-contain\" class=\"navbar-fixed-top\">\r\n");
      out.write("    \t</div> \t   \r\n");
      out.write("\t\t<div id=\"music-tittle\" class=\"navbar-fixed-top\"><!--å¤´åãåç§°æ¾ç½®å¨è¿é-->\r\n");
      out.write("\t         <div class=\"media\">\r\n");
      out.write("\t\t\t  <div class=\"media-left\">\r\n");
      out.write("\t\t\t    <a href=\"#\">\r\n");
      out.write("\t\t\t      <img class=\"media-object\" id=\"headImageUrl\" src=\"img/bgimg2.jpg\" alt=\"...\">\r\n");
      out.write("\t\t\t    </a>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"media-body\" id=\"media-body\" style=\"padding: 10px;\">\r\n");
      out.write("\t\t\t    <h4 class=\"media-heading\"  style=\"padding: 10px;\">Media heading</h4>\r\n");
      out.write("\t\t\t        <span id=\"\"  style=\"padding: 10px;\">ä½è </span> \r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("\t\t</div><!--å¤´åãåç§°æ¾ç½®å¨è¿é-->\r\n");
      out.write("\t     <div id=\"music-body\" style=\"margin: 150px 0;\">\r\n");
      out.write("\t     \t\r\n");
      out.write("\t     </div>\r\n");
      out.write("\t       \r\n");
      out.write("\t     <div id=\"music-foot\" class=\"navbar-fixed-bottom\"><!--é³ä¹æ»å¨æ¡æ¾ç½®-->\r\n");
      out.write("\t     \t<div id=\"disc\"><!--å­æ¾ç¢çï¼å¤´åè½¬å¨-->\r\n");
      out.write("\t     \t\t<!--<div id=\"music-pho\">-->\r\n");
      out.write("\t     \t\t\t<img id=\"imageUrl\" src=\"img/bgimg2.jpg\"/>\r\n");
      out.write("\t     \t\t<!--</div>-->\r\n");
      out.write("\t     \t</div>\r\n");
      out.write("\t     \t<div id=\"music-play\"><!--é³ä¹æ§å¶ç»ä»¶-->\r\n");
      out.write("\t     \t\t<div id=\"play\"><img src=\"img/pause.png\"/></div>\r\n");
      out.write("\t     \t\t<div id=\"progress\">\r\n");
      out.write("\t     \t\t\t<div class=\"progress\">\r\n");
      out.write("\t\t\t\t\t  <div id=\" progress-tiao\" class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:  0%\">\t\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t     \t\t</div>\r\n");
      out.write("\t     \t\t<div id=\"music-time\"><span id=\"time1\">12</span>/<span id=\"time2\">34</span></div>\r\n");
      out.write("\t     \t</div><!--é³ä¹æ§å¶ç»ä»¶-->\r\n");
      out.write("\t\t    <audio id=\"music\" controls=\"controls\" autoplay=\"\" loop=\"loop\" preload=\"auto\">\r\n");
      out.write("\t\t\t      ä½ çæµè§å¨ä¸æ¯æaudioæ ç­¾\r\n");
      out.write("\t\t\t      <source src=\"img/1.mp3\" type='audio/mp3' /> \r\n");
      out.write("\t    \t</audio>\r\n");
      out.write("            <div id=\"download-APP\">\r\n");
      out.write("            \t<div style=\"float: left;margin-left: 30px;\"><img style=\"height: 40px;width: 40px;margin-right: 20px;\" src=\"img/f.gif\" alt=\"\" />æ±æ³é³ä¹</div>\r\n");
      out.write("            \t<div style=\"float: right;margin-right: 30px;\"><a href=\"http://www.baidu.com\"><button class=\"btn btn-primary\" style=\"margin-right: 0px;\">ä¸è½½app</button></a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t     </div><!--é³ä¹æ»å¨æ¡æ¾ç½®-->\r\n");
      out.write(" \r\n");
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
