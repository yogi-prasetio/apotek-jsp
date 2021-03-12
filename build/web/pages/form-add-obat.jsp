    <jsp:include page="../template/header.jsp"></jsp:include>
    <%@page import="function.*, java.util.*"%>
    <title>Form Input Obat || Apotek Siaga</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../public/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../public/assets/libs/css/style.css">
    <link rel="stylesheet" href="../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
            <div class="container-fluid dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">                            
                            <h2 class="pageheader-title">Form Input Obat</h2>
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>                                        
                                        <li class="breadcrumb-item"><a href="" class="breadcrumb-link">Forms</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Input Obat</li>
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
                                    <form class="needs-validation" name="inputobat" method="POST" action="add-obat.jsp" validate>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Kode Obat</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="kd_obat" id="validationCustom01" placeholder="Kode" required>
                                                </div>
                                            </div>                                            
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom03">Nama Obat</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="nama_obat" id="validationCustom03" placeholder="Nama Obat" required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom04">Jenis Obat</label>
                                                <div class="form-group">
                                                <select name="id_jenis" class="form-control form-control-sm" required>
                                                    <option value="">--- Pilih Jenis Obat ---</option>
                                                    <%
                                                        List <fjenis_obat> list = jenis_obat.getAllRecords();
                                                        request.setAttribute("list", list);
                                                    %>
                                                    <c:forEach items="${list}" var="u">
                                                    <option value="${u.getId_jenis()}">${u.getJenis()}</option>
                                                    </c:forEach>
                                                </select>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Keterangan</label>
                                                <div class="form-group">
                                                <textarea class="form-control" name="keterangan" id="validationCustom01" placeholder="Keterangan" required></textarea>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Dosis</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="dosis" id="validationCustom01" placeholder="Dosis" required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Stok</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="stok" id="validationCustom01" placeholder="Stok" required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Harga</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="harga" id="validationCustom01" placeholder="Harga" required>
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
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <script src="../public/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="../public/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <script src="../public/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <script src="../public/assets/vendor/parsley/parsley.js"></script>
    <script src="../public/assets/libs/js/main-js.js"></script>
    