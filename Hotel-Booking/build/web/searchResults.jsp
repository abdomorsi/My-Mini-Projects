<%-- 
    Document   : searchResults
    Created on : Jan 3, 2021, 7:20:55 AM
    Author     : abdom
--%>
<%@include  file="includes/head.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Courgette|Pacifico:400,700">
        <link href='https://fonts.googleapis.com/css?family=ABeeZee' rel='stylesheet'>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="myStyle/headstyle.css">
        <link rel="stylesheet" type="text/css" href="myStyle/resultsStyle.css">
        <title>Results</title>
    </head>
    <body>
        <div class="container-sr">
            <article>
                <h5> Filter </h5>
                <div class="filter-Box">
                    <form action="" method="GET">
                        <div class="filter">
                            <div class="form-group">
                                <label for="price">What is you budget?</label>
                                <input type="number" class="form-control" id="price">
                            </div>
                        </div>
                        <div class="filter" >
                            <h6> users's rating </h6>
                            <div class="form-check" id="fc">
                                <label class="form-check-label" for="check1">
                                    <input type="checkbox" class="form-check-input" id="check1" name="vehicle1" value="something" checked>breakfast
                                </label>
                            </div>
                            <div class="form-check">
                                <label class="form-check-label" for="check1">
                                    <input type="checkbox" class="form-check-input" id="check1" name="vehicle1" value="something" checked>Option 1
                                </label>
                            </div>
                            <div class="form-check">
                                <label class="form-check-label" for="check2">
                                    <input type="checkbox" class="form-check-input" id="check2" name="vehicle2" value="something">Option 2
                                </label>
                            </div>
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input type="checkbox" class="form-check-input" >Option 3
                                </label>
                            </div>
                        </div>
                        <div class="filter">
                            <h6> Hotel's Stars </h6>
                            <div class="rating-filter"> <input type="radio" name="rating-filter" value="5" id="5"><label for="5">☆</label> <input type="radio" name="rating-filter" value="4" id="4"><label for="4">☆</label> <input type="radio" name="rating-filter" value="3" id="3"><label for="3">☆</label> <input type="radio" name="rating-filter" value="2" id="2"><label for="2">☆</label> <input type="radio" name="rating-filter" value="1" id="1"><label for="1">☆</label>
                            </div>
                        </div>
                        <button type="submit" class="btn ">Apply</button>
                    </form>    
                </div>
            </article>
            <div class="show">
                <div class="container-fluid px-4 py-5 mx-auto">
                    <div class="hotel-card">
                        <div class="row d-flex justify-content-center">
                            <div class="hotelImage">
                                <% 
                                   String imgsrc = "https://i.imgur.com/3pcJdqF.jpg";
                                   String Cost = "1880";
                                   String HotelName = "Park Inn by Radisson Berlin Alexanderplatz";
                                %>
                                <img class="h-image" src= "<%= (imgsrc)%>" >
                            </div>
                            <div class="col-12">
                                <div class="row px-3 mt-4 mb-3">
                                    <p class="rating mb-0 px-2 mr-3"><strong>8.0</strong></p>
                                    <p class="text mb-0 mr-2 grade"><strong>Very Good</strong></p>
                                    <p class="text mb-0 mr-2">&middot;</p>
                                </div>
                                <div class="row px-3">
                                    <h3 class="h-name"> <%= (HotelName) %> </h3>
                                </div>
                                <div class="info">
                                <div class="row px-3 mb-2 mt-2"> <span class="fa fa-star text-warning mr-1"></span> <span class="fa fa-star text-warning mr-1"></span> <span class="fa fa-star text-warning mr-1"></span> <span class="fa fa-star text-warning mr-1"></span> </div>
                                <div class="row px-3">
                                    <h5 class="mb-1">1 bedroom &middot; 1 living &middot; 2 beds</h5>
                                </div>
                                <div class="row px-3">
                                    <p class="mb-4">Mitte, Berlin &middot; 2.6 km from center</p>
                                </div>
                                </div>
                                <div class="line"></div>
                                <div class="row px-3 mb-4">
                                    <h2 class="text-success mb-1 font-weight-bold"> Price: <%= (Cost)%></h2>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </body>
</html>
