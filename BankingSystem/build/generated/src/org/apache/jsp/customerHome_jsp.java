package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import processes.Operations;

public final class customerHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

          //PrintWriter out = response.getWriter();
          Cookie c[] = request.getCookies();
          String userID = c[0].getValue();
          System.out.println( c[0].getName() + " <<<" );
          Integer haveAccount = Operations.haveBankAccount(userID);
          System.out.println( haveAccount );
          
          System.out.println( "****" );
          
          if(haveAccount != 0){
              double balance = Operations.getBalance(haveAccount);
        //${balance}
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"card text-center\">\n");
      out.write("            <div class=\"card-header\"> Banking System </div>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                    <h3 class=\"card-title\">Current Balance</h3>\n");
      out.write("                    <p class=\"card-text\" > \n");
      out.write("                    ");
 out.print(balance + " $"); 
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                    <input type=\"button\" value=\"View Transactions\" onClick=\"JavaScript:window.location='Transactions.jsp';\">\n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("        ");

          }  
          else {
                //System.out.println("5 5 5 5 5 55 ");
        
      out.write("\n");
      out.write("        <div class=\"card text-center\">\n");
      out.write("            <div class=\"card-header\"> </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h3 class=\"card-title\">You, haven't account yet</h3>\n");
      out.write("                    <p class=\"card-text\"> Press Create Account to get one NOW </p>\n");
      out.write("                    <form action=\"AddAccount\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\"> Create Account </button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("        ");
   
          }  
        
      out.write("\n");
      out.write("        <div class=\"card text-center\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div>\n");
      out.write("                    <form  action=\"SendMoney\" method=\"POST\">\n");
      out.write("                        <div class=\"form-group mb-2\">\n");
      out.write("                            <h4> Make Transaction </h4> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group  mx-sm-3 mb-2\">\n");
      out.write("                            <label> to Bank-Account ID </label>\n");
      out.write("                            <input type=\"text\" name=\"ToAccountID\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group  mx-sm-3 mb-2\">\n");
      out.write("                            <label>Amount </label>\n");
      out.write("                            <input type=\"double\" name=\"amount\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success\"> Confirm </button>\n");
      out.write("                        </div>                            \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
