/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/SendMoney"})
public class SendMoney extends HttpServlet {
    PrintWriter out = null;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try {
            out = response.getWriter();
            Cookie c[] = request.getCookies();
            String userID = c[0].getValue();
            System.out.println(">> 00 :: "+c[0].getName());
            String tID = request.getParameter("transactionID");
            int transID = Integer.parseInt(tID);
            //System.out.println(">> 00"+accID);
            //System.out.println(">> 00"+userID);
            boolean status = Operations.cancelTransaction(transID);
            System.out.println(">> tt "+ status);
            
            if( status ){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Successfully canceled');");
                out.println("location='Transactions.jsp';");
                out.println("</script>");

                //response.sendRedirect("Transactions.jsp");
                //RequestDispatcher rd = request.getRequestDispatcher("Transactions.jsp");
                //rd.forward(request,response);
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Cannot canceled .. something wrong');");
                out.println("location='Transaction.jsp';");
                out.println("</script>");
                //response.sendRedirect("customerHome.jsp");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SendMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            out = response.getWriter();
            Cookie c[] = request.getCookies();
            String userID = c[0].getValue();
            System.out.println(">> 00 :: "+c[0].getName());
            
            int accID = Integer.parseInt(request.getParameter("ToAccountID"));
            double amountToSend = Double.parseDouble(request.getParameter("amount"));
            System.out.println(">> 00"+accID);
            System.out.println(">> 00"+userID);
            boolean status = Operations.validTransaction(accID,userID,amountToSend);
            System.out.println(">> 00"+ status);
            
            if( status ){
                Operations.makeTransaction(accID, userID, amountToSend,false);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Successful Transaction');");
                out.println("location='Transactions.jsp';");
                out.println("</script>");
//                RequestDispatcher rd = request.getRequestDispatcher("Transactions");
//                rd.forward(request,response);
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Something wrong check your balance or enter valid Account-ID');");
                out.println("location='customerHome.jsp';");
                out.println("</script>");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SendMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
