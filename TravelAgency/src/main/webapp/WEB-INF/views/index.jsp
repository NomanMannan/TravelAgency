<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
	$(document).ready(function() {
		jQuery('#camera_wrap').camera({
			loader : false,
			pagination : false,
			minHeight : '444',
			thumbnails : false,
			height : '48.375%',
			caption : true,
			navigation : true,
			fx : 'mosaic'
		});
		/*carousel*/
		var owl = $("#owl");
		owl.owlCarousel({
			items : 2, //10 items above 1000px browser width
			itemsDesktop : [ 995, 2 ], //5 items between 1000px and 901px
			itemsDesktopSmall : [ 767, 2 ], // betweem 900px and 601px
			itemsTablet : [ 700, 2 ], //2 items between 600 and 0
			itemsMobile : [ 479, 1 ], // itemsMobile disabled - inherit from itemsTablet option
			navigation : true,
			pagination : false
		});
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
							<li class="current"><a href="index.jsp">HOME</a></li>
							<li><a href="package.jsp">PACKAGES</a></li>
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
					<a href="index.html"> <img src="resources/images/logo.png"
						alt="Your Happy Family"></a>
				</h1>
			</div>
		</div>
	</header>
	<div class="slider_wrapper">
		<div id="camera_wrap" class="">
			<div data-src="resources/images/slide.jpg">
				<div class="caption fadeIn">
					<h2>Bangkok</h2>
					<div class="price">
						FROM <span>$50</span>
					</div>
					<a href="package.jsp">LEARN MORE</a>
				</div>
			</div>
			<div data-src="resources/images/slide1.jpg">
				<div class="caption fadeIn">
					<h2>Pattaya</h2>
					<div class="price">
						FROM <span>$100</span>
					</div>
					<a href="package.jsp">LEARN MORE</a>
				</div>
			</div>
			<div data-src="resources/images/slide2.jpg">
				<div class="caption fadeIn">
					<h2>Phuket</h2>
					<div class="price">
						FROM <span>$200</span>
					</div>
					<a href="package.jsp">LEARN MORE</a>
				</div>
			</div>
		</div>
	</div>
	<!--==============================Content=================================-->
	<div class="content">
		<div class="ic">More Website Templates @ TemplateMonster.com -
			February 10, 2014!</div>
		<div class="container_12">
			<div class="grid_4">
				<div class="banner">
					<img src="resources/images/ban_img1.jpg" alt="">
					<div class="label">
						<div class="title">KUALALAMPUR</div>
						<div class="price">
							FROM<span>$ 80</span>
						</div>
						<a href="package.jsp">LEARN MORE</a>
					</div>
				</div>
			</div>
			<div class="grid_4">
				<div class="banner">
					<img src="resources/images/ban_img2.jpg" alt="">
					<div class="label">
						<div class="title">SINGAPORE</div>
						<div class="price">
							FROM<span>$ 300</span>
						</div>
						<a href="package.jsp">LEARN MORE</a>
					</div>
				</div>
			</div>
			<div class="grid_4">
				<div class="banner">
					<img src="resources/images/ban_img3.jpg" alt="">
					<div class="label">
						<div class="title">MALDIVES</div>
						<div class="price">
							FROM<span>$ 400</span>
						</div>
						<a href="package.jsp">LEARN MORE</a>
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<div class="grid_6">
				<h3>Plan Your Trip</h3>

				<form:form class="form-horizontal" role="form"
					commandName="planmytripbooking" action="./"
					method="post">

					<div class="form-group">
						<label class="col-sm-2 control-label">Countries:</label>
						<div class="col-sm-7">
							<form:select path="travelToCountries" multiple="true">
								<form:options items="${countries}" itemLabel="name"
									itemValue="id" />
							</form:select>
						</div>
						<div class="col-sm-3">
							<form:errors path="travelToCountries" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Places:</label>
						<div class="col-sm-7">
							<form:select path="travelToPlaces" multiple="true">
								<form:options items="${places}" itemLabel="name" itemValue="id" />
							</form:select>
						</div>
						<div class="col-sm-3">
							<form:errors path="travelToPlaces" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Sights:</label>
						<div class="col-sm-7">
							<form:select path="travelToSightSeeings" multiple="true">
								<form:options items="${sightseeings}" itemLabel="name"
									itemValue="id" />
							</form:select>
						</div>
						<div class="col-sm-3">
							<form:errors path="travelToSightSeeings" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Start Date: </label>
						<div class="col-sm-7">
							<form:input type="date" cssClass="form-control"
								path="departureDate" placeholder="departure date"
								autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="departureDate" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">End Date: </label>
						<div class="col-sm-7">
							<form:input type="date" cssClass="form-control" path="returnDate"
								placeholder="return date" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="returnDate" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Adults: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="adults"
								placeholder="number of adults" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="adults" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Childs: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="childs"
								placeholder="number of childs" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="childs" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Name: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="name"
								placeholder="your name" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="name" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Email: </label>
						<div class="col-sm-7">
							<form:input type="email" cssClass="form-control" path="email"
								placeholder="your email address" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="email" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Phone: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="phone"
								placeholder="your phone number" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="phone" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Notes: </label>
						<div class="col-sm-7">
							<form:textarea type="text" cssClass="form-control" path="comments"
								placeholder="your special notes" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="comments" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Country: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control"
								path="travelFromCountry" placeholder="your departure country"
								autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="travelFromCountry" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-success">Plan your
								Trip</button>
						</div>
					</div>



				</form:form>
			</div>

			<div class="grid_5 prefix_1">
				<h4>Packages</h4>


				<table data-toggle="table" class="table table-hover"
					data-toolbar="#transform-buttons">

					<thead>
						<tr>
							<th>Package Name</th>
							<th>Nights/Days</th>
							<th>Price</th>
							<th>Details</th>
						</tr>
					</thead>

					<c:forEach var="pack" items="${packages}">
						<tbody>
							<tr>
								<td>${pack.name}</td>
								<td>${pack.duration}N/${pack.duration+1}D</td>
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
				<img src="resources/images/page1_img1.jpg" alt=""
					class="img_inner fleft">
				<div class="extra_wrapper">
					<p>Discover Thailand Co. Ltd, welcome you all.</p>
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
					Discover Thailand Co. Ltd. (c) 2014 
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
		$(function() {
			$('#bookingForm input, #bookingForm textarea').placeholder();
		});
	</script>
</body>
</html>

