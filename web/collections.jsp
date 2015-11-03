<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bios.Usuario" %>
<%
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario(12313, "Paco", 30));
    usuarios.add(new Usuario(456, "Julio", 31));
    usuarios.add(new Usuario(370, "Marta", 28));
    request.setAttribute("usuarios", usuarios);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Colecciones y Streams</title>
    </head>
    <body>
        <br/>
        El arreglo usuarios esta 
        ${((empty usuarios)?
          "sin elementos":"con elementos")}
        <br/>
        Filtrado de elementos <br/>
        ${usuarios.stream().
          filter(u -> (u.edad > 28)).
          map(u -> {'Nombre':u.nombre,
          'Edad':u.edad}).toList()}
        <br/>
        Listado       
        <br/>
        ${usuarios.stream().sorted(
          (u1,u2) -> 
          (r=u1.nombre.compareTo(u2.nombre))).
          toList()}
        <br/>
        Total edad: ${usuarios.stream().map(u->u.edad).sum()}
    </body>
</html>