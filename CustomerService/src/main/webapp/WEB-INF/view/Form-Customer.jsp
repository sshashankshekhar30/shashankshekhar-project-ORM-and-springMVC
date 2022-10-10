<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer Form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container p-3 my-3 bg-success text-white">
		<h1 style="color: yellow; hight: 20px">Enter The Below Details</h1>
		<hr class="text-warning" style="background-color: orange; hight: 6px;">


		<form action="save" method="Post">
			<div class="form-group">

				<input type="hidden" class="form-control" placeholder="Customer Id"
					name="id" value="${customer.id}">
			</div>
			<div class="form-group">

				<input type="text" class="form-control" placeholder="Enter the Customer First Name"
					name="firstName" value="${customer.firstName}">
			</div>
			<div class="form-group">

				<input type="text" class="form-control"
					placeholder="Enter the Customer Last Name" name="lastName"
					value="${customer.lastName}">

			</div>
			<div class="form-group">

				<input type="text" class="form-control" placeholder="Enter Customer E-Mail"
					name="emailId" value="${customer.emailId}">
			</div>
			<div class="form-group form-check">
				<label class="form-check-label"> <input
					class="form-check-input" type="checkbox"> Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-primary">save</button>
		</form>
	</div>
</body>
</html>