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
    <jsp:include page="pages/header.jsp"/>

        <div class="cart-table-area section-padding-100">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-9 col-lg-7">
                        <div class="single_product_thumb">
                            <div id="product_details_slider" class="carousel slide" data-ride="carousel">
                                <ol class="carousel-indicators">
                                    <li class="active" data-target="#product_details_slider" data-slide-to="0">
                                    </li>
                                    <li data-target="#product_details_slider" data-slide-to="1">
                                    </li>
                                    <li data-target="#product_details_slider" data-slide-to="2">
                                    </li>
                                    <li data-target="#product_details_slider" data-slide-to="3">
                                    </li>
                                </ol>
                                <div class="carousel-inner">

                                    <c:choose>
                                        <c:when test="${empty photos}">
                                            <div class="carousel-item active">
                                                <a class="gallery_img" href="../resources/img/account_default.png">
                                                    <img class="d-block w-100" src="../resources/img/account_default.png" alt="First slide">
                                                </a>
                                            </div>
                                        </c:when>
                                        <c:when test="${!empty photos}">
                                            <c:forEach items="${photos}" var="photo">
                                                <div class="carousel-item">
                                                    <a class="gallery_img" href="img/product-img/pro-big-1.jpg">
                                                        <img class="d-block w-100" src="img/product-img/pro-big-1.jpg" alt="First slide">
                                                    </a>
                                                </div>
                                            </c:forEach>
                                        </c:when>
                                    </c:choose>



                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-lg-5">
                        <div class="single_product_desc">
                            <!-- Product Meta Data -->
                            <div class="product-meta-data">
                                <div class="line"></div>

                                <p><h3>${account.name}</h3></p>
                                <p><a style="font-size:16px" href="mailto:${account.email}">${account.email}</a></p>

                                <!-- Ratings & Review -->
                                <div class="ratings-review mb-15 d-flex align-items-center justify-content-between">
                                    <div class="ratings">
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                        <i class="fa fa-star" aria-hidden="true"></i>
                                    </div>
                                    <div class="review">
                                        <a href="#">Write A Review</a>
                                    </div>
                                </div>
                                <!-- Avaiable -->
                                <p class="avaibility"><i class="fa fa-circle"></i> In Stock</p>
                            </div>

                            <div class="short_overview my-5">
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aliquid quae eveniet culpa officia quidem mollitia impedit iste asperiores nisi reprehenderit consequatur, autem, nostrum pariatur enim?</p>
                            </div>

                            <!-- Add to Cart Form -->
                            <form class="cart clearfix" method="post">
                                <div class="cart-btn d-flex mb-50">
                                    <p>Qty</p>
                                    <div class="quantity">
                                        <span class="qty-minus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty ) &amp;&amp; qty &gt; 1 ) effect.value--;return false;"><i class="fa fa-caret-down" aria-hidden="true"></i></span>
                                        <input type="number" class="qty-text" id="qty" step="1" min="1" max="300" name="quantity" value="1">
                                        <span class="qty-plus" onclick="var effect = document.getElementById('qty'); var qty = effect.value; if( !isNaN( qty )) effect.value++;return false;"><i class="fa fa-caret-up" aria-hidden="true"></i></span>
                                    </div>
                                </div>
                                <button type="submit" name="addtocart" value="5" class="btn amado-btn">Add to cart</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>

</div>



<jsp:include page="pages/footer.jsp"/>

<!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
<script src="../resources/js/jquery/jquery-2.2.4.min.js"></script>
<script src="../resources/js/popper.min.js"></script>
<script src="../resources/js/bootstrap.min.js"></script>
<script src="../resources/js/plugins.js"></script>
<script src="../resources/js/active.js"></script>
</body>
</html>