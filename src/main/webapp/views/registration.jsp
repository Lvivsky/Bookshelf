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
                            <h2>Registration</h2>
                        </div>

                        <form>
                            <div class="row">

                                <div class="col-12 mb-3">
                                    <input type="email" class="form-control" id="" placeholder="Email" value="">
                                </div>

                                <div class="col-12 mb-3">
                                    <input type="text" class="form-control" id="" value="" placeholder="Name" required>
                                </div>

                                <div class="col-12 mb-3">
                                    <input type="password" class="form-control" id="" placeholder="Password" value="">
                                </div>
                                <div class="col-12 mb-3">
                                    <input type="password" class="form-control" id="" placeholder="Re password" value="">
                                </div>
                                <div class="col-md-6 mb-3">
                                    <input type="date" class="form-control" id="" placeholder="Birthday" value="">
                                </div>

                                <div class="col-md-6 mb-3">
                                    <input type="number" class="form-control" id="" min="0" placeholder="Phone" value="">
                                </div>

                                <div class="col-12">
                                    <div class="custom-control custom-checkbox d-block mb-2">
                                        <input type="checkbox" class="custom-control-input" id="customCheck2">
                                        <label class="custom-control-label" for="customCheck2">Create an accout</label>
                                    </div>
                                </div>

                                <div class="cart-btn mt-10">
                                    <a href="#" class="btn amado-btn w-100">Submit</a>
                                </div>

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
<script src="../resources/js/custom/registration.js"></script>
</body>
</html>