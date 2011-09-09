package svl.pos.dominio;


import java.util.List;

import svl.pos.data.IRegistroDAO;
import svl.pos.data.JDBCRegistroDAO;

public class RegistroStore implements IRegistroDAO{

	JDBCRegistroDAO dao = new JDBCRegistroDAO();

	@Override
	public List<Registro> recuperarTodosLosRegistros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registro> recuperarTodosLosRegistrosByUsuaid(int usua_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registro> recuperarTodosLosRegistrosByVolucod(String volu_cod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectTotalHorasByVolucod(String volu_cod) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}