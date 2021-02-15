/*
Name : Abdelrahman Mohammed Ahmed Morsy 

 */
package processes;

import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Cookie;

/**
 *
 * @author abdom
 */
public class Operations {
    private static Connection createConnection() throws ClassNotFoundException{
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/banksystem","root","");    
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static boolean validation(String userID,String password) throws ClassNotFoundException{
        boolean status = false;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/banksystem","root","");
            Connection conn  = createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM customer where CustomerID=? and Password=?");
            ps.setString(1,userID);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    public static Integer haveBankAccount(String userID) throws SQLException{
        Integer accID = 0;
        boolean status = false;
        try {
            Connection conn = createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM bankaccount where CustomerID=?");
            ps.setString(1,userID);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            if(status)accID = rs.getInt("BankAccountID");
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        //if ( !status ) BAID++;
        return accID;
    }
    
    public static double getBalance(Integer accID) throws SQLException{
        double b = -1;
        try {
            Connection conn = createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT BACurrentBalance FROM bankaccount where BankAccountID=?");
            ps.setInt(1,accID);
            ResultSet rs = ps.executeQuery();
            boolean status = rs.next();
            if(status) b = rs.getDouble("BACurrentBalance");
            else return -1;
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    
    public static Integer generateValidAccountID() throws SQLException{
        int max = 20500 , min = 10000;
        int accID = (int)(Math.random() * (max - min + 1) + min);
        try {
            Connection conn = createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM bankaccount where BankACCountID=?");
            ps.setInt(1,accID); 
            ResultSet rs = ps.executeQuery();
            boolean status = rs.next();
            if( status ) return generateValidAccountID();
            conn.close(); ///??
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return accID;
    }
    
    public static void CreateNewBankAccount(String userID, double initialBalanceAmount) throws SQLException{
        try {
            
            int BankAccID = generateValidAccountID();
            Connection conn = createConnection();
            java.util.Date date = new java.util.Date();
            java.sql.Date creationDate = new java.sql.Date(date.getTime());
            PreparedStatement ps = conn.prepareStatement("INSERT INTO bankaccount (BankAccountID,BACreationDate,BACurrentBalance,CustomerID) VALUES(?,?,?,?)");
            ps.setInt(1,BankAccID);
            ps.setDate(2, creationDate);
            ps.setDouble(3, initialBalanceAmount);
            ps.setString(4,userID);
            ps.executeUpdate();
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    public static ResultSet viewTransactions(String userID) throws ClassNotFoundException{
        ResultSet rs = null; 
        try {
            Connection conn = createConnection();
            PreparedStatement ps2 = conn.prepareStatement("SELECT BankAccountID FROM bankaccount where CustomerID=?");
            ps2.setString(1,userID); 
            rs = ps2.executeQuery();
            rs.next();
            int accID = rs.getInt("BankAccountID");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM banktransaction where BTFromAccount=?");
            ps.setInt(1,accID); 
            rs = ps.executeQuery();
         }  catch (SQLException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static boolean validTransaction(int ToAccID,String FromCustomerID, double money) throws SQLException{
        boolean status = false;
        boolean isReciverExist = false;
        boolean moneyCanSend = false;
        try {
            Connection conn = createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM bankaccount where BankAccountID=?");
            ps.setInt(1,ToAccID);
            ResultSet rs = ps.executeQuery();
            isReciverExist = rs.next();
            System.out.println(">> 11 * "+isReciverExist);
            ps.close();
            PreparedStatement ps2 = conn.prepareStatement("SELECT BACurrentBalance FROM bankaccount where CustomerID=?");
            ps2.setString(1, FromCustomerID);
            rs = ps2.executeQuery();
            rs.next();
            double currentBalance = rs.getDouble("BACurrentBalance");
            moneyCanSend = (currentBalance >= money);
            System.out.println(">> 11 * "+moneyCanSend);
            ps2.close();
            status = isReciverExist && moneyCanSend;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
     }
    
    public static Integer generateValidTransactionID() throws SQLException{
        int max = 3000 , min = 1000;
        int transID = (int)(Math.random() * (max - min + 1) + min);
        try {
            Connection conn = createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM banktransaction where BankTransactionID=?");
            ps.setInt(1,transID); 
            ResultSet rs = ps.executeQuery();
            boolean status = rs.next();
            if( status ) return generateValidTransactionID();
            conn.close(); ///??
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return transID;
    }
    
    public static void makeTransaction(int ToAccID,String FromCustomerID, double money, boolean cancel) throws SQLException{
        try {
            Connection conn = createConnection();
            
            PreparedStatement ps2 = conn.prepareStatement("SELECT BACurrentBalance FROM bankaccount where CustomerID=?"); // sender
            ps2.setString(1, FromCustomerID);
            ResultSet rs = ps2.executeQuery();
            rs.next();
            double newSenderBalance = rs.getDouble("BACurrentBalance") - money; 

            PreparedStatement ps3 = conn.prepareStatement("SELECT BACurrentBalance FROM bankaccount where BankAccountID=?"); // reciver
            ps3.setInt(1, ToAccID);
            rs = ps3.executeQuery();
            rs.next();
            double newReciverBalance = rs.getDouble("BACurrentBalance") + money; 

            PreparedStatement ps = conn.prepareStatement("update bankaccount set BACurrentBalance=? where BankAccountID=?");
            ps.setDouble(1, newReciverBalance);
            ps.setInt(2,ToAccID);
            ps.executeUpdate();
            
            ps = conn.prepareStatement("update bankaccount set BACurrentBalance=? where CustomerID=?");
            ps.setDouble(1, newSenderBalance);
            ps.setString(2,FromCustomerID);
            ps.executeUpdate();
            
            /////********************************************************************************************
            if(!cancel){
            java.util.Date date = new java.util.Date();
            java.sql.Date creationDate = new java.sql.Date(date.getTime());
            
            ps = conn.prepareStatement("SELECT BankAccountID FROM bankaccount where CustomerID=?");
            ps.setString(1, FromCustomerID);
            rs = ps.executeQuery();
            rs.next();
            int from = rs.getInt("BankAccountID");
            
            ps = conn.prepareStatement("INSERT INTO banktransaction (BankTransactionID,BTCreationDate,BTAmount,BTFromACCount,BTToacount) VALUES(?,?,?,?,?)");
            int transID = generateValidTransactionID();
            ps.setInt(1,transID);
            ps.setDate(2, creationDate);
            ps.setDouble(3,money);
            ps.setInt(4,from);
            ps.setInt(5,ToAccID);
            ps.executeUpdate();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
    public static boolean cancelTransaction(int transID) throws SQLException{
            boolean status = false;
            try {
            Connection conn = createConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * from banktransaction where BankTransactionID=?");
            ps.setInt(1, transID);
            ResultSet rs = ps.executeQuery();
            if(!rs.next()) return false;
            
            java.sql.Timestamp ts = rs.getTimestamp("BTCreationDate");
            java.sql.Date  creationDate  = new java.sql.Date(ts.getTime());  

            java.util.Date dateNow = new java.util.Date();
            java.sql.Date now = new java.sql.Date(dateNow.getTime());
            
            long difference = now.getTime() - creationDate.getTime(); 
            long difference_In_Days = TimeUnit.MILLISECONDS.toDays(difference) % 365; 
            System.out.println(difference_In_Days);
            
            if( difference_In_Days > 2 ) return false;
            status = true;
            double money = rs.getDouble("BTAmount");
            int backTo = rs.getInt("BTFromAccount"); //ToaccID
            int canceledReciver = rs.getInt("BTToAcount");
            ps = conn.prepareStatement("SELECT CustomerID from bankaccount where BankAccountID=?");
            ps.setInt(1,canceledReciver);
            rs = ps.executeQuery();
            rs.next();
            String newTransFrom = rs.getString("CustomerID");
            makeTransaction(backTo,newTransFrom,money,true);
            ps = conn.prepareStatement("DELETE from bankTransaction where BankTransactionID=?");
            ps.setInt(1,transID);
            ps.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
     }

   
}
