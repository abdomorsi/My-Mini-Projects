<%-- 
    Document   : Home
    Created on : Dec 31, 2020, 10:45:08 AM
    Author     : abdom
--%>
<%@include  file="includes/head.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Courgette|Pacifico:400,700">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="myStyle/headstyle.css">
        <link rel="stylesheet" href="myStyle/homestyle.css">
        <title>Home</title>
    </head>
    <body>

        <div class="searchForm" id="srch">
            <form action="searchServlet.java" method="get">
                <div class="row">
                    <div class="col-md-2"></div>
                    <div class="col-md-8">
                        <label for="location"> Where are you going? </label>
                        <input type="text" class="form-control" name="location" placeholder="Hurghada">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-2"></div>
                    <div class="col-md-4">
                        <label for="location"> Check-in </label>
                        <input type="date" class="form-control" name="checkin" placeholder="2-1-2021">
                    </div>
                    <div class="col-md-4">
                        <label for="location"> Check-out </label>
                        <input type="date" class="form-control" name="checkout" placeholder="3-1-2021">
                    </div>
                </div>
                <button type="submit" id="srchBtn"> Search </button>

            </form>

        </div>

    </body>
</html>
