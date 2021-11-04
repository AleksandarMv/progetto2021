package progetto2021;

public class Elettore {
	private final String id;
	private final boolean authenticated;
	
	public Elettore(String newID) {
		if (newID == null) throw new NullPointerException("id is null");
		id = newID;
		authenticated = false;
	}
	private Elettore(String newID, Boolean auth) {
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
		if (placeholder4SPID(id , password)) return new Elettore(id , true);
		else return new Scrutinatore(id, false);
	}
	//ancora da implementare, lasciato vuoto
	public void vota (String idVoto, String scelta) {
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Elettore)) return false;
		Elettore echeck = (Elettore) o;
		if (echeck.id.equals(id) && echeck.authenticated == authenticated) return true;
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
}
