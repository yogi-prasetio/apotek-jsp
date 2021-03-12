<%@page import="function.*, java.sql.*, java.util.*"%>    
    <title>Form Penjualan || Apotek Siaga</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../public/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../public/assets/libs/css/style.css">
    <link rel="stylesheet" href="../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <jsp:include page="../template/header.jsp"></jsp:include>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.33.1/sweetalert2.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.33.1/sweetalert2.min.js"></script>

<%    
    Connection con=koneksi.getKoneksi();
    String nota="";
    ResultSet rs=con.createStatement().executeQuery("SELECT MAX(right(nota,5)) AS nota FROM penjualan");    
    while(rs.next()){
        if(rs.first()==false){
            nota="TRS-00001";
        } else {
            rs.last();
            int auto_id = rs.getInt(1)+1;
            String no = String.valueOf(auto_id);
            int noLong = no.length();
            for (int x=0; x<=4-noLong; x++){
                no ="0"+no;
            }
            nota=("TRS-"+no);
        }
    }
    rs.close();
    
    if(request.getParameter("qty")!=null) {
        String kd = request.getParameter("kd_obat");
        String query = "SELECT kd_obat,harga FROM obat WHERE harga = '"+kd+"'";
        Statement stm = con.createStatement();
        ResultSet r = stm.executeQuery(query);
         int status=0;
        if(r.next()){
            String id_p = r.getString("kd_obat");            
            int jumlah = Integer.valueOf(request.getParameter("qty"));
            int total = Integer.valueOf(request.getParameter("total"));
            String waktu = request.getParameter("waktu");
            PreparedStatement pst = con.prepareStatement("INSERT INTO penjualan VALUES (?,?,?,?,?)");
            pst.setString(1, nota);
            pst.setString(2, id_p);
            pst.setInt(3, jumlah);
            pst.setInt(4, total);
            pst.setString(5, waktu);
            status=pst.executeUpdate();
            if(status>0) { 
                out.print("<script>Swal.fire({type: 'success',title: 'Berhasil!',text: 'Data berhasil ditambahkan.',"
                        + "confirmButtonText: 'OK'}).then(function() {window.location = 'datapenjualan.jsp';}); </script>");
            } else{
                out.print("<script>alert('Data gagal Ditambahkan!'); history.go(-1);</script>");
            }
        }        
        }              
%>

<%  
    Statement stm;
    ResultSet res;
    String query = "SELECT * FROM obat";
    stm = con.createStatement();
    res = stm.executeQuery(query);
%>
    
            <div class="container-fluid  dashboard-content">
                <!-- ============================================================== -->
                <!-- pageheader -->
                <!-- ============================================================== -->
                <div class="row">
                    <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div class="page-header">
                            <h2 class="pageheader-title">Form Penjualan </h2>                            
                            <div class="page-breadcrumb">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb">
                                        <li class="breadcrumb-item"><a href="../index.jsp" class="breadcrumb-link">Dashboard</a></li>                                        
                                        <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Forms</a></li>
                                        <li class="breadcrumb-item active" aria-current="page">Form Penjualan</li>
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
                                    <form class="needs-validation" name="transaksi" method="POST" validate>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Nota Penjualan</label>
                                                <div class="form-group">
                                                <input type="text" class="form-control" name="nota" id="validationCustom01" value="<% out.print(nota);%>" readonly required>
                                                </div>
                                            </div>                                            
                                        </div>              
                                        <div class="form-row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom04">Nama Obat</label>
                                                <div class="form-group">
                                                <select id="kode" class="custom-select" name="kd_obat" onchange="proses()" required>
                                                    <option>--- Pilih Obat ---</option>
                                                    <% while(res.next()) { %>
                                                        <option value="<%=res.getInt("harga")%>"><%=res.getString("nama_obat")%></option>
                                                    <% } %>
                                                </select>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-row">        
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom05">Harga</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="harga" id="harga" readonly>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="form-row">        
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom05">Jumlah</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="qty" id="qty" placeholder="Qty" onkeyup="hitung()" required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="form-row">        
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom05">Jumlah</label>
                                                <div class="form-group">
                                                <input type="number" class="form-control" name="total" id="total" placeholder="Total Harga" readonly required>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="form-row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Waktu </label>
                                                <div class="form-group">
                                                    <input type="text" class="form-control" name="waktu" id="waktu" readonly required>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-12 pl-0">
                                                <p class="text-right">                                                
                                                    <input class="btn btn-primary" name="submit" type="submit" value="SAVE">
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
<script>
    function proses(){
        var a = document.getElementById("kode").value;
                document.getElementById("harga").value=a;
        date = new Date();
        var detik = String(date.getSeconds()+ 1).padStart(2,'0');
        var menit = String(date.getMinutes()+ 1).padStart(2,'0');
        var jam = String(date.getHours());
        var tanggal = String(date.getDate());
        var bulan = String(date.getMonth()+ 1).padStart(2,'0');
        var tahun = String(date.getFullYear());
                
        today = tahun+"-"+bulan+"-"+tanggal+" "+jam+":"+menit+":"+detik;
                document.getElementById("waktu").value=today;
    }
    function hitung(){
        var b = document.getElementById("harga").value;
        var a = document.getElementById("qty").value;
                document.getElementById("total").value=a*b;
    }
</script>        
