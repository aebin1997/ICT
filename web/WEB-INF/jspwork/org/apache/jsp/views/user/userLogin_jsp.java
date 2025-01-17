/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2021-01-08 00:22:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.model.vo.User;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.math.BigInteger;
import user.model.vo.User;

public final class userLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/user/../common/header.jsp", Long.valueOf(1610063680523L));
    _jspx_dependants.put("/views/user/../../views/common/footer.jsp", Long.valueOf(1609658644552L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.security.SecureRandom");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.math.BigInteger");
    _jspx_imports_classes.add("user.model.vo.User");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>직산 가정의학 의원</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("section table#loginTbl {\r\n");
      out.write("\tfloat: center;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\"> //자바스크립트 안에 자바코드\r\n");

String clientId = "fqQoUV89itlpdGTeJSUv";//애플리케이션 클라이언트 아이디값";
String redirectURI = URLEncoder.encode("http://localhost:8800/jiksan/", "UTF-8");
SecureRandom random = new SecureRandom();
String state = new BigInteger(130, random).toString();
String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
apiURL += "&client_id=" + clientId;
apiURL += "&redirect_uri=" + redirectURI;
apiURL += "&state=" + state;
session.setAttribute("state", state);

      out.write("\r\n");
      out.write("\r\n");
      out.write("function popupOpen(){\r\n");
      out.write("\tvar popUrl = \"");
      out.print(apiURL);
      out.write("\";\t//팝업창에 출력될 페이지 URL\r\n");
      out.write("\t/* 그냥 띄우는 법\r\n");
      out.write("\tvar popOption = \"width=460, height=690, resizable=no, scrollbars=no, status=no;\";    //팝업창 옵션(optoin)\r\n");
      out.write("\twindow.open(popUrl,\"\", popOption); \r\n");
      out.write("\t*/ \r\n");
      out.write("\t\r\n");
      out.write("\t//팝업창을 중앙에 정렬(모니터 화면 기준)\r\n");
      out.write("\tvar popupWidth =460;\r\n");
      out.write("\tvar popupHeight =690;\r\n");
      out.write("\tvar popupX =(window.screen.width/2)-(popupWidth/2);\r\n");
      out.write("\tvar popupY =(window.screen.height/2)-(popupHeight/2);\r\n");
      out.write("\twindow.open(popUrl,\"\", 'status=no, height=690, width=460, left='+ popupX + ', top='+ popupY);\r\n");
      out.write("\t\r\n");
      out.write("\t/*  팝업창을 중앙에 정렬(브라우저 화면 기준)\r\n");
      out.write("\tvar popupX = (document.body.offsetWidth / 2) - (200 / 2);\r\n");
      out.write("\t//만들 팝업창 좌우 크기의 1/2 만큼 보정값으로 빼주었음\r\n");
      out.write("\r\n");
      out.write("\tvar popupY= (window.screen.height / 2) - (300 / 2);\r\n");
      out.write("\t//만들 팝업창 상하 크기의 1/2 만큼 보정값으로 빼주었음\r\n");
      out.write("\r\n");
      out.write("\twindow.open('', '', 'status=no, height=300, width=200, left='+ popupX + ', top='+ popupY);\r\n");
      out.write("    */\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function doneLogin(){\r\n");
      out.write("\tlocation.href=\"/jiksan/index.jsp\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
   User loginUser = (User)session.getAttribute("loginUser"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"    href=\"/jiksan/resources/css/jiksan-header.css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("   src=\"/jiksan/resources/js/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("   $(\".full-slide\").click(function() {\r\n");
      out.write("      $(\".full-menu\").stop().slideToggle(300);\r\n");
      out.write("         $('.hamburger .line').css('transition', 'all 0.2s ease-in-out');\r\n");
      out.write("\r\n");
      out.write("         if($('.hamburger').hasClass('is-active')){\r\n");
      out.write("            $('.hamburger span:nth-child(1)').css({'transform':'translateY(0) rotate(0)'});\r\n");
      out.write("            $('.hamburger span:nth-child(2)').css({'opacity':'1'});\r\n");
      out.write("            $('.hamburger span:nth-child(3)').css({'transform':'translateY(0) rotate(0)'});            \r\n");
      out.write("            $('.hamburger').removeClass('is-active');\r\n");
      out.write("         } else {\r\n");
      out.write("            $('.hamburger span:nth-child(1)').css({'transform':'translateY(12px) rotate(45deg)'});\r\n");
      out.write("            $('.hamburger span:nth-child(2)').css({'opacity':'0'});\r\n");
      out.write("            $('.hamburger span:nth-child(3)').css({'transform':'translateY(-4px) rotate(-45deg)'});\r\n");
      out.write("            $('.hamburger').addClass('is-active');\r\n");
      out.write("         }\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   function setCookie(name, value, expiredays) {\r\n");
      out.write("      var todayDate = new Date();\r\n");
      out.write("      todayDate.setDate(todayDate.getDate() + expiredays);\r\n");
      out.write("      document.cookie = name + \"=\" + escape(value) + \"; path=/; expires=\" + todayDate.toGMTString() + \";\"\r\n");
      out.write("   }\r\n");
      out.write("   function getCookie(name) {\r\n");
      out.write("      var nameOfCookie = name + \"=\";\r\n");
      out.write("      var x = 0;\r\n");
      out.write("      while (x <= document.cookie.length) {\r\n");
      out.write("         var y = (x + nameOfCookie.length);\r\n");
      out.write("         if (document.cookie.substring(x, y) == nameOfCookie) {\r\n");
      out.write("            if ((endOfCookie = document.cookie.indexOf(\";\", y)) == -1)\r\n");
      out.write("               endOfCookie = document.cookie.length;\r\n");
      out.write("            return unescape(document.cookie.substring(y, endOfCookie));\r\n");
      out.write("         }\r\n");
      out.write("         x = document.cookie.indexOf(\" \", x) + 1;\r\n");
      out.write("         if (x == 0)\r\n");
      out.write("            break;\r\n");
      out.write("      }\r\n");
      out.write("      return \"\";\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        //예약페이지로 넘어가게하는 함수\r\n");
      out.write("        function redirect(){\r\n");
      out.write("        window.location.href = \"/jiksan/drlist\" \r\n");
      out.write("        }\r\n");
      out.write("        function redirectAdmin(){\r\n");
      out.write("        window.location = \"/jiksan/drlist.ad\" /* 만약에 실행시 오류나면 \"/jiksan/drlist.ad/\"          */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <div id=\"wrap\" class=\"mw1600\" >\r\n");
      out.write("      <div class=\"mw1600\">\r\n");
      out.write("         <div class=\"bg-white mw\" style=\"position: relative;\">\r\n");
      out.write("            <div id=\"header-wrap\" class=\"inner cf\" >\r\n");
      out.write("               <a href=\"/jiksan/index.jsp\"><img style=\"position: absolute; left: 200px; top: 0px; z-index: 1;\"\r\n");
      out.write("                  src=\"/jiksan/resources/main_images/jiksan_logo.png\"\r\n");
      out.write("                  alt=\"직산 가정의학과 의원\" width=264px; height=66px></a>\r\n");
      out.write("\t\t\t\t<div style=\"position: relative;\">\r\n");
      out.write("               <section>\r\n");
      out.write("                  ");
      out.write("\r\n");
      out.write("                  ");
 if(loginUser == null){ 
      out.write("\r\n");
      out.write("                  <nav>\r\n");
      out.write("                     <a href=/jiksan/views/user/userLogin.jsp><img\r\n");
      out.write("                        src=\"/jiksan/resources/main_images/nav-icon01.png\" alt=\"LOGIN\"><span>LOGIN</span></a>\r\n");
      out.write("                     <a href=\"/jiksan/views/user/userEnroll.jsp\"><img\r\n");
      out.write("                        src=\"/jiksan/resources/main_images/nav-icon02.png\" alt=\"JOIN\"><span>JOIN</span></a>\r\n");
      out.write("                     <a href=\"/jiksan/views/about/contact-us.jsp\"><img\r\n");
      out.write("                        src=\"/jiksan/resources/main_images/nav-icon03.png\"\r\n");
      out.write("                        alt=\"CONTACT US\"><span>CONTACT US</span></a> <a href=\"#n\"\r\n");
      out.write("                        class=\"full-slide\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                           <div class=\"three col\">\r\n");
      out.write("                              <div class=\"hamburger\" id=\"hamburger-1\">\r\n");
      out.write("                                 <span class=\"line\"></span> <span class=\"line\"></span> <span\r\n");
      out.write("                                    class=\"line\"></span>\r\n");
      out.write("                              </div>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div> <span style=\"font-weight: 500; color: #74afc9;\">전체메뉴</span>\r\n");
      out.write("                     </a>\r\n");
      out.write("                  </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"full-menu bg-white\">\r\n");
      out.write("               <div class=\"inner\">\r\n");
      out.write("                  <ul class=\"full-list inner cf\">\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>병원안내</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-clinic.jsp\">병원안내</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-services.jsp\">진료안내</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-team.jsp\">의료진 소개</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/contact-us.jsp\">오시는길</a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>당뇨클리닉</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/disease?disease_no=108\">당뇨병이란?</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-diet.jsp\">당뇨병과 식생활</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-exercise.jsp\">당뇨병과 운동</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-complications.jsp\">당뇨병 합병증</a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>건강정보</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/dlist\">질환백과</a></li>\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>진료 예약</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/reservation/about-appt.jsp\">예약안내</a></li>\r\n");
      out.write("                           <li><a href=\"javascript:redirect()\">진료 예약하기</a></li>\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>커뮤니티</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/nlist\">공지사항</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/faqlist\">자주묻는 질문</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/qalist\">Q&A 게시판</a></li>\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("               ");
 } else if (loginUser != null && loginUser.getUserLv() > '1'){ 
      out.write("\r\n");
      out.write("               <nav>\r\n");
      out.write("                  <a href=\"/jiksan/logout\"><img\r\n");
      out.write("                     src=\"/jiksan/resources/main_images/nav-icon01.png\" alt=\"LOGOUT\"><span>LOGOUT</span></a>\r\n");
      out.write("                  <a href=\"moveDoctorMP();\">\r\n");
      out.write("                     <img src=\"/jiksan/resources/main_images/nav-icon02.png\" alt=\"MY PAGE\"><span>MY PAGE</span></a>\r\n");
      out.write("                  <a href=\"javascript:redirectAdmin()\"><img\r\n");
      out.write("                     src=\"/jiksan/resources/main_images/nav-icon04.png\"\r\n");
      out.write("                     alt=\"RESERVATION\"><span>RESERVATION</span></a> <a href=\"#n\"\r\n");
      out.write("                     class=\"full-slide\">\r\n");
      out.write("                     <div class=\"row\">\r\n");
      out.write("                        <div class=\"three col\">\r\n");
      out.write("                           <div class=\"hamburger\" id=\"hamburger-1\">\r\n");
      out.write("                              <span class=\"line\"></span> <span class=\"line\"></span> <span\r\n");
      out.write("                                 class=\"line\"></span>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div> <span style=\"font-weight: 500; color: #74afc9;\">전체메뉴</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("               </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"full-menu bg-white\">\r\n");
      out.write("               <div class=\"inner\">\r\n");
      out.write("                  <ul class=\"full-list inner cf\">\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>병원안내</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-clinic.jsp\">병원안내</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-services.jsp\">진료안내</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-team.jsp\">의료진 소개</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/contact-us.jsp\">오시는길</a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>당뇨클리닉</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/disease?disease_no=108\">당뇨병이란?</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-diet.jsp\">당뇨병과 식생활</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-exercise.jsp\">당뇨병과 운동</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-complications.jsp\">당뇨병 합병증</a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>건강정보 관리</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/dlist\">질환백과</a></li>\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>진료 예약 관리</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/reservation/about-appt.jsp\">예약안내</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/reservation\">진료 예약하기</a></li>\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>커뮤니티 관리</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/nlist\">공지사항</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/faqlist\">자주묻는 질문</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/qalist\">Q&A 게시판</a></li>\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                        <div>회원 관리</div>\r\n");
      out.write("                        <ol>\r\n");
      out.write("                           <li><a href=\"#\">회원 리스트</a></li>\r\n");
      out.write("                           <li><a href=\"#\">#</a></li>\r\n");
      out.write("                           <li><a href=\"#\">#</a></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                     </li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script type=\"text/javascript\">  ");
      out.write("\r\n");
      out.write("      \t\t//의사 마이페이지로 넘어가게 하는 함수 \r\n");
      out.write("\t\t\tfunction moveDoctorMP(){\r\n");
      out.write("\t   \t\tlocation.href = \"/jiksan/dtlist?user_no=");
      out.print( loginUser.getUserNo() );
      out.write("\"; \r\n");
      out.write("\t    \t}\r\n");
      out.write("\t  \t\t</script>\r\n");
      out.write("            ");
 } else { 
      out.write("\r\n");
      out.write("            <nav>\r\n");
      out.write("               <a href=\"/jiksan/logout\"><img\r\n");
      out.write("                  src=\"/jiksan/resources/main_images/nav-icon01.png\" alt=\"LOGOUT\"><span>LOGOUT</span></a>\r\n");
      out.write("                  <a href=\"/jiksan/uupdate\">\r\n");
      out.write("                  ");
      out.write("\r\n");
      out.write("                     <img src=\"/jiksan/resources/main_images/nav-icon02.png\" alt=\"MY PAGE\"><span>MY PAGE</span></a>\r\n");
      out.write("                  <a href=\"javascript:redirect()\"><img\r\n");
      out.write("                  src=\"/jiksan/resources/main_images/nav-icon04.png\"\r\n");
      out.write("                  alt=\"RESERVATION\"><span>RESERVATION</span></a> <a href=\"#n\"\r\n");
      out.write("                  class=\"full-slide\">\r\n");
      out.write("                  <div class=\"row\">\r\n");
      out.write("                     <div class=\"three col\">\r\n");
      out.write("                        <div class=\"hamburger\" id=\"hamburger-1\">\r\n");
      out.write("                           <span class=\"line\"></span> <span class=\"line\"></span> <span\r\n");
      out.write("                              class=\"line\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div> <span style=\"font-weight: 500; color: #74afc9;\">전체메뉴</span>\r\n");
      out.write("               </a>\r\n");
      out.write("            </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"full-menu bg-white\">\r\n");
      out.write("         <div class=\"inner\">\r\n");
      out.write("            <ul class=\"full-list inner cf\">\r\n");
      out.write("               <li>\r\n");
      out.write("                  <div>병원안내</div>\r\n");
      out.write("                  <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-clinic.jsp\">병원안내</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-services.jsp\">진료안내</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/about-team.jsp\">의료진 소개</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/about/contact-us.jsp\">오시는길</a></li>\r\n");
      out.write("                  </ol>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                  <div>당뇨클리닉</div>\r\n");
      out.write("                  <ol>\r\n");
      out.write("                           <li><a href=\"/jiksan/disease?disease_no=108\">당뇨병이란?</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-diet.jsp\">당뇨병과 식생활</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-exercise.jsp\">당뇨병과 운동</a></li>\r\n");
      out.write("                           <li><a href=\"/jiksan/views/diabetes/diabetes-complications.jsp\">당뇨병 합병증</a></li>\r\n");
      out.write("                  </ol>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                  <div>건강정보</div>\r\n");
      out.write("                  <ol>\r\n");
      out.write("                     <li><a href=\"/jiksan/dlist\">질환백과</a></li>\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                  </ol>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                  <div>진료 예약</div>\r\n");
      out.write("                  <ol>\r\n");
      out.write("                     <li><a href=\"/jiksan/reservation/about-appt.jsp\">예약안내</a></li>\r\n");
      out.write("                     <li><a href=\"javascript:redirectAdmin()\">진료 예약하기</a></li>\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                  </ol>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                  <div>커뮤니티</div>\r\n");
      out.write("                  <ol>\r\n");
      out.write("                     <li><a href=\"/jiksan/nlist\">공지사항</a></li>\r\n");
      out.write("                     <li><a href=\"/jiksan/faqlist\">자주묻는 질문</a></li>\r\n");
      out.write("                     <li><a href=\"/jiksan/qalist\">Q&A 게시판</a></li>\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                     ");
      out.write("\r\n");
      out.write("                  </ol>\r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("      </section>\r\n");
      out.write("      </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<section>\r\n");
 if(loginUser == null){ //로그인 안 했다면 
      out.write("\r\n");
      out.write("<form action=\"/jiksan/login.cp\" method=\"post\">\r\n");
      out.write("<table id=\"loginTbl\">\r\n");
      out.write("\t<tr><th style=\"\" colspan=\"2\">아이디 / 비빌번호 LOGIN</th></tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>아이디 &nbsp;&nbsp;&nbsp;&nbsp; <input type=\"text\" name=\"user_id\"></th><td align=\"left\" rowspan=\"2\"><input type=\"submit\" value=\"로그인\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>비밀번호 &nbsp; <input type=\"password\" name=\"user_pw\"></th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\"><a href=\"#\">아이디 찾기</a> &nbsp; | &nbsp; <a href=\"#\">비밀번호 찾기</a></td>\r\n");
      out.write("\t</tr> \r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\"><input type=\"radio\" name=\"remember\" value=\"rememberid\">아이디 기억하기 &nbsp; \r\n");
      out.write("\t\t<input type=\"radio\" name=\"remember\" value=\"rememberidpw\">로그인 상태 유지하기</td>\r\n");
      out.write("\t</tr> \r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<tr><td align=\"center\" >소셜계정으로 로그인</td></tr>\r\n");
      out.write("\t\t\t<tr><td align=\"center\" >\r\n");
      out.write("\t\t\t<a href=\"javascript:popupOpen();\"><img src=\"/jiksan/resources/user_files/naver.logo.png\" width=\"199\" height=\"47\"></a>\r\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"/jiksan/resources/user_files/kakao.logo.png\" width=\"199\" height=\"47\"></a>\r\n");
      out.write("\t\t\t</td></tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"center\" colspan=\"2\">▪아직 회원가입을 하지 않으셨나요? <a href=\"/jiksan/views/user/userEnroll.jsp\">회원가입</a></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</section>\t\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("footer {\r\n");
      out.write("   background:#3e4247;\r\n");
      out.write("   text-align : center;\r\n");
      out.write("   width : 100%;\r\n");
      out.write("   height : 10%;\r\n");
      out.write("   color: #d1d1d1;\r\n");
      out.write("   font-size : 0.8em;\r\n");
      out.write("   padding-top : 2%;   \r\n");
      out.write("   padding-bottom : 2%;   \r\n");
      out.write("   line-height:1;\r\n");
      out.write("}\r\n");
      out.write("footer div h3 {\r\n");
      out.write("   color: #fff;\r\n");
      out.write("   font-size : 1.2em;\r\n");
      out.write("   font-weight : none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer_btn_list li {\r\n");
      out.write(" float: auto; overflow: hidden;\r\n");
      out.write(" padding-right: 10px;\r\n");
      out.write(" display:inline;\r\n");
      out.write(" line-height:2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#copyright, .footer_btn_list, address{\r\n");
      out.write("   color: #9AA0A6 /* #80868B */\r\n");
      out.write("} \r\n");
      out.write("hr { clear : both; }\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("   //개인정보처리방침\r\n");
      out.write("   function OpenMemberPrivate() { // \"개인정보처리방침\" 만들기? 가져오기\r\n");
      out.write("      window.open(\r\n");
      out.write("                  \"/jiksan/resources/js/개인정보처리방침.asp\",\r\n");
      out.write("                  \"MemberPrivate\",\r\n");
      out.write("                  \"toolbar=0, left=100, top=50, location=0, directories=0, status=0, menubar=0, scrollbars=1, resizable=0, copyhistory=0, width=600 ,height=600\");\r\n");
      out.write("   }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write("<div>\r\n");
      out.write("            <h3>직산 가정의학과 의원 Jiksan Family Medicine Clinic</h3><br>\r\n");
      out.write("            <address>충남 천안시 서북구 직산읍 직산로 31 직산농협 2층 &nbsp;&nbsp;&nbsp;&nbsp; (041) 583-8500\r\n");
      out.write("            </address>\r\n");
      out.write("            <br> <br>\r\n");
      out.write("            <p>\r\n");
      out.write("               평일 08:30 ~ 18:00 &nbsp;&nbsp;&nbsp;&nbsp; 토요일 09:00 ~ 13:00\r\n");
      out.write("               &nbsp;&nbsp;&nbsp;&nbsp; 점심시간 13:00 ~ 14:00\r\n");
      out.write("               &nbsp;&nbsp;&nbsp;&nbsp; 화요일 야간진료 21:00 까지 &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("               <i>일요일/공휴일은 휴무입니다.</i>\r\n");
      out.write("            </p>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label id=\"copyright\">Copyright ⓒ 2020 by Jiksan Family Medicine Clinic. All rights reserved.</label>\r\n");
      out.write("            <br>\r\n");
      out.write("         </div>\r\n");
      out.write("            <ul class=\"footer_btn_list\">\r\n");
      out.write("               <li><a href=\"#\" onclick=\"OpenMemberPrivate();\" style=\"cursor: pointer;\">개인정보처리방침</a></li>\r\n");
      out.write("               <li> | </li>\r\n");
      out.write("               <li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("               <li> | </li>\r\n");
      out.write("               <li><a href=\"/jiksan/contact-us\">찾아오시는길</a></li>         ");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
