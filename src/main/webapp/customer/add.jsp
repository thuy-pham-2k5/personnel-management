<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Customer</title>
    <link rel="stylesheet" href="/style/stylesheet.css">
</head>
<body>
<h1>Add New Customer</h1>

<form class="mb-2" action="/customer?action=add" method="post">
    <div class="mb-3">
        <label for="linkImage" class="form-label">Image Url</label>
        <input id="linkImage" type="text" class="form-control" name="imageUrl"  aria-describedby="imageNotice">
    </div>
    <div class="mb-3">
        <label for="linkName" class="form-label">Name</label>
        <input id="linkName" type="text" class="form-control" name="name" aria-describedby="nameNotice" >
    </div>
    <div class="mb-3">
        <label for="linkPhone" class="form-label">Phone</label>
        <input id="linkPhone" type="text" class="form-control" name="phone" aria-describedby="phoneNotice">
    </div>
    <div class="mb-3">
        <label for="linkEmail" class="form-label">Email</label>
        <input id="linkEmail" type="text" class="form-control" name="email" aria-describedby="emailNotice">
    </div>
    <div class="mb-3">
        <label for="linkAddress" class="form-label">Address</label>
        <input id="linkAddress" type="text" class="form-control" name="address" aria-describedby="addressNotice">
    </div>
    <button type="submit" class="btn btn-primary">Add</button>
</form>
</body>
</html>
