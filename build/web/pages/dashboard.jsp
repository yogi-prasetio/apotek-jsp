        <%@page import="function.*,java.util.*, java.sql.*"%>        
        <%
            Connection con = koneksi.getKoneksi();            
            int obat=0, penjualan=0, user=0;
            ResultSet r=con.createStatement().executeQuery("SELECT COUNT(kd_obat) as jumlahobat FROM obat");
            while(r.next()){
                obat=r.getInt(1);
            }
            ResultSet rs=con.createStatement().executeQuery("SELECT COUNT(nota) as jumlahtransaksi FROM penjualan");
            while(rs.next()){
                penjualan=rs.getInt(1);
            }
            ResultSet res=con.createStatement().executeQuery("SELECT COUNT(id_user) as jumlahuser FROM user");
            while(res.next()){
                user=res.getInt(1);
            }
        %>
                <div class="container-fluid dashboard-content ">
                    <!-- ============================================================== -->
                    <!-- pageheader  -->
                    <!-- ============================================================== -->
                    <div class="row">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                            <div class="page-header">
                                <h2 class="pageheader-title">Dashboard</h2>
                                <div class="page-breadcrumb">
                                    <nav aria-label="breadcrumb">
                                        <ol class="breadcrumb">
                                            <li class="breadcrumb-item"><a href="" class="breadcrumb-link">Dashboard</a></li>
                                            <li class="breadcrumb-item active" aria-current="page">Apotek Siaga</li>
                                        </ol>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="row">
                            <!-- ============================================================== -->
                            <!-- sales  -->
                            <!-- ============================================================== -->
                            <div class="col-lg-4 col-sm-6 col-xs-12">
                                <div class="card border-3 border-top border-top-primary">
                                    <div class="card-body">
                                        <h5 class="text-muted">Obat</h5>
                                        <div class="metric-value d-inline-block">
                                            <h1 class="mb-1"><% out.print(obat); %></h1>
                                        </div>
                                    </div>
                                </div>
                            </div>
                                        
                            <div class="col-lg-4 col-sm-6 col-xs-12">
                                <div class="card border-3 border-top border-top-primary">
                                    <div class="card-body">
                                        <h5 class="text-muted">Penjualan</h5>
                                        <div class="metric-value d-inline-block">
                                                <h1 class="mb-1 text-right"><% out.print(penjualan); %></h1>
                                        </div>                                        
                                    </div>
                                </div>
                            </div>
                            
                            <div class="col-lg-4 col-sm-6 col-xs-12">
                                <div class="card border-3 border-top border-top-primary">
                                    <div class="card-body">
                                        <h5 class="text-muted">User</h5>
                                        <div class="metric-value d-inline-block">
                                                <h1 class="mb-1" text-right><% out.print(user); %></h1>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                </div>