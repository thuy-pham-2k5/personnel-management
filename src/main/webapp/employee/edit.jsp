<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/10/2024
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1 style="text-align: center; margin: 0 auto">Add New Employee</h1>
<br>
<div class="form-container">
    <form action="/employees?action=edit&id=${employee.id}" method="post">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp" size="30" value="${employee.name}">
        </div>
        <div class="mb-3">
            <label class="form-label">Age</label>
            <input type="text" class="form-control" id="age" name="age" aria-describedby="emailHelp" size="30" value="${employee.age}">
        </div>
        <div class="mb-3">
            <label class="form-label">Position</label>
            <input type="text" class="form-control" id="position" name="position" aria-describedby="emailHelp" size="30" value="${employee.position}">
        </div>
        <div class="mb-3">
            <label class="form-label">Department</label>
            <input type="text" class="form-control" id="department" name="department" aria-describedby="emailHelp" size="30" value="${employee.department}">
        </div>
        <div class="mb-3">
            <label class="form-label">Salary</label>
            <input type="text" class="form-control" id="salary" name="salary" aria-describedby="emailHelp" size="30" value="${employee.salary}">
        </div>
        <button type="submit" class="btn btn-primary">Edit</button>
    </form>
</div>
</body>
</html>
