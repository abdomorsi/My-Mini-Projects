package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchResults_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../myStyle/headstyle.css\">\n");
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Courgette|Pacifico:400,700\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=ABeeZee' rel='stylesheet'>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"myStyle/headstyle.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"myStyle/resultsStyle.css\">\n");
      out.write("        <title>Results</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-sr\">\n");
      out.write("            <article>\n");
      out.write("                <h5> Filter </h5>\n");
      out.write("                <div class=\"filter-Box\">\n");
      out.write("                    <form action=\"\" method=\"GET\">\n");
      out.write("                        <div class=\"filter\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"price\">What is you budget?</label>\n");
      out.write("                                <input type=\"number\" class=\"form-control\" id=\"price\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"filter\" >\n");
      out.write("                            <h6> users's rating </h6>\n");
      out.write("                            <div class=\"form-check\" id=\"fc\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"check1\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" id=\"check1\" name=\"vehicle1\" value=\"something\" checked>breakfast\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-check\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"check1\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" id=\"check1\" name=\"vehicle1\" value=\"something\" checked>Option 1\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-check\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"check2\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" id=\"check2\" name=\"vehicle2\" value=\"something\">Option 2\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-check\">\n");
      out.write("                                <label class=\"form-check-label\">\n");
      out.write("                                    <input type=\"checkbox\" class=\"form-check-input\" >Option 3\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"filter\">\n");
      out.write("                            <h6> Hotel's Stars </h6>\n");
      out.write("                            <div class=\"rating-filter\"> <input type=\"radio\" name=\"rating-filter\" value=\"5\" id=\"5\"><label for=\"5\">☆</label> <input type=\"radio\" name=\"rating-filter\" value=\"4\" id=\"4\"><label for=\"4\">☆</label> <input type=\"radio\" name=\"rating-filter\" value=\"3\" id=\"3\"><label for=\"3\">☆</label> <input type=\"radio\" name=\"rating-filter\" value=\"2\" id=\"2\"><label for=\"2\">☆</label> <input type=\"radio\" name=\"rating-filter\" value=\"1\" id=\"1\"><label for=\"1\">☆</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn \">Apply</button>\n");
      out.write("                    </form>    \n");
      out.write("                </div>\n");
      out.write("            </article>\n");
      out.write("            <div class=\"show\">\n");
      out.write("                <div class=\"container-fluid px-4 py-5 mx-auto\">\n");
      out.write("                    <div class=\"hotel-card\">\n");
      out.write("                        <div class=\"row d-flex justify-content-center\">\n");
      out.write("                            <div class=\"hotelImage\">\n");
      out.write("                                ");
 
                                   String imgsrc = "https://i.imgur.com/3pcJdqF.jpg";
                                   String Cost = "1880";
                                   String HotelName = "Park Inn by Radisson Berlin Alexanderplatz";
                                
      out.write("\n");
      out.write("                                <img class=\"h-image\" src= \"");
      out.print( (imgsrc));
      out.write("\" >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <div class=\"row px-3 mt-4 mb-3\">\n");
      out.write("                                    <p class=\"rating mb-0 px-2 mr-3\"><strong>8.0</strong></p>\n");
      out.write("                                    <p class=\"text mb-0 mr-2 grade\"><strong>Very Good</strong></p>\n");
      out.write("                                    <p class=\"text mb-0 mr-2\">&middot;</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row px-3\">\n");
      out.write("                                    <h3 class=\"h-name\"> ");
      out.print( (HotelName) );
      out.write(" </h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"info\">\n");
      out.write("                                <div class=\"row px-3 mb-2 mt-2\"> <span class=\"fa fa-star text-warning mr-1\"></span> <span class=\"fa fa-star text-warning mr-1\"></span> <span class=\"fa fa-star text-warning mr-1\"></span> <span class=\"fa fa-star text-warning mr-1\"></span> </div>\n");
      out.write("                                <div class=\"row px-3\">\n");
      out.write("                                    <h5 class=\"mb-1\">1 bedroom &middot; 1 living &middot; 2 beds</h5>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row px-3\">\n");
      out.write("                                    <p class=\"mb-4\">Mitte, Berlin &middot; 2.6 km from center</p>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                                <div class=\"row px-3 mb-4\">\n");
      out.write("                                    <h2 class=\"text-success mb-1 font-weight-bold\"> Price: ");
      out.print( (Cost));
      out.write("</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
