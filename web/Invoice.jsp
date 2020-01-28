
<%@page import="java.time.LocalDate"%>
<%@page import="db.JDBC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DAmazon.in Invoice Page</title>
    </head>
    <body style="padding:15px 190px">
        <img src="Pictures/complete.jpg">
        <%
                JDBC c = new JDBC();
                int a = c.orderno();
                String b = c.orderalpha();
                %>
        <div style="line-height: 25px; padding-top: 50px; padding-bottom: 10px">
            <table style="width:770px">
                <tr>
                    <td> Hi, <b>${username}</b></td>
                    <td style="text-align: right">Order placed on: <b><%= LocalDate.now()%></b></td>
                </tr>
                <tr>
                    <td>Your order has been successfully placed.</td>
                    <td style="text-align: right">Order Id: <b> <%= b%>11<%=a%> </b> </td>
                </tr>
            </table>
        </div>
        <table>
        <tr>
            <td rowspan="0">
                <div style="line-height: 17px; border: 1px #dad8d8 solid;font-family: arial; padding:20px 22px;height: 300px; width: 730px; border-radius: 3px; margin-right: 26px;background-color: #f6f6f8">
                    <table style="width:100%; padding-bottom: 20px">
                <tr>
                    <td style="width:60%"><img src="Pictures/unnamed.png"></td>
                    <td rowspan="0" style="text-align: left"><b style="line-height: 23px">Delivery Address</b>
                        <ul style=" list-style-type: none;line-height: 20px;padding: 0px">
                            <li>${address.get(0)}</li>
                            <li>${address.get(3)}</li>
                            <li>${address.get(4)}</li>
                            <li>${address.get(5)},${address.get(2)}</li>
                            <li><h3>SMS updates send to</h3></li>
                            <li style="line-height:0px">${address.get(1)}</li>
                        </ul>
                    </td>
                </tr>
                <tr style="height:45%">
                    <td>
                        <table>
                            <tr><td style="width:72%;font-size: 14px"> Delivered by: </td>
                                <td style=" color: green; font-weight: bold"> 30-Dec-2019</td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr style="height:45%">
                    <td>
                        <table>
                            <tr><td style="width:80%"> Amount Payable: </td>
                                <td style=" color: green; font-weight: bold">₹${total}</td>
                            </tr>
                        </table>
                    </td>
                </tr>
                </table>
                    <span style="line-height: 20px; font-size: 13px">
                        You will receive the next update when the item in your order is packed/shipped by the seller.<br>
                    <strong>Important Scam Advisory: Beware of any fake offers and fraudulent sites.
                    Amazon’s representatives do not demand money or ask for any personal details like your password/PIN/CVV by contacting you.
                    Your bank account details may be requested only in case a refund is due for your order. </strong></span>
                </div>
            </td>
            <td>
                <div style="border: 1px #dad8d8 solid;font-family: arial; padding:14px 18px;height: 70px; width: 200px; border-radius: 3px;background-color:#f7f7f7">
                    <a href="http://localhost:8080/DAmazon_site-war/Loginjsp.jsp"><input type="Submit" value="Log Out" style="border: 0.8px solid #949494;font-size:12pt;color:black;background-color: #f0c14b; padding:1px; width:100%;border-color: #bf942a; height: 32px;border-radius: 3px;"/></a>
                    <div style="padding-top: 10px; line-height: 18px; font-size: 12.5px; text-align: center">Log In Again to buy more amazing products.</div>
                </div>
            </td>
        </tr>
        <tr><td style="height: 225px"></td></tr>
        </table>
    </body>
</html>
