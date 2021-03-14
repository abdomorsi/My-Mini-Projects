<%-- 
    Document   : dashboard
    Created on : Jan 12, 2021, 2:34:23 PM
    Author     : abdom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://www.google.com/recaptcha/api.js"></script>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Courgette|Pacifico:400,700">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="myStyle/dashboardStyle.css">
        <title>Dashboard</title>
    </head>
    <body>
        <div class="head-db">
            <h2> Admin Dashboard </h2>
            <h3> Hotel </h3>
            <p> powered by <strong> zayBooking </strong> </p>
        </div>
        <div class="container-fluid row">
            <div class="side-menu col-2">

                <button class="tablink" onclick="openPage('home', this)" id="defaultOpen"><i class="fa fa-fw fa-home"></i> Home</button>
                <button class="tablink" onclick="openPage('services', this)"><i class="fa fa-fw fa-wrench"></i>services</button>
                <button class="tablink" onclick="openPage('customers', this)"><i class="fa fa-fw fa-user"></i> Clients</button>
                <button class="tablink" onclick="openPage('feedback', this)"><i class="fa fa-fw fa-envelope"></i> Feedback</button>
                <button class="tablink" id="rate"> Average Rating: 4.1</button>


            </div>
            <div class="content col-9" id="home">
                <div class="show-table">
                    <table id="reservation-table">
                        <h3> Reservation  </h3>
                        <thead>
                            <tr>
                                <th>first</th>
                                <th>Second</th>
                                <th>third</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td>valueFirst</td>
                                <td>valueSecond</td>
                                <td>valueSecond</td>
                            </tr>

                        </tbody>

                    </table>

                </div>

                <div class="inline-form">
                    <form action="#" method="GET">
                        <div class="form-item"> 
                            <h4> cancel Reservation </h4>
                            <div class="col-60">
                                <input type="text" name="reservationID" class="form-control" placeholder="Reservation-ID">
                            </div>
                            <div class="col-40">
                                <button type="submit" class="btn">Cancel</button>
                            </div>
                        </div>
                    </form>  
                </div>

                <div class="inline-form" id="show-reservation-inperiod">
                    <form action="#" method="GET">
                        <div class="form-item"> 
                            <h4> Show Reservation </h4>
                            <div class="col-25">
                                <input type="date" name="fromDate" class="form-control">
                            </div>
                            <div class="col-25">
                                <input type="date" name="toDate" class="form-control">
                            </div>
                            <div class="col-25">
                                <button type="submit" onclick="myFunction('reservation-table-inperiod')" class="btn">Show</button>
                            </div>
                        </div>
                    </form>  
                </div>

                <div class="show-table" id="reservation-table-inperiod">
                    <table>
                        <h3> Reservation  </h3>
                        <thead>
                            <tr>
                                <th>first</th>
                                <th>Second</th>
                                <th>third</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td>valueFirst</td>
                                <td>valueSecond</td>
                                <td>valueSecond</td>
                            </tr>

                        </tbody>

                    </table>

                </div>


            </div>

            <div class="content col-9" id="customers"> 
                <div class="show-table">
                    <table id="customers-table">
                        <h3> Customers  </h3>
                        <thead>
                            <tr>
                                <th>first</th>
                                <th>Second</th>
                                <th>third</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td>valueFirst</td>
                                <td>valueSecond</td>
                                <td>valueSecond</td>
                            </tr>

                        </tbody>

                    </table>

                </div>

                <div class="inline-form">
                    <form action="#" method="GET">
                        <div class="form-item"> 
                            <h4> Find Customer </h4>
                            <div class="col-60">
                                <input type="text" name="customerID" class="form-control" placeholder="Customer-ID">
                            </div>
                            <div class="col-40">
                                <button type="submit" onclick="myFunction('userInfo')" class="btn">Find</button>
                            </div>
                        </div>
                    </form>  
                </div>

                <div class="user-info">
                    <div class="show-table" id="userInfo">
                        <table>
                            <thead>
                                <tr>
                                    <th>first</th>
                                    <th>Second</th>
                                    <th>third</th>
                                </tr>
                            </thead>
                            <tbody>

                                <tr>
                                    <td>valueFirst</td>
                                    <td>valueSecond</td>
                                    <td>valueSecond</td>
                                </tr>

                            </tbody>

                        </table>

                    </div>
                </div>



            </div>

            <div class="content col-9" id="feedback">

                <h3> Reviews </h3>
                <div class="textBox">
                    <div class="comment">
                        <p>
                            "We stayed at Hotel Arthur on our trip to Helsinki and it was great. Location 
                            was perfect for walking to everything! Staff was helpful and breakfast was great.
                            Room was perfect for my daughter and myself. The only thing was our room faced the
                            main road and the traffic was noisy all night. Would definite stay here again!"
                        </p>
                        <strong> Abdo Morsy </strong>
                    </div>
                </div>

                <div class="textBox">
                    <div class="comment">
                        <p>
                            "The hotel located in the city center and lots of public transport, nearby restaurants, bars etc. The hotel staff are nice and friendly. Breakfast not bad. The room a bit small but the bed is really comfortable."
                        </p>
                        <strong> Suhail </strong>
                    </div>
                </div>

                <div class="textBox">
                    <div class="comment">
                        <p>
                            "Good relaxing break! Friendly, welcoming staff. Very good location for city centre and local transport. Overall an enjoyable stay. The hotel is old and could do with some renovation, but it seems like this issue is being addressed."                        </p>
                        <strong> Sarah </strong>
                    </div>
                </div>

            </div>

            <div class="content col-9" id="services">

                <div class="inline-form">
                    <form action="#" method="GET">
                        <div class="form-item"> 
                            <h4> Add Photo </h4>
                            <div class="col-60">
                                <input type="text" name="photoPath" class="form-control" placeholder="your path..">
                            </div>
                            <div class="col-40">
                                <button type="submit" class="btn">ADD</button>
                            </div>
                        </div>
                    </form>  
                </div>

                <div class="inline-form">
                    <form action="#" method="GET">
                        <div class="form-item"> 
                            <h4> Delete Photo </h4>
                            <div class="col-60">
                                <input type="text" name="photoID" class="form-control" placeholder="photo-ID..">
                            </div>
                            <div class="col-40">
                                <button type="submit" class="btn">Delete</button>
                            </div>
                        </div>
                    </form>  
                </div>

                <div class="form-x">
                    <form action="#" method="GET">
                        <h4> UPDATE / ADD room information </h4>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="roomID" class="form-label"> Room ID </label>
                            </div>
                            <div class="col-60">
                                <input type="text" name="roomID" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="kind" class="form-label"> Kind </label>
                            </div>
                            <div class="col-60">
                                <input type="text" name="kind" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="numOfRooms" class="form-label">Number Of Rooms</label>
                            </div>
                            <div class="col-60">
                                <input type="number" name="numOfRooms" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="price" class="form-label"> Price </label>
                            </div>
                            <div class="col-60">
                                <input type="number" name="" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="nAva" class="form-label"># Available Rooms</label>
                            </div>
                            <div class="col-60">
                                <input type="number" name="noar" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="desc" class="form-label"> Description </label>
                            </div>
                            <div class="col-60">
                                <input type="text" name="" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="noc" class="form-label"> # of Child </label>
                            </div>
                            <div class="col-60">
                                <input type="number" name="numOfChildren" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="noa" class="form-label"># of Adults</label>
                            </div>
                            <div class="col-60">
                                <input type="number" name="numOfAdults" class="form-input">
                            </div>
                        </div>
                        <div class="form-item">
                            <div class="col-25">
                                <button type="submit" onclick="actionFunction('action-update')" class="btn">Update</button>
                            </div>

                            <div class="col-25">
                                <button type="submit" onclick="actionFunction('action-add')" class="btn">ADD</button>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="form-x">
                    <form action="#" method="GET">
                        <h4> update HOTEL information </h4>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="conInfo" class="form-label"> Contact Info </label>
                            </div>
                            <div class="col-60">
                                <input type="text" name="cntactInfo" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="hf" class="form-label"> Hotel Facilities </label>
                            </div>
                            <div class="col-60">
                                <input type="text" name="hotelFacilties" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="loc" class="form-label">Location</label>
                            </div>
                            <div class="col-60">
                                <input type="text" name="location" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-30">
                                <label  for="" class="form-label"> Other Branch </label>
                            </div>
                            <div class="col-60">
                                <input type="text" name="" class="form-input">
                            </div>
                        </div>

                        <div class="form-item">
                            <div class="col-25">
                                <button type="submit" class="btn">Update</button>
                            </div>
                        </div>


                    </form>

                </div>

            </div>


        </div>

        <script>

            function actionFunction(action)
            {
                document.getElementById('columnarForm').action = action;
                document.getElementById('columnarForm').submit();
            }

            function myFunction(divID) {
                var x = document.getElementById(divID);
                if (x.style.display === "block") {
                    x.style.display = "none";
                } else {
                    x.style.display = "block";
                }
            }

            function openPage(pageName, elmnt) {
                var i, tabcontent, tablinks;
                tabcontent = document.getElementsByClassName("content");
                for (i = 0; i < tabcontent.length; i++) {
                    tabcontent[i].style.display = "none";
                }

                document.getElementById(pageName).style.display = "block";

            }
            document.getElementById("defaultOpen").click();
        </script>
    </body>
</html>
