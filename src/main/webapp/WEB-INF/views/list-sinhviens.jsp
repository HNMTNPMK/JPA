<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý Sinh Viên</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<%@ page isELIgnored="false"%>
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
    <div class="container">
        <div class="col-md-offset-1 col-md-10">
            <h3 class="text-center">Quản lý Sinh Viên</h3>
            <hr />

            <input type="button" value="Thêm Sinh Viên"
                onclick="window.location.href='showForm'; return false;"
                class="btn btn-primary" /> <br />
            <br />
            <div class="panel panel-info">
                <div class="panel-heading">
                    <div class="panel-title">Danh Sách Sinh Viên</div>
                </div>
                <div class="panel-body">
                    <table class="table table-striped table-bordered">
                        <tr>
                            <th>Mã Sinh Viên</th>
                            <th>Họ Tên</th>
                            <th>Ngày Sinh</th>
                            <th>Địa Chỉ Hiện Tại</th>
                            <th>CCCD</th>
                            <th>Giới Tính</th>
                            <th>Quê Quán</th>
                            <th>Khoa Học</th>
                            <th>Action</th>
                        </tr>

                        <!-- loop over and print our Sinh Viên -->
                        <c:forEach var="sinhVien" items="${sinhViens}">

                            <!-- construct an "update" link with Sinh Viên id -->
                            <c:url var="updateLink" value="/sinhvien/editSinhVien">
                                <c:param name="id" value="${sinhVien.masv}" />
                            </c:url>

                            <!-- construct a "delete" link with Sinh Viên id -->
                            <c:url var="deleteLink" value="/sinhvien/deleteSinhVien">
                                <c:param name="id" value="${sinhVien.masv}" />
                            </c:url>

                            <tr>
                                <td>${sinhVien.masv}</td>
                                <td>${sinhVien.hoten}</td>
                                <td>${sinhVien.ngaysinh}</td>
                                <td>${sinhVien.diachihientai}</td>
                                <td>${sinhVien.cccd}</td>
                                <td>${sinhVien.gioitinh}</td>
                                <td>${sinhVien.quequan}</td>
                                <td>${sinhVien.khoahoc.tenkhoahoc}</td>
                                <td>
                                    <!-- display the update link -->
                                    <a href="${updateLink}">Sửa</a> |
                                    <a href="${deleteLink}"
                                        onclick="if (!(confirm('Bạn có chắc muốn xóa Sinh Viên này?'))) return false;">Xóa</a>
                                </td>

                            </tr>

                        </c:forEach>

                    </table>

                </div>
            </div>
        </div>

    </div>
    <div class="footer">
        <p>Footer</p>
    </div>
</body>

</html>
