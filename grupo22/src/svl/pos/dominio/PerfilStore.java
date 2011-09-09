package svl.pos.dominio;


import java.util.List;

import svl.pos.data.IPerfilDAO;
import svl.pos.data.JDBCPerfilDAO;

public class PerfilStore implements IPerfilDAO{

	JDBCPerfilDAO dao = new JDBCPerfilDAO();

	@Override
	public List<Perfil> recuperarTodosLosPerfiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectPerfDescricoByPerfid(int perf_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarPerfil(int usua_id) {
		// TODO Auto-generated method stub
		
	}

	
}