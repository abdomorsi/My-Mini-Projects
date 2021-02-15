<%-- 
    Document   : customerHome
    Created on : Dec 22, 2020, 6:17:45 AM
    Author     : abdom
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="processes.Operations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <title>Home</title>
    </head>
    <body>
        <%
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
        %>

        <div class="card text-center">
            <div class="card-header"> Banking System </div>
            <div class="card-body">
                    <h3 class="card-title">Current Balance</h3>
                    <p class="card-text" > 
                    <% out.print(balance + " $"); %>
                    </p>
                    <input type="button" value="View Transactions" onClick="JavaScript:window.location='Transactions.jsp';">
            </div>    
        </div>
        <%
          }  
          else {
                //System.out.println("5 5 5 5 5 55 ");
        %>
        <div class="card text-center">
            <div class="card-header"> </div>
                <div class="card-body">
                    <h3 class="card-title">You, haven't account yet</h3>
                    <p class="card-text"> Press Create Account to get one NOW </p>
                    <form action="AddAccount">
                        <div class="form-group">
                            <button type="submit" class="btn btn-success"> Create Account </button>
                        </div>
                    </form>
                </div>
        </div>
        <%   
          }  
        %>
        <div class="card text-center">
            <div class="card-body">
                        <div class="container">
            <div class="row">
                <div>
                    <form  action="SendMoney" method="POST">
                        <div class="form-group mb-2">
                            <h4> Make Transaction </h4> 
                        </div>
                        <div class="form-group  mx-sm-3 mb-2">
                            <label> to Bank-Account ID </label>
                            <input type="text" name="ToAccountID" class="form-control">
                        </div>
                        <div class="form-group  mx-sm-3 mb-2">
                            <label>Amount </label>
                            <input type="double" name="amount" class="form-control">
                        </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-success"> Confirm </button>
                        </div>                            
                    </form>
                </div>
            </div>
        </div>

            </div>
        </div>
    </body>
    
</html>
