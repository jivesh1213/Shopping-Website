
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="https://images-eu.ssl-images-amazon.com/images/I/21rQMjhzuzL._RC|71rAXxFqYRL.css,11-cFHXC3yL.css,31EoLLC7GjL.css,21+aU+R3IiL.css,31wWWC6YAvL.css,11G4HxMtMSL.css,31OvHRW+XiL.css,01XHMOHpK1L.css_.css?AUIClients/AmazonNavigationDesktopMetaAsset#desktop.in.222470-T1">
        <style>
            .mySlides {display:none;}
            .nav-sprite-v1 .nav-sprite, .nav-sprite-v1 .nav-icon {
            background-image: url(https://images-eu.ssl-images-amazon.com/images/G/31/gno/sprites/nav-sprite-global_bluebeacon-V3-1x_optimized._CB468962293_.png);
        }</style>
    </head>
    <body>
        <header>
    
<div id="navbar" class="nav-sprite-v1 celwidget nav-bluebeacon hamburger nav-packard-glow nav-a11y-t1">
    <div id="nav-belt">
        <div class="nav-left" style="width: 217px;">
        <a id="nav-hamburger-menu"><i class="hm-icon nav-sprite"></i></a>
    <div id="nav-logo">
        <a class="nav-logo-link" href="http://localhost:8080/DAmazon_site-war/Homejsp.jsp">
        <span class="nav-sprite nav-logo-base"></span>
    </a>
    <a class="nav-sprite nav-logo-tagline nav-prime-try" href="http://localhost:8080/DAmazon_site-war/Homejsp.jsp">
    Try Prime
    </a>
    </div>
        </div>
    <div class="nav-right">
        <div id="nav-tools" class="layoutToolbarPadding">
              
    <div class="nav-a nav-a-2 icp-link-style-2">
        <span class="nav-line-2">EN&nbsp;
        <span class="nav-icon nav-arrow" style="visibility: visible;"></span>
        </span>
    </div>
        <c:if test="${username eq null}">
<a class="nav-a nav-a-2" id="nav-link-accountList" href="http://localhost:8080/DAmazon_site-war/Loginjsp.jsp">
    <span class="nav-line-1">Hello. Sign in</span>
    <span class="nav-line-2 ">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
    </span>
</a>
        </c:if>
        <c:if test="${username ne null}">
<a class="nav-a nav-a-2" id="nav-link-accountList" href="http://localhost:8080/DAmazon_site-war/Loginjsp.jsp">
    <span class="nav-line-1" style="padding-top:0px;margin-top: 0px;border-top: 0px; padding-bottom: 5px;">Hello, <b style="font-size: 14px; color: #f08804">${sessionScope.username}</b></span>
    <span class="nav-line-2 "><input type="button" value="Log Out" style=" font-family: sans-serif;width: 66px; height:22px; border-radius:2px;"/><span class="nav-icon nav-arrow" style="visibility: visible;"></span>
    </span>
</a>
        </c:if>

<div class="nav-a nav-a-2 nav-single-row-link ">
    <span class="nav-line-1"></span>
    <a href="http://localhost:8080/DAmazon_site-war/Orders.jsp"><span class="nav-line-2">Orders</span></a>
</div>

<div class="nav-a nav-a-2" id="nav-link-prime">
    <span class="nav-line-1">Try</span>
    <span class="nav-line-2 ">Prime<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
    </span>
</div>

            <a class="nav-a nav-a-2" id="nav-cart" href="http://localhost:8080/DAmazon_site-war/ShoppingCart.jsp">
    <span class="nav-line-1"> </span>
    <span class="nav-line-2">Cart<span class="nav-icon nav-arrow"></span>
    </span>
    <span class="nav-cart-icon nav-sprite"></span>
    <c:if test="${cart.size() ne null}">
        <span id="nav-cart-count" class="nav-cart-count nav-cart-0">${cart.size()}</span>
    </c:if>
    <c:if test="${cart.size() eq null}">
        <span id="nav-cart-count" class="nav-cart-count nav-cart-0">0</span>
    </c:if>
</a>
    </div>
    </div>
        
<div class="nav-fill">
<div id="nav-search" style="left: 0px; right: 0px;">
    <form class="nav-searchbar" name="search">
    <div class="nav-left">
        <div id="nav-search-dropdown-card">
    <div class="nav-search-scope nav-sprite">
    <div class="nav-search-facade">
        <span class="nav-search-label" style="width: auto;">All</span>
        <i class="nav-icon"></i>
    </div>
    <select class="nav-search-dropdown searchSelect" id="searchDropdownBox" style="display: block;">
        <option selected="selected" value="search-alias=aps">All Categories</option>
        <option value="search-alias=alexa-skills">Alexa Skills</option>
        <option value="search-alias=amazon-devices">Amazon Devices</option>
        <option value="search-alias=appliances">Appliances</option>
        <option value="search-alias=beauty">Beauty</option>
        <option value="search-alias=apparel">Clothing &amp; Accessories</option>
        <option value="search-alias=computers">Computers &amp; Accessories</option>
        <option value="search-alias=electronics">Electronics</option>
        <option value="search-alias=grocery">Grocery &amp; Gourmet Foods</option>
        <option value="search-alias=hpc">Health &amp; Personal Care</option>
        <option value="search-alias=kitchen">Home &amp; Kitchen</option>
        <option value="search-alias=dvd">Movies &amp; TV Shows</option>
        <option value="search-alias=mi">Musical Instruments</option>
        <option value="search-alias=instant-video">Prime Video</option>
        <option value="search-alias=shoes">Shoes &amp; Handbags</option>
        <option value="search-alias=software">Software</option>
        <option value="search-alias=sporting">Sports, Fitness &amp; Outdoors</option>
        <option value="search-alias=watches">Watches</option>
    </select>
    </div>
        </div>
    </div>
    <div class="nav-right">
        <div class="nav-search-submit nav-sprite">
            <span id="nav-search-submit-text" class="nav-search-submit-text nav-sprite">
            Go
            </span>
            <input type="button" class="nav-input">
        </div>
    </div>
    <div class="nav-fill">
        <div class="nav-search-field ">
        <input type="text" class="nav-input">
        </div>
    </div>
    </form>
</div>
        </div>
<div class="nav-main">
    <div class="nav-left">
        <div id="nav-global-location-slot"><div class="nav-a nav-a-2 a-popover-trigger a-declarative"><div><span class="nav-line-1">Deliver to</span><span class="nav-line-2">Delhi 110092</span></div></div></div>
    </div>
    <div class="nav-fill">
        <div id="nav-xshop">
            
<a class="nav-a" href="http://localhost:8080/DAmazon_site-war/Itempage2.jsp">Best Sellers </a>

<div class="nav-a">Gift Ideas</div>

<a class="nav-a" href="http://localhost:8080/DAmazon_site-war/Homejsp.jsp">New Releases</a>

<a class="nav-a" href="http://localhost:8080/DAmazon_site-war/Itempage1.jsp">Today's Deals</a>

<div class="nav-a  ">Coupons</div>

<a class="nav-a " href="http://localhost:8080/DAmazon_site-war/Orders.jsp">Orders</a>

<div class="nav-a  ">Customer Service</div>

<a class="nav-a " href="http://localhost:8080/DAmazon_site-war/ShoppingCart.jsp">Shopping Cart</a>

<div class="nav-a  ">Sell</div>
        </div>            
    </div>
</div>
    </div>
    </div>
        </header>
    </body>
</html>
