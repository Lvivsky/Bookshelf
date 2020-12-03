<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Bookshelf welcome</title>

    <!-- Favicon  -->
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
                            <h2>Publish your new book</h2>
                        </div>
                            <form:form method="POST" modelAttribute="bookForm">
                            <div class="row">
                                <spring:bind path="title">
                                    <div class="form-group col-12 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="text" path="title" class="form-control" placeholder="Title" autofocus="true"/>
                                        <form:errors path="title"/>
                                    </div>
                                </spring:bind>
                                <spring:bind path="description">
                                    <div class="form-group col-12 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:textarea path="description" class="form-control" placeholder="Description"/>
                                        <form:errors path="description"/>
                                    </div>
                                </spring:bind>

                                <div class="col-2 mb-3">
                                    <p class="form-control mb-3">Pages</p>
                                </div>

                                <spring:bind path="pageCount">
                                    <div class="form-group col-10 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="number" path="pageCount" class="form-control" value="0"/>
                                        <form:errors path="pageCount"/>
                                    </div>
                                </spring:bind>

                                <div class="col-2 mb-3">
                                    <span class="form-control mb-3">Price</span>
                                </div>

                                <spring:bind path="price">
                                    <div class="form-group col-md-8 mb-3 ${status.error ? 'has-error' : ''}">
                                        <form:input type="number" path="price" class="form-control" value="0"/>
                                        <form:errors path="price"/>
                                    </div>
                                </spring:bind>
                                <div class="col-2 mb-3">
                                    <span class="form-control mb-3">$</span>
                                </div>
                                <div class="col-12 mt-10">
                                    <button class="btn amado-btn w-100">Submit</button>
                                </div>
                            </div>
                            </form:form>
                    </div>
                </div>
                <div class="col-12 col-lg-4">
                    <div class="cart-summary">
                        <h5>Cart Total</h5>
                        <ul class="summary-table">
                            <li><span>subtotal:</span> <span>$140.00</span></li>
                            <li><span>delivery:</span> <span>Free</span></li>
                            <li><span>total:</span> <span>$140.00</span></li>
                        </ul>

                        <div class="payment-method">
                            <!-- Cash on delivery -->
                            <div class="custom-control custom-checkbox mr-sm-2">
                                <input type="checkbox" class="custom-control-input" id="cod" checked>
                                <label class="custom-control-label" for="cod">Cash on Delivery</label>
                            </div>
                            <!-- Paypal -->
                            <div class="custom-control custom-checkbox mr-sm-2">
                                <input type="checkbox" class="custom-control-input" id="paypal">
                                <label class="custom-control-label" for="paypal">Paypal <img class="ml-15" src="img/core-img/paypal.png" alt=""></label>
                            </div>
                        </div>

                        <div class="cart-btn mt-100">
                            <a href="#" class="btn amado-btn w-100">Checkout</a>
                        </div>
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
</body>
</html>