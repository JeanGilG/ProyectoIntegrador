package service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import model.Usuario;
import mybatis.MyBatisUtil;
import mybatis.mapper.LoginMapper;


public class LoginService {
	public Usuario login(String nomUsu, String claveUsu) {
		Usuario u = null;
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			LoginMapper mapper = session.getMapper(LoginMapper.class);
			
			HashMap<Object, Object> parameters = new HashMap<>();
			parameters.put("nomUsu", nomUsu);
			parameters.put("claveUsu", claveUsu);
			
			u = mapper.login(parameters);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return u;
	}
}
