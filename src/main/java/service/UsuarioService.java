package service;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import model.Usuario;
import mybatis.MyBatisUtil;
import mybatis.mapper.UsuarioMapper;

public class UsuarioService implements UsuarioMapper{
	SqlSessionFactory sqlMapper = MyBatisUtil.getSqlSessionFactory();
	@Override
	public int insertar(Usuario model) throws Exception {
		int ok = -1;
		SqlSession session =  sqlMapper.openSession();
		try {
			ok = session.insert("idInsertarUsuario", model); 
			session.commit();
		}catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return ok;
	}

	@Override
	public int eliminar(int idUsu) throws Exception {
		int ok = -1;
		SqlSession session =  sqlMapper.openSession();
		try {
			ok = session.delete("idEliminarUsuario", idUsu);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return ok;
	}

	@Override
	public int actualizar(Usuario model) throws Exception {
		int ok = -1;
		SqlSession session =  sqlMapper.openSession();
		try {
			ok = session.update("idActualizarUsuario", model);
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally{
			session.close();
		}
		return ok;
	}

	@Override
	public List<Usuario> listarTodos() throws Exception {
		SqlSession session = sqlMapper.openSession();
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			lista = session.selectList("idListarTodosUsuarios");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Usuario consultarPK(int idUsu) throws Exception {
		SqlSession session = sqlMapper.openSession();
		Usuario model = null;
		try {
			model = (Usuario)session.selectOne("idConsultarPKUsuario", idUsu);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return model;
	}
}
