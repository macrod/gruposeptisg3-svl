package svl.pos.dominio;

import java.util.List;

import svl.pos.data.IServicioDAO;
import svl.pos.data.JDBCServicioDAO;

public class ServicioStore implements IServicioDAO {

	JDBCServicioDAO dao = new JDBCServicioDAO();
	@Override
	public List<Servicio> recuperarTodosLosServicios() {
		// TODO Auto-generated method stub
		return dao.recuperarTodosLosServicios();
	}
	
	public String selectServDescricoByServid (int serv_id){
		return dao.selectServDescricoByServid(serv_id);
	}
	
	public String selectServDescrilaByServid (int serv_id){
		return dao.selectServDescrilaByServid(serv_id);
	}
	
	public String selectTipoServicioByServid (int serv_id){
		return dao.selectTipoServicioByServid(serv_id);
	}
	
	public void insertarServicio(Servicio servicio){
		dao.insertarServicio(servicio);
	}
	
	public void borrarServicio(int serv_id){
		dao.borrarServicio(serv_id);
	}
	
	public void actualizarServicio(Servicio servicio){
		dao.actualizarServicio(servicio);
	}
	

}