<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recruiter Detail Form</title>
<!-- user form -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">

				<c:if test="${recruiterDetail != null}">
					<form action="/PBL3/recruiter-detail-update" method="post">
				</c:if>
				<c:if test="${recruiterDetail == null}">
					<form action="/PBL3/recruiter-detail-insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${recruiterDetail != null}">
            			Edit Introduce
            		</c:if>
						<c:if test="${recruiterDetail == null}">
            			Build Introduce
            		</c:if>
					</h2>
				</caption>

				<c:if test="${recruiterDetail != null}">
					<input type="hidden" name="id" value="<c:out value='${recruiterDetail.idRecruiter}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Description</label> <input type="text"
						value="<c:out value='${recruiterDetail.description}' />" class="form-control"
						name="description" required="required" >
				</fieldset>

				<fieldset class="form-group">
					<label>Link web</label> <input type="text"
						value="<c:out value='${recruiterDetail.web}' />" class="form-control"
						name="web">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Country</label> <input type="text"
						value="<c:out value='${country.name}' />" class="form-control"
						name="country">
				</fieldset>

				
				<fieldset class="form-group">
					<label>Image</label> <input type="text"
						value="<c:out value='${recruiterDetail.img}' />" class="form-control"
						name="img">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>