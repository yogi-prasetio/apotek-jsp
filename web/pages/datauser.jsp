    <jsp:include page="../template/header.jsp"></jsp:include>
    <title>Data User || Apotek Siaga</title>
        <link rel="stylesheet" href="../public/assets/vendor/bootstrap/css/bootstrap.min.css">
        <link href="../public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
        <link rel="stylesheet" href="../public/assets/libs/css/style.css">
        <link rel="stylesheet" href="../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
        <link rel="stylesheet" type="text/css" href="../public/assets/vendor/datatables/css/dataTables.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="../public/assets/vendor/datatables/css/buttons.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="../public/assets/vendor/datatables/css/select.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="../public/assets/vendor/datatables/css/fixedHeader.bootstrap4.css">                
        <%@page import="function.*,java.util.*"%>        
        
        <div class="container-fluid  dashboard-content">
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>            
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">
                            <h2 class="pageheader-title">Data Users</h2>                            
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>
                                        <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Data </a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Data Users</li>
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- end pageheader -->
                <!-- ============================================================== -->
                
            <div class="row">
                    <!-- ============================================================== -->
                    <!-- basic table  -->
                    <!-- ============================================================== -->
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="card">                           
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered first" id="datatable">
                                        <thead>
                                            <tr>
                                                <th>NO</th>
                                                <th>NAMA USER</th>
                                                <th>NO HANDPHONE</th>
                                                <th>USERNAME</th>
                                                <th><center>AKSI</center></th>
                                            </tr>
                                        </thead>
                                        <tbody>                                            
                                                <%                                                    
                                                    List<fuser> data = user.getAllRecords();
                                                    request.setAttribute("data", data); int x=1;
                                                %>
                                                <c:forEach items="${data}" var="u">
                                                <tr>
                                                    <td><% out.print(x++); %></td>
                                                    <td>${u.getnamauser()}</td>
                                                    <td>${u.getNo_hp()}</td>
                                                    <td>${u.getusername()}</td>
                                                    <td><center>                                                        
                                                        <a href="form-update-user.jsp?IDuser=${u.getIDuser()}">
                                                        <button class="btn btn-dark"><span class="fa fa-edit"></span> 
                                                            Update</button></a></center></td>
                                            </tr></c:forEach>
                                        </tbody>
                                        <div style="margin-bottom: 20px;">
                                             <a href="form-add-user.jsp"><button class="btn btn-primary">
                                                    <span class="fa fa-plus"></span> Add User</button></a>
                                        </div>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ============================================================== -->
                    <!-- end basic table  -->
                    <!-- ============================================================== -->                    
                </div>
            <script type="text/javascript">                
                $(document).ready(function() {
                    $('#datatable').DataTable()({
                            "scrollX": false,
                            "Processing": true,
                            "ServerSide": true,
                            "paging":false,
                            "order":[2,'asc']
                    });
                }
            </script>
            </div>
        <!-- Optional JavaScript -->
    <jsp:include page="../template/footer.jsp"></jsp:include>
    <script src="../public/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="../public/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <script src="../public/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <script src="../public/assets/vendor/multi-select/js/jquery.multi-select.js"></script>
    <script src="../public/assets/libs/js/main-js.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="../public/assets/vendor/datatables/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js"></script>
    <script src="../public/assets/vendor/datatables/js/buttons.bootstrap4.min.js"></script>
    <script src="../public/assets/vendor/datatables/js/data-table.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.colVis.min.js"></script>
    <script src="https://cdn.datatables.net/rowgroup/1.0.4/js/dataTables.rowGroup.min.js"></script>
    <script src="https://cdn.datatables.net/select/1.2.7/js/dataTables.select.min.js"></script>
    <script src="https://cdn.datatables.net/fixedheader/3.1.5/js/dataTables.fixedHeader.min.js"></script>
