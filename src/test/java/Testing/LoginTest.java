package Testing;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import action.LoginAction;
import model.Usuario;
import service.LoginService;

public class LoginTest {
	
	@Test
	public void testLogin() {
		LoginService service = new LoginService();
		LoginAction login = new LoginAction();
		Usuario usu = service.login("Cristhian", "1234");
		
		login.login();
		assertNotNull(usu);
	}
}
