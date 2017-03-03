<%-- 
    Document   : index
    Created on : Feb 28, 2017, 3:08:56 PM
    Author     : Jacob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Login | Discussion Forum</title>
        
    </head>
    <body>
        <div class="container text-center">
            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <h1>Login</h1><br>
                    <form method="post" action="login">
                        <input type="text" id="username" name="username" required placeholder="Username"></input>
                        <br>
                        <input type="password" id="password" name="password" required placeholder="Password"></input>
                        <br><br>
                        <button type="submit" class="btn btn-primary" value="Login">Login</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
