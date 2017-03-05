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

		<c:choose>
			<c:when test="${userForm['new']}">
				<h1>Add Employee</h1>
			</c:when>
			<c:otherwise>
				<h1>Update Employee</h1>
			</c:otherwise>
		</c:choose>
		<br />

		<spring:url value="/users" var="userActionUrl" />

		<form:form class="form-horizontal" method="post"
			modelAttribute="userForm" action="${userActionUrl}">

			<form:hidden path="id" />

			<spring:bind path="name">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Name</label>
					<div class="col-sm-10">
						<form:input path="name" type="text" class="form-control" id="name"
							placeholder="Name" />
						<form:errors path="name" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<spring:bind path="joiningDate">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Joining Date</label>
					<div class="col-sm-10">
						<form:input path="joiningDate" type="date" class="form-control"
							id="joiningDate" placeholder="Select date..." />
						<form:errors path="joiningDate" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<spring:bind path="salary">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Salary</label>
					<div class="col-sm-10">
						<form:input path="salary" type="number" class="form-control"
							id="salary" placeholder="Salary" />
						<form:errors path="salary" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<spring:bind path="ssn">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Password</label>
					<div class="col-sm-10">
						<form:input path="ssn" type="text" class="form-control" id="ssn"
							placeholder="Social Security Number" />
						<form:errors path="ssn" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<c:choose>
						<c:when test="${userForm['new']}">
							<button type="submit" class="btn-lg btn-primary pull-right">Add
							</button>
						</c:when>
						<c:otherwise>
							<button type="submit" class="btn-lg btn-primary pull-right">Update
							</button>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</form:form>

		<jsp:include page="../fragments/footer.jsp" />
	</section>

</body>
</html>