<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
        integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
        crossorigin="anonymous"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit Product</title>
    <style>
        .form-container {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .mb-3 {
            width: 500px;
            margin-bottom: 15px;
        }
    </style>
</head>
<body>
<h1 style="text-align: center; margin: 0 auto">
    ${action=='view' ? 'Information Employee' : 'Edit Information Employee'}
</h1>
<br>
<div class="form-container">
    <form action="/employees?action=${action}&id=${employee.id}" method="post">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp" size="30"
                   value="${employee.name}"
                   <c:if test="${action == 'view'}">readonly</c:if>>
        </div>
        <div class="mb-3">
            <label class="form-label">Age</label>
            <input type="text" class="form-control" id="age" name="age" aria-describedby="emailHelp" size="30"
                   value="${employee.age}"
                   <c:if test="${action == 'view'}">readonly</c:if>>
        </div>
        <div class="mb-3">
            <label class="form-label">Position</label>
            <input type="text" class="form-control" id="position" name="position" aria-describedby="emailHelp" size="30"
                   value="${employee.position}"
                   <c:if test="${action == 'view'}">readonly</c:if>>
        </div>
        <div class="mb-3">
            <label class="form-label">Department</label>
            <input type="text" class="form-control" id="department" name="department" aria-describedby="emailHelp"
                   size="30" value="${employee.department}"
                   <c:if test="${action == 'view'}">readonly</c:if>>
        </div>
        <div class="mb-3">
            <label class="form-label">Salary</label>
            <input type="text" class="form-control" id="salary" name="salary" aria-describedby="emailHelp" size="30"
                   value="${employee.salary}"
                   <c:if test="${action == 'view'}">readonly</c:if>>
        </div>
        <button type="submit" class="btn btn-primary">
            ${param.action == 'view' ? 'Back' : 'Edit'}
        </button>
    </form>
</div>
</body>
</html>
