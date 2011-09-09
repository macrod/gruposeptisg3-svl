package svl.pos.data;

import java.util.List;

import svl.pos.dominio.Usuario;
import svl.pos.dominio.Demandante;
import svl.pos.dominio.Servicio;

import com.mysql.jdbc.Connection;

public class JDBCDemandanteDAO implements IDemandanteDAO{

	private Connection conn;
	
	public JDBCDemandanteDAO(){
		conn =  (Connection) ConnectionManager.getInstance().checkOut();
	}

	@Override
	public void registarDemandante() {
		// TODO Auto-generated method stub
		
	}

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
	public List<Servicio> listaServicioByDemId(int dema_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
