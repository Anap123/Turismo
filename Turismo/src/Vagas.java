
public class Vagas {
	
	private int quantidade;
	private Double precos;
	private int idVagas;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPrecos() {
		return precos;
	}
	public void setPrecos(Double precos) {
		this.precos = precos;
	}
	public int getIdVagas() {
		return idVagas;
	}
	public void setIdVagas(int idVagas) {
		this.idVagas = idVagas;
	}
	
	@Override
	public String toString() {
		return "Vagas [quantidade=" + quantidade + ", precos=" + precos + ", idVagas=" + idVagas + "]";
	}
	
	

}
