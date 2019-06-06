package action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

import model.Producto;
import service.ProductoService;

public class ProductoAction extends ActionSupport {
	private ProductoService service = new ProductoService();
	private List<Producto> grdProducto;
	private int rows;
	private Producto registro = new Producto();
	private int idProd;
	private String mensaje;

	private static final Log log = LogFactory.getLog(ProductoAction.class);
	

	public ProductoService getService() {
		return service;
	}


	public void setService(ProductoService service) {
		this.service = service;
	}

	public List<Producto> getGrdProducto() {
		return grdProducto;
	}


	public void setGrdProducto(List<Producto> grdProducto) {
		this.grdProducto = grdProducto;
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public Producto getRegistro() {
		return registro;
	}


	public void setRegistro(Producto registro) {
		this.registro = registro;
	}
	
	public int getIdProd() {
		return idProd;
	}


	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public String execute() {
		log.info("En lista Producto Grid");
		try {
			
			this.setGrdProducto(service.listarTodos());
			this.setRows(getGrdProducto().size());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String nuevoProducto() {
		log.info("En nuevo Proveedor");
		try {
			setRegistro(new Producto());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String insertarProducto() {
		log.info("En insertar Proveedor");
		try {
			service.insertar(registro);
			setMensaje("Se registró correctamente el registro");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return execute();
	}
	
	public String eliminarProducto() {
		log.info("En eliminar Producto");
		try {
			
			service.eliminar(idProd);
			setMensaje("Se elimino correctamente el registro");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return execute();
	}
	
	public String editarProducto() {
		log.info("En editar Producto");
		try {
			
			setRegistro(service.consultarPK(idProd));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String actualizarProducto() {
		log.info("En actualizar Producto");
		try {
			
			service.actualizar(getRegistro());
			setMensaje("Se actualizo correctamente el registro");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return execute();
	}
	
}
