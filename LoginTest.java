package test;

import code.Login;
import junit.framework.TestCase;

public class LoginTest extends TestCase {

	
  public void testGetLoginUsername() {
	  
	  Login login1 = new Login();
	  login1.setUsername("Sabiha"); 
	  login1.setPassword("vora");
	  assertEquals("Sabiha vora",login1.getLogin());
	  
	  
	  Login login2 = new Login(); 
	  login2.setUsername("Sabiha");
	  login2.setPassword("N/A"); 
	  assertEquals ("Sabiha N/A",login2.getLogin());
	  
	  
	  Login login3 = new Login ();
	  login3.setUsername("N/A");
	  login3.setPassword("Sabiha"); 
	  assertEquals("N/A Sabiha",login3.getLogin());
	  
	  Login login4 = new Login (); 
	  login4.setUsername("N/A");
	  login4.setPassword("N/A"); 
	  assertEquals ("N/A N/A",login4.getLogin()); 
	  }
}
