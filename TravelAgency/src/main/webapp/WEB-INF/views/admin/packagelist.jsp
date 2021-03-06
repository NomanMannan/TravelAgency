<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Discover Thailand Co. Limited: Package</title>

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

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>


	<jsp:include page="menu.jsp">
		<jsp:param value="a" name="a" />
	</jsp:include>

	<div id="page-wrapper">

		<div class="panel panel-primary margin_top_20">
			<div class="panel-heading">List of Package</div>
			<div class="panel-body">
				<table data-toggle="table" class="table table-hover"
					data-toolbar="#transform-buttons">
					<thead>
						<tr>
							<th>ID</th>
							<th>Package Name</th>
							<th>Places</th>
							<th>Sightseeings</th>
							<th>Transports</th>
							<th>Base Price</th>
							<th>Bonus Point</th>
							<th>Duration</th>
							<th>Start Date</th>
							<th>End Date</th>
							<th>Profit</th>
							<th>Action</th>
						</tr>
					</thead>
					<c:forEach var="pack" items="${packages}">
						<tbody>
							<tr>
								<td>${pack.id}</td>
								<td>${pack.name}</td>
								<td>${pack.places}</td>
								<td>${pack.sightseeings}</td>
								<td>${pack.transports}</td>
								<td>${pack.basePrice}</td>
								<td>${pack.bonusPoint}</td>
								<td>${pack.duration}</td>
								<td>${pack.startDate}</td>
								<td>${pack.endDate}</td>
								<td>${pack.profit}</td>
								<td><a href="./${pack.id}">Edit</a></td>
							</tr>
						</tbody>

					</c:forEach>
				</table>
				<a href="./add/">
					<button type="button" class="btn btn-success">Add Package</button>
				</a>
			</div>
		</div>

	</div>
	<!-- /#page-wrapper -->



	<!-- jQuery Version 1.11.0 -->
	<script src="js/jquery-1.11.0.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="js/plugins/metisMenu/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="js/plugins/morris/raphael.min.js"></script>
	<script src="js/plugins/morris/morris.min.js"></script>
	<script src="js/plugins/morris/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="js/sb-admin-2.js"></script>

</body>

</html>
