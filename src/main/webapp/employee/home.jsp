<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<div style="background: center; margin: 0 auto">
    <h1>Employee List</h1>
    <a href="/employees?action=add"><button>Add new employee</button></a>
</div>
<div>
    <form action="/employees?action=search" method="get">
        <input type="text" name="keyword"/>
        <input type="submit" value="Search"/>
    </form>
</div>
<div>
    <table class="table" border="1" >
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Age</th>
            <th scope="col">Position</th>
            <th scope="col">Department</th>
            <th scope="col">Salary</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody >
            <c:forEach items="${employees}" var="employee">
                <tr>
                    <td>${employee.getId()}</td>
                    <td>${employee.getName()}</td>
                    <td>${employee.getAge()}</td>
                    <td>${employee.getPosition()}</td>
                    <td>${employee.getDepartment()}</td>
                    <td>${employee.getSalary()}</td>
                    <td>
                        <a href="/employees?action=view&id=${employee.id}"><button>View</button></a>
                        <a href="/employees?action=edit&id=${employee.id}"><button>Edit</button></a>
                        <a href="/employees?action=delete&id=${employee.id}"><button>Delete</button></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
