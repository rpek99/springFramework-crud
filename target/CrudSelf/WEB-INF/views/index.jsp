<html>

    <head>
        <%@include file="./base.jsp" %>

        <title>Home</title>
    </head>

    <body>

        <div class="container mt-3">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center mb-3">Customers Page</h1>

                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">First Name</th>
                                <th scope="col">Last Name</th>
                                <th scope="col">Age</th>
                                <th scope="col">Address</th>
                                <th scope="col">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${customers}" var="customer">
                            <tr>
                                <th scope="row">${customer.id}</th>
                                <td>${customer.f_name}</td>
                                <td>${customer.l_name}</td>
                                <td>${customer.age}</td>
                                <td>${customer.address}</td>
                                <td>
                                    <a class="btn btn-success" href="update_customer/${customer.id}" role="button">Update</a>
                                    <a class="btn btn-danger" href="delete_customer/${customer.id}" role="button">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table><br>

                    <div style="text-align: center">
                        <a class="btn btn-dark" href="add_customer" role="button">Add Customer</a>
                    </div>

                </div>
            </div>
        </div>
    </body>

</html>
