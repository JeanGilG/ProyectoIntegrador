	package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.Producto;
import mybatis.MyBatisUtil;
import mybatis.mapper.ProductoMapper;

public class ProductoService implements ProductoMapper{

SqlSessionFactory sqlMapper = MyBatisUtil.getSqlSessionFactory();

@Override
public int insertar(Producto model) throws Exception {
	int ok = -1;
	SqlSession session =  sqlMapper.openSession();
	try {
		ok = session.insert("idInsertarProducto", model); 
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
public int eliminar(int idProd) throws Exception {
	int ok = -1;
	SqlSession session =  sqlMapper.openSession();
	try {
		ok = session.delete("idEliminarProducto", idProd);
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
public int actualizar(Producto model) throws Exception {
	int ok = -1;
	SqlSession session =  sqlMapper.openSession();
	try {
		ok = session.update("idActualizarProducto", model);
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
public List<Producto> listarTodos() throws Exception {
	SqlSession session = sqlMapper.openSession();
	List<Producto> lista = new ArrayList<Producto>();
	try {
		lista = session.selectList("idListarTodosProductos");
	}catch(Exception e) {
		e.printStackTrace();
	}
	return lista;
}

@Override
public Producto consultarPK(int idProd) throws Exception {
	SqlSession session = sqlMapper.openSession();
	Producto model = null;
	try {
		model = (Producto)session.selectOne("idConsultarPKProducto", idProd);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return model;
	}

}
