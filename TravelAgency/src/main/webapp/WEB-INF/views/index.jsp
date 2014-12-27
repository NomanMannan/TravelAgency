<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Discover Thailand Co. Ltd.</title>
		<meta charset="utf-8">
		<meta name="format-detection" content="telephone=no" />
		<link rel="icon" href="resources/images/favicon.ico">
		<link rel="shortcut icon" href="resources/images/favicon.ico" />
		<link rel="stylesheet" href="resources/booking/css/booking.css">
		<link rel="stylesheet" href="resources/css/camera.css">
		<link rel="stylesheet" href="resources/css/owl.carousel.css">
		<link rel="stylesheet" href="resources/css/style.css">
		
		
<!-- Bootstrap Core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link
	href="<c:url value="/resources/css/plugins/metisMenu/metisMenu.min.css" />"
	rel="stylesheet">

<!-- Timeline CSS -->
<link href="<c:url value="/resources/css/plugins/timeline.css" />"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<c:url value="/resources/css/sb-admin-2.css" />"
	rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="<c:url value="/resources/css/plugins/morris.css" />"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<c:url value="/resources/font-awesome-4.1.0/css/font-awesome.min.css" />"
	rel="stylesheet" type="text/css">
		
		
		<script src="resources/js/jquery.js"></script>
		<script src="resources/js/jquery-migrate-1.2.1.js"></script>
		<script src="resources/js/script.js"></script>
		<script src="resources/js/superfish.js"></script>
		<script src="resources/js/jquery.ui.totop.js"></script>
		<script src="resources/js/jquery.equalheights.js"></script>
		<script src="resources/js/jquery.mobilemenu.js"></script>
		<script src="resources/js/jquery.easing.1.3.js"></script>
		<script src="resources/js/owl.carousel.js"></script>
		<script src="resources/js/camera.js"></script>
		<!--[if (gt IE 9)|!(IE)]><!-->
		<script src="resources/js/jquery.mobile.customized.min.js"></script>
		<!--<![endif]-->
		<script src="resources/booking/js/booking.js"></script>
		<script>
			$(document).ready(function(){
			jQuery('#camera_wrap').camera({
				loader: false,
				pagination: false ,
				minHeight: '444',
				thumbnails: false,
				height: '48.375%',
				caption: true,
				navigation: true,
				fx: 'mosaic'
			});
			/*carousel*/
			var owl=$("#owl");
				owl.owlCarousel({
				items : 2, //10 items above 1000px browser width
				itemsDesktop : [995,2], //5 items between 1000px and 901px
				itemsDesktopSmall : [767, 2], // betweem 900px and 601px
				itemsTablet: [700, 2], //2 items between 600 and 0
				itemsMobile : [479, 1], // itemsMobile disabled - inherit from itemsTablet option
				navigation : true,
				pagination : false
				});
			$().UItoTop({ easingType: 'easeOutQuart' });
			});
		</script>
		<!--[if lt IE 8]>
		<div style=' clear: both; text-align:center; position: relative;'>
			<a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
				<img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
			</a>
		</div>
		<![endif]-->
		<!--[if lt IE 9]>
		<script src="resources/js/html5shiv.js"></script>
		<link rel="stylesheet" media="screen" href="resources/css/ie.css">
		<![endif]-->
	</head>
	<body class="page1" id="top">
<!--==============================header=================================-->
		<header>
			<div class="container_12">
				<div class="grid_12">
					<div class="menu_block">
						<nav class="horizontal-nav full-width horizontalNav-notprocessed">
							<ul class="sf-menu">
								<li class="current"><a href="index.jsp">ABOUT</a></li>
								<li><a href="index-1.html">HOT TOURS</a></li>
								<li><a href="index-2.html">SPECIAL OFFERS</a></li>
								<li><a href="index-3.html">BLOG</a></li>
								<li><a href="index-4.html">CONTACTS</a></li>
							</ul>
						</nav>
						<div class="clear"></div>
					</div>
				</div>
				<div class="grid_12">
					<h1>
						<a href="index.html">
							<img src="resources/images/logo.png" alt="Your Happy Family">
						</a>
					</h1>
				</div>
			</div>
		</header>
		<div class="slider_wrapper">
			<div id="camera_wrap" class="">
				<div data-src="resources/images/slide.jpg">
					<div class="caption fadeIn">
						<h2>LONDON</h2>
						<div class="price">
							FROM
							<span>$1000</span>
						</div>
						<a href="#">LEARN MORE</a>
					</div>
				</div>
				<div data-src="resources/images/slide1.jpg">
					<div class="caption fadeIn">
						<h2>Maldives</h2>
						<div class="price">
							FROM
							<span>$2000</span>
						</div>
						<a href="#">LEARN MORE</a>
					</div>
				</div>
				<div data-src="resources/images/slide2.jpg">
					<div class="caption fadeIn">
						<h2>Venice</h2>
						<div class="price">
							FROM
							<span>$1600</span>
						</div>
						<a href="#">LEARN MORE</a>
					</div>
				</div>
			</div>
		</div>
<!--==============================Content=================================-->
		<div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - February 10, 2014!</div>
			<div class="container_12">
				<div class="grid_4">
					<div class="banner">
						<img src="resources/images/ban_img1.jpg" alt="">
						<div class="label">
							<div class="title">Barcelona</div>
							<div class="price">FROM<span>$ 1000</span></div>
							<a href="#">LEARN MORE</a>
						</div>
					</div>
				</div>
				<div class="grid_4">
					<div class="banner">
						<img src="resources/images/ban_img2.jpg" alt="">
						<div class="label">
							<div class="title">GOA</div>
							<div class="price">FROM<span>$ 1.500</span></div>
							<a href="#">LEARN MORE</a>
						</div>
					</div>
				</div>
				<div class="grid_4">
					<div class="banner">
						<img src="resources/images/ban_img3.jpg" alt="">
						<div class="label">
							<div class="title">PARIS</div>
							<div class="price">FROM<span>$ 1.600</span></div>
							<a href="#">LEARN MORE</a>
						</div>
					</div>
				</div>
				<div class="clear"></div>
				<div class="grid_6">
					<h3>Booking Form</h3>
					<form id="bookingForm">
						<div class="fl1">
							<div class="tmInput">
								<input name="Name" placeHolder="Name:" type="text" data-constraints='@NotEmpty @Required @AlphaSpecial'>
							</div>
							<div class="tmInput">
								<input name="Country" placeHolder="Country:" type="text" data-constraints="@NotEmpty @Required">
							</div>
						</div>
						<div class="fl1">
							<div class="tmInput">
								<input name="Email" placeHolder="Email:" type="text" data-constraints="@NotEmpty @Required @Email">
							</div>
							<div class="tmInput mr0">
								<input name="Hotel" placeHolder="Hotel:" type="text" data-constraints="@NotEmpty @Required">
							</div>
						</div>
						<div class="clear"></div>
						<strong>Check-in</strong>
						<label class="tmDatepicker">
							<input type="text" name="Check-in" placeHolder='10/05/2014' data-constraints="@NotEmpty @Required @Date">
						</label>
						<div class="clear"></div>
						<strong>Check-out</strong>
						<label class="tmDatepicker">
							<input type="text" name="Check-out" placeHolder='20/05/2014' data-constraints="@NotEmpty @Required @Date">
						</label>
						<div class="clear"></div>
						<div class="tmRadio">
							<p>Comfort</p>
							<input name="Comfort" type="radio" id="tmRadio0" data-constraints='@RadioGroupChecked(name="Comfort", groups=[RadioGroup])' checked/>
							<span>Cheap</span>
							<input name="Comfort" type="radio" id="tmRadio1" data-constraints='@RadioGroupChecked(name="Comfort", groups=[RadioGroup])' />
							<span>Standart</span>
							<input name="Comfort" type="radio" id="tmRadio2" data-constraints='@RadioGroupChecked(name="Comfort", groups=[RadioGroup])' />
							<span>Lux</span>
						</div>
						<div class="clear"></div>
						<div class="fl1 fl2">
							<em>Adults</em>
							<select name="Adults" class="tmSelect auto" data-class="tmSelect tmSelect2" data-constraints="">
								<option>1</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
							</select>
							<div class="clear"></div>
							<em>Rooms</em>
							<select name="Rooms" class="tmSelect auto" data-class="tmSelect tmSelect2" data-constraints="">
								<option>1</option>
								<option>1</option>
								<option>2</option>
								<option>3</option>
							</select>
						</div>
						<div class="fl1 fl2">
							<em>Children</em>
							<select name="Children" class="tmSelect auto" data-class="tmSelect tmSelect2" data-constraints="">
								<option>0</option>
								<option>0</option>
								<option>1</option>
								<option>2</option>
							</select>
						</div>
						<div class="clear"></div>
						<div class="tmTextarea">
							<textarea name="Message" placeHolder="Message" data-constraints='@NotEmpty @Required @Length(min=20,max=999999)'></textarea>
						</div>
						<a href="#" class="btn" data-type="submit">Submit</a>
					</form>
				</div>
				
				<div class="grid_5 prefix_1">
				<h4>Packages</h4>
				
				
			<table data-toggle="table" class="table table-hover"
					data-toolbar="#transform-buttons">
					
						<thead>
						<tr>
							<th>Package Name</th>
							<th>Days/Nights</th>
							<th>Price</th>
							<th>Details</th>
						</tr>
					</thead>
					
					<c:forEach var="pack" items="${packages}">
						<tbody>
							<tr>
								<td>${pack.name}</td>
								<td>${pack.duration-1}D/${pack.duration}N</td>
								<td>${pack.basePrice+(pack.basePrice*(pack.profit*.01))}$</td>
								<td><a href="./package/${pack.id}">More</a></td>
							</tr>
						</tbody>

					</c:forEach>
				</table>
				
				
				<h4>Sightseeings</h4>
				
				
			<table data-toggle="table" class="table table-hover"
					data-toolbar="#transform-buttons">
					
							<thead>
						<tr>
							<th>Sightseeing Name</th>
							<th>Place</th>
							<th>Price</th>
							<th>Details</th>
						</tr>
					</thead>
					
					<c:forEach var="sightseeing" items="${sightseeings}">
						<tbody>
							<tr>
								<td>${sightseeing.name}</td>
								<td>${sightseeing.place}</td>
								<td>${sightseeing.adultPrice}$</td>
								<td><a href="./sightseeing/${sightseeing.id}">More</a></td>
							</tr>
						</tbody>

					</c:forEach>
				</table>
				
				
								
				<h4>Transports</h4>
				
				
			<table data-toggle="table" class="table table-hover"
					data-toolbar="#transform-buttons">
					
					<c:forEach var="transport" items="${transports}">
							<thead>
						<tr>
							<th>Transport Name</th>
							<th>Max Paxs</th>
							<th>Price</th>
							<th>Details</th>
						</tr>
					</thead>
						<tbody>
							<tr>
								<td>${transport.name}</td>
								<td>${transport.seats}Paxs</td>
								<td>${transport.price}$</td>
								<td><a href="./transport/${transport.id}">More</a></td>
							</tr>
						</tbody>

					</c:forEach>
				</table>

				
				
				
				
				
					<h3>Welcome</h3>
					<img src="resources/images/page1_img1.jpg" alt="" class="img_inner fleft">
					<div class="extra_wrapper">
						<p>Lorem ipsum dolor sit ere amet, consectetur ipiscin.</p>
						In mollis erat mattis neque facilisis, sit ametiol
					</div>
					<div class="clear cl1"></div>
					<p>Find the detailed description of this <span class="col1"><a href="http://blog.templatemonster.com/free-website-templates/" rel="dofollow">freebie</a></span> at TemplateMonster blog.</p>
					<p><span class="col1"><a href="http://www.templatemonster.com/category/travel-website-templates/" rel="nofollow">Travel Website Templates</a></span> category offers you a variety of designs that are perfect for travel sphere of business.</p>
					Proin pharetra luctus diam, a scelerisque eros convallis
					<h4>Clientsâ Quotes</h4>
					<blockquote class="bq1">
						<img src="resources/images/page1_img2.jpg" alt="" class="img_inner noresize fleft">
						<div class="extra_wrapper">
							<p>Duis massa elit, auctor non pellentesque vel, aliquet sit amet erat. Nullam eget dignissim nisi, aliquam feugiat nibh. </p>
							<div class="alright">
								<div class="col1">Miranda Brown</div>
								<a href="#" class="btn">More</a>
							</div>
						</div>
					</blockquote>
				</div>
				<div class="grid_12">
					<h3 class="head1">Latest News</h3>
				</div>
				<div class="grid_4">
					<div class="block1">
						<time datetime="2014-01-01">10<span>Jan</span></time>
						<div class="extra_wrapper">
							<div class="text1 col1"><a href="#">Aliquam nibh</a></div>
							Proin pharetra luctus diam, any scelerisque eros convallisumsan. Maecenas vehicula egestas
						</div>
					</div>
				</div>
				<div class="grid_4">
					<div class="block1">
						<time datetime="2014-01-01">21<span>Jan</span></time>
						<div class="extra_wrapper">
							<div class="text1 col1"><a href="#">Etiam dui eros</a></div>
							Any scelerisque eros vallisumsan. Maecenas vehicula egestas natis. Duis massa elit, auctor non
						</div>
					</div>
				</div>
				<div class="grid_4">
					<div class="block1">
						<time datetime="2014-01-01">15<span>Feb</span></time>
						<div class="extra_wrapper">
							<div class="text1 col1"><a href="#">uamnibh Edeto</a></div>
							Ros convallisumsan. Maecenas vehicula egestas venenatis. Duis massa elit, auctor non
						</div>
					</div>
				</div>
			</div>
		</div>
<!--==============================footer=================================-->
		<footer>
			<div class="container_12">
				<div class="grid_12">
					<div class="socials">
						<a href="#" class="fa fa-facebook"></a>
						<a href="#" class="fa fa-twitter"></a>
						<a href="#" class="fa fa-google-plus"></a>
					</div>
					<div class="copy">
						Your Trip (c) 2014 | <a href="#">Privacy Policy</a> | Website Template Designed by <a href="http://www.templatemonster.com/" rel="nofollow">TemplateMonster.com</a>
					</div>
				</div>
			</div>
		</footer>
		<script>
			$(function (){
				$('#bookingForm').bookingForm({
					ownerEmail: '#'
				});
			})
			$(function() {
				$('#bookingForm input, #bookingForm textarea').placeholder();
			});
		</script>
	</body>
</html>

