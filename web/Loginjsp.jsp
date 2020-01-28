<%
    if(session!=null){
        session = request.getSession(false);
        session.invalidate();
    }
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>DAmazon Sign Up</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            div {
                border-bottom-color: graytext;
                border-top-color: #949494;
                border: 1px #ddd solid;
                box-sizing: border-box;
                border-radius: 5px;
                display: block;
                font-size: 15px;
                width: 348px;
                height: 350px;
                padding: 50px;
                margin-top: 20px;
                margin-left: auto;
                margin-right: auto;
                font-family:sans-serif;
                padding-bottom: 30px;
                padding-left: 26px;
                padding-right: 26px;
                padding-top: 20px;
                position: relative;
            }
            
        </style>
    </head>
    <body>
        <form method="POST" action="LoginServlets">
        <img src="Pictures\amazon-logo.png" alt="Amazon.in" style="margin-left: auto;margin-right: auto;display: block;width:128px;height: 35px;padding-top: 5px">
        <div>
            <b style="font-weight: 400;font-size: 28px;">Login</b>
            <br>                   
            <br>
            <b style="font-weight: 700;font-size: 13px;">Email or Mobile number</b>
                <br>
                <input type="text" name="login_txt" style="border:1px solid #a6a6a6;box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 100%;height: 28px;border-radius: 3px" required>
                <br>
                <br>
                <b style="font-weight: 700;font-size: 13px;">Password</b>
                <br>
                <input type="password" name="pass_txt" style="border:1px solid #a6a6a6; box-shadow: 0 1px 0 rgba(255,255,255,.5), 0 1px 0 rgba(0,0,0,.07) inset;width: 100%;height: 28px;border-radius: 3px" required>
                <br>
                <br>
                <input type="submit" value="Continue" style="border: 1px solid #a6a6a6;font-size:10.5pt;color:black;background-color:#f0c14b;padding:1px;width:100%;height: 31px;border-radius: 3px"/>
                <br>
                <br>
                <span style="font-size:12px;">By continuing, you agree to Amazon's <a href="" style="color: #0066c0">Conditions of Use </a>and <a href="" style="color: #0066c0"> Privacy Notice</a>.</span>
                <br>
                <br>
                <a href="" style="color: #0066c0;font-size:12px;">Need Help?</a>
        </div>
        
        <div style="border: azure;font-size: 12px;margin-top:10px;padding-left: 0px;padding-right: 0px">
        ------------------------------- New to Amazon? --------------------------------
        <br>
        
        <a href="http://localhost:8080/DAmazon_site-war/Registerjsp.jsp"><input type="button" value="Create your Amazon account" style="width: 100%;height: 31px"></a>
        </div>
        </form>
        
    </body>
</html>