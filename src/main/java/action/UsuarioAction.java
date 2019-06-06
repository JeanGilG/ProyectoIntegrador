package action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

import model.Producto;
import model.Usuario;
import service.UsuarioService;

public class UsuarioAction extends ActionSupport {
	private UsuarioService service = new UsuarioService();
	private List<Usuario> grdUsuario;
	private int rows;
	private Usuario registro = new Usuario();
	private int idUsu;
	private String mensaje;
	
	private static final Log log = LogFactory.getLog(ProductoAction.class);

	public UsuarioService getService() {
		return service;
	}

	public void setService(UsuarioService service) {
		this.service = service;
	}

	public List<Usuario> getGrdUsuario() {
		return grdUsuario;
	}

	public void setGrdUsuario(List<Usuario> grdUsuario) {
		this.grdUsuario = grdUsuario;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public Usuario getRegistro() {
		return registro;
	}

	public void setRegistro(Usuario registro) {
		this.registro = registro;
	}

	public int getIdUsu() {
		return idUsu;
	}

	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String listarUsuario() {
		log.info("En lista Usuario Grid");
		try {
			
			this.setGrdUsuario(service.listarTodos());
			this.setRows(getGrdUsuario().size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String nuevoUsuario() {
		log.info("En nuevo Usuario");
		try {
			setRegistro(new Usuario());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String insertarUsuario() {
		log.info("En insertar Usuario");
		try {
			service.insertar(registro);
			setMensaje("Se registró correctamente el registro");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listarUsuario();
	}
	public String eliminarUsuario() {
		log.info("En eliminar Usuario");
		try {
			
			service.eliminar(idUsu);
			setMensaje("Se elimino correctamente el registro");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listarUsuario();
	}
	public String editarUsuario() {
		log.info("En editar Usuario");
		try {
			
			setRegistro(service.consultarPK(idUsu));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String actualizarUsuario() {
		log.info("En actualizar Usuario");
		try {
			
			service.actualizar(getRegistro());
			setMensaje("Se actualizo correctamente el registro");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listarUsuario();
	}
}
