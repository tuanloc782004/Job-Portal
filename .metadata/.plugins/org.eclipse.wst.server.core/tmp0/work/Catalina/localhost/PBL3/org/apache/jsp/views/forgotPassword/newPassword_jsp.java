/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-06 14:41:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.forgotPassword;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset='utf-8'>\r\n");
      out.write("<meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("<title>Job Portal</title>\r\n");
      out.write("<link\r\n");
      out.write("	href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css'\r\n");
      out.write("	rel='stylesheet'>\r\n");
      out.write("<link\r\n");
      out.write("	href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'\r\n");
      out.write("	rel='stylesheet'>\r\n");
      out.write("<script type='text/javascript'\r\n");
      out.write("	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\r\n");
      out.write("<style>\r\n");
      out.write(".placeicon {\r\n");
      out.write("	font-family: fontawesome\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-control-label::before {\r\n");
      out.write("	background-color: #dee2e6;\r\n");
      out.write("	border: #dee2e6\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body oncontextmenu='return false' class='snippet-body bg-info'>\r\n");
      out.write("	<link rel=\"stylesheet\"\r\n");
      out.write("		href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-social/5.1.1/bootstrap-social.css\">\r\n");
      out.write("	<div>\r\n");
      out.write("		<!-- Container containing all contents -->\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row justify-content-center\">\r\n");
      out.write("				<div class=\"col-12 col-md-9 col-lg-7 col-xl-6 mt-5\">\r\n");
      out.write("					<!-- White Container -->\r\n");
      out.write("					<div class=\"container bg-white rounded mt-2 mb-2 px-0\">\r\n");
      out.write("						<!-- Main Heading -->\r\n");
      out.write("						<div class=\"row justify-content-center align-items-center pt-3\">\r\n");
      out.write("							<h1>\r\n");
      out.write("								<strong>Reset Password</strong>\r\n");
      out.write("							</h1>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"pt-3 pb-3\">\r\n");
      out.write("							<form class=\"form-horizontal\" action=\"newPassword\" method=\"POST\">\r\n");
      out.write("								<!-- User Name Input -->\r\n");
      out.write("								<div class=\"form-group row justify-content-center px-3\">\r\n");
      out.write("									<div class=\"col-9 px-0\">\r\n");
      out.write("										<input type=\"text\" name=\"password\" placeholder=\"&#xf084; &nbsp; New Password\"\r\n");
      out.write("											class=\"form-control border-info placeicon\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- Password Input -->\r\n");
      out.write("								<div class=\"form-group row justify-content-center px-3\">\r\n");
      out.write("									<div class=\"col-9 px-0\">\r\n");
      out.write("										<input type=\"password\" name=\"confPassword\"\r\n");
      out.write("											placeholder=\"&#xf084; &nbsp; Confirm New Password\"\r\n");
      out.write("											class=\"form-control border-info placeicon\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							\r\n");
      out.write("								<!-- Log in Button -->\r\n");
      out.write("								<div class=\"form-group row justify-content-center\">\r\n");
      out.write("									<div class=\"col-3 px-3 mt-3\">\r\n");
      out.write("										<input type=\"submit\" value=\"Reset\"\r\n");
      out.write("											class=\"btn btn-block btn-info\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- Alternative Login -->\r\n");
      out.write("						<div class=\"mx-0 px-0 bg-light\">\r\n");
      out.write("							\r\n");
      out.write("							<!-- Horizontal Line -->\r\n");
      out.write("							<div class=\"px-4 pt-5\">\r\n");
      out.write("								<hr>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- Register Now \r\n");
      out.write("							<div class=\"pt-2\">\r\n");
      out.write("								<div class=\"row justify-content-center\">\r\n");
      out.write("									<h5>\r\n");
      out.write("										Don't have an Account?<span><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/register\"\r\n");
      out.write("											class=\"text-danger\"> Register Now!</a></span>\r\n");
      out.write("									</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div\r\n");
      out.write("									class=\"row justify-content-center align-items-center pt-4 pb-5\">\r\n");
      out.write("									<div class=\"col-4\">\r\n");
      out.write("										\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>-->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script type='text/javascript'\r\n");
      out.write("		src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.bundle.min.js'></script>\r\n");
      out.write("	\r\n");
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
