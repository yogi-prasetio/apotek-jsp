<%@page import="java.sql.*"%>
<%@page import="function.*"%>
<%    
    Connection con=koneksi.getKoneksi();
    String id_user="";

    ResultSet rs=con.createStatement().executeQuery("SELECT MAX(right(id_user,4)) AS id FROM user");    
    while(rs.next()){
        if(rs.first()==false){
            id_user="USER-0001";
        } else {
            rs.last();
            int auto_id = rs.getInt(1)+1;
            String no = String.valueOf(auto_id);
            int noLong = no.length();
            for (int x=0; x<=3-noLong; x++){
                no ="0"+no;
            }
            id_user=("USER-"+no);
        }
    }
    rs.close();
%>
        
<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Sign Up || Apotek Siaga</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="public/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="public/assets/libs/css/style.css">
    <link rel="stylesheet" href="public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.33.1/sweetalert2.min.css">
    
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
<!-- ============================================================== -->
<!-- signup form  -->
<!-- ============================================================== -->

<body>
    <!-- ============================================================== -->
    <!-- signup form  -->
    <!-- ============================================================== -->
    <form class="splash-container" method="POST" name="signup" action="process-signup.jsp">
        <div class="card">
            <div class="card-header">
                <h3 class="mb-1">Registrations Form</h3>
            </div>
                <div class="card-body">             
                    <% String error = request.getParameter("data");
                    String error2 = request.getParameter("msg");
                        if (error==null && error2==null){} else{
                    %>   
                    <div class="form-group" >
                        <font color="red"><center> <%=error%> </center></font>
                    </div>                    
                    <% } %>
                    <input class="form-control" name="IDuser" type="hidden" value="<% out.print(id_user); %>" readonly required>
                    <div class="form-group">
                        <label for="namuser">Nama Lengkap</label>
                        <input class="form-control" id="namauser" name="namauser" type="text" placeholder="Nama Lengkap" required> 
                    </div>
                    <div class="form-group">
                        <label for="namuser">No Handphone</label>
                        <input class="form-control" id="no_hp" name="no_hp" type="text" placeholder="No Handphone" required> 
                    </div>
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input class="form-control" id="username" name="username" type="text" placeholder="Username" required> 
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input class="form-control" id="password" name="password" type="password" placeholder="Password" required>
                    </div>                    
                    <input type="submit" class="btn btn-primary btn-lg btn-block" id="daftar" value="DAFTAR">
                </div>
            <div class="card-footer bg-white">
                <p align="center">Sudah punya akun? <a href="login.jsp" class="text-secondary">Login Disini.</a></p>
            </div>
        </div>
    </form>
</body>    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.33.1/sweetalert2.min.js"></script>
