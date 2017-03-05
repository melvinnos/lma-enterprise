<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<body data-ng-app>

	<!-- Preloader -->
	<div class="loading-container">
		<div class="loading">
			<div class="l1">
				<div></div>
			</div>
			<div class="l2">
				<div></div>
			</div>
			<div class="l3">
				<div></div>
			</div>
			<div class="l4">
				<div></div>
			</div>
		</div>
	</div>
	<!-- Preloader -->

	<section class="content">

		<c:if test="${not empty msg}">
			<div class="alert alert-${css} alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>${msg}</strong>
			</div>
		</c:if>

		<h1>All Users</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Name</th>
					<th>Joining Date</th>
					<th>Salary</th>
					<th>SSN</th>
					<th>Action</th>
				</tr>
			</thead>

			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.joiningDate}</td>
					<td>${user.salary}</td>
					<td>${user.ssn}</td>
					<td><spring:url value="/users/${user.ssn}" var="userUrl" /> <spring:url
							value="/users/${user.ssn}/delete" var="deleteUrl" /> <spring:url
							value="/users/${user.ssn}/update" var="updateUrl" />

						<button class="btn btn-info" onclick="location.href='${userUrl}'">View</button>
						<button class="btn btn-primary"
							onclick="location.href='${updateUrl}'">Update</button>
						<button class="btn btn-danger"
							onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>
					</td>
				</tr>
			</c:forEach>
		</table>



		<jsp:include page="../fragments/footer.jsp" />

	</section>

</body>
</html>