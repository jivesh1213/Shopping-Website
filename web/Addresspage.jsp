<%-- 
    Document   : Addresspage
    Created on : 26 Dec, 2019, 3:17:22 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select a Delivery Address - DAmazon.in</title>
    </head>
    <body style="padding-left: 190px;">
        <img style=" padding-top: 15px" src="Pictures/delivery.gif">
        <div style="margin-bottom: 14px">
        <h1 style="font-family: arial; font-weight: normal; padding-top: 20px; font-size: 29px"> Select a delivery address </h1>
        Is the address you'd like to use? Enter a delivery address and click "Deliver to this address" button.
        <h3 style="font-family: arial; margin-bottom: 08px"> On the move? Pick up your order from our pickup store. </h3>
        <div style="border-bottom: 1px #ddd solid; padding-bottom: 6px"><img src="Pictures/pickup.png"><span>Orders for select areas in select cities can now be delivered to Amazon pickup locations.</span></div>
        
        <form method="post" action="address">
        <div style="margin-top: 50px">
            <h2 style="font-family: arial; font-size: 21px;line-height: 20px"> Enter an address </h2><span style="font-size: 14px; font-family: arial; line-height: 23px"> Be sure to click "Deliver to this address" when you've finished. </span><br>
            <b style="font-family: arial; line-height: 21px; font-size: 13px"> Full Name: </b><br>
            <input type="text" name="name_txt" style="border:1px solid #a6a6a6;box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 30%;height: 28px;border-radius: 4px; border-top-color: #bbb" required><br>
            <br><b style="font-family: arial; line-height: 23px; font-size: 13px"> Mobile Number: </b><br>
            <input type="text" name="phone_txt" style="border:1px solid #a6a6a6;box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 30%;height: 28px;border-radius: 4px; border-top-color: #bbb" required><br>
            <br><b style="font-family: arial; line-height: 23px; font-size: 13px"> Pincode: </b><br>
            <input type="text" name="pincode_txt" style="border:1px solid #a6a6a6;box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 30%;height: 28px;border-radius: 4px; border-top-color: #bbb" required><br>
            <br><b style="font-family: arial; line-height: 23px; font-size: 13px"> Flat No. ,Street No. ,Area:</b><br>
            <input type="text" name="flatno_txt" style="border:1px solid #a6a6a6;box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 30%;height: 28px;border-radius: 4px; border-top-color: #bbb" required><br>
            <br><b style="font-family: arial; line-height: 23px; font-size: 13px"> Landmark: </b><br>
            <input type="text" name="landmark_txt" style="border:1px solid #a6a6a6;box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 30%;height: 28px;border-radius: 4px; border-top-color: #bbb" required><br>
            <br><b style="font-family: arial; line-height: 23px; font-size: 13px"> City/State :</b><br>
            <input type="text" name="city_txt" style="border:1px solid #a6a6a6;box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 30%;height: 28px;border-radius: 4px; border-top-color: #bbb" required><br><br>
            <input type="Submit" value="Deliver to this address" style="border: 0.8px solid #949494;font-size:12pt;color:black;background-color: #f0c14b; padding:1px; width:180px;border-color: #cba957; height: 32px;border-radius: 3px; margin-left: 17%;"/>
        </div>
        </form>
        </div>
    </body>
</html>
