<%
response.setHeader("Pragma", "No-cache");
response.setDateHeader("Expires", 0);
response.setHeader("Cache-Control", "no-cache");
%>
 <%@page contentType="text/html; charset=iso-8859-1" pageEncoding="ISO-8859-1" language="java" import="java.sql.*,javax.sql.*,javax.naming.*,svl.pos.util.*,svl.pos.dominio.*"%>
<%

Usuario usuario = (Usuario)session.getAttribute("usuario");
	
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></meta>
    	<title>SVL - Servicio de Voluntariado Local</title>
    	<link rel="stylesheet" type="text/css" href="css/svl_estilo.css"></link>
  	</head>
  	<body leftmargin=0 topmargin=0>
    	<table border="0" cellpadding="0" cellspacing="0" width="100%">
			<tr><td valign="top" colspan="2">
            	<IFRAME src="Cabecera_buscador.htm" scrolling="no" frameborder="0" width="100%" height="132"></IFRAME>
            </td></tr>
            <form action="" name="formulario" method="post" target="_blank">
			<tr align="left">
            	<td width="200" align="left" valign="top">
					<IFRAME src="Menu.htm" scrolling="no" frameborder="0" width="200" height="565"></IFRAME> 
            	</td>
				<td width="1065" align="left" valign="top">
					<table width="99%" border="0" cellpadding="0" cellspacing="0" align="left">
						<tr><td class="cabecera_pagina">ALTA DE VOLUNTARIOS</td></tr>
						<tr><td>
							<table width="100%" style="border:1px solid #1a81b6;" cellpadding="2" cellspacing="5">
								<tr>
									<td width="10%" class="etiqueta" nowrap="nowrap">Nickname</td>
									<td width="16%" valign="top" nowrap="nowrap"><input class="caja_texto" size="20" type="text" name="usua_usuario" value="svl"></td>
									<td width="10%" class="etiqueta" nowrap="nowrap">Clave</td>
									<td width="28%" valign="top" nowrap="nowrap"><input class="caja_texto" size="30" type="password" name="usua_clave" value="svl"></td>
									<td width="10%" class="etiqueta" nowrap="nowrap">Email</td>
									<td width="28%" valign="top" nowrap="nowrap"><input class="caja_texto" size="45" type="text" name="usua_email" value="carlos@svl.es"></td>
								</tr>
								<tr>
									<td class="etiqueta" nowrap>Nombre</td>
									<td valign="top" nowrap="nowrap"><input class="caja_texto" size="20" type="text" name="usua_nombre" value="Carlos"></td>
									<td class="etiqueta" nowrap="nowrap">Apellidos</td>
									<td valign="top" nowrap="nowrap"><input class="caja_texto" size="45" type="text" name="usua_apellidos" value="Pompa"></td>
									<td class="etiqueta" nowrap="nowrap">Nif</td>
									<td valign="top" nowrap="nowrap"><input class="caja_texto" size="12" type="text" name="usua_nif" ></td>
								</tr>
								<tr>
									<td class="etiqueta" nowrap>G�nero</td>
									<td valign="top" nowrap="nowrap">
										<select class="caja_texto" size="1" name="usua_genero">
											<option value="0" selected>Masculino</option>                                                     
											<option value="1">Femenino</option>
										</select>
									</td>
									<td class="etiqueta" nowrap="nowrap">Direcci�n</td>
									<td valign="top" nowrap="nowrap"><input class="caja_texto" size="45" type="text" name="usua_direccion"></td>
									<td class="etiqueta" nowrap="nowrap">N�</td>
									<td valign="top" nowrap="nowrap"><input class="caja_texto" size="5" type="text" name="usua_numero" maxlength="4"></td>
								</tr>
								<tr>
									<td class="etiqueta" nowrap>Cod. Postal</td>
									<td valign="top" nowrap="nowrap"><input class="caja_texto" size="7" type="text" name="usua_codpostal" maxlength="5"></td>
									<td class="etiqueta" nowrap="nowrap">Provincia</td>
									<td>
										<select class="caja_texto">
											<option value="0" selected>Todas ...</option>
											<option value="1">Almer�a</option>
											<option value="2">C�diz</option>
											<option value="3">C�rdoba</option>
											<option value="4">Granada</option>
											<option value="5">M�laga</option>                                                                                                                                                                              
											<option value="6">Ja�n</option>
											<option value="7">Huelva</option>
											<option value="8" selected>Sevilla</option>                                                                                                                    
										</select>
									</td>
									<td class="etiqueta" nowrap="nowrap">Municipio</td>
									<td>
										<select class="caja_texto">
											<option value="0">Todas ...</option>
											<option value="1">Aguadulce</option>
											<option value="1">Alanis</option>
											<option value="2">Alcal� de Guadaira</option>
											<option value="3">Bormujos</option>
											<option value="4" selected>Constantina</option>
											<option value="5">Coria del R�o</option>                                                                                                                                                                              
											<option value="6">Coripe</option>
											<option value="6">Dos Hermanas</option>
											<option value="6">Ecija</option>                                                                                                                    
										</select>
									</td>
								</tr>
							</table>
						</td></tr>
						<tr><td>
							<table width="100%" cellpadding="0" cellspacing="0">
								<tr>
									<td align="right"><button class="boton_general" type="button" onclick="javascript:location.href='SVL_Registro_VO_2.htm'">Grabar datos personales</button></td>
								</tr>
							</table>							
						</td></tr>
					</table>
				</td>
			</tr>
			</form>
			<tr><td valign="top" colspan="2">
            	<IFRAME src="Pie.htm" scrolling="no" frameborder="0" width="100%" height="25"></IFRAME>
            </td></tr>
		</table>
	</body>
</html>