import java.util.HashMap;

/*Key could be user name and value could be our password
 * */
public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Geoffrey","pizza%");
		logininfo.put("Daniel","amsterdom2");
		logininfo.put("Jennifer","Rush--&");
		logininfo.put("David","PASSWORD");
		logininfo.put("Lena","abc123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}