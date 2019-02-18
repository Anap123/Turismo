
public class Turista {

	private String nome;
	private int CPF;
	private int contato;
	private String endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Turista [nome=" + nome + ", CPF=" + CPF + ", contato=" + contato + ", endereco=" + endereco + "]";
	}
	
	
	

}
