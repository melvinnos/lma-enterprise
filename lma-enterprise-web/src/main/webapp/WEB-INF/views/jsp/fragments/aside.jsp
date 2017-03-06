<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url value="/" var="urlHome" />
<spring:url value="/users/add" var="urlAddUser" />
<spring:url value="/resources/images/avtar/user5.png"
	var="avatarImg" />

<aside class="left-panel">

	<div class="user text-center">
		<img src="${avatarImg}" class="img-circle" alt="...">
		<h4 class="user-name">Melvin Moreno</h4>

		<div class="dropdown user-login">
			<button class="btn btn-xs dropdown-toggle btn-rounded" type="button"
				data-toggle="dropdown" aria-expanded="true">
				<i class="fa fa-circle status-icon available"></i> Available <i
					class="fa fa-angle-down"></i>
			</button>
			<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
				<li role="presentation"><a role="menuitem" href="#"><i
						class="fa fa-circle status-icon busy"></i> Busy</a></li>
				<li role="presentation"><a role="menuitem" href="#"><i
						class="fa fa-circle status-icon invisibled"></i> Invisible</a></li>
				<li role="presentation"><a role="menuitem" href="#"><i
						class="fa fa-circle status-icon signout"></i> Sign out</a></li>
			</ul>
		</div>
	</div>



	<nav class="navigation">
		<ul class="list-unstyled">
			<li class="active"><a href="#"><i class="fa fa-bookmark-o"></i><span
					class="nav-label">Dashboard</span></a></li>
			<li class="has-submenu"><a href="#"><i
					class="fa fa-comment-o"></i> <span class="nav-label">Users</span></a>
				<ul class="list-unstyled">
					<li><a href="${urlAddUser}">Add user</a></li>
					<li><a href="${urlHome}">List users</a></li>
				</ul></li>
			<li class="has-submenu"><a href="#"><i class="fa fa-flag-o"></i>
					<span class="nav-label">UI Elements</span></a>
				<ul class="list-unstyled">
					<li><a href="uielements-general.html">General Elements</a></li>
					<li><a href="buttons.html">Buttons</a></li>
					<li><a href="icons.html">Icons</a></li>
					<li><a href="typography.html">Typography</a></li>
					<li><a href="grid.html">Grid</a></li>
					<li><a href="panels.html">Panels</a></li>
				</ul></li>
			<li class="has-submenu"><a href="#"><i
					class="fa fa-file-text-o"></i> <span class="nav-label">Forms</span></a>
				<ul class="list-unstyled">
					<li><a href="forms-element.html">General Elements</a></li>
					<li><a href="forms-validation.html">Form Validation</a></li>
					<li><a href="wysihtml.html">Wysihtml</a></li>
					<li><a href="file-upload.html">File Upload</a></li>
					<li><a href="image-crop.html">Image Crop</a></li>
				</ul></li>
			<li class="has-submenu"><a href="#"><i class="fa fa-heart-o"></i>
					<span class="nav-label">Table &amp; Grid</span></a>
				<ul class="list-unstyled">
					<li><a href="basic-tables.html">Basic Tables</a></li>
					<li><a href="data-tables.html">Data Table</a></li>
				</ul></li>
			<li class="has-submenu"><a href="#"><i class="fa fa-code"></i>
					<span class="nav-label">Charts</span></a>
				<ul class="list-unstyled">
					<li><a href="chart-variants.html">Chart Variants</a></li>
					<li><a href="gauges.html">Gauges</a></li>
					<li><a href="vector-maps.html">Vector Maps</a></li>
					<li><a href="range-selector.html">Range Selector</a></li>
				</ul></li>
			<li class="has-submenu"><a href="#"><i class="fa fa-star-o"></i>
					<span class="nav-label">Plugins &amp; More</span></a>
				<ul class="list-unstyled">
					<li><a href="404.html">404 Page</a></li>
					<li><a href="invoice.html">Invoice</a></li>
					<li><a href="elfinder.html">File Manager</a></li>
					<li><a href="google-maps.html">Google Maps</a></li>
					<li><a href="signin.html">Signin</a></li>
					<li><a href="signup.html">Signup</a></li>
					<li><a href="search.html">Search</a></li>
					<li><a href="full-screen.html">Full Screen</a></li>
					<li><a href="blank.html">Blank Page</a></li>

				</ul></li>
		</ul>
	</nav>

</aside>
<!-- Aside Ends-->