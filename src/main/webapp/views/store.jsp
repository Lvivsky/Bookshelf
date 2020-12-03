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

    <div class="products-catagories-area clearfix">
        <div class="amado-pro-catagory clearfix">

            <c:forEach items="${books}" var="e">
            <div class="single-products-catagory clearfix">
                <a href="${'/book-page/'.concat(e.id)}">
                    <img src="../resources/img/book-default.png" alt="book img">
                    <!-- Hover Content -->
                    <div class="hover-content">
                        <div class="line"></div>
                        <c:if test="${e.price == 0}">
                            <p>Free</p>
                        </c:if>
                        <c:if test="${e.price != 0}">
                            <p>From ${e.price}</p>
                        </c:if>
                        <h4>${e.title}</h4>
                        <h6>${e.account.email}</h6>
                    </div>
                </a>
            </div>
            </c:forEach>

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