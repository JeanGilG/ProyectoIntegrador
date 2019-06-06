package mybatis.mapper;

import java.util.HashMap;

import model.Usuario;

public interface LoginMapper {
	public Usuario login(HashMap<Object, Object> params);
}
