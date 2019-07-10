<%@page import="java.io.PrintWriter"%>
<%@page import="com.croweloper.globalchef.dao.impl.RecetaDAOImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.croweloper.globalchef.model.Receta"%>
<%
    String chefnom = null;
   
    HttpSession misession = (HttpSession) request.getSession(false);

    chefnom = (String) misession.getAttribute("chefnom");
 
    String chefape = (String) misession.getAttribute("chefape");
    String chefmail = (String) misession.getAttribute("chefmail");
    int chefid = (Integer) misession.getAttribute("chefid");

    String nombreCompleto = chefnom + " " + chefape;

    List<Receta> listarecetas;
    RecetaDAOImpl objReceta = new RecetaDAOImpl();
    listarecetas = objReceta.listarPorChef(chefid);

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" href="img/faviconglobal.png" type="image/png">
        <title>GlobalChef</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="vendors/linericon/style.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
        <link rel="stylesheet" href="vendors/lightbox/simpleLightbox.css">
        <link rel="stylesheet" href="vendors/nice-select/css/nice-select.css">
        <link rel="stylesheet" href="vendors/animate-css/animate.css">
        <link rel="stylesheet" href="vendors/popup/magnific-popup.css">
        <!-- main css -->
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/responsive.css">
    </head>
    <body>

        <!--================Header Menu Area =================-->
        <header class="header_area">
            <div class="main_menu" id="mainNav">
                <nav class="navbar navbar-expand-lg navbar-light">
                    <div class="container">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <a class="navbar-brand logo_h" href="index.html"><img src="img/logogcbanner.png" alt=""></a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                            <ul class="nav navbar-nav menu_nav ml-auto">
                                <li class="nav-item active"><a class="nav-link" href="index.html">HOME</a></li> 
                                <li class="nav-item"><a class="nav-link" href="ChefServlet?val=0">CERRAR SESION</a></li> 

                                    <!-- <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li> -->
                            </ul>
                        </div> 
                    </div>
                </nav>
            </div>
        </header>
        <!--================Header Menu Area =================-->
        <!--================Home Banner Area =================-->
        <section class="banner_area">
            <div class="banner_inner d-flex align-items-center">
                <div class="overlay bg-parallax" data-stellar-ratio="0.9" data-stellar-vertical-offset="0" data-background=""></div>
                <div class="container">
                    <div class="banner_content text-center">
                        <h2>Perfil Chef</h2>
                    </div>
                </div>
            </div>
        </section>
        <!--================End Home Banner Area =================-->

        <!--================Blog Categorie Area =================-->
        <section class="blog_categorie_area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 offset-md-4">
                        <div class="categories_post">
                            <img src="img/blog/cat-post/cat-post-1.jpg" alt="post">
                            <div class="categories_details">
                                <div class="categories_text">
                                    <a href="#"><h5>Food</h5></a>
                                    <div class="border_line"></div>
                                    <p>Comida</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================Blog Categorie Area =================-->
        <!--================Blog Area =================-->
        <section class="blog_area">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="blog_left_sidebar">
                            <% for (int i = 0; i < listarecetas.size(); i++) {%>
                            <article class="row blog_item">
                                <div class="col-md-3">
                                    <div class="blog_info text-right">

                                        <ul class="blog_meta list">
                                            <li><a href="#"><%=nombreCompleto%><i class="lnr lnr-user"></i></a></li>
                                            <li><a href="#">Dificultad : <%=listarecetas.get(i).getRec_dificultad()%><i class="lnr lnr-calendar-full"></i></a></li>
                                            <li><a href="#"><%=listarecetas.get(i).getRec_votos()%> Votos<i class="lnr lnr-eye"></i></a></li>

                                        </ul>
                                    </div>
                                </div>
                                <div class="col-md-9">
                                    <div class="blog_post">
                                        <img src="img/blog/main-blog/m-blog-1.jpg" alt="">
                                        <div class="blog_details">
                                            <a href="#.html"><h2><%=listarecetas.get(i).getRec_descripcion()%></h2></a>
                                            <!--<p>MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money on boot camp when you can get the MCSE study materials yourself at a fraction.</p>-->
                                            <!--<a href="#.html" class="blog_btn">View More</a>-->
                                        </div>
                                    </div>
                                </div>
                            </article>
                            <%}%>

                        </div>
                    </div>
                    <div class="col-lg-4">
                        <div class="blog_right_sidebar">

                            <aside class="single_sidebar_widget author_widget">
                                <img class="author_img rounded-circle" src="img/blog/author.png" alt="">
                                <h4><%=nombreCompleto%></h4>
                                <p><%=chefmail%></p>
                                <div class="social_icon">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a> 
                                </div>
                                <p>Presentacion.</p>
                                <div class="br"></div>
                            </aside>

                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--================Blog Area =================-->

        <!--================ start footer Area  =================-->	
        <footer class="footer-area p_120">
            <div class="container">

                <div class="row footer-bottom d-flex justify-content-between align-items-center">
                    <p class="col-lg-8 col-md-8 footer-text m-0"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Make for GlobalChef with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://croweloper.com" target="_blank">Croweloper</a>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    <div class="col-lg-4 col-md-4 footer-social">
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-twitter"></i></a>

                    </div>
                </div>
            </div>
        </footer>
        <!--================ End footer Area  =================-->





        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/stellar.js"></script>
        <script src="vendors/lightbox/simpleLightbox.min.js"></script>
        <script src="vendors/nice-select/js/jquery.nice-select.min.js"></script>
        <script src="vendors/isotope/imagesloaded.pkgd.min.js"></script>
        <script src="vendors/isotope/isotope-min.js"></script>
        <script src="vendors/owl-carousel/owl.carousel.min.js"></script>
        <script src="js/jquery.ajaxchimp.min.js"></script>
        <script src="vendors/counter-up/jquery.waypoints.min.js"></script>
        <script src="vendors/counter-up/jquery.counterup.js"></script>
        <script src="js/mail-script.js"></script>
        <script src="vendors/popup/jquery.magnific-popup.min.js"></script>
        <script src="js/theme.js"></script>
    </body>
</html>