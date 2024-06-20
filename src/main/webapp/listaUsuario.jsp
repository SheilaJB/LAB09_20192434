<%@ page import="org.example.lab9_20192434.beans.UsuarioB" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<UsuarioB> lista = (ArrayList<UsuarioB>) request.getAttribute("lista"); %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Películas</title>
</head>
<body>

<h1>Lista de Usuarios</h1>

<table border="1">
    <tr>

        <th>Nombres</th>
        <th>Apellidos</th>
        <th>Tipo de Licencia</th>
        <th>Fecha de emision</th>
        <th>Fecha de caducidad</th>
        <th>País de procedencia</th>
        <th>Cantidad de reservas canceladas</th>

    </tr>
    <%
        for (UsuarioB usuario : lista) {
    %>
    <tr>
        <td><a href="UsuarioServlet?idUsuario=<%= usuario.getIdusuario() %>"></a></td>
        <td><%=usuario.getNombres()%></td>
        <td><%=usuario.getApellidos()%></td>
        <td><%=usuario.getTipoLicencia()%></td>
        <td>$<%=usuario.getFecha_emision()%></td>
        <td>$<%=usuario.getFecha_caducidad()%></td>
        <td><%=usuario.getPaisProcedente()%></td>
        <td><%=usuario.getCantidadCancelado()%></td>

    </tr>
    <%
        }
    %>

</table>

</body>
</html>