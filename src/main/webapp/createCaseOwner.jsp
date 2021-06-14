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
                        <div class="logo"> <a href="homeOwner.jsp"><img src="images/logo.png" alt="logo"/></a> </div>
                     </div>
                  </div>
               </div>
               <div class="col-xl-7 col-lg-7 col-md-9 col-sm-9">
                  <div class="menu-area">
                     <div class="limit-box">
                        <nav class="main-menu">
                           <ul class="menu-area-main">
                              <li > <a href="homeOwner.jsp">Home</a> </li>
                           </ul>
                        </nav>
                     </div>
                  </div>
               </div>
               <div class="col-xl-2 col-lg-2 col-md-2 col-sm-2">
                  <li><img src="icon/owner.png" width="75" height="75"></li>
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
                        <h2>Register case</h2>
                    </div>
                </div>
            </div>
        </div>

    </div>

    <!-- contact -->
    <div class="about">
      <div class="container">
         <div class="row">
            <dir class="col-xl-6 col-lg-6 col-md-12 col-sm-12">
               <div class="about_box">
                  <figure><img src="images/addcase.jpg" alt="sing up image"></figure>
               </div>
          </dir>
          <dir class="col-xl-6 col-lg-6 col-md-12 col-sm-12">
              <div class="about_box">
                  <h3 class="form-title">Register a case</h3>
                    <form class="main_form" class="register-form" id="register-form">
                        <div class="row">
                            <div class=" col-md-12">
                                <input type="text" class="form-control" name="petId" id="petId" placeholder="Your petId" required="required"/>
                            </div>
                            <div class=" col-md-12">
                              <input class="form-control" type="text" placeholder="Created" name="created" id="created">
                            </div>
                            <div class=" col-md-12">
                              <input class="form-control" placeholder="Type" type="text" name="type" id="type">
                          </div>
                          <div class=" col-md-12">
                           <textarea class="textarea" placeholder="Description" type="text" name="description" id="description"></textarea>
                       </div>
                            <div class=" col-md-12">
                                <button class="send" type="submit"> Register</button>
                            </div>
                        </div>
                    </form>
                  </dir> 
               </div>
            </div>
         </div>>
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
 
      <!-- Javascript files-->

      <script>

          var formulario = document.getElementById('register-form');

          formulario.addEventListener('submit', function (e){
              e.preventDefault();
              console.log('me diste un click')

              var datos = new FormData(formulario);


              console.log(datos.get('created'))
              console.log(datos.get('type'))
              console.log(datos.get('description'))

              fetch('http://localhost:8080/FourPawsCitizens-Osprey-1.0-SNAPSHOT/api/pets/12/petcases', {
                  method: 'POST',
                  body: JSON.stringify({
                      created_at: datos.get('created'),
                      type: datos.get('type'),
                      description:datos.get('description')
                  }),
                  headers: {
                      'Content-type': 'application/json; charset=UTF-8',
                  },
              })
                  .then((response) => response.json())
                  .then((json) => console.log(json));
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