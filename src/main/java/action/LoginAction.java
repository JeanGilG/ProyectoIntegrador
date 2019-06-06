package action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import model.Usuario;
import service.LoginService;



public class LoginAction extends ActionSupport {
	
	private static final Logger logger = LogManager.getLogger(LoginAction.class);

	private String nomUsu;
	private String claveUsu;
	private String mensaje;
	
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getNomUsu() {
		return nomUsu;
	}
	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}
	public String getClaveUsu() {
		return claveUsu;
	}
	public void setClaveUsu(String claveUsu) {
		this.claveUsu = claveUsu;
	}
	public String login() {
		
		logger.debug("Ingreso al login");
		
		LoginService service = new LoginService();
		
		Usuario emp = service.login(nomUsu, claveUsu);
		
		if (emp instanceof Usuario) {
			return SUCCESS;
		}else {	
			setMensaje("¡Usuario o contraseña incorrecta!");
			return ERROR;
		}
	}
}
