/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2021-01-04 12:10:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("   margin-left: 10%;\r\n");
      out.write("   margin-top: 10%;\r\n");
      out.write("   margin-right: 10%;\r\n");
      out.write("   align: center;\r\n");
      out.write("   color: #9AA0A6;\r\n");
      out.write("}\r\n");
      out.write("h5 {\r\n");
      out.write("   color: #9AA0A6;\r\n");
      out.write("}\r\n");
      out.write("h1 {\r\n");
      out.write("   color:  #80868B;\r\n");
      out.write("}\r\n");
      out.write("hr {\r\n");
      out.write("   border: 4px dotted #E6E8E8;\r\n");
      out.write("}\r\n");
      out.write("h3{ color: #blue;}\r\n");
      out.write("a { text-decoration: none; }\r\n");
      out.write("a:visited {text-decoration: none; }\r\n");
      out.write("a:hover {text-decoration: black; position: relative; }\r\n");
      out.write("a:hover:after{\r\n");
      out.write("   content: url(/jiksan/resources/main_images/jiksan_logo.png); \r\n");
      out.write("   zoom: 20%;\r\n");
      out.write("   position: center;\r\n");
      out.write("   display: block;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>직산 가정의학과 의원</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<section>\r\n");
      out.write("<article id=\"alertImg\">\r\n");
      out.write("<img src=\"/jiksan/resources/main_images/error_alert_01.jpg\" alt=\"alert image\" width=\"10%\">\r\n");
      out.write("</article>\r\n");
      out.write("<h5>이용에 불편을 드려 죄송합니다.</h5>\r\n");
      out.write("<h1>페이지 준비중 입니다.</h1>\r\n");
      out.write("<hr>\r\n");
      out.write("<h3>직산 가정의학과 의원 Jiksan Family Medicine Clinic</h3>\r\n");
      out.write("<address>충남 천안시 서북구 직산읍 직산로 31 직산농협 2층 &nbsp;&nbsp;&nbsp;&nbsp; (041) 583-8500\r\n");
      out.write("</address>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("<div id=\"alertMsg\">\r\n");
      out.write("진료 안내 및 예약관련은 전화로 문의해 주세요. <br>\r\n");
      out.write("요청하신 페이지는 아직 준비중에 있거나 다음과 같은 오류가 발생하였습니다.\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
 if(exception != null){ //다른 jsp 파일에서 예외가 발생했다면 
      out.write("\r\n");
      out.write("<h3>jsp 페이지 오류 : ");
      out.print( exception.getMessage() );
      out.write(',');
      out.write(' ');
      out.print( exception.getClass().getName() );
      out.write("</h3>\r\n");
 }else{ 
      out.write("\r\n");
      out.write("<h3>servlet 오류 : ");
      out.print( request.getAttribute("message") );
      out.write("</h3>\r\n");
 } 
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<hr>\r\n");
      out.write("<h3><a href=\"/jiksan/index.jsp\"><img src=\"/jiksan/resources/main_images/error-home-icon.png\" alt=\"redirect home\" width = \"25px\">&nbsp;&nbsp; 홈으로</a></h3>\r\n");
      out.write("<h3><a href=\"javascript:history.go(-1);\"><img src=\"/jiksan/resources/main_images/error-back-icon.png\" alt=\"redirect home\" width = \"25px\">&nbsp;&nbsp; 이전 페이지로 이동</a></h3>\r\n");
      out.write("</section>\r\n");
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
