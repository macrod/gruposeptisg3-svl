package svl.pos.dominio;

import java.util.List;

import svl.pos.data.IAlertaDAO;
import svl.pos.data.JDBCAlertaDAO;

public class AlertaProcessor implements IAlertaProcessor {

	private IAlertaDAO dao = new JDBCAlertaDAO();

	@Override
	public void registrarAlerta(String aler_nombrecontacto,
			String aler_emailcontacto, int prov_id, int muni_id, int serv_id,
			int tibu_id, int tise_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarAlerta(Alerta alerta) {
		// TODO Auto-generated method stub
		
	}
	

}
