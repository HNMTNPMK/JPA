<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC 5 - form handling | Java Guides</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<div class="col-md-offset-2 col-md-7">
			<h3 class="text-center">Spring MVC 5 + Spring Data JPA 2 + JSP + MySQL
				Example - Customer Management</h3>
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Add SinhVien</div>
				</div>
				<div class="panel-body">
					<form:form action="saveSinhVien" cssClass="form-horizontal" method="post" modelAttribute="sinhvien">
						<div class="form-group">
							<label for="masv" class="col-md-3 control-label">Mã SinhVien</label>
							<div class="col-md-9">
								<form:input path="masv" cssClass="form-control" required="required" maxlength="250" />
								<form:errors path="masv" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="cccd" class="col-md-3 control-label">CCCD</label>
							<div class="col-md-9">
								<form:input path="cccd" cssClass="form-control" maxlength="250" />
								<form:errors path="cccd" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="diachihientai" class="col-md-3 control-label">Địa Chỉ Hiện Tại</label>
							<div class="col-md-9">
								<form:input path="diachihientai" cssClass="form-control" maxlength="250" />
								<form:errors path="diachihientai" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="gioitinh" class="col-md-3 control-label">Giới Tính</label>
							<div class="col-md-9">
								<form:input path="gioitinh" cssClass="form-control" maxlength="250" />
								<form:errors path="gioitinh" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="hoten" class="col-md-3 control-label">Họ Tên</label>
							<div class="col-md-9">
								<form:input path="hoten" cssClass="form-control" required="required" maxlength="250" />
								<form:errors path="hoten" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="ngaysinh" class="col-md-3 control-label">Ngày Sinh</label>
							<div class="col-md-9">
								<form:input path="ngaysinh" type="date" cssClass="form-control" />
								<form:errors path="ngaysinh" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="quequan" class="col-md-3 control-label">Quê Quán</label>
							<div class="col-md-9">
								<form:input path="quequan" cssClass="form-control" maxlength="250" />
								<form:errors path="quequan" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<label for="khoahoc" class="col-md-3 control-label">Khoa Hoc</label>
							<div class="col-md-9">
								<form:input path="khoahoc" cssClass="form-control" maxlength="250" />
								<form:errors path="khoahoc" cssClass="error" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-offset-3 col-md-9">
								<form:button cssClass="btn btn-primary">Submit</form:button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
