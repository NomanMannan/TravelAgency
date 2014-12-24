<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Discover Thailand: Add Sightseeing</title>

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
			<div class="panel-heading">Add Sightseeing</div>
			<div class="panel-body">
				<form:form class="form-horizontal" role="form"
					commandName="sightseeing" action="./" method="post">

					<div class="form-group">
						<label class="col-sm-2 control-label">Sightseeing Name: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="name"
								placeholder="name" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="name" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">Description: </label>
						<div class="col-sm-7">
							<form:input type="description" cssClass="form-control" path="description"
								placeholder="description" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="description" cssClass="error" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label">Duration: </label>
						<div class="col-sm-7">
							<form:input type="text" cssClass="form-control" path="durations"
								placeholder="durations" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="durations" cssClass="error" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label">Adult Price: </label>
						<div class="col-sm-7">
							<form:input type="price" cssClass="form-control" path="adultPrice"
								placeholder="adult price" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="adultPrice" cssClass="error" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-sm-2 control-label">Child Price: </label>
						<div class="col-sm-7">
							<form:input type="price" cssClass="form-control" path="childPrice"
								placeholder="child price" autocomplete="off" />
						</div>
						<div class="col-sm-3">
							<form:errors path="childPrice" cssClass="error" />
						</div>
					</div>
								
					<div class="form-group">
						<label class="col-sm-2 control-label">Place:</label>
						<div class="col-sm-7">
							<form:select path="place">
								<form:options items="${places}" itemLabel="name"
									itemValue="id" />
							</form:select>
						</div>
						<div class="col-sm-3">
							<form:errors path="place" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-success">Save</button>
						</div>
					</div>

				</form:form>
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
