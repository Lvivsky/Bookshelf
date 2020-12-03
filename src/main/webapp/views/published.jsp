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
                    <div class="cart-title mt-50">
                        <h2>My published</h2>
                    </div>

                    <div class="cart-table clearfix">
                        <table class="table table-responsive">
                            <thead>
                            <tr>
                                <th></th>
                                <th>Title</th>
                                <th>Published date</th>
                                <th>Price</th>
<%--                                <th>Quantity</th>--%>
<%--                                <th>Rate</th>--%>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${books}" var="book">
                            <tr>
                                <td class="cart_product_img">
                                    <a href="#"><img src="..." alt="Product"></a>
                                </td>
                                <td class="cart_product_desc">
                                    <a href="${'/book-page/'.concat(book.id)}">
                                    <h5>${book.title}</h5></a>
                                </td>
                                <td class="cart_product_desc">
                                    <span>${book.publishedDate}</span>
                                </td>
                                <td class="price">
                                    <span>$${book.price}</span>
                                </td>

                            </tr>
                            </c:forEach>
                            </tbody>
                        </table>
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
                        <div class="cart-btn mt-100">
                            <a href="cart.html" class="btn amado-btn w-100">Checkout</a>
                        </div>
                        <div class="cart-btn mt-100">
                            <a href="/create-book" class="btn amado-btn w-100">Add book</a>
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