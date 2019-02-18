
public class municipios {
	
	private int id;
	private int cep;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "municipios [id=" + id + ", cep=" + cep + "]";
	}
	
	

	
}
