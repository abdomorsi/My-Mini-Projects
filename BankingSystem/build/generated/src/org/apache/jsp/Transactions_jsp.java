package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import processes.Operations;

public final class Transactions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Transactions</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"card-header text-center\" > Banking System </div>\n");
      out.write("        <form class=\"form-inline\" action=\"SendMoney\" method=\"GET\">\n");
      out.write("            <div class=\"form-group mx-sm-3 mb-2\">\n");
      out.write("            <label name=\"transactionID\" >Transaction ID</label>\n");
      out.write("            <input type=\"text\" name=\"transactionID\" class=\"form-control\" placeholder=\"Transaction-ID\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success mb-2\">Cancel Transaction</button>\n");
      out.write("        </form>    \n");
      out.write("\n");
      out.write("        <table class=\"table table-striped\">\n");
      out.write("            <thead class=\"thead-dark\">\n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"col\">#</th>\n");
      out.write("                    <th scope=\"col\">Transaction ID</th>\n");
      out.write("                    <th scope=\"col\">Date</th>\n");
      out.write("                    <th scope=\"col\">Amount</th>\n");
      out.write("                    <th scope=\"col\">To</th>                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("        ");

            Cookie c[] = request.getCookies();
            String userID = c[0].getValue();
            System.out.println( c[0].getName() + " <<<" );
            ResultSet rs = Operations.viewTransactions(userID);
            int cnt = 0;
            boolean status = true;
            while( rs.next() ){
                status = false;
                cnt++;
                int transactionID = Integer.parseInt(rs.getString("BankTransactionID"));
                java.sql.Timestamp ts = rs.getTimestamp("BTCreationDate");
                java.sql.Date  date  = new java.sql.Date(ts.getTime());  
                //java.util.Date ddate = new java.util.Date(date.getTime());
                //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                //java.util.Date date = new java.util.Date();
                //java.sql.Date date = rs.getTime("BTCreationDate");
                double amount = rs.getDouble("BTAmount");
                int recieverID = rs.getInt("BTToAcount"); 
        
      out.write(" \n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\"> ");
 out.print(cnt); 
      out.write(" </th>\n");
      out.write("                    <td> ");
 out.print(transactionID); 
      out.write("  </td>\n");
      out.write("                    <td> ");
 out.print(date); 
      out.write("</td>\n");
      out.write("                    <td> ");
 out.print(amount); 
      out.write("</td>\n");
      out.write("                    <td> ");
 out.print(recieverID); 
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("        ");

            if( status ){
                out.println(" <div class='alert alert-success' role='alert'> ");
                out.println(" you didn't make any transaction yet ");
                out.println("</div>");
            }
            }
        
      out.write("\n");
      out.write("            \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
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
