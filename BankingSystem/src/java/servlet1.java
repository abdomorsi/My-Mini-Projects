

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import processes.Operations;

/**
 *
 * @author abdom
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
    
    PrintWriter out = null;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            out = response.getWriter();
            
            String userID = request.getParameter("userID");
            String userPass = request.getParameter("password");
            System.out.println(">> "+userID);
            boolean status = Operations.validation(userID, userPass);
            if( status ){
                response.addCookie(new Cookie("userID",userID));
                RequestDispatcher rd = request.getRequestDispatcher("customerHome.jsp");
                rd.forward(request,response);
                
            } else {
               
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User or password incorrect');");
                out.println("location='index.html';");
                out.println("</script>");
               
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
