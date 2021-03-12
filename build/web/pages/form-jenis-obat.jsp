<jsp:include page="../template/header.jsp"></jsp:include>
<%@page import="function.*, java.util.*, java.sql.*"%>
    <title>Form Input Jenis Obat || Apotek Siaga</title>
<%    
    Connection con=koneksi.getKoneksi();
    String id="";
    ResultSet rs=con.createStatement().executeQuery("SELECT MAX(right(id_jenis,3)) AS id FROM jenis_obat");    
    while(rs.next()){
        if(rs.first()==false){
            id="001";
        } else {
            rs.last();
            int auto_id = rs.getInt(1)+1;
            String no = String.valueOf(auto_id);
            int noLong = no.length();
            for (int x=0; x<=2-noLong; x++){
                no ="0"+no;
            }
            id=(no);
        }
    }
    rs.close();
%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
            <div class="container-fluid  dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">                            
                            <h2 class="pageheader-title">Form Input Jenis Obat</h2>
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>                                        
                                        <li class="breadcrumb-item"><a href="" class="breadcrumb-link">Forms</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Input Jenis Obat</li>
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- end pageheader -->
                <!-- ============================================================== -->
             
                    <div class="row" style="width: 60%">
                        <!-- ============================================================== -->
                        <!-- validation form -->
                        <!-- ============================================================== -->
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card">                                
                                <div class="card-body">
                                    <form class="needs-validation" name="inputobat" method="POST" action="add-jenis.jsp" validate>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Id Jenis</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="id_jenis" id="validationCustom01" value="<% out.print(id);%>" readonly>
                                                </div>
                                            </div>                                            
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom03">Jenis Obat</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="jenis" id="validationCustom03" placeholder="Jenis Obat" required>
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
    </div>
    <jsp:include page="../template/footer.jsp"></jsp:include>