<%-- 
    Document   : ShowMyInfo
    Created on : Sep 18, 2022, 4:06:06 PM
    Author     : joudalghamdi
--%>

<%@ page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        Database.Database_connection user = new Database.Database_connection();
        ResultSet rs = user.getMyInfo();
        %>
        
        <table border="1" >
            <tbody>
                <tr>
                    <td>name</td>
                </tr>
                <% while(rs.next()){ %>
                <tr>
                    <td><%= rs.getString("username")%></td>
                </tr>
                <% } %>

            </tbody>
        </table>

        
        
        
    </body>
</html>
