package svl.pos.data;

import java.util.List;

import svl.pos.dominio.Perfil;

import com.mysql.jdbc.Connection;

public class JDBCPerfilDAO implements IPerfilDAO{

	private Connection conn;
	
	public JDBCPerfilDAO(){
		conn =  (Connection) ConnectionManager.getInstance().checkOut();
	}

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