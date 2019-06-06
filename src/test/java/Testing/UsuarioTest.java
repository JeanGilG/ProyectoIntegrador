package Testing;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import action.LoginAction;
import action.UsuarioAction;
import model.Usuario;
import service.LoginService;
import service.UsuarioService;

public class UsuarioTest {

	
	
	@Test
	public void testUsuario() {
		UsuarioService service = new UsuarioService();
		UsuarioAction action = new UsuarioAction();
		
		Usuario model = new Usuario();
		
		model.setApeUsu("Gil Garcia");
		model.setNomUsu("Jean");
		model.setClaveUsu("123");
		model.setIdTipoEmpleado("1");
		assertNotNull(model);
	}
}
