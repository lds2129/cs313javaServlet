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
        <title>Scripture List</title>
    </head>
    <body>
       <div> 
            Scriptures:<br /><br /> 
         
        <c:forEach var="scripture" items="${scriptures}">

         <strong>${scripture.book}</strong> ${scripture.chapter}:${scripture.verse}<br />

        </c:forEach>
            
       </div>
    </body>
</html>
