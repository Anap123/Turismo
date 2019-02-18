
public class EstabComercial {
	
	private int idHoteis;
	private int contato;
	private String endereco;
	private String nome;
	private int CNPJ;
	
	public int getIdHoteis() {
		return idHoteis;
	}
	public void setIdHoteis(int idHoteis) {
		this.idHoteis = idHoteis;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	
	@Override
	public String toString() {
		return "EstabComercial [idHoteis=" + idHoteis + ", contato=" + contato + ", endereco=" + endereco + ", nome="
				+ nome + ", CNPJ=" + CNPJ + "]";
	}
	
	
	

}
