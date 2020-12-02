<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bookshelf welcome</title>

    <!-- Favicon  -->
    <link rel="icon" href="../../resources/img/favicon.ico">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="../../resources/css/core-style.css">
    <link rel="stylesheet" href="../../resources/css/style.css">
</head>
<body>


<div class="main-content-wrapper d-flex clearfix">
    <jsp:include page="../pages/header.jsp"></jsp:include>

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12 col-lg-8">
                        <div class="checkout_details_area mt-50 clearfix">
                            <div class="cart-title">
                                <h2>Admin panel</h2>
                            </div>
                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <a href="/admin-orders" class="btn amado-btn form-control">Orders</a>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <a href="/admin-accounts" class="form-control btn amado-btn">Accounts</a>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <a href="/admin-books" class="form-control btn amado-btn">Books</a>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <a href="/admin-genres" class="form-control btn amado-btn">Genres</a>
                                </div>
                            </div>
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