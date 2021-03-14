<%-- 
    Document   : signup
    Created on : Dec 30, 2020, 1:23:21 AM
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
        <link rel="stylesheet" href="myStyle/formstyle.css">

        <title> Register </title>
    </head>
    <body>
        <div class="myform">
            <form action="processes/signupServlet" method="post">
		<div class="form-header">
			<h2>zayBooking</h2>
			<p>Fill out this form to Sign up!</p>
		</div>
                <div class="form-group">
			<label>Username</label>
                        <input type="text" class="form-control" name="username" required="required">
                </div>

                <div class="form-group">
            		<label>Email Address</label>
                	<input type="email" class="form-control" name="email" required="required">
                </div>
                
                <div class="form-group">
                        <label for="phone">Phone Number</label>
                        <input type="tel" class="form-control" id="phone" name="phone" placeholder="01*********" required>
                </div>
                
		<div class="form-group">
			<label class="form-check-label"><input type="checkbox" required="required"> I accept the <a href="#">Terms of Use</a> &amp; <a href="#">Privacy Policy</a></label>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary btn-block btn-lg">Sign Up</button>
		</div>	
        </form>
	<div class="text-center small">Already have an account? <a href="#">Login here</a></div>
        </div>

    </body>
</html>


