<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <nav>
        <% System.out.println("inhomejsp"+ request.getSession().getAttribute("sessionId"));
            request.setAttribute("sessionId",request.getAttribute("sessionId"));%>
        <span><a href="update.jsp">Update</a></span>
        <span><a href="RemoveAccountController">RemoveAccount</a></span>
        <span><a href="DisplayController">Display Details</a></span>
       <span><a href="LogoutController">Logout</a></span>
    </nav>
</body>
</html>