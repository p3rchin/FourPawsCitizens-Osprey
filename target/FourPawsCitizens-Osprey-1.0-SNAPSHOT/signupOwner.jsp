<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    <title>Paws Citizens</title>
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

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
    
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
                      <div class="logo"> <a href="index.jsp"><img src="images/logo.png" alt="logo"/></a> </div>
                   </div>
                </div>
             </div>
             <div class="col-xl-7 col-lg-7 col-md-9 col-sm-9">
                <div class="menu-area">
                   <div class="limit-box">
                      <nav class="main-menu">
                         <ul class="menu-area-main">
                            <li > <a href="index.jsp">Home</a> </li>
                            <li> <a href="about.jsp">About</a> </li>
                             <li> <a href="signupOfficial.jsp">Register official</a> </li>
                            <li class="active"> <a href="signupOwner.jsp">Register owner</a> </li>
                             <li> <a href="signupVet.jsp">Register vet</a> </li>
                         </ul>
                      </nav>
                   </div>
                </div>
             </div>
             <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2">
                <li><a class="buy" href="signin.jsp">Sign in</a></li>
             </div>
          </div>
       </div>
       <!-- end header inner --> 
    </header>
    <!-- end header -->

    <div class="brand_color">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="titlepage">
                        <h2>Sign up as an owner</h2>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <div>
        <section class="signin">
        <div class="about">
            <div class="container">
               <div class="row">
                  <dir class="col-xl-6 col-lg-6 col-md-12 col-sm-12">
                     <div class="about_box">
                        <figure><img src="images/signup-owner.png" alt="sing up image"></figure>
                        <a href="signin.jsp">I am already member</a>
                     </div>
                </dir>
                <dir class="col-xl-6 col-lg-6 col-md-12 col-sm-12">
                    <div class="about_box">
                        <h3 class="form-title">Sign up</h3>
                        <form method="POST" class="register-form" id="register-form">
                            <div class=" col-md-12">
                                <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" class="form-control" name="username" id="username" placeholder="Your username" required="required"/>
                            </div>
                            <div class=" col-md-12">
                                <label for="email"><i class="zmdi zmdi-email"></i></label>
                                <input type="email"  class="form-control"name="email" id="email" placeholder="Your email" required="required"/>
                            </div>
                            <div class=" col-md-12">
                                <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                <input type="password"  class="form-control"name="pass" id="pass" placeholder="Password" required="required"/>
                            </div>
                            <div class=" col-md-12">
                                <label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
                                <input type="password" class="form-control" name="re_pass" id="re_pass" placeholder="Repeat your password" required="required"/>
                            </div>
                            <div class=" col-md-12">
                                <input class="form-control" placeholder="Your name" type="text" name="name" id="name" required="required">
                            </div>
                            <div class=" col-md-12">
                                <input class="form-control" placeholder="Your address" type="text" name="address" id="address" required="required">
                            </div>
                            <div class=" col-md-12">
                                <select class="form-control" style="height:60px" name="neighborhood">
                                    <option disabled="disabled" selected="selected">Select your neighborhood</option>
                                    <option value="A. Nriño">A. Nariño</option>
                                    <option value="B. Unidos">B. Unidos</option>
                                    <option value="Bosa">Bosa</option>
                                    <option value="C.Bolivar">C.Bolivar</option>
                                    <option value="Chapinero">Chapinero</option>
                                    <option value="Engativa">Engativa</option>
                                    <option value="Fontibon">Fontibon</option>
                                    <option value="Kennedy">Kennedy</option>
                                    <option value="La candelaria">La candelaria</option>
                                    <option value="Los martires">Los martires</option>
                                    <option value="Municipios aledaños a Bogota D.C">Municipios aledaños a Bogota D.C</option>
                                    <option value="P. Aranda">P. Aranda</option>
                                    <option value="R. Uribe">R. Uribe</option>
                                    <option value="San Cristobal">San Cristobal</option>
                                    <option value="Santa Fe">Santa Fe</option>
                                    <option value="Suba">Suba</option>
                                    <option value="Sumapaz">Sumapaz</option>
                                    <option value="Teusaquillo">Teusaquillo</option>
                                    <option value="Tunjuelito">Tunjuelito</option>
                                    <option value="Usaquen">Usaquen</option>
                                    <option value="Usme">Usme</option>
                                    <option value="Sin identificar">Sin identificar</option>
                                </select>
                            </div>
                            <div class=" col-md-12">
                                <input type="submit" name="signup" id="signup" class="send" value="Register"/>
                            </div>
                        </form>
                    </dir> 
                 </div>
              </div>
           </div>>
           </section>

    </div>
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
                      <li> <a href="about.jsp">About</a></li>
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
     <!-- end footer -->
     <!-- Javascript files-->

    <script>

        var formulario = document.getElementById('register-form');

        formulario.addEventListener('submit', function (e){
            e.preventDefault();
            console.log('me diste un click')

            var datos = new FormData(formulario);

            console.log(datos.get('selection'))
            console.log(datos.get('name'))
            console.log(datos.get('email'))
            console.log(datos.get('pass'))

            if(datos.get('selection') == 'Owner'){

                fetch('http://localhost:8080/FourPawsCitizens-Osprey-1.0-SNAPSHOT/api/owners', {
                    method: 'POST',
                    body: JSON.stringify({
                        username: datos.get('name'),
                        password: datos.get('pass'),
                        email: datos.get('email'),
                        name: 'Perchin',
                        personId:12345,
                        address: 'carrera 3',
                        neighborhood: 'funzita'
                    }),
                    headers: {
                        'Content-type': 'application/json; charset=UTF-8',
                    },
                })
                    .then((response) => response.json())
                    .then((json) => console.log(json));
            }

            if(datos.get('selection') == 'Vet'){

            }

            if(datos.get('selection') == 'Official'){

            }



        });


    </script>
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