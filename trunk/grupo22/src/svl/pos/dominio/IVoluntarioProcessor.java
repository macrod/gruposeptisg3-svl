package svl.pos.dominio;

import java.util.List;

public interface IVoluntarioProcessor {

	boolean voluntarioRegistrado(String usua_usuario, String usua_email);
	void registrarVoluntario(Usuario usuario);
	Usuario obtenerMisdatos(String usua_usuario, String usua_email);
	Usuario buscarDemandantes(Usuario usuario);
}
