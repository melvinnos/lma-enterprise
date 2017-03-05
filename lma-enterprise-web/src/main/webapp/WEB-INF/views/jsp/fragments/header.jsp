<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Spring Hibernate Example - Brio Bootstrap Admin Template
	+ AngularJS</title>

<spring:url value="/resources/css/bootstrap/bootstrap.css"
	var="bootstrapCss" />
<spring:url value="/resources/css/plugins/calendar/calendar.css"
	var="calendarCss" />
<spring:url value="/resources/css/app/app.v1.css" var="baseStylingCss" />

<meta name="description"
	content="J2E App test with Brio bootstrap template">
<meta name="author" content="Melvin Moreno">

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="${bootstrapCss}" />

<!-- Calendar Styling  -->
<link rel="stylesheet" href="${calendarCss}" />

<!-- Fonts  -->
<link
	href='http://fonts.googleapis.com/css?family=Raleway:400,500,600,700,300'
	rel='stylesheet' type='text/css'>

<!-- Base Styling  -->
<link rel="stylesheet" href="${baseStylingCss}" />

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<jsp:include page="../fragments/aside.jsp" />