<%-- 
    Document   : QLKL
    Created on : Aug 31, 2022, 9:22:18 PM
    Author     : ManhHuy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<link href="<c:url value="/resources/css/QL.css"/>" rel="stylesheet" />
<body>
    <div id="layoutSidenav_content"">
        <div class="table-responsive">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2><b>Quản Lý Khóa Luận</b></h2>
                        </div>
                        <div class="col-sm-6">
                            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Thêm</span></a>
                            <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Xóa</span></a>						
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="selectAll">
                                    <label for="selectAll"></label>
                                </span>
                            </th>
                            <th>Tên khóa luận</th>
                            <th>HDBV</th>
                            <th>Ngày bắt đầu</th>
                            <th>Sinh viên</th>
                            <th>Tiêu chí chấm điểm</th>
                            <th>Đề tài</th>
                            <th>Điểm số</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                    <label for="checkbox1"></label>
                                </span>
                            </td>
                            <td>Khoa luan 1</td>
                            <td>hihi</td>
                            <td>1/7/2001</td>
                            <td>Huy</td>
                            <td>Dep trai</td>
                            <td>qlkl</td>
                            <td>10</td>
                            <td>
                                <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>        
    </div>
    <!-- Edit Modal HTML -->
    <div id="addEmployeeModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form>
                    <div class="modal-header">						
                        <h4 class="modal-title">Thêm</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">					
                        <div class="form-group">
                            <label>Tên khóa luận</label>
                            <input type="tenkhoaluan" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>HDBV</label>
                            <div class="form-group">
                                <select class="form-control" id="mc" name="medicine_id">
                                    <option></option>
                                    <c:forEach items="${Hdbv}" var="c">
                                        <option>{c.id}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Ngày bắt đầu</label>
                            <textarea class="form-control" required></textarea>
                        </div>
                        <div class="form-group">
                            <label>Sinh viên</label>
                            <input type="sinhvien" class="form-control" required>
                        </div>	
                        <div class="form-group">
                            <label>Tiêu chí chấm điểm</label>
                            <input type="tieuchichamdiem" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Đề tài</label>
                            <textarea class="form-control" required></textarea>
                        </div>
                        <div class="form-group">
                            <label>Điểm số</label>
                            <input type="diem" class="form-control" required>
                        </div>	
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- Edit Modal HTML -->
    <div id="editEmployeeModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form>
                    <div class="modal-header">						
                        <h4 class="modal-title">Chỉnh sửa</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">					
                        <div class="form-group">
                            <label>Tên khóa luận</label>
                            <input type="tenkhoaluan" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>HDBV</label>
                            <input type="hdbv" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Ngày bắt đầu</label>
                            <textarea class="form-control" required></textarea>
                        </div>
                        <div class="form-group">
                            <label>Sinh viên</label>
                            <input type="sinhvien" class="form-control" required>
                        </div>	
                        <div class="form-group">
                            <label>Tiêu chí chấm điểm</label>
                            <input type="tieuchichamdiem" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Đề tài</label>
                            <textarea class="form-control" required></textarea>
                        </div>
                        <div class="form-group">
                            <label>Điểm số</label>
                            <input type="diem" class="form-control" required>
                        </div>			
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Thoát">
                        <input type="submit" class="btn btn-info" value="Lưu">
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- Delete Modal HTML -->
    <div id="deleteEmployeeModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form>
                    <div class="modal-header">						
                        <h4 class="modal-title">Xóa</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">					
                        <p>Are you sure you want to delete these Records?</p>
                        <p class="text-warning"><small>This action cannot be undone.</small></p>
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Thoát">
                        <input type="submit" class="btn btn-danger" value="Xóa">
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>
