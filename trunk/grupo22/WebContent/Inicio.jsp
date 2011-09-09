<%
response.setHeader("Pragma", "No-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "no-cache");
%>
 <%@page contentType="text/html; charset=iso-8859-1" pageEncoding="ISO-8859-1" language="java" import="java.sql.*,javax.sql.*,javax.naming.*,svl.pos.util.*,svl.pos.dominio.*"%>
<%

Usuario usuario = (Usuario)session.getAttribute("usuario");
String nombre = "";
if (usuario!=null){
	nombre = usuario.getUsua_usuario();
}

%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SVL - Servicio de Voluntariado Local</title>
<link href="css/svl_estilo.css"" rel="stylesheet" type="text/css" />

</head>

<body class="body2">

<div id="cabecera"></div><!--[if !IE]>Aqui termina #cabecera<![endif]-->
<table border="0" width="100%" cellspacing="0" cellpadding="0">
	<tr bgcolor="#3980F4">
		<td width="60%" height="20" align="left" class="ruta">&nbsp;Está Vd. en: INICIO - Menú Inicial</td>
		<td width="30%" align="right" class="texto_min_1"><a class="texto_min_1_b" href="javascript:window.parent.location.href='SVL_Ayuda.htm';">Ayuda</a>&nbsp;&nbsp;&nbsp;<a class="texto_min_1_b" href="javascript:window.parent.location.href='FrontController?accion=Test';">Ejecutar Test</a>&nbsp;</td>
		<td width="10%" align="right"><a class="texto_min_1_b" href="javascript:window.parent.location.href='SVL_Ayuda.htm';">Ayuda</a>&nbsp;&nbsp;&nbsp;<a class="texto_min_1_b" href="javascript:window.parent.location.href='Inicio.jsp';">Salir</a>&nbsp;</td>
	</tr>
</table>

<div id="contenedorInicio">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr><td height="30" colspan="5"></td></tr>
	<tr>
    <td width="5%">&nbsp;</td>
    <td width="30%">&nbsp;</td>
    <td width="30%">&nbsp;</td>
    <td width="30%">&nbsp;</td>
    <td width="5%">&nbsp;</td>
    </tr>
    <tr>
    <td>&nbsp;</td>
    <td align="center" valign="middle"><span class="entrada"><a href="SVL_Ayuda.htm">Entrada </a></span></td>
    <td align="center" valign="middle"><span class="voluntarios"><a href="javascript:window.parent.location.href='FrontController?accion=Registro_VO">Voluntarios</a></span></td>
    <td align="center" valign="middle"><span class="demandantes"><a href="SVL_Registro_DE_1.htm">Demandantes</a></span></td>
	
    <td>&nbsp;</td>
    </tr>
    <tr>
    <td height="25">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
	<td>&nbsp;</td>
    <tr>
    <td>&nbsp;</td>
    <td align="center" valign="middle"><span class="buscador"><a href="SVL_Buscador.htm">Buscador</a></span></td>
    <td align="center" valign="middle"><span class="alertas"><a href="javascript:window.parent.location.href='FrontController?accion=SVL_Alertas';">Alertas y Avisos </a></span></td>
    <td align="center" valign="middle"><span class="admin"><a href="SVL_Logado.htm">Administración</a></span></td>
	
	<td>&nbsp;</td>
    </tr>
    <tr>
    <td height="25">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
	<td>&nbsp;</td>
    <tr>
    </table>
  
</div><!--[if !IE]>Aqui termina #contenedorInicio<![endif]-->

</body>
</html>
