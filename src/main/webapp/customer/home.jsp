<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h1>List Customer</h1>
<a href="/customer?action=add"><button class="btn btn-success">Add</button></a>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Image</th>
        <th scope="col">Name</th>
        <th scope="col">Phone</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <th>${customer.getId()}</th>
            <td><img src="${customer.getImageUrl()}" alt="Image Error"></td>
            <td>${customer.getName()}</td>
            <td>${customer.getPhone()}</td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
            <td>
                <a href="/customer?action=view&id=${customer.id}"><button class="btn btn-light">View</button></a>
                <a href="/customer?action=edit&id=${customer.id}"><button class="btn btn-primary">Update</button></a>
                <a href="/customer?action=delete&id=${customer.id}"><button class="btn btn-danger">Delete</button></a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>