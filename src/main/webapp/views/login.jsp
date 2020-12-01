<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
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
                                <h2>Login</h2>
                            </div>
                            <form>
                                <div class="row">
                                    <div class="col-12 mb-3">
                                        <input type="email" class="form-control" id="email" placeholder="Email" value="">
                                    </div>
                                    <div class="col-12 mb-3">
                                        <input type="password" class="form-control mb-3" id="street_address" placeholder="Password" value="">
                                    </div>
                                </div>

                                <div class="cart-btn mt-10">
                                    <button id="login" class="btn amado-btn w-100">Submit</button>
                                </div>
                                <div class="cart-btn mt-30">
                                    <button id="toRegister" class="btn amado-btn w-100">Registration</button>
                                </div>
                            </form>
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
<script src="../resources/js/custom/login.js"></script>
</body>
</html>