/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2020-02-11 14:05:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inscription_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>FDP - Food De Paris</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/aos.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"goto-here\">\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark ftco-navbar-light\"\r\n");
      out.write("\t\tid=\"ftco-navbar\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.jsp\">FDP - Food De Paris</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#ftco-nav\" aria-controls=\"ftco-nav\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"oi oi-menu\"></span> Menu\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a href=\"index.jsp\"\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a href=\"login.jsp\"\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link\">Login</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item cta cta-colored\"><a href=\"cart.jsp\"\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link\"><span class=\"icon-shopping_cart\"></span>[");
 int num = (int) application.getAttribute("numberArticle"); 
					out.print(num); 
      out.write("]</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- END nav -->\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"hero-wrap hero-bread\"\r\n");
      out.write("\t\tstyle=\"background-image: url('images/bg_1.jpg');\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div\r\n");
      out.write("\t\t\t\tclass=\"row no-gutters slider-text align-items-center justify-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9 ftco-animate text-center\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"mb-0 bread green\">Inscription</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"ftco-section contact-section\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row block-9\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 order-md-last d-flex empty\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 order-md-last d-flex\">\r\n");
      out.write("\t\t\t\t\t<form action=\"ServletRegister\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"bg-white p-5 contact-form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"nom\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Your Name\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Your Surname\" name=\"prenom\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Password\" name=\"password\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"addresse\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Address\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Inscription\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary py-3 px-5\"><a href=\"login.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"link-inscription\"> Déjà inscrit ?</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"error\">");

							String error = (String) request.getAttribute("error");
							if (error != null && !error.isEmpty())
								out.print(error);
						
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- loader -->\r\n");
      out.write("\t<div id=\"ftco-loader\" class=\"show fullscreen\">\r\n");
      out.write("\t\t<svg class=\"circular\" width=\"48px\" height=\"48px\"> <circle\r\n");
      out.write("\t\t\tclass=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\"\r\n");
      out.write("\t\t\tstroke=\"#eeeeee\" /> <circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\"\r\n");
      out.write("\t\t\tfill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\" /></svg>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/popper.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/aos.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.animateNumber.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<script src=\"js/scrollax.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
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