    <jsp:include page="../template/header.jsp"></jsp:include>
    <title>Update Data User|| Apotek Siaga</title>
    <!-- Bootstrap CSS -->
    <%@page import="function.*" %>
    
            <div class="container-fluid  dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">                            
                            <h2 class="pageheader-title">Update Data User</h2>
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>                                        
                                        <li class="breadcrumb-item active" aria-current="page">Update User</li>
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- end pageheader -->
                <!-- ============================================================== -->
             
                <% 
                    String id = request.getParameter("IDuser");
                    fuser us = user.getRecordById(id);
                %>
                    <div class="row" style="width: 60%;">
                        <!-- ============================================================== -->
                        <!-- validation form -->
                        <!-- ============================================================== -->
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card">                                
                                <div class="card-body">
                                    <form class="needs-validation" id="update" method="POST" action="update-user.jsp" validate>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <div class="form-group">
                                                    <input type="hidden" class="form-control" name="IDuser" value="<%=us.getIDuser()%>" readonly required>
                                                </div>
                                            </div>                                            
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom03">Nama User</label>
                                                <div class="form-group">
                                                    <input type="text" class="form-control" name="namauser" value="<%=us.getnamauser()%>" required>
                                                </div>
                                            </div>
                                        </div>                                                                                
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">                                                
                                                <label for="validationCustom03">No Handphone</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="no_hp" value="<%=us.getNo_hp()%>" required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Username</label>
                                                <div class="form-group">
                                                    <input type="text" class="form-control" name="username" value="<%=us.getusername()%>" required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Password</label>
                                                <div class="form-group">
                                                    <input type="password" class="form-control" name="password" value="<%=us.getpassword()%>" required>                                                
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-12 pl-0">
                                                <p class="text-right">                                                
                                                <button class="btn btn-primary update" type="button" onclick="konfirmasi()">UPDATE</button>
                                                <a href="datauser.jsp" class="btn btn-secondary" type="reset">CANCEL</a>
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