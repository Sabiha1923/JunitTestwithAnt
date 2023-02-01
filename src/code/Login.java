package code;

public class Login
{
	String username = null;
	String password = null;
	
	public String getLogin()
	{
		String returnValue = null;
		if ((this.username != null) && (this.password != null))
		returnValue = this.username + " " + this.password;
		
		else if(this.username != null) 
			returnValue = this.username + "N/A";
		
		else if(this.password != null) 
			returnValue ="N/A" + this.password;
		
		else
			returnValue = "N/A" + "N/A";
		return returnValue;
				
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
