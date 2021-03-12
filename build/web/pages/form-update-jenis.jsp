    <jsp:include page="../template/header.jsp"></jsp:include>
    <%@page import="function.*, java.util.*"%>
    <title>Form Update Jenis Obat || Apotek Siaga</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
            <div class="container-fluid  dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">                            
                            <h2 class="pageheader-title">Form Update Jenis Obat</h2>
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>                                        
                                        <li class="breadcrumb-item"><a href="" class="breadcrumb-link">Forms</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Input Update Obat</li>
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
                        <% 
                            String id = request.getParameter("id_jenis");
                            fjenis_obat jns = jenis_obat.getRecordById(id);
                        %>
                        <!-- ============================================================== -->
                        <!-- validation form -->
                        <!-- ============================================================== -->
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card">                                
                                <div class="card-body">
                                    <form class="needs-validation" id="update" method="POST" action="update-jenis.jsp" validate>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Id Jenis</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="id_jenis" id="validationCustom01" value="<%=jns.getId_jenis()%>" readonly>
                                                </div>
                                            </div>                                            
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom03">Jenis Obat</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="jenis" id="validationCustom03" value="<%=jns.getJenis()%>" required>
                                                </div>
                                            </div>
                                        </div>                                        
                                        <div class="row">
                                            <div class="col-sm-12 pl-0">
                                                <p class="text-right">                                                
                                                <button class="btn btn-primary update" type="button" onclick="konfirmasi()">UPDATE</button>
                                                <a href="data-jenis-obat.jsp" class="btn btn-secondary" type="reset">CANCEL</a>
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
    <script>
        function konfirmasi(){            
                Swal.fire({
                    title: 'Konfirmasi',
                    text: 'Apakah Anda yakin data akan diubah?',
                    type: 'warning',
                    showCancelButton: true,
                    confirmButtonColor: '#3085d6',
                    cancelButtonColor: '#d33',
                    confirmButtonText: 'Ya, Yakin!',
                    cancelButtonText: 'Tidak'
                }).then((result) => {
                    if (result.value) {                        
                        document.getElementById("update").submit();
                    }
                return false;
                });
            }
    </script>