<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Packages</title>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no" />
<link rel="icon" href="../../resources/images/favicon.ico">
<link rel="shortcut icon" href="../resources/images/favicon.ico" />
<link rel="stylesheet" href="../resources/css/style.css">
<script src="../resources/js/jquery.js"></script>
<script src="../resources/js/jquery-migrate-1.2.1.js"></script>
<script src="../resources/js/script.js"></script>
<script src="../resources/js/superfish.js"></script>
<script src="../resources/js/jquery.ui.totop.js"></script>
<script src="../resources/js/jquery.equalheights.js"></script>
<script src="../resources/js/jquery.mobilemenu.js"></script>
<script src="../resources/js/jquery.easing.1.3.js"></script>
<script>
	$(document).ready(function() {
		$().UItoTop({
			easingType : 'easeOutQuart'
		});
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
		<script src="js/html5shiv.js"></script>
		<link rel="stylesheet" media="screen" href="css/ie.css">
		<![endif]-->
</head>
<body>
	<!--==============================header=================================-->
	<header>
		<div class="container_12">
			<div class="grid_12">
				<div class="menu_block">
					<nav class="horizontal-nav full-width horizontalNav-notprocessed">
						<ul class="sf-menu">
							<li class="current"><a href="index.jsp">HOME</a></li>
							<li class="current"><a href="package.jsp">PACKAGES</a></li>
							<li><a href="sightseeing.jsp">SIGHTSEEINGS</a></li>
							<li><a href="transport.jsp">TRANSPORTS</a></li>
							<li><a href="contact.jsp">CONTACTS</a></li>
						</ul>
					</nav>
					<div class="clear"></div>
				</div>
			</div>
			<div class="grid_12">
				<h1>
					<a href="index.html"> <img src="../resources/images/logo.png"
						alt="Your Happy Family"></a>
				</h1>
			</div>
		</div>
	</header>
	<!--==============================Content=================================-->
	<div class="content">
		<div class="ic">More Website Templates @ TemplateMonster.com -
			February 10, 2014!</div>
		<div class="container_12">
			<div class="grid_7">
				<h4>Package Details: ${pack.getName()}</h4>
				<form:form class="form-horizontal" role="form" commandName="pack"
					action="./packagebooking/" method="post">

					<H6>Package Name: ${pack.getName()}</H6><br/>

					<H6>Places: ${pack.places}</H6><br/>

					<H6>Sightseeings:${pack.sightseeings}</H6><br/>

					<H6>Transports:${pack.transports}</H6><br/>

					<H6>Itenarary: ${pack.getItenarary()}</H6><br/>

					<h6>Cancellation Policy:${pack.getCancellationPolicy()}</h6><br/>
					
					<h6>Nights/Days:${pack.duration}N/${pack.duration+1}D</h6><br/>
					
					<h6>Terms and Conditions: ${pack.getTermsAndConditions()}</h6><br/>
					
					<h6><b>Price:${pack.basePrice+(pack.basePrice*(pack.profit*.01))}$</b></h6><br/>


					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-success">Book Now</button>
						</div>
					</div>

				</form:form>

			</div>
			<div class="grid_3 prefix_1">
				<h3 class="head1">CATEGORIES</h3>
				<ul class="list">
					<li><a href="#">Suspendisse massa mi </a></li>
					<li><a href="#">Porttitor at velit id </a></li>
					<li><a href="#">Congue adipiscing </a></li>
					<li><a href="#">Vestibulum vitae porta </a></li>
					<li><a href="#">Vivamus ac sodales </a></li>
					<li><a href="#">Massa quis adipiscing </a></li>
					<li><a href="#">Phasellus hendrerit </a></li>
					<li><a href="#">Libero in sapien </a></li>
					<li><a href="#">Dignissim vel imperdiet </a></li>
				</ul>
				<h3 class="head1">ARchives</h3>
				<ul class="list">
					<li><a href="#">November 2013</a></li>
					<li><a href="#">October 2013</a></li>
					<li><a href="#">September 2013</a></li>
					<li><a href="#">August 2013</a></li>
					<li><a href="#">July 2013</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--==============================footer=================================-->
	<footer>
		<div class="container_12">
			<div class="grid_12">
				<div class="socials">
					<a href="#" class="fa fa-facebook"></a> <a href="#"
						class="fa fa-twitter"></a> <a href="#" class="fa fa-google-plus"></a>
				</div>
				<div class="copy">
					Your Trip (c) 2014 | <a href="#">Privacy Policy</a> | Website
					Template Designed by <a href="http://www.templatemonster.com/"
						rel="nofollow">TemplateMonster.com</a>
				</div>
			</div>
		</div>
	</footer>
	<script>
		$(function() {
			$('#bookingForm').bookingForm({
				ownerEmail : '#'
			});
		})
	</script>
</body>
</html>