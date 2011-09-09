package svl.pos.dominio;

import java.util.List;

import svl.pos.data.IVoluntarioDAO;
import svl.pos.data.JDBCVoluntarioDAO;

public class VoluntarioStore implements IVoluntarioDAO{

	JDBCVoluntarioDAO dao = new JDBCVoluntarioDAO();

	

	@Override
	public Usuario consultarMisdatos(String usua_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAlerta(String usua_usuario, String usua_email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Servicio> listaServicioByVolId(int volu_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrarVoluntario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	
	
}