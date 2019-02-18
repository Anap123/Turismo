
public class Visita {
	
	private int Visita;
	private String local;
	
	public int getVisita() {
		return Visita;
	}
	public void setVisita(int visita) {
		Visita = visita;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	@Override
	public String toString() {
		return "Visita [Visita=" + Visita + ", local=" + local + "]";
	}
	
	
	

}
