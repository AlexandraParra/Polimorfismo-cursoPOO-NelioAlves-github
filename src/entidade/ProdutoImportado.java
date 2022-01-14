package entidade;

public class ProdutoImportado extends Produto{
	private Double taxa;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public double precoTotal() {
		return super.getPreco() + taxa;
	}
	
	@Override
	public String precoMarcado() {
		return String.format("%.2f",precoTotal()) + " (Taxa de alf�ndega: $" + String.format("%.2f",taxa) + ")";
	}
}
