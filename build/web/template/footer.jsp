            <div class="footer">
                <div class="container-fluid text-center">
                    Copyright © 2020. Apotek Siaga by <a href="https://yogiprasetio5.blogspot.com/">Yogi Prasetio</a>.
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- end footer -->
            <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- end wrapper  -->
        <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- end main wrapper  -->
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <!-- jquery 3.3.1 -->
    <script src="public/assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <!-- bootstap bundle js -->
    <script src="public/assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
    <!-- slimscroll js -->
    <script src="public/assets/vendor/slimscroll/jquery.slimscroll.js"></script>
    <!-- main js -->
    <script src="public/assets/libs/js/main-js.js"></script>
    <!-- sparkline js -->
    <script src="public/assets/vendor/charts/sparkline/jquery.sparkline.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/7.33.1/sweetalert2.min.js"></script>
</body>
 <%
    String nama=String.valueOf(session.getAttribute("namauser"));
    if(nama.equals("null")) { %>
        <script>
            Swal.fire({
                type: 'error',
                title: 'Oops...',
                text: 'Anda belum login!',                
                confirmButtonText: "OK"
            }).then(function() {
                window.location = "../login.jsp";
            });            
        </script>        
   <% } %>
<script>
    $(document).ready(function(){        
        $("#laporan").on("click",function(){
            Swal({            
                title: 'Loading',
                allowEscapeKey: false,
                allowOutsideClick: false,
                timer: 3000,
                onOpen: () => {
                    Swal.showLoading();
                }
            });
        });
    });
</script>
</html>