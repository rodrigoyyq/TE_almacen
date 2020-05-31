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
    <h1>PRODUCTOS</h1>
    <p><a href="Controlador?accion=nuevo">nuevo producto</a></p>
    <div class="contenedor">
        <table>
            <thead>
            <tr>
                <th class="borde">ID</th>
                <th>DESCRIPCION</th>
                <th>STOCK</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
            <c:forEach var="item" items="${productos}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.descripcion}</td>
                    <td>${item.stock}</td>
                    <td class="muestra"><a href="Controlador?accion=editar&id=${item.id}">EDITAR</a></td>
                    <td class="muestra"><a href="Controlador?accion=eliminar&id=${item.id}">ELIMINAR</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>

</html>