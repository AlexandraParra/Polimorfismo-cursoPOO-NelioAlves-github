package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataFabrica;
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabrica) {
		super(nome, preco);
		this.dataFabrica = dataFabrica;
	}

	public Date getDataFabrica() {
		return dataFabrica;
	}

	public void setDataFabrica(Date dataFabrica) {
		this.dataFabrica = dataFabrica;
	}
	
	@Override
	public String precoMarcado() {
		return super.precoMarcado() + " (Data de fabricação: " + String.valueOf(sdf.format(dataFabrica)) + ")";
	}
	
	public String toString() {
		return super.getNome()
				+ " (usado) $"
				+precoMarcado();
	}
}
