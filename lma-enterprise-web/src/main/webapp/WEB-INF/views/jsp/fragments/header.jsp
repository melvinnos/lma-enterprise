<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
	<title>Spring Hibernate Example - Bootstrap</title>
	
	<spring:url value="/resources/css/hello.css" var="coreCss" />
	<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
	
	<link href="${bootstrapCss}" rel="stylesheet" />
	<link href="${coreCss}" rel="stylesheet" />
	
	<spring:url value="/resources/js/hello.js" var="coreJs" />
	<script src="${coreJs}"></script>
</head>

<spring:url value="/" var="urlHome" />
<spring:url value="/users/add" var="urlAddUser" />

<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Spring Hibernate</a>
		</div>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${urlAddUser}">Add User</a></li>
			</ul>
		</div>
	</div>
</nav>