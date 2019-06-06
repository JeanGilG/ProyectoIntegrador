package mybatis.mapper;

import java.util.List;

import model.Usuario;

public interface UsuarioMapper {

	public abstract int insertar(Usuario model) throws Exception;
	public abstract int eliminar(int idUsu) throws Exception;
	public abstract int actualizar(Usuario model) throws Exception;
	public abstract List<Usuario> listarTodos() throws Exception;
	public abstract Usuario consultarPK(int idUsu) throws Exception;
}
