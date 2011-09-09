package svl.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import svl.pos.dominio.Usuario;
import svl.pos.dominio.UsuarioStore;
import svl.test.Tests;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String user = "practica";

	String passwd = "practica";
	
	public void init() throws ServletException {
	}
       
    

	//destino = "../../servletAdministracion?accion=consulta
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		procesarAccion(accion,request,response);
	}
	
	public void procesarAccion(String accion, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		if ( accion.equals("entrar") ){
			entrar(request,response);
		}else if ( accion.equals("Test") ){
			Test(request,response);
		}
		else if ( accion.equals("salir") ){
			salir(request,response);
		}else if ( accion.equals("Registro_VO") ){
			registrar(request,response);
		}else if ( accion.equals("SVL_Alertas") ){
			addAlerta(request,response);
		}else if ( accion.equals("insertarUsuario") ){
			insertarUsuario(request,response);
		}else if ( accion.equals("actualizarUsuario") ){
			actualizarUsuario(request,response);
		}else if ( accion.equals("nuevoPerfil") ){
			guardarNuevoPerfil(request,response);
		}else if ( accion.equals("consultarUsuario") ){
			consultarUsuario(request,response);
		}
	}
	
	public void procesarAccion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		if (logado(request)) {
			String accion = request.getParameter("accion");
			RequestDispatcher d = request.getRequestDispatcher(accion);
			if(d!=null){
				d.forward(request,response);
			}
			System.out.println("LOGADO ACCEDIENDO A " + accion);
		} else {
			response.sendRedirect("errorUsuario.htm");
		}
	}
	
	


	private void insertarUsuario(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("InsertarUsuario.jsp").include(request,response);
	}
	
	private void consultarUsuario(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ConsultarUsuario.jsp").include(request,response);
	}
	
	private void actualizarUsuario(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ActualizarUsuario.jsp").include(request,response);
	}

	private void registrar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("SVL_Registro_VO_1.jsp").include(request,response);
		
	}
	
	private void salir(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("salir", "si");
		request.getRequestDispatcher("ServletLogar").include(request,response);
		
	}
	
	private void Test(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.setAttribute("salir", "si");
		//request.getRequestDispatcher("ServletLogar").include(request,response);
		Tests.main();
	}
	
	private void guardarNuevoPerfil(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("nuevoPerfil").include(request,response);
		
	}
	
	public void addAlerta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("idalerta", 1);
		request.getRequestDispatcher("SVL_Alerta_1.jsp").include(request,response);
	}

	
	public void entrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		HttpSession session = request.getSession();
		
		if ( "si".equals((String)request.getAttribute("salir") )){
			session.invalidate();
			request.getRequestDispatcher("Inicio.jsp").include(request,response);
		}else{
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");

		UsuarioStore usuariostore = new UsuarioStore();
		if ( usuario != null && clave != null && !"".equals(usuario) && !"".equals(clave) ){
			if ( usuariostore.comprobarUsuario(usuario,clave) ){
				Usuario user = usuariostore.recuperarUsuarioByUsuarioClave(usuario,clave);
				request.getSession().setAttribute("usuario", user);
				request.getRequestDispatcher("Inicio.jsp").include(request,response);
			}else{
				request.getRequestDispatcher("errorUsuario.htm").include(request,response);
			}
		}
	}
		
	}
	
	private boolean logado(HttpServletRequest request) {
		boolean logado = false;

		HttpSession session = request.getSession(false);

		String userForm = request.getParameter("usuario");
		String passwdForm = request.getParameter("clave");

		if (session == null) {
			session = request.getSession();
			if (userForm == null || passwdForm == null
					|| userForm.length() == 0 || passwdForm.length() == 0) {
				logado = false;

			} else {
				if (valido(userForm, passwdForm)) {
					logado = true;
					session.setAttribute("session.user", userForm);
				} else {
					logado = false;
				}

			}

		} else {
			if (userForm == null || passwdForm == null) {
				logado = true;
			} else {
				if (valido(userForm, passwdForm)) {
					logado = true;
					session.setAttribute("session.user", userForm);
				} else {
					logado = false;
				}

			}
		}
		return logado;
	}

	public boolean valido(String userForm, String passwdForm) {
		boolean res = false;
		res = (userForm.equals(this.user) && passwdForm.equals(this.passwd));
		return res;

	}
	
	
}
