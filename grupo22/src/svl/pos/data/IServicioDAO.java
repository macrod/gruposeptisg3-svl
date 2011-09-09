package svl.pos.data;

import java.util.List;

import svl.pos.dominio.Servicio;


public interface IServicioDAO {

	public List<Servicio> recuperarTodosLosServicios();
	public String selectServDescricoByServid (int serv_id);
	public String selectServDescrilaByServid (int serv_id);
	public String selectTipoServicioByServid (int serv_id);
	public void insertarServicio(Servicio servicio);
	public void borrarServicio(int serv_id);
	public void actualizarServicio(Servicio servicio);
}
