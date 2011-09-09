package svl.pos.dominio;

import java.util.List;

import svl.pos.data.IVoluntarioDAO;
import svl.pos.data.JDBCVoluntarioDAO;

public class VoluntarioProcessor implements IVoluntarioProcessor {

	private IVoluntarioDAO vdao = new JDBCVoluntarioDAO();

	@Override
	public boolean voluntarioRegistrado(String usua_usuario, String usua_email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registrarVoluntario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario obtenerMisdatos(String usua_usuario, String usua_email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarDemandantes(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
