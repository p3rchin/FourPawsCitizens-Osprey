<%--
  Created by IntelliJ IDEA.
  User: fabic
  Date: 13/06/2021
  Time: 5:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>Pawn Citizens</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" href="css/style.css">
    <!-- Responsive-->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- fevicon -->
    <link rel="icon" href="images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<!-- body -->
<body class="main-layout">
<!-- loader  -->
<div class="loader_bg">
    <div class="loader"><img src="images/loading.gif" alt="#" /></div>
</div>
<!-- end loader -->
<!-- header -->
<header>
    <!-- header inner -->
    <div class="header">
        <div class="head_top">
            <div class="container">
                <div class="row">
                    <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                        <div class="top-box">
                            <ul class="sociel_link">
                                <li> <a href="#"><i class="fa fa-facebook-f"></i></a></li>
                                <li> <a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li> <a href="#"><i class="fa fa-instagram"></i></a></li>
                                <li> <a href="#"><i class="fa fa-linkedin"></i></a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-xl-6 col-lg-6 col-md-6 col-sm-12">
                        <div class="top-box">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                    <div class="full">
                        <div class="center-desk">
                            <div class="logo"> <a href="homeOfficial.jsp"><img src="images/logo.png" alt="logo"/></a> </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-7 col-lg-7 col-md-9 col-sm-9">
                    <div class="menu-area">
                        <div class="limit-box">
                            <nav class="main-menu">
                                <ul class="menu-area-main">
                                    <li class="active" > <a href="homeOfficial.jsp">Home</a> </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                </div>
                <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2">
                    <li><img src="icon/officer.png" width="75" height="75"></li>
                </div>
            </div>
        </div>
        <!-- end header inner -->
</header>
<!-- end header -->
<section class="slider_section">
    <div id="main_slider" class="carousel slide banner-main" data-ride="carousel">

        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="first-slide" src="images/banner9.jpg" alt="First slide">
                <div class="container">
                    <div class="carousel-caption relative">

                        <h1>See<br> <strong class="black_bold"> total</strong><br>
                            <strong class="yellow_bold">pets</strong></h1>
                        <p>You can see total pets</p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="second-slide" src="images/banner10.jpg" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption relative">
                        <h1>See<br> <strong class="black_bold"> total</strong><br>
                            <strong class="yellow_bold">cases</strong></h1>
                        <p>You can see total cases of pets</p>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="third-slide" src="images/banner11.jpg" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption relative">
                        <h1>See <br> <strong class="black_bold"> total</strong><br>
                            <strong class="yellow_bold">visits</strong></h1>
                        <p> You can see total cases of vets</p>
                    </div>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#main_slider" role="button" data-slide="next">
            <i class='fa fa-angle-right'></i>
        </a>
        <a class="carousel-control-next" href="#main_slider" role="button" data-slide="prev">
            <i class='fa fa-angle-left'></i>
        </a>
    </div>
</section>

<!-- service -->
<div class="service">
    <div class="container">
        <div class="row">
            <div class="col-md-8 offset-md-2">
                <div class="title">
                    <h2>List of <strong class="black">services</strong></h2>
                    <span>Easy and effective way to get your service</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                <div class="service-box">
                    <a href="viewPetsOfficial.jsp"><img src="icon/viewpetsofficial.png"/></a>
                    <h3>Check pets</h3>
                    <p>You can inspect and review each of the pets</p>
                </div>
            </div>
            <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                <div class="service-box">
                    <a href="viewCasesOfficial.jsp"><img src="icon/viewcasesofficial.png"/></a>
                    <h3>Check cases</h3>
                    <p>You can inspect and review each case</p>
                </div>
            </div>
            <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                <div class="service-box">
                    <a href="viewVisitsOfficial.jsp"><img src="icon/iconviewinformation.png"/></a>
                    <h3>Check total visits</h3>
                    <p> You can see all the information related to the visits</p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end service -->


<!-- map -->
<div class="container-fluid padi">
    <div class="map">
        <img src="images/mapimg.jpg" alt="img"/>
    </div>
</div>
<!-- end map -->
<!--  footer -->

<footr>
    <div class="footer">
        <div class="container">
            <div class="row">
            </div>
            <div class="row">
                <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12">
                    <div class="contact">
                        <h3>Contact us</h3>
                        <ul class="lik"></ul>
                        <span>Av. Cra. 9 No. 131 A - 02<br>
                       Usaquén, Bogotá<br>
                       PBX: (571) 648 9000</span>
                    </div>
                </div>
                <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12">
                    <div class="contact">
                        <h3>ADDITIONAL LINKS</h3>
                        <ul class="lik">
                            <li> <a href="index.jsp">Home</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-xl-3 col-lg-3 col-md-6 col-sm-12">
                    <div class="contact">
                        <h3>About Osprey</h3>
                        <span>We are a web development company that is dedicated to solving the life of companies</span>
                    </div>
                </div>
            </div>
        </div>
        <div class="copyright">
            <p>Copyright 2021 — All right reserved by Osprey Software Development</a></p>
        </div>

    </div>
</footr>
<!-- end footer -->
<!-- Javascript files-->
<script src="js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/jquery-3.0.0.min.js"></script>
<script src="js/plugin.js"></script>
<!-- sidebar -->
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="js/custom.js"></script>
<script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
<script>
    $(document).ready(function(){
        $(".fancybox").fancybox({
            openEffect: "none",
            closeEffect: "none"
        });

        $(".zoom").hover(function(){

            $(this).addClass('transition');
        }, function(){

            $(this).removeClass('transition');
        });
    });

</script>
</body>
</html>
