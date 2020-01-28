<%-- 
    Document   : Paymentpage
    Created on : 26 Dec, 2019, 4:37:53 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select a Payment method - DAmazon.in</title>
    </head>
    <body style="padding-left: 190px;">
        <img style=" padding-top: 15px" src="Pictures/delivery.gif">
        <div style="margin-bottom: 14px">
        <h1 style="font-family: arial; font-weight: normal; padding-top: 20px; font-size: 29px"> Select a Payment method </h1>
        <form action="Placeorder.jsp" method="GET">
        <table>
        <tr>
            <td rowspan="0">
        <div style="line-height: 17px; border: 1px #dad8d8 solid;font-family: arial; padding:14px 18px;height: 300px; width: 760px; border-radius: 3px; margin-right: 26px">
            <div style="font-size: 17px;border: 1px #ddd solid; padding:14px 18px;padding-left: 60px;height: 24px;border-radius: 3px; background-color: #f7f7f7">
                Enter how you'd like to pay below, and we'll save it as an option.
            </div><br>
            <div style="border-bottom: 1px #ddd solid;"><b style="line-height: 30px"> Another Payment Method</b></div>
            <div style=" padding-top: 20px; padding-bottom: 20px; line-height: 23px">
                <input type="radio" name="pay" value="Pay On Delivery"><b> Pay On Delivery (Cash/UPI/Card)</b><br>
                <div style="padding-left: 25px; font-size: 15px; line-height: 17px; color: #4d4a4a">We also accept Credit/ Debit cards on delivery, subject to availability of the payment device. Please check with the delivery agent.</div>
            </div><br>
            <div>
                <input type="radio" name="pay" value="Amazon Pickup Store"><b style=" line-height: 23px"> Amazon Pickup Store (Cash/UPI/Card)</b><br>
                <div style="padding-left: 25px; font-size: 15px; line-height: 17px; color: #4d4a4a">We also accept Credit/ Debit cards on Store, subject to availability of the payment device. Please check with the delivery agent.</div>
            </div>
        </div>
            </td>
            <td>
                <div style="border: 1px #dad8d8 solid;font-family: arial; padding:14px 18px;height: 70px; width: 200px; border-radius: 3px;background-color:#f7f7f7">
                    <input type="Submit" value="Continue" style="border: 0.8px solid #949494;font-size:12pt;color:black;background-color: #f0c14b; padding:1px; width:100%;border-color: #bf942a; height: 32px;border-radius: 3px;"/>
                    <div style="padding-top: 10px; line-height: 18px; font-size: 12.5px; text-align: center">You can review this order before it's final.</div>
                </div>
            </td>
        </tr>
        <tr><td style="height: 225px"></td></tr>
        </table>
        </form>
        <div style="width:760px; padding-top: 20px;line-height: 23px;border-bottom: 1px #ddd solid; font-family: arial">
            <b style="line-height: 30px; ">Gift Cards, Vouchers & Promotional Codes</b><br>
        </div>
        <div style="padding-top: 10px; line-height: 23px; font-family: arial">
            <span style="color: #0066c0; padding-bottom: 20px; line-height: 33px">Enter a gift card, or promotional code</span><br>
            <input type="text" placeholder="Enter Code" name="giftcode" style="padding-left: 10px;border:2px #e2dddd solid ;width: 15%;height: 26px;border-radius: 4px;background-color: #fbf8f8; border-top-color: #e1d8d8 "/><br>
        </div>
        </div>
    </body>
</html>
