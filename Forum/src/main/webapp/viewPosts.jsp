<%-- 
    Document   : viewPosts
    Created on : Feb 28, 2017, 3:35:48 PM
    Author     : Jacob
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>View Posts | Discussion Forum</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-10 col-md-offset-1">
                    <h1>Discussion Forum</h1><br>
                        <table class="table table-condensed">
                            <c:forEach var="post" items="${posts}">
                                <tr>
                                    <td>${loop.index}</td>
                                    <td>${post}</td>
                                </tr>
                            </c:forEach>
                        </table>       
                    <p><a class="btn btn-primary" href="newPost.jsp" role="button">Create New Post</a></p>
                </div>
            </div>
        </div>
    </body>
</html>
