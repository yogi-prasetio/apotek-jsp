<%@page import="java.io.File"%>
<%@page language="java"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
 
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../public/assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="../public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../public/assets/libs/css/style.css">
    <link rel="stylesheet" href="../public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    <link rel="stylesheet" href="../public/assets/vendor/charts/chartist-bundle/chartist.css">
    <link rel="stylesheet" href="../public/assets/vendor/charts/morris-bundle/morris.css">
    <link rel="stylesheet" href="../public/assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../public/assets/vendor/charts/c3charts/c3.css">
    <link rel="stylesheet" href="../public/assets/vendor/fonts/flag-icon-css/flag-icon.min.css">        
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.33.1/sweetalert2.min.css">    
    <script src="../public/assets/libs/js/konfirmasi.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.33.1/sweetalert2.min.js"></script>
</head>

<body>
    <!-- ============================================================== -->
    <!-- main wrapper -->
    <!-- ============================================================== -->
    <div class="dashboard-main-wrapper">
        <!-- ============================================================== -->
        <!-- navbar -->
        <!-- ============================================================== -->
        <div class="dashboard-header">
            <nav class="navbar navbar-expand-lg bg-white fixed-top">
                <a class="navbar-brand" href="../dashboard.jsp">Apotek Siaga</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse " id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto navbar-right-top">
                        <li class="nav-item dropdown nav-user">
                            <a class="nav-link nav-user-img" href="#" id="navbarDropdownMenuLink2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="../public/assets/images/user.png" alt="" class="user-avatar-md rounded-circle"></a>
                            <div class="dropdown-menu dropdown-menu-right nav-user-dropdown" aria-labelledby="navbarDropdownMenuLink2">
                                <div class="nav-user-info">
                                    <h5 class="mb-0 text-white nav-user-name"><%=session.getAttribute("namauser")%></h5>
                                    <span class="status"></span><span class="ml-2"><%=session.getAttribute("waktu")%></span>
                                </div>                                
                                <a class="dropdown-item" data-toggle="modal" data-target="#exampleModal"><i class="fas fa-power-off mr-2"></i>Logout</a>               
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
                                
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                  <div class="modal-dialog">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Konfirmasi</h5>                        
                      </div>
                      <div class="modal-body">
                        Apakah Anda yakin akan keluar?
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Batal</button>
                        <a href="../login.jsp"><button type="button" class="btn btn-primary">Keluar</button></a>
                      </div>
                    </div>
                  </div>
                </div>
        <!-- ============================================================== -->
        <!-- end navbar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- left sidebar -->
        <!-- ============================================================== -->
        <div class="nav-left-sidebar sidebar-dark">
            <div class="menu-list">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <a class="d-xl-none d-lg-none" href="../dashboard.jsp">Dashboard</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav flex-column">
                            <li class="nav-divider">
                                Menu
                            </li>
                            <li class="nav-item ">
                                <a class="nav-link active" href="../dashboard.jsp" aria-expanded="false" data-target="#submenu-1" aria-controls="submenu-1"><i class="fa fa-fw fa-user-circle"></i>Dashboard</a> 
                            </li>                            
                            <li class="nav-item">
                                <a class="nav-link" href="" data-toggle="collapse" aria-expanded="false" data-target="#submenu-3" aria-controls="submenu-3"><i class="fas fa-fw fa-table"></i>Data</a>
                                <div id="submenu-3" class="collapse submenu" style="">
                                    <ul class="nav flex-column">
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/dataobat.jsp">Data Obat</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/data-jenis-obat.jsp">Data Jenis Obat</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/datapenjualan.jsp">Data Penjualan</a>
                                        </li>                                        
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/datauser.jsp">Data User</a>
                                        </li>                                        
                                    </ul>
                                </div>
                            </li>
                            <li class="nav-item ">
                                <a class="nav-link" href="" data-toggle="collapse" data-target="#submenu-4" aria-controls="submenu-4" aria-expanded="false"><i class="fab fa-fw fa-wpforms"></i>Forms </a>
                                <div id="submenu-4" class="collapse submenu" style="">
                                    <ul class="nav flex-column">
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/form-jenis-obat.jsp">Form Jenis Obat</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/form-add-obat.jsp">Form Obat</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/form-penjualan.jsp">Form Penjualan</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="../pages/form-add-user.jsp">Form User</a>
                                        </li>
                                    </ul>
                                </div>
                            </li>            
                            <li class="nav-item ">
                                <a class="nav-link" href="http://localhost:8080/Apotek_Siaga/laporan" aria-expanded="false" id="laporan"><i class="fa fa-fw fa-file"></i>Laporan Penjualan</a> 
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
        <!-- ============================================================== -->
        <!-- end left sidebar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- wrapper  -->
        <!-- ============================================================== -->
        <div class="dashboard-wrapper">
    