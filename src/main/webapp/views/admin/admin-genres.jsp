<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Admin genres</title>

    <!-- Favicon  -->
    <link rel="icon" href="../../resources/img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="../../resources/css/core-style.css">
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>


<div class="main-content-wrapper d-flex clearfix">
    <jsp:include page="../pages/header.jsp"></jsp:include>

<%--    <div class="cart-table-area section-padding-100">--%>
<%--        <div class="container-fluid">--%>
<%--            <div class="row">--%>
<%--                <div class="col-12 col-lg-8">--%>
<%--                    <div class="checkout_details_area mt-50 clearfix">--%>

<%--                        <div class="row">--%>
<%--                            <div class="col-md-3 mb-3">--%>
<%--                                <a href="/admin" class="btn amado-btn form-control"><-</a>--%>
<%--                            </div>--%>
<%--                            <div class="cart-title col-md-6 mb-3">--%>
<%--                                <h2>Genres</h2>--%>
<%--                            </div>--%>

<%--                            <form:form method="POST" modelAttribute="genreForm">--%>
<%--                                <spring:bind path="name">--%>
<%--                                    <div class="form-control col-6 mb-3 ${status.error ? 'has-error' : ''}">--%>
<%--                                        <form:input type="text" path="name" placeholder="Genre name"></form:input>--%>
<%--                                        <form:errors path="name"></form:errors>--%>
<%--                                    </div>--%>
<%--                                </spring:bind>--%>
<%--                                <div class="cart-btn mt-10">--%>
<%--                                    <button class="btn amado-btn w-25">Add</button>--%>
<%--                                </div>--%>
<%--                            </form:form>--%>
<%--                        </div>--%>



<%--                        <table style="font-size: 10px">--%>
<%--                            <thead>--%>
<%--                                <td>--%>
<%--                                    <th>Id</th>--%>
<%--                                    <th>Genre</th>--%>
<%--                                    <th></th>--%>
<%--                                </td>--%>
<%--                            </thead>--%>
<%--                            <tbody>--%>
<%--                            <c:forEach items="${genres}" var="e">--%>
<%--                                <tr>--%>
<%--                                    <td>${e.id}</td>--%>
<%--                                    <td>${e.name}</td>--%>
<%--                                    <td>--%>
<%--                                        <a href="#" class="text-warning">edit </a>--%>
<%--                                        <a href="#" class="text-danger">delete</a>--%>
<%--                                    </td>--%>
<%--                                </tr>--%>
<%--                            </c:forEach>--%>
<%--                            </tbody>--%>
<%--                        </table>--%>

<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>




    <div class="cart-table-area section-padding-100">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12 col-lg-8">
                    <div class="col-md-3 mb-3">
                        <a href="/admin" class="btn amado-btn form-control"><-</a>
                    </div>
                    <div class="cart-title mt-50">
                        <h2>Genres</h2>
                    </div>

                    <div class="cart-table clearfix">
                        <table class="table table-responsive">
                            <thead>
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th></th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${genres}" var="e">
                                <tr>
                                    <td>${e.id}</td>
                                    <td>${e.name}</td>
                                    <td>
                                        <a href="#" class="text-warning">edit</a>
                                    </td>
                                    <td>
                                        <a href="${'/admin-genres/delete/'.concat(e.id)}" class="text-danger">delete</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-12 col-lg-4">
                    <div class="cart-summary">
                        <h5>Add new genre</h5>

                        <form:form method="POST" modelAttribute="genreForm">
                            <spring:bind path="name">
                                <div class="form-group col-12 mb-3 mt-5 ${status.error ? 'has-error' : ''}">
                                    <form:input type="text" path="name" class="form-control" placeholder="Name"></form:input>
                                    <form:errors path="name"></form:errors>
                                </div>
                            </spring:bind>

                            <div class="cart-btn mt-100">
                                <button class="btn amado-btn w-100">Add</button>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>





</div>



<jsp:include page="../pages/footer.jsp"></jsp:include>

<!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
<script src="../../resources/js/jquery/jquery-2.2.4.min.js"></script>
<script src="../../resources/js/popper.min.js"></script>
<script src="../../resources/js/bootstrap.min.js"></script>
<script src="../../resources/js/plugins.js"></script>
<script src="../../resources/js/active.js"></script>
<%-- Custom --%>
<script src="../../resources/js/admin.js"></script>
</body>
</html>