import java.util.HashMap;
import java.util.Map;
public class User {
	private String username;
	private String password;
	private Map<String, String> settings;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.settings = new HashMap<>();
	}

	public String getUsername(){
		return username;
	}

	public String getPassword(){
		return password;
	}

	public void setUsername(String usernameIn){
		this.username = usernameIn;
	}

	public void setPassword(String passwordIn){
		this.password = passwordIn;
	}
	
	public void updateSettings(String key, String value){
		settings.put(key, value);
	}
}
