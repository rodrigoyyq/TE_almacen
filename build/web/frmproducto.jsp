<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1><c:if test="${producto.id == 0} ">nuevo registro</c:if></h1>
        <h1><c:if test="${producto.id != 0} ">editar registro</c:if></h1>
        <form action="Controlador" method="POST">
            <input type="hidden" name="id" value="${producto.id}" />
            <label>Descripcion</label>
            <input type="text" name="descripcion" value="${producto.descripcion}" />
            <br>
            <label>Stock</label>
            <textarea name="stock">${producto.stock}</textarea>
            <br>
            <input type="submit" value="registrar">      
        </form>
            
    </body>
</html>
