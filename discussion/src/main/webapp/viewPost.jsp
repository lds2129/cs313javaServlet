<%-- 
    Document   : scriptureList
    Created on : Nov 15, 2016, 10:20:43 PM
    Author     : James Kim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
    </head>
    <body>
        <div> 
            <h1>View Posts: </h1><br /><br /> 

            <c:forEach var="post" items="${posts}">

                ${post}<br>

            </c:forEach>
                <a href="newPost.jsp">Create New Post</a>
                
        </div>
    </body>
</html>