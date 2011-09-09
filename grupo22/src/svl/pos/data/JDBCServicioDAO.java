package svl.pos.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import svl.pos.dominio.Servicio;
import svl.pos.data.JDBCTipoServicioDAO;


import com.mysql.jdbc.Connection;

public class JDBCServicioDAO implements IServicioDAO{

	private Connection conn;
	
	public JDBCServicioDAO(){
		conn =  (Connection) ConnectionManager.getInstance().checkOut();
	}
	
	public List<Servicio> recuperarTodosLosServicios(){
		List<Servicio> lista = new ArrayList<Servicio>();
		
		String sql = "SELECT * FROM servicios";
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			result = stmt.executeQuery();

			while(result.next()){
				Servicio serv = new Servicio();
				serv.setServ_id(result.getString("serv_id"));
				serv.setServ_descrico(result.getString("serv_descrico"));
				serv.setServ_descrila(result.getString("serv_descrila"));
				lista.add(serv);
			}
		} catch (SQLException e) {
			System.out.println("Message: recuperarTodosLosServicios" + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("ErrorCode: " + e.getErrorCode());
		} finally {
			try {
				if (result != null) {
					result.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
		}

		return lista;
	}
	
	public String selectServDescricoByServid(int serv_id) {
		
		PreparedStatement stmt = null;
		String sql = "SELECT * FROM Servicios WHERE serv_id = ?";
		ResultSet result = null;
		String servdescrico =  null;
		try{
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, serv_id);
			result = stmt.executeQuery();
			result.next();
			servdescrico = result.getString("serv_descrico");
        } catch (SQLException e) {
            System.out.println("Message: selectServDescricoByServid: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
        } finally {
        	ConnectionManager.getInstance().checkIn(conn);
            try {
            	if (result != null)
            		result.close();
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
            }
        }	
        return servdescrico;
	}
	
	public String selectServDescrilaByServid(int serv_id) {
		
		PreparedStatement stmt = null;
		String sql = "SELECT * FROM Servicios WHERE serv_id = ?";
		ResultSet result = null;
		String servdescrila =  null;
		try{
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, serv_id);
			result = stmt.executeQuery();
			result.next();
			servdescrila = result.getString("serv_descrila");
        } catch (SQLException e) {
            System.out.println("Message: selectServDescrilaByServid: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
        } finally {
        	ConnectionManager.getInstance().checkIn(conn);
            try {
            	if (result != null)
            		result.close();
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
            }
        }	
        return servdescrila;
	}
	
	public String selectTipoServicioByServid (int serv_id){
		JDBCTipoServicioDAO daoTipoServicio = new JDBCTipoServicioDAO();
		PreparedStatement stmt = null;
		String sql = "SELECT tise_tiseid FROM Servicios WHERE serv_id = ?";
		ResultSet result = null;
		int tiseid =  0;
		String tisedescrico = null;
		try{
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, serv_id);
			result = stmt.executeQuery();
			result.next();
			tiseid = result.getInt("tise_tiseid");
        } catch (SQLException e) {
            System.out.println("Message: selectTipoServicioByServid: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
        } finally {
        	ConnectionManager.getInstance().checkIn(conn);
            try {
            	if (result != null)
            		result.close();
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
            }
        }	
		tisedescrico = daoTipoServicio.selectTiseDescricoByServid(tiseid);
		return tisedescrico;
	}

	@Override
	public void insertarServicio(Servicio servicio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarServicio(int serv_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarServicio(Servicio servicio) {
		// TODO Auto-generated method stub
		
	}
	
}
