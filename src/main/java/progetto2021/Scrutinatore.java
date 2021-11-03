package progetto2021;

public class Scrutinatore {
	private final String id;
	private final boolean authenticated;
	
	public Scrutinatore(String newID) {
		if (newID == null) throw new NullPointerException("id is null");
		id = newID;
		authenticated = false;
	}
	private Scrutinatore(String newID, Boolean auth) {
		if (newID == null) throw new NullPointerException("id is null");
		if (auth == null) throw new NullPointerException("auth is null");
		id = newID;
		authenticated = auth;
	}
	private Boolean placeholder4SPID(String checkID, String password) {
		if (password.equals("1234")) return true;
		else return false;
	}
	
	public Scrutinatore login(String password) {
		if (placeholder4SPID(id , password)) return new Scrutinatore(id , true);
		else return new Scrutinatore(id, false);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Scrutinatore)) return false;
		Scrutinatore echeck = (Scrutinatore) o;
		if (echeck.id == id && echeck.authenticated == authenticated) return true;
		else return false;
		
 	}
	
	@Override
	public String toString() {
		return "["+id + " " +"autheticated : "+ authenticated+"]";
	}
	
	@Override
	public int hashCode() {
		int hash = id.hashCode();
		Boolean k = new Boolean(authenticated);
		return hash * 31 + k.hashCode();
	}
}
