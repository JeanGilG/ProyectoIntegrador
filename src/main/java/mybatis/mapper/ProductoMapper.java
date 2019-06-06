package mybatis.mapper;

import java.util.List;

import model.Producto;

public interface ProductoMapper {
	
	public abstract int insertar(Producto model) throws Exception;
	public abstract int eliminar(int idProd) throws Exception;
	public abstract int actualizar(Producto model) throws Exception;
	public abstract List<Producto> listarTodos() throws Exception;
	public abstract Producto consultarPK(int idProd) throws Exception;
}
