package svl.pos.dominio;

import java.util.List;

import svl.pos.data.IAlertaDAO;
import svl.pos.data.JDBCAlertaDAO;

public class AlertaStore implements IAlertaDAO{

	JDBCAlertaDAO dao = new JDBCAlertaDAO();

	@Override
	public List<Alerta> recuperarTodasLasAlertas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alerta selectAlertaByAlerid(int aler_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alerta selectAlertaByContacto(String aler_nombrecontacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAlerta(Alerta alerta) {
		dao.addAlerta(alerta);
		
	}

	@Override
	public int selectIDAlertaByNombre(String aler_nombrecontacto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}