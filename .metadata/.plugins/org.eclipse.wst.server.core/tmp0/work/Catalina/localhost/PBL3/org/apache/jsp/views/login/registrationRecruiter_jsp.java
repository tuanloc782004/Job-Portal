/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-03 03:31:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrationRecruiter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1712144786899L));
    _jspx_dependants.put("jar:file:/D:/PBL3/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/PBL3/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/D:/PBL3/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/PBL3/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1711982526419L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1712141790945L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Sign up - Recruiter</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<input type=\"hidden\" id=\"status\"\r\n");
      out.write("		value=\"");
      out.print(request.getAttribute("status"));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"main\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Sign up form -->\r\n");
      out.write("		<section class=\"signup\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"signup-content\">\r\n");
      out.write("					<div class=\"signup-form\">\r\n");
      out.write("						<h2 class=\"form-title\">Sign up</h2>\r\n");
      out.write("\r\n");
      out.write("						<!-- Buttons for switching between user and recruiter signup -->\r\n");
      out.write("						<div class=\"switch-form\">\r\n");
      out.write("							<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/register\"><button\r\n");
      out.write("									style=\"background-color: rgba(0, 140, 186, 0.5); /* Green */ border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px; margin: 0px 2px 32px 2px; cursor: pointer;\">User</button></a>\r\n");
      out.write("							<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/register-recruiter\"><button\r\n");
      out.write("									style=\"background-color: #008CBA; /* Blue */ border: none; color: white; padding: 15px 32px; text-align: center; text-decoration: none; display: inline-block; font-size: 16px; margin: 0px 2px 32px 2px; cursor: pointer;\">Recruiter</button></a>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<form method=\"post\" action=\"\" class=\"register-form\"\r\n");
      out.write("							id=\"register-form\">\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"name\"><i\r\n");
      out.write("									class=\"zmdi zmdi-account material-icons-name\"></i></label> <input\r\n");
      out.write("									type=\"text\" name=\"name\" id=\"name\" placeholder=\"Company Name\" />\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label> <input\r\n");
      out.write("									type=\"email\" name=\"email\" id=\"email\"\r\n");
      out.write("									placeholder=\"Company Email\" />\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"pass\"><i class=\"zmdi zmdi-lock\"></i></label> <input\r\n");
      out.write("									type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Password\" />\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"re-pass\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\r\n");
      out.write("								<input type=\"password\" name=\"re_pass\" id=\"re_pass\"\r\n");
      out.write("									placeholder=\"Repeat your password\" />\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label for=\"contact\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\r\n");
      out.write("								<input type=\"text\" name=\"contact\" id=\"contact\"\r\n");
      out.write("									placeholder=\"Contact no\" />\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<input type=\"checkbox\" name=\"agree-term\" id=\"agree-term\"\r\n");
      out.write("									class=\"agree-term\" /> <label for=\"agree-term\"\r\n");
      out.write("									class=\"label-agree-term\"><span><span></span></span>I\r\n");
      out.write("									agree all statements in <a href=\"#\" class=\"term-service\">Terms\r\n");
      out.write("										of service</a></label>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group form-button\">\r\n");
      out.write("								<input type=\"submit\" name=\"signup\" id=\"signup\"\r\n");
      out.write("									class=\"form-submit\" value=\"Register\" />\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"signup-image\">\r\n");
      out.write("						<figure>\r\n");
      out.write("							<img\r\n");
      out.write("								src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login-project/images/signup-image.jpg\"\r\n");
      out.write("								alt=\"sing up image\">\r\n");
      out.write("						</figure>\r\n");
      out.write("						<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\"\r\n");
      out.write("							class=\"signup-image-link\">I am already member</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("js/main.js\"></script>\r\n");
      out.write("	<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		var status = document.getElementById(\"status\").value;\r\n");
      out.write("		if (status == \"success\")\r\n");
      out.write("			swal(\"Congrats\", \"Account Created Successfully\", \"success\");\r\n");
      out.write("		if (status == \"invalidName\")\r\n");
      out.write("			swal(\"Sorry\", \"Please Enter Name\", \"error\");\r\n");
      out.write("		if (status == \"invalidEmail\")\r\n");
      out.write("			swal(\"Sorry\", \"Please Enter Email\", \"error\");\r\n");
      out.write("		if (status == \"invalidUpwd\")\r\n");
      out.write("			swal(\"Sorry\", \"Please Enter Password\", \"error\");\r\n");
      out.write("		if (status == \"invalidConfirmUpwd\")\r\n");
      out.write("			swal(\"Sorry\", \"Password do not match\", \"error\");\r\n");
      out.write("		if (status == \"invalidEmail\")\r\n");
      out.write("			swal(\"Sorry\", \"Please Enter Email\", \"error\");\r\n");
      out.write("		if (status == \"invalidUmobile\")\r\n");
      out.write("			swal(\"Sorry\", \"Please Enter Mobile Number\", \"error\");\r\n");
      out.write("		if (status == \"invalidUmobileLength\")\r\n");
      out.write("			swal(\"Sorry\", \"Mobile Number should be of 10 digit\", \"error\");\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
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