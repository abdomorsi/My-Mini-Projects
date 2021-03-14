package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/includes/head.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Courgette|Pacifico:400,700\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"..\\myStyle\\headstyle.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h1> zayBooking </h1>\n");
      out.write("                <p> Making your movement easier and more comfortable </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-dark bg-dark\" role=\"navigation\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"Home.jsp\" > zayBooking </a>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"exCollapsingNavbar\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">About</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Link</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">Service</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a href=\"#\" class=\"nav-link\">More</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav flex-row justify-content-between ml-auto\">\n");
      out.write("                    <li class=\"nav-item order-2 order-md-1\"><a href=\"#\" class=\"nav-link\" title=\"settings\"><i class=\"fa fa-cog fa-fw fa-lg\"></i></a></li>\n");
      out.write("                    <li class=\"nav-item order-2 order-md-2\">\n");
      out.write("                        <input type=\"button\"  class=\"btn btn-outline-secondary\" onclick=\"location.href='../login.jsp'\" value=\"Login\">                        \n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>       \n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Courgette|Pacifico:400,700\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"myStyle/headstyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"myStyle/homestyle.css\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"searchForm\" id=\"srch\">\n");
      out.write("            <form action=\"searchServlet.java\" method=\"get\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2\"></div>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <label for=\"location\"> Where are you going? </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"location\" placeholder=\"Hurghada\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2\"></div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <label for=\"location\"> Check-in </label>\n");
      out.write("                        <input type=\"date\" class=\"form-control\" name=\"checkin\" placeholder=\"2-1-2021\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <label for=\"location\"> Check-out </label>\n");
      out.write("                        <input type=\"date\" class=\"form-control\" name=\"checkout\" placeholder=\"3-1-2021\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" id=\"srchBtn\"> Search </button>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
