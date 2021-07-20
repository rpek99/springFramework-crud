<html>

<head>
    <%@include file="./base.jsp" %>

    <title>Home</title>
</head>

<body>

<div class="container mt-3">
    <div class="row">
        <div class="col-md-12">
            <h1 class="text-center mb-3">Update Customer</h1>

            <form action="${pageContext.request.contextPath}/action" method="post">

                <input type="hidden" name="id" value="${customer.id}" >

                <div class="form-group">
                    <label for="f_name">First Name</label>
                    <input
                            type="text"
                            class="form-control"
                            id="f_name"
                            placeholder="Enter Your First Name"
                            name="f_name"
                            value="${customer.f_name}">
                </div><br>
                <div class="form-group">
                    <label for="l_name">Last Name</label>
                    <input
                            type="text"
                            class="form-control"
                            id="l_name"
                            placeholder="Enter Your Last Name"
                            name="l_name"
                            value="${customer.l_name}">
                </div><br>
                <div class="form-group">
                    <label for="age">Age</label>
                    <input
                            type="number"
                            class="form-control"
                            id="age"
                            placeholder="Enter Your Age"
                            name="age"
                            value="${customer.age}">
                </div><br>
                <div class="form-group">
                    <label for="address">Address</label>
                    <input
                            type="text"
                            class="form-control"
                            id="address"
                            placeholder="Enter Your Address"
                            name="address"
                            value="${customer.address}">
                </div><br>

                <div style="text-align: center">
                    <a class="btn btn-dark" href="${pageContext.request.contextPath}/" role="button">Back</a>
                    <button type="submit" class="btn btn-primary">Update Customer</button>
                </div>
            </form>

        </div>
    </div>
</div>
</body>

</html>
