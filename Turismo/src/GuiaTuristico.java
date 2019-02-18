
public class GuiaTuristico {
	
	private String nome;
	private int contato;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	
	@Override
	public String toString() {
		return "GuiaTuristico [nome=" + nome + ", contato=" + contato + "]";
	}
	
	

}
