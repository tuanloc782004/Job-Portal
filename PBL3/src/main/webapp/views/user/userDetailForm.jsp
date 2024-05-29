<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Detail Form</title>
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

				<c:if test="${userDetail != null}">
					<form action="/PBL3/user-detail-update" method="post">
				</c:if>
				<c:if test="${userDetail == null}">
					<form action="/PBL3/user-detail-insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${userDetail != null}">
            			Edit Resume
            		</c:if>
						<c:if test="${userDetail == null}">
            			Build Resume
            		</c:if>
					</h2>
				</caption>

				<c:if test="${userDetail != null}">
					<input type="hidden" name="id" value="<c:out value='${userDetail.idUser}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Category</label> <input type="text"
						value="<c:out value='${category.name}' />" class="form-control"
						name="category" required="required" >
				</fieldset>

				<fieldset class="form-group">
					<label>Location</label> <input type="text"
						value="<c:out value='${location.name}' />" class="form-control"
						name="location">
				</fieldset>

				<fieldset class="form-group">
					<label>Work Experience</label> <input type="text"
						value="<c:out value='${userDetail.workExperience}' />" class="form-control"
						name="workExperience">
				</fieldset>

				<fieldset class="form-group">
					<label>Education</label> <input type="text"
						value="<c:out value='${userDetail.education}' />" class="form-control"
						name="education">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Professional Skills</label> <input type="text"
						value="<c:out value='${userDetail.professionalSkills}' />" class="form-control"
						name="professionalSkills">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Image</label> <input type="text"
						value="<c:out value='${userDetail.img}' />" class="form-control"
						name="img">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>