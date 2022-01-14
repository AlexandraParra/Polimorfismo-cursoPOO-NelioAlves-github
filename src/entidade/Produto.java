package entidade;

public class Produto {
	private String nome;
	protected Double preco;
	
	public Produto() {
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String precoMarcado() {
		return String.valueOf(String.format("%.2f",preco));
	}
	
	public String toString() {
		return nome
				+ " $"
				+precoMarcado();
	}
}
