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
<jsp:include page="../template/header.jsp"></jsp:include>
    <title>Form Input User|| Apotek Siaga</title>
    
            <div class="container-fluid dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">                            
                            <h2 class="pageheader-title">Form Input User</h2>
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>                                        
                                        <li class="breadcrumb-item"><a href="" class="breadcrumb-link">Forms</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Input User</li>
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- end pageheader -->
                <!-- ============================================================== -->
             
                    <div class="row" style="width: 60%;">
                        <!-- ============================================================== -->
                        <!-- validation form -->
                        <!-- ============================================================== -->
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card">                                
                                <div class="card-body">
                                    <form class="needs-validation" name="add-user" method="POST" action="add-user.jsp" validate>
                                        <input class="form-control" name="IDuser" type="hidden" value="<% out.print(id_user); %>" readonly required>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom03">Nama User</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="namauser" id="validationCustom03" placeholder="Nama Lengkap" required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">                                                
                                                <label for="validationCustom03">No Handphone</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="no_hp" id="validationCustom03" placeholder="No Handphone" required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Username</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="username" id="validationCustom01" placeholder="Username" required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Password</label>
                                                <div class="form-group">
                                                <input type="password" class="form-control" name="password" id="validationCustom01" placeholder="Password" required>
                                                </div>
                                            </div>
                                        </div>                                        
                                        <div class="row">
                                            <div class="col-sm-12 pl-0">
                                                <p class="text-right">                                                
                                                    <button class="btn btn-primary" type="submit">SAVE</button>
                                                    <button class="btn btn-secondary" type="reset">CANCEL</button>
                                                </p>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- ============================================================== -->
                        <!-- end validation form -->
                        <!-- ============================================================== -->
                    </div>
            </div>
        <jsp:include page="../template/footer.jsp"></jsp:include>