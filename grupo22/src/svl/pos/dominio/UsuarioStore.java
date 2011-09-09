package svl.pos.dominio;

import java.sql.Connection;
import java.util.List;

import svl.pos.data.IUsuarioDAO;
import svl.pos.data.JDBCUsuarioDAO;

public class UsuarioStore implements IUsuarioDAO {
	
	private JDBCUsuarioDAO userDAO;
	
	/**
	 * 	CONSTRUCTOR DE LA CLASE
	 */
	public UsuarioStore(){
		userDAO = new JDBCUsuarioDAO();
	}
	
	public boolean comprobarUsuario(String idUser, String password){
		return userDAO.comprobarUsuario(idUser,password);
	}
	
	
	public Usuario recuperarUsuarioByIdUsuario(String idUser){
		return userDAO.recuperarUsuarioByIdUsuario(idUser);
	}
	
	public void insertarUsuario(Usuario user){
		userDAO.insertarUsuario(user);
	}
	
	public List<Usuario> selectAllUsers(){
		return userDAO.selectAllUsers();
	}
	
	public void borrarUsuario(int usua_id){
		userDAO.borrarUsuario(usua_id);
	}
	
	public void actualizarUsuario(Usuario u){
		userDAO.actualizarUsuario(u);
	}
	
	

	@Override
	public Integer recuperarIdByUsuarioClave(String usua_usuario,
			String usua_clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario selectUserById(String usua_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLogado(String usua_usuario, String usua_clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRegistrado(Connection conn, Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer obtenerUsuaId(String usua_usuario, String usua_clave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean singOut() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAdmin(Usuario usuario) {
		// TODO Auto-generated method stub
		return userDAO.isAdmin(usuario);
	}

	@Override
	public void insertarUsuarioAlerta(Alerta alerta) {
		// TODO Auto-generated method stub
		userDAO.insertarUsuarioAlerta(alerta);
	}

	@Override
	public Usuario recuperarUsuarioByUsuarioClave(String usua_usuario,String usua_clave) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
