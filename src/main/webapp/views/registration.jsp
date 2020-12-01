<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Register new account</title>
    <link rel="icon" href="../resources/img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="../resources/css/core-style.css">
    <link rel="stylesheet" href="../resources/css/style.css">
</head>

<body>
<div class="main-content-wrapper d-flex clearfix">
    <jsp:include page="pages/header.jsp"></jsp:include>

    <div class="cart-table-area section-padding-100">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12 col-lg-8">
                    <div class="checkout_details_area mt-50 clearfix">
                        <div class="cart-title">
                            <h2>Create new account</h2>
                        </div>

                        <form:form method="POST" modelAttribute="userForm" class="form-signin">
                            <div class="row">

                                <spring:bind path="email">
                                    <div class="form-group col-12 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="email" path="email" class="form-control" placeholder="Email" autofocus="true"></form:input>
                                        <form:errors path="email"></form:errors>
                                    </div>
                                </spring:bind>

                                <spring:bind path="password">
                                    <div class="form-group col-12 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                                        <form:errors path="password"></form:errors>
                                    </div>
                                </spring:bind>

                                <spring:bind path="name">
                                    <div class="form-group col-12 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="text" path="name" class="form-control" placeholder="Name"></form:input>
                                        <form:errors path="name"></form:errors>
                                    </div>
                                </spring:bind>

                                <spring:bind path="birthday">
                                    <div class="form-group col-md-6 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="date" path="birthday" class="form-control" placeholder="Date"></form:input>
                                        <form:errors path="birthday"></form:errors>
                                    </div>
                                </spring:bind>

                                <spring:bind path="phone">
                                    <div class="form-group col-md-6 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="number" path="phone" class="form-control" placeholder="Phone"></form:input>
                                        <form:errors path="phone"></form:errors>
                                    </div>
                                </spring:bind>





<%--                                <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>--%>

                                <div class="cart-btn mt-10">
                                    <button class="btn amado-btn w-100">Submit</button>
                                </div>
                            </div>
                        </form:form>


                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="pages/footer.jsp"></jsp:include>

<!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
<script src="../resources/js/jquery/jquery-2.2.4.min.js"></script>
<script src="../resources/js/popper.min.js"></script>
<script src="../resources/js/bootstrap.min.js"></script>
<script src="../resources/js/plugins.js"></script>
<script src="../resources/js/active.js"></script>
<%-- Custom --%>
<script src="../resources/js/custom/registration.js"></script>
</body>
</html>