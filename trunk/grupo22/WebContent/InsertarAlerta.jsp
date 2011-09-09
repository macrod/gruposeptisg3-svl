<%
response.setHeader("Pragma", "No-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "no-cache");
%>
 <%@page contentType="text/html; charset=iso-8859-1" pageEncoding="ISO-8859-1" language="java" import="java.sql.*,javax.sql.*,javax.naming.*,svl.pos.util.*,svl.pos.dominio.*,svl.pos.data.*"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
<%

Usuario usuario = (Usuario)session.getAttribute("usuario");
Alerta alerta = new Alerta();

alerta.setAler_nombrecontacto(request.getParameter("aler_nombrecontacto"));
alerta.setAler_emailcontacto(request.getParameter("aler_emailcontacto"));
alerta.setTise_tiseid((new Integer(request.getParameter("tise_tiseid"))).intValue());
alerta.setServ_servid((new Integer(request.getParameter("serv_servid"))).intValue());
alerta.setAler_descripcion(request.getParameter("aler_descripcion"));
alerta.setTibu_tibuid((new Integer(request.getParameter("tibu_tibuid"))).intValue());	
alerta.setProv_provid((new Integer(request.getParameter("prov_provid"))).intValue());	
alerta.setMuni_muniid((new Integer(request.getParameter("muni_muniid"))).intValue());	

JDBCAlertaDAO jdaoalertas = new JDBCAlertaDAO();


jdaoalertas.addAlerta(alerta);
int idalerta = jdaoalertas.selectIDAlertaByNombre(request.getParameter("aler_nombrecontacto"));
session.setAttribute("idalerta",idalerta);
response.sendRedirect("SVL_Alerta_1.jsp?"+idalerta);

%>
</body>
</html>