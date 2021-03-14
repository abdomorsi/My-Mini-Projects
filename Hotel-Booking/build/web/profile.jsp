<%-- 
    Document   : profile
    Created on : Jan 9, 2021, 1:30:26 PM
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
        <link rel="stylesheet" href="myStyle/profileStyle.css">
        <title> My profile </title>
    </head>
    <body>
        <div class="container-p">
            <div class="row">
                <div class="updForm">                    
                    <form action="" method="POST">
                        <h2> update your information </h2>
                        <div class="form-item">
                            <div class="col-25">
                                <label for="fname">Username</label>
                            </div>
                            <div class="col-75">
                                <input type="text" id="fname" name="firstname" placeholder="Your name..">
                            </div>
                        </div>
                        <div class="form-item">
                            <div class="col-25">
                                <label for="mail">Email</label>
                            </div>
                            <div class="col-75">
                                <input type="email" id="email" name="email" placeholder="Your email..">
                            </div>
                        </div>
                        <div class="form-item">
                            <div class="col-25">
                                <label for="phone">Phone Number</label>
                            </div>
                            <div class="col-75">
                                <input type="text" id="phone" name="phone" placeholder="Your phone..">
                            </div>
                        </div>
                        <div class="form-item">
                            <input type="submit" value="Submit">
                        </div>

                    </form>
                </div>
            </div>
            
            <div class="row">
                <div class="updForm">                    
                    <form action="" method="get">
                        <h2> Cancel Reservation </h2>
                        <div class="form-item">
                            <div class="col-25">
                                <label for="rid">Reservation ID</label>
                            </div>
                            <div class="col-75">
                                <input type="text" id="rid" name="reservationID" placeholder="Reservation ID..">
                            </div>
                        </div>
                        <div class="form-item">
                            <input type="submit" value="Submit">
                        </div>
                    </form>
                </div>
            </div>

        </div>



    </body>
</html>
