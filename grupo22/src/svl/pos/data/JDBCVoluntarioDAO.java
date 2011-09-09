package svl.pos.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import svl.pos.util.UIDGenerator;

import com.mysql.jdbc.PreparedStatement;

import svl.pos.dominio.Usuario;
import svl.pos.dominio.Voluntario;
import svl.pos.dominio.Servicio;

public class JDBCVoluntarioDAO implements IVoluntarioDAO{

	IVoluntarioDAO vdao;

	

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
