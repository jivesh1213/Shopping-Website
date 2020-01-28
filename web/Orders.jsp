<%-- 
    Document   : Orders
    Created on : 1 Jan, 2020, 5:56:12 PM
    Author     : lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="Header.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Orders - DAmazon.in</title>
        <style>
        td{
            border-bottom: 1px #ddd solid
        }
        ul {
            list-style-type: none
        }
        a:link, a:visited{
            color: #0066c0;
        }
        a:link{
            text-decoration: none;
        }
        a:hover{
            text-decoration: underline;
        }
        </style>
     </head>
    <body>
        <div style="padding-left: 200px; padding-right: 200px">
            <div class="a-row" style="font-size: 20px;font-family: sans-serif; padding: 53px; padding-top: 7px;padding-bottom: 10px;border-bottom: 1px #ddd solid">
                <h2 style="margin-bottom: 0px">Your Orders</h2>
            </div>
            <form style="box-sizing: border-box; height: 400px; padding-left: 10px" method="get" action="CartServlets">
            <table style="width: 100%">
                <tr style="text-align: center;font-size: 17px;font-weight: bold; background-color: #f7f7f7">
                    <td>Product Image</td>
                    <td>Product Details</td>
                    <td>Buying Date</td>
                </tr>
                <c:forEach var="i" begin="1" end="${order.size()}">
                <tr>
                    <td style=" width: 25%;text-align: center"><img src="<c:url value="Pictures/${order.get(i - 1).getPhoto()}"></c:url>" style="padding-top: 08px; padding-bottom: 07px; height: 140px"></td>
                    <td style=" width: 65%; padding-top: 13px; vertical-align: top; font-family: Arial,sans-serif; font-size: 17px;"><span style=" color: #0066c0">${order.get(i - 1).getDescription()}</span><br>
                        <div style="font-size:13px;padding-bottom: 07px;padding-top: 2px">(1 Piece)</div>
                        <span style="font-size: 21px"> ₹${order.get(i - 1).getPrice()}.00 </span><br>
                        <span style="font-size:13px; color: #007600">FREE Delivery by Amazon</span>
                        <div class="a-row" style="margin-top: 10px; font-size: 20px ">
                            <b>Add again Item to Cart:  </b><input type="checkbox" name="${order.get(i - 1).getCheckbox()}" style="width: 17px; height: 15px">
                        </div>
                    </td>
                    <td style=" font-weight: bold;width: 10%; text-align: center;padding-top: 08px; vertical-align: top; font-family: Arial,sans-serif; font-size: 17px; color: #B12704;  "> ${order.get(i - 1).getDate()}</td>
                </tr>
                </c:forEach>
            </table>
                <input type="Submit" value="Go to Cart" style=" margin-top: 10px;border: 0.8px solid #949494;font-size:12pt;color:black;background-color: #ffb42b;border-color: black;padding:1px;width:160px;height: 38px;border-radius: 3px; margin-left: 45%; margin-right: 55%; "/>
            </form>
        </div>
    </body>
</html>
