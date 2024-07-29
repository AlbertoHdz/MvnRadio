<%-- 
    Document   : hello
    Created on : 2/12/2019, 11:43:13 PM
    Author     : Draxl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page pruebas</title>
        
        <script src="assets/js/jquery.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        
	<meta name="description" content=" | Best radio station">

	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<link rel="icon" href="assets/images/icon.ico" type="image/x-icon">

	<link rel="stylesheet" type="text/css" media="all" href="assets/css/default.css">    

	<link rel="stylesheet" type="text/css" media="all" href="assets/css/bootstrap.min.css">	
	<link rel="stylesheet" title="styles1" type="text/css" media="all" href="assets/css/style.css">
	<link rel="stylesheet" title="styles1" type="text/css" media="all" href="assets/css/screen.css">
        <link rel="stylesheet" title="styles1" type="text/css" media="all" href="assets/css/public.css">
        <link rel="stylesheet" title="styles1" type="text/css" media="all" href="assets/css/flexslider.css">
        <link href="assets/css/font-awesome.min.css" rel="stylesheet">
	<link rel="dns-prefetch" href="https://fonts.googleapis.com/">

	<style type="text/css">
            a{
                cursor: pointer;
            }
		.customColor, #breadCrumd li a:hover, span.wpcf7-not-valid-tip { color:#d50d41 !important; }
                #navArea ul .sub-menu,
		#latestPostHome a.bigButton,
		#primaryWrapContent .header-title,
		.single.single-post .header-title h1,
		div.wpcf7-validation-errors { background-color:#d50d41 !important; }#navArea ul li:hover > a,
		#afterSliderArea .bigBannerText:hover,
		#afterSliderArea .bigBannerText:hover,
		#afterSliderArea .bannerBlock .in p a:hover:after,
		#afterSliderArea .bannerBlock .in p a:hover,
		#latestPostHome ul li .in a.readmore:hover,
		#carouselBox #owl-posts .item:hover a.read,
		#carouselBox #owl-posts .owl-buttons > div.owl-next:hover,
		#carouselBox #owl-posts .owl-buttons > div.owl-prev:hover,
		body #owl-posts .wrapImg:hover,
		#breadCrumd li a:after,
		a.button:hover,
		#galleryHolder .galleryItem a img:hover { background-color:#d50d41 !important; }  

		#afterSliderArea .bigBannerText:hover,
		div.wpcf7-validation-errors { border-color:#d50d41 !important; }      
	</style>

    </head>
    <body>
            <template id="navArea" class="">
                <div class="container">
                    <div class="row">                       
                        <nav class="primary">
                            <div class="clearfix">                              
                                <div class="responds"><span>Menu</span></div>   

                                <ul id="topnav" class="sf-menu sf-js-enabled">
                                    <li v-for="(link, index) in accesos" :key="index" class="menu-item">
                                        <a :data-url="{{link.url}}">{{link.name}}</a>
                                    </li>
                                </ul>                               
                            </div>
                        </nav>.primary
                    </div>
                </div>
            </template>
        <h1>Hello World my friend ${message}!</h1>
        <div id="app">
<!--            {{ mensaje }}
            <img :src="imagen">-->
            <app-nav></app-nav>
            <app-view>
<!--              <app-sidebar></app-sidebar>
              <app-content></app-content>-->
            </app-view>
        <div>
            
        
        <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
        <!-- production version, optimized for size and speed -->
        <!--<script src="https://cdn.jsdelivr.net/npm/vue"></script>-->
        <script src="resources/js/portal/portal.js"></script>
       

    </body>
</html>
