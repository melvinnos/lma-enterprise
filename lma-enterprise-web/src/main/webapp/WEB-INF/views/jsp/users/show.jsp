<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<body data-ng-app>

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

		<h1>Employee Details</h1>
		<br />

		<div class="row">
			<label class="col-sm-2">ID</label>
			<div class="col-sm-10">${user.id}</div>
		</div>

		<div class="row">
			<label class="col-sm-2">Name</label>
			<div class="col-sm-10">${user.name}</div>
		</div>

		<div class="row">
			<label class="col-sm-2">Joining Date</label>
			<div class="col-sm-10">${user.joiningDate}</div>
		</div>

		<div class="row">
			<label class="col-sm-2">Salary</label>
			<div class="col-sm-10">${user.salary}</div>
		</div>

		<div class="row">
			<label class="col-sm-2">SSN</label>
			<div class="col-sm-10">${user.ssn}</div>
		</div>

		<jsp:include page="../fragments/footer.jsp" />

	</section>

</body>
</html>