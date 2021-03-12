<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="public/assets/vendor/bootstrap/css/bootstrap.min.css">
        <link href="public/assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
        <link rel="stylesheet" href="public/assets/libs/css/style.css">
        <link rel="stylesheet" href="public/assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
        <link rel="stylesheet" href="public/assets/vendor/charts/chartist-bundle/chartist.css">
        <link rel="stylesheet" href="public/assets/vendor/charts/morris-bundle/morris.css">
        <link rel="stylesheet" href="public/assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="public/assets/vendor/charts/c3charts/c3.css">
        <link rel="stylesheet" href="public/assets/vendor/fonts/flag-icon-css/flag-icon.min.css">
        <link rel="stylesheet" href="public/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="public/vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- inject:css -->
        <link rel="stylesheet" href="public/css/style.css">

        <title>Apotek Siaga</title>
        <style>
            * {box-sizing: border-box;}
            body {font-family: Verdana, sans-serif;}
            .mySlides {display: none;}
            img {vertical-align: middle;}

            /* Slideshow container */
            .slideshow-container {
                max-width: 1000px;
                position: relative;
                margin: auto;
            }

            /* Caption text */
            .text {
                color: #f2f2f2;
                font-size: 15px;
                padding: 8px 12px;
                position: absolute;
                bottom: 8px;
                width: 100%;
                text-align: center;
            }

            /* Number text (1/3 etc) */
            .numbertext {
                color: #f2f2f2;
                font-size: 12px;
                padding: 8px 12px;
                position: absolute;
                top: 0;
            }

            /* The dots/bullets/indicators */
            .dot {
                height: 15px;
                width: 15px;
                margin: 0 2px;
                background-color: #bbb;
                border-radius: 50%;
                display: inline-block;
                transition: background-color 0.6s ease;
            }

            .active {
                background-color: #717171;
            }

            /* Fading animation */
            .fade {
                -webkit-animation-name: fade;
                -webkit-animation-duration: 1.5s;
                animation-name: fade;
                animation-duration: 1.5s;
            }

            @-webkit-keyframes fade {
                from {opacity: .4}
                to {opacity: 1}
            }

            @keyframes fade {
                from {opacity: .4}
                to {opacity: 1}
            }

            /* On smaller screens, decrease text size */
            @media only screen and (max-width: 300px) {
                .text {font-size: 11px}
            }
        </style>
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
                    <a class="navbar-brand" href="index.jsp">Apotek Siaga</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse " id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto navbar-right-top">
                            <li class="nav-item">
                                <a class="nav-link nav-user-img" href="login.jsp" >
                                    <button class="btn btn-primary" style="border-radius: 20px; width: 100px">
                                        LOGIN</button></a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>

            <!-- partial -->
            <div class="container-fluid page-body-wrapper">
                <!-- partial:partials/_sidebar.html -->

                <div class="main-panel">
                    <p></p>
                    <div class="slideshow-container" >

                        <div class="mySlides fade">
                            <div class="numbertext">1 / 4</div>
                            <img src="public/assets/images/apotek1.jpg" style="width:100%; height: 500px">
                        </div>

                        <div class="mySlides fade">
                            <div class="numbertext">2 / 4</div>
                            <img src="public/assets/images/apotek2.jpg" style="width:100%; height: 500px">
                        </div>

                        <div class="mySlides fade">
                            <div class="numbertext">3 / 4</div>
                            <img src="public/assets/images/apotek3.jpg" style="width:100%; height: 500px">
                        </div>

                        <div class="mySlides fade">
                            <div class="numbertext">4 / 4</div>
                            <img src="public/assets/images/apotek4.jpg" style="width:100%; height: 500px">
                        </div>

                    </div>
                    <br>

                    <div style="text-align:center">
                        <span class="dot"></span>
                        <span class="dot"></span>
                        <span class="dot"></span>
                        <span class="dot"></span>
                    </div>

                    <script>
                        var slideIndex = 0;
                        showSlides();

                        function showSlides() {
                            var i;
                            var slides = document.getElementsByClassName("mySlides");
                            var dots = document.getElementsByClassName("dot");
                            for (i = 0; i < slides.length; i++) {
                                slides[i].style.display = "none";
                            }
                            slideIndex++;
                            if (slideIndex > slides.length) {
                                slideIndex = 1
                            }
                            for (i = 0; i < dots.length; i++) {
                                dots[i].className = dots[i].className.replace(" active", "");
                            }
                            slides[slideIndex - 1].style.display = "block";
                            dots[slideIndex - 1].className += " active";
                            setTimeout(showSlides, 2000);
                        }

                    </script>
                </div>
            </div>
        </div>
    </body>
</html>
