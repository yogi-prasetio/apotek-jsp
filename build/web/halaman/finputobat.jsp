<!doctype html>
<html lang="en">

 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Form Input Obat</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../public/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../public/assets/libs/css/style.css">
    <link rel="stylesheet" href="../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
</head>

<body>
            <div class="container-fluid  dashboard-content">
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
                                        <li class="breadcrumb-item"><a href="#" class="breadcrumb-link">Dashboard</a></li>                                        
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
             
                    <div class="row">
                        <!-- ============================================================== -->
                        <!-- validation form -->
                        <!-- ============================================================== -->
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="card">
                                <h5 class="card-header">Form Input Obat</h5>
                                <div class="card-body">
                                    <form class="needs-validation" name="inputobat" methode="POST" action="pages/inputobat.jsp" validate>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Kode Obat</label>
                                                <input type="text" class="form-control" name="kd_obat" id="validationCustom01" placeholder="Kode" required>
                                                <div class="valid-feedback">
                                                    Looks good!
                                                </div>
                                            </div>                                            
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom03">Nama Obat</label>
                                                <input type="text" class="form-control" name="nama_obat" id="validationCustom03" placeholder="Nama Obat" required>
                                                <div class="valid-feedback">
                                                    Looks good!
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom04">Jenis Obat</label>
                                                <div class="form-group">
                                                <select name="jenis" class="form-control" form-control-sm required>
                                                    <option value="">--Pilih Jenis--</option>
                                                    <option value="Capsul">Capsul</option>
                                                    <option value="Tablet">Tablet</option>
                                                    <option value="Sirup">Sirup</option>
                                                    <option value="Salep">Salep</option>
                                                </select>
                                                </div>
                                                <div class="invalid-feedback">
                                                    Please provide a valid state.
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Keterangan</label>
                                                <textarea class="form-control" name="keterangan" id="validationCustom01" placeholder="Keterangan" required></textarea>
                                                <div class="valid-feedback">
                                                    Looks good!
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Stok</label>
                                                <input type="number" class="form-control" name="stok" id="validationCustom01" placeholder="Stok" required>
                                                <div class="valid-feedback">
                                                    Looks good!
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <label for="validationCustom01">Harga</label>
                                                <input type="number" class="form-control" name="harga" id="validationCustom01" placeholder="Harga" required>
                                                <div class="valid-feedback">
                                                    Looks good!
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                                                <button class="btn btn-primary" type="submit">SIMPAN</button>
                                                <button class="btn btn-secondary" type="reset">BATAL</button>
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
    
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <script src="../public/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="../public/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <script src="../public/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <script src="../public/assets/vendor/parsley/parsley.js"></script>
    <script src="../public/assets/libs/js/main-js.js"></script>
    <script>
    $('#form').parsley();
    </script>
    <script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (function() {
        'use strict';
        window.addEventListener('load', function() {
            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function(form) {
                form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
    </script>
</body>
 
</html>