        <link rel="stylesheet" href="public/assets/vendor/bootstrap/css/bootstrap.min.css">
        <link href="public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
        <link rel="stylesheet" href="public/assets/libs/css/style.css">
        <link rel="stylesheet" href="public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
        <link rel="stylesheet" type="text/css" href="public/assets/vendor/datatables/css/dataTables.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="public/assets/vendor/datatables/css/buttons.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="public/assets/vendor/datatables/css/select.bootstrap4.css">
        <link rel="stylesheet" type="text/css" href="public/assets/vendor/datatables/css/fixedHeader.bootstrap4.css">

        <div class="container-fluid  dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">
                            <h2 class="pageheader-title">Data Obat</h2>                            
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Dashboard</a></li>
                                        <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Data Obat</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">All</li>
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ============================================================== -->
                <!-- end pageheader -->
                <!-- ============================================================== -->
        
        <%@page import="function.*,java.util.*"%>        
            <div class="row">
                    <!-- ============================================================== -->
                    <!-- basic table  -->
                    <!-- ============================================================== -->
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="card">
                            <h5 class="card-header">DATA OBAT</h5>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-striped table-bordered first">
                                        <thead>
                                            <tr>
                                                <th>KODE</th>
                                                <th>NAMA OBAT</th>
                                                <th>JENIS</th>
                                                <th>KETERANGAN</th>
                                                <th>STOK</th>
                                                <th>HARGA</th>
                                                <th colspan="2"><center>AKSI</center></th>
                                            </tr>
                                        </thead>
                                        <tbody>                                            
                                            <tr>
                                                <%
                                                    obat ob = new obat();
                                                    List<fobat> data = new ArrayList<fobat>();
                                                    String ket = request.getParameter("ket");
                                                    if (ket == null) {
                                                        data = ob.getAllRecords();
                                                    } 
                                                    for (int x = 0; x < data.size(); x++) {
                                                %>
                                                <tr>
                                                    <td><%=data.get(x).getKode()%></td>
                                                    <td><%=data.get(x).getNama()%></td>
                                                    <td><%=data.get(x).getJenis()%></td>
                                                    <td><%=data.get(x).getKeterangan()%></td>
                                                    <td><%=data.get(x).getStok()%></td>
                                                    <td><%=data.get(x).getHarga()%></td>
                                                    <td><a href="#">
                                                       <button class="btn btn-primary">Edit</button></a></td>
                                                    <td><a href="#">
                                                       <button class="btn btn-danger">Hapus</button></a></td>                                                    
                                            </tr><%}%>
                                            </c:forEach>                                            
                                        </tbody>
                                        <a href="index.jsp?dir=pages&file=inputobat.jsp">
                                            <button class='btn-primary'>Tambah Obat</button></a>
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
                    $('.first').DataTable()({
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
    <script src="public/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="public/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <script src="public/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <script src="public/assets/vendor/multi-select/js/jquery.multi-select.js"></script>
    <script src="public/assets/libs/js/main-js.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="public/assets/vendor/datatables/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js"></script>
    <script src="public/assets/vendor/datatables/js/buttons.bootstrap4.min.js"></script>
    <script src="public/assets/vendor/datatables/js/data-table.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.colVis.min.js"></script>
    <script src="https://cdn.datatables.net/rowgroup/1.0.4/js/dataTables.rowGroup.min.js"></script>
    <script src="https://cdn.datatables.net/select/1.2.7/js/dataTables.select.min.js"></script>
    <script src="https://cdn.datatables.net/fixedheader/3.1.5/js/dataTables.fixedHeader.min.js"></script>
