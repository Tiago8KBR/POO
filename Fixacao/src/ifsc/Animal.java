package ifsc;

public class Animal {

	private String nome;
	private String raca;
	private Float comprimento;
	private Integer numerodepatas;
	private String cor;
	private String ecosistema;

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public Float getComprimento() {
		return comprimento;
	}

	public Integer getNumerodepatas() {
		return numerodepatas;
	}

	public String getCor() {
		return cor;
	}

	public String getEcosistema() {
		return ecosistema;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	public void setNumerodepatas(Integer numerodepatas) {
		this.numerodepatas = numerodepatas;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setEcosistema(String ecosistema) {
		this.ecosistema = ecosistema;
	}

}
