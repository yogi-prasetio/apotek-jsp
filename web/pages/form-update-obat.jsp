    <jsp:include page="../template/header.jsp"></jsp:include>
    <title>Update Data Obat || Apotek Siaga</title>
    <%@page import="function.*, java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <div class="container-fluid  dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row" style="width: 60%;">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">                            
                            <h2 class="pageheader-title">Update Data Obat</h2>
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>                                        
                                        <li class="breadcrumb-item active" aria-current="page">Update Obat</li>
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
                    String kd = request.getParameter("kd_obat");
                    fobat ob = obat.getRecordById(kd);
                %>
                    <div class="row" style="width: 60%;">
                        <!-- ============================================================== -->
                        <!-- validation form -->
                        <!-- ============================================================== -->
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card">                                
                                <div class="card-body">
                                    <form class="needs-validation" id="update" method="POST" action="update-obat.jsp" validate>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Kode Obat</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="kd_obat" value="<%=ob.getKd_obat()%>" readonly required>
                                                </div>
                                            </div>                                            
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom03">Nama Obat</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="nama_obat" value="<%=ob.getNama_obat()%>" required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom04">Jenis Obat</label>                                                
                                                <div class="form-group">
                                                <select name="id_jenis" class="form-control form-control-sm" required>
                                                    <option>-- Pilih Jenis Obat --</option>
                                                    <%
                                                        List <fjenis_obat> list = jenis_obat.getAllRecords();
                                                        request.setAttribute("list", list);
                                                        String id = ob.getId_jenis();  
                                                        for(int x=0; x<list.size(); x++){
                                                    %>
                                                     <option value="<%= list.get(x).getId_jenis() %>" <% if(id.equals(list.get(x).getId_jenis())){ %> selected <% } else {}%>> <%= list.get(x).getJenis() %></option>
                                                    <% } %>
                                                </select>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Keterangan</label>
                                                <div class="form-group">
                                                <textarea class="form-control" name="keterangan" required><%=ob.getKeterangan()%></textarea>                                                
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Dosis</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="dosis" value="<%=ob.getDosis()%>" required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Stok</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="stok" value="<%=ob.getStok()%>" required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Harga</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="harga" value="<%=ob.getHarga()%>" required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-12 pl-0">
                                                <p class="text-right">                                                
                                                <button class="btn btn-primary" type="button" onclick="konfirmasi()">UPDATE</button>
                                                <a href="dataobat.jsp" class="btn btn-secondary" type="reset">CANCEL</a>
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