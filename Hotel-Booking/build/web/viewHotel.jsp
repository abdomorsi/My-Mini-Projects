<%-- 
    Document   : viewHotel
    Created on : Jan 13, 2021, 9:18:10 AM
    Author     : abdom
--%>
<%@include  file="includes/head.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Courgette|Pacifico:400,700">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="myStyle/headstyle.css">
        <link rel="stylesheet" href="myStyle/viewHotelStyle.css">
        <title>Hotel Name</title>
    </head>
    <body>
        <div class="head-db">
            <h2> Hotel Name </h2>

        </div>
        <div class="main">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-sm-9 col-md-6 col-lg-8">

                    </div>
                    <div class="col-sm-3 col-md-6 col-lg-4">
                        <div class="location">
                            <div class="card-body card-body-cascade text-center">
                                <div id="map-container-google-8" class="z-depth-1-half map-container-5" style="height:200px">
                                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d18709.871244279006!2d31.21589931271423!3d30.03963376741791!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x145840cd3ef57809%3A0xd7f50b4221f71eb0!2sFour%20Seasons%20Hotel%20Cairo%20at%20Nile%20Plaza!5e0!3m2!1sen!2seg!4v1610528076340!5m2!1sen!2seg" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="gallery">
                    <div class="row-gallery">
                        <div class="column-img">
                            <img src="img/room/rooms-1.jpg" alt="our Facilities" onclick="myFunction(this);">
                        </div>
                        <div class="column-img">
                            <img src="img/room/rooms-1.jpg" alt="our Facilities" onclick="myFunction(this);">
                        </div>
                        <div class="column-img">
                            <img src="img/room/rooms-1.jpg" alt="our Facilities" onclick="myFunction(this);">
                        </div>
                        <div class="column-img">
                            <img src="img/room/rooms-1.jpg" alt="our Facilities" onclick="myFunction(this);">
                        </div>
                        <div class="column-img">
                            <img src="img/room/rooms-1.jpg" alt="our Facilities" onclick="myFunction(this);">
                        </div>
                    </div>
                    <div class="show-img">
                        <span onclick="this.parentElement.style.display = 'none'" class="closebtn">&times;</span>
                        <img id="expandedImg" style="width:100%">
                        <div id="imgtext"> </div>
                    </div>
                </div>
                <div class="hotel-rooms">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="room-pic">
                                <img src="img/room/rooms-1.jpg" alt="">
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="room-text">
                                <div class="room-title">
                                    <h2>Standard Room</h2>
                                    <div class="room-price">
                                        <span>From</span>
                                        <h2>$99</h2>
                                        <sub>/night</sub>
                                    </div>
                                </div>
                                <div class="room-desc">
                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus mauris, bibendum
                                        eget sapien ac, ultrices rhoncus ipsum.</p>
                                </div>
                                <div class="room-features">
                                    <div class="room-info">
                                        <span>Smart TV</span>
                                    </div>
                                    <div class="room-info">
                                        <span>High Wi-fii</span>
                                    </div>
                                    <div class="room-info">
                                        <span>AC</span>
                                    </div>
                                    <div class="room-info">
                                        <span>Parking</span>
                                    </div>
                                    <div class="room-info last">
                                        <span>Pool</span>
                                    </div>
                                </div>
                                <a href="#" class="primary-btn">Book Now <i class="lnr lnr-arrow-right"></i></a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="txtarea">
                    <form action="#" method="get">
                        <div class="row">
                            <div class="cmnt" >
                                <textarea name="comment"  rows="7" cols="100" id="comment">Hey... Write your comment!</textarea>
                            </div>

                            <div class="userRate"> 
                                Rate us: <input type="number" step="0.01" min="0" max="5" placeholder="4.5">
                            </div>

                            <div class="sendbtn" >
                                <input type="submit" class="btn" value="Submit">
                            </div>

                        </div>
                    </form>

                </div>

                <div class="hotel-rating">
                    <div class="row" id="hr-r">
                        <span class="heading">User Rating</span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star"></span>
                        <p>4.1 average based on 254 reviews.</p>
                        <hr style="border:3px solid #f1f1f1">

                        <div class="row" id="hr-b">
                            <div class="side">
                                <div>5 star</div>
                            </div>
                            <div class="middle">
                                <div class="bar-container">
                                    <div class="bar-5"></div>
                                </div>
                            </div>
                            <div class="side right">
                                <div>150</div>
                            </div>
                            <div class="side">
                                <div>4 star</div>
                            </div>
                            <div class="middle">
                                <div class="bar-container">
                                    <div class="bar-4"></div>
                                </div>
                            </div>
                            <div class="side right">
                                <div>63</div>
                            </div>
                            <div class="side">
                                <div>3 star</div>
                            </div>
                            <div class="middle">
                                <div class="bar-container">
                                    <div class="bar-3"></div>
                                </div>
                            </div>
                            <div class="side right">
                                <div>15</div>
                            </div>
                            <div class="side">
                                <div>2 star</div>
                            </div>
                            <div class="middle">
                                <div class="bar-container">
                                    <div class="bar-2"></div>
                                </div>
                            </div>
                            <div class="side right">
                                <div>6</div>
                            </div>
                            <div class="side">
                                <div>1 star</div>
                            </div>
                            <div class="middle">
                                <div class="bar-container">
                                    <div class="bar-1"></div>
                                </div>
                            </div>
                            <div class="side right">
                                <div>20</div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="txtarea">
                    <h4> Reviews </h4>
                    <div class="textBox">
                        <div class="row">
                            <div class="cmnt" >
                                <p>
                                    "We stayed at Hotel Arthur on our trip to Helsinki and it was great. Location 
                                    was perfect for walking to everything! Staff was helpful and breakfast was great.
                                    Room was perfect for my daughter and myself. The only thing was our room faced the
                                    main road and the traffic was noisy all night. Would definite stay here again!"
                                </p>
                                <strong> Abdo Morsy </strong>
                            </div>
                        </div>


                        <div class="row">
                            <div class="cmnt" >
                                <p>
                                    "We stayed at Hotel Arthur on our trip to Helsinki and it was great. Location 
                                    was perfect for walking to everything! Staff was helpful and breakfast was great.
                                    Room was perfect for my daughter and myself. The only thing was our room faced the
                                    main road and the traffic was noisy all night. Would definite stay here again!"
                                </p>
                                <strong> Suhail </strong>
                            </div>
                        </div>

                        <div class="row">
                            <div class="cmnt" >
                                <p>
                                    "Good relaxing break! Friendly, welcoming staff. Very good location for city centre and local transport. Overall an enjoyable stay. The hotel is old and could do with some renovation, but it seems like this issue is being addressed."                        </p>
                                <strong> Sarah </strong>
                            </div>
                        </div>


                    </div>
                </div>


            </div>



        </div>

        <script>
            function myFunction(imgs) {
                var expandImg = document.getElementById("expandedImg");
                var imgText = document.getElementById("imgtext");
                expandImg.src = imgs.src;
                imgText.innerHTML = imgs.alt;
                expandImg.parentElement.style.display = "block";
            }
        </script>

    </body>
</html>

<%-- 
    <div class="col-md-6 mb-4">

    <!--Card-->
    <div class="card card-cascade narrower">

      <!--Card image-->
      <div class="view view-cascade gradient-card-header blue-gradient">
        <h5 class="mb-0">Regular map</h5>
      </div>
      <!--/Card image-->

      <!--Card content-->
      <div class="card-body card-body-cascade text-center">

        <!--Google map-->
        <div id="map-container-google-8" class="z-depth-1-half map-container-5" style="height: 300px">
          <iframe src="https://maps.google.com/maps?q=Barcelona&t=&z=13&ie=UTF8&iwloc=&output=embed"
            frameborder="0" style="border:0" allowfullscreen></iframe>
        </div>

      </div>
      <!--/.Card content-->

    </div>
    <!--/.Card-->

  </div>
--%>