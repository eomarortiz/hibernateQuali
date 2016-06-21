<%-- 
    Document   : newjsp
    Created on : 21/06/2016, 09:54:57 AM
    Author     : Usuario121
--%>

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
            int j=0;
            
            for(int i=1985;i<=2017;i++){
                out.println("<f:selectItem itemLabel='Seleccione...' itemValue='' noSelectionOption='false' /> ");
               j++;
            }
        %>
    </body>
</html>
