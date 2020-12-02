<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%-- Stile --%>
<link rel="stylesheet" href="../../resources/css/core-style.css">
<link rel="stylesheet" href="../../resources/css/style.css">


<!-- Search Wrapper Area Start -->
<div class="search-wrapper section-padding-100">
    <div class="search-close">
        <i class="fa fa-close" aria-hidden="true"></i>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="search-content">
                    <form action="#" method="get">
                        <input type="search" name="search" id="search" placeholder="Type book name...">
                        <button type="submit"><img src="../../resources/img/search.png" alt=""></button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Search Wrapper Area End -->

<!-- Mobile Nav (max width 767px)-->
<div class="mobile-nav">
    <!-- Navbar Brand -->
    <div class="amado-navbar-brand">
        <a href="index.html"><img src="../../resources/img/logotype.png" alt=""></a>
    </div>
    <!-- Navbar Toggler -->
    <div class="amado-navbar-toggler">
        <span></span><span></span><span></span>
    </div>
</div>

<!-- Header Area Start -->
<header class="header-area clearfix">
    <!-- Close Icon -->
    <div class="nav-close">
        <i class="fa fa-close" aria-hidden="true"></i>
    </div>
    <!-- Logo -->
    <div class="logo">
        <a href="index.html"><img src="../../resources/img/logotype.png" alt="logo"></a>
    </div>
    <!-- Amado Nav -->
    <nav class="amado-nav">
        <ul>
            <li>
                <a href="/account">
                    <c:choose>
                        <c:when test="${!empty pageContext.request.userPrincipal.name}">
                            ${pageContext.request.userPrincipal.name}</c:when>
                        <c:when test="${empty pageContext.request.userPrincipal.name}">Account</c:when>
                    </c:choose>
                </a>
            </li>

            <li><a href="/store">Store</a></li>
            <li><a href="/library">Library</a></li>
            <li><a href="/published">Published</a></li>


<%--            <c:if test="${pageCo}">--%>
<%--                <li><a href="/admin">Admin panel</a></li>--%>
<%--            </c:if>--%>



            <c:if test="${!empty pageContext.request.userPrincipal.name}">
                <li><a href="#">Log out</a></li>
            </c:if>

        </ul>
    </nav>

    <!-- Cart Menu -->
    <div class="cart-fav-search mb-100">
        <a href="#" class="cart-nav"><img src="../../resources/img/cart.png" alt="">Cart <span>(0)</span></a>
        <a href="#" class="fav-nav"><img src="../../resources/img/favorites.png" alt="">Favourite</a>
        <a href="#" class="search-nav"><img src="../../resources/img/search.png" alt="">Search</a>
    </div>
    <!-- Social Button -->
    <div class="social-info d-flex justify-content-between">
        <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
        <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
        <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
        <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
    </div>
</header>
<!-- Header Area End -->

<script src="../../resources/js/jquery/jquery-2.2.4.min.js"></script>
<script src="../../resources/js/popper.min.js"></script>
<script src="../../resources/js/bootstrap.min.js"></script>
<script src="../../resources/js/plugins.js"></script>
<script src="../../resources/js/active.js"></script>
<%-- Custom --%>
<script src="../../resources/js/custom/header.js"></script>

