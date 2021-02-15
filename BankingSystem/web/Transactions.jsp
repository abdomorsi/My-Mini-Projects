<%-- 
    Document   : Transactions
    Created on : Dec 26, 2020, 11:31:32 PM
    Author     : abdom
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="processes.Operations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transactions</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="card-header text-center" > Banking System </div>
        <form class="form-inline" action="SendMoney" method="GET">
            <div class="form-group mx-sm-3 mb-2">
            <label name="transactionID" >Transaction ID</label>
            <input type="text" name="transactionID" class="form-control" placeholder="Transaction-ID">
            </div>
            <button type="submit" class="btn btn-success mb-2">Cancel Transaction</button>
        </form>    

        <table class="table table-striped">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Transaction ID</th>
                    <th scope="col">Date</th>
                    <th scope="col">Amount</th>
                    <th scope="col">To</th>                    
                </tr>
            </thead>
            <tbody>
        <%
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
        %> 
                <tr>
                    <th scope="row"> <% out.print(cnt); %> </th>
                    <td> <% out.print(transactionID); %>  </td>
                    <td> <% out.print(date); %></td>
                    <td> <% out.print(amount); %></td>
                    <td> <% out.print(recieverID); %></td>
                </tr>
        <%
            if( status ){
                out.println(" <div class='alert alert-success' role='alert'> ");
                out.println(" you didn't make any transaction yet ");
                out.println("</div>");
            }
            }
        %>
            
            </tbody>
        </table>
    </body>
</html>
