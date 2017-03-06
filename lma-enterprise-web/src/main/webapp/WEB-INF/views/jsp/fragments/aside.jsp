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
					class="nav-label">Home</span></a></li>
			<li class="has-submenu"><a href="#"><i
					class="fa fa-users"></i> <span class="nav-label">Users</span></a>
				<ul class="list-unstyled">
					<li><a href="${urlAddUser}">Add user</a></li>
					<li><a href="${urlHome}">List users</a></li>
				</ul></li>
		</ul>
	</nav>

</aside>
<!-- Aside Ends-->