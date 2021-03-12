<!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Log In || Apotek Siaga</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="public/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="public/assets/libs/css/style.css">
    <link rel="stylesheet" href="public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.css" rel="stylesheet" />
    <style>
    html,
    body {
        height: 100%;        
    } body { 
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align: center;
        align-items: center;
        padding-top: 40px;
        padding-bottom: 40px;
    }
    </style>
</head>

<body>
    <% session.invalidate() ; %>
    <!-- ============================================================== -->
    <!-- login page  -->
    <!-- ============================================================== -->
    <div class="splash-container">        
        <div class="card ">
            <div class="card-header text-center">
                <h2 class="mb-1">LOGIN</h3>
            </div>
            <div class="card-body">
                <form name="login" method="POST" action="process-login.jsp">
                    <% String error = request.getParameter("data");
                        if (error==null){} else{
                    %>
                    <div class="form-group" >
                        <font color="red"><center> <%=error%> </center></font>
                    </div>                    
                    <% } %>
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input class="form-control form-control-lg" id="username" name="username" type="text" placeholder="Username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input class="form-control form-control-lg" id="password" name="password" type="password" placeholder="Password" required>
                    </div><br/>
                    <button type="submit" class="btn btn-primary btn-lg btn-block">LOGIN</button><br>                    
                </form>
                    <a href="sign-up.jsp" class="footer-link">
                    <button class="btn btn-secondary btn-lg btn-block">REGISTER</button></a>
            </div>
            <div class="card-footer bg-white p-0 text-center ">
                <div class="card-footer-item card-footer-item-bordered">
                    Copyright © 2020. Apotek Siaga
                </div>
            </div>
        </div>
    </div>
  
    <!-- ============================================================== -->
    <!-- end login page  -->
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <script src="public/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="public/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    
</body>
 
</html>