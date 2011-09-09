package svl.pos.data;

import java.sql.Connection;
import java.util.List;
import svl.pos.dominio.*;

public interface IUsuarioDAO {
	boolean comprobarUsuario(String nombreUsuario, String password);
	List<Usuario> selectAllUsers();
	Integer recuperarIdByUsuarioClave(String usua_usuario, String usua_clave);
	Usuario selectUserById(String usua_id);
	boolean isLogado(String usua_usuario, String usua_clave);
	boolean isRegistrado(Connection conn, Usuario usuario);
	Integer obtenerUsuaId(String usua_usuario, String usua_clave);
	boolean singOut();
	boolean isAdmin(Usuario u);
	Usuario recuperarUsuarioByIdUsuario(String usua_id);
	//todo
	Usuario recuperarUsuarioByUsuarioClave(String usua_usuario, String usua_clave);
	void insertarUsuario(Usuario usuario);
	void borrarUsuario(int usua_id);
	void actualizarUsuario(Usuario usuario);
	void insertarUsuarioAlerta (Alerta alerta);

}
