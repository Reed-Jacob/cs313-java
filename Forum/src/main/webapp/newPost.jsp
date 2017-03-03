<%-- 
    Document   : discussion
    Created on : Feb 28, 2017, 3:25:07 PM
    Author     : Jacob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>New Post | Discussion Forum</title>
    </head>
    <body>
        <div class="container text-center">
            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <h1>Enter New Post</h1><br>
                    <div class="forum-group">
                        <form method="post" action="createPost">
                            <input type="hidden" value="${sessionScope.username}" id="name" name="name"></input>
                            <textarea id="message" name="message" cols="40" rows ="5" required></textarea>
                            <br />
                            <button type="submit" class="btn btn-primary" value="Post">Post</button>
                        <a class="btn btn-info" href="loadPost" role="button">View All Posts</a>
                        </form>
                    </div>
                    
                </div>
            </div>
        </div>
    </body>
</html>