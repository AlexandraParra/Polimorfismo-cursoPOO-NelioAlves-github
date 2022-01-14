import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;
import entidade.ProdutoImportado;
import entidade.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List <Produto> list = new ArrayList<>();
		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do produto #"+i+":");
			System.out.print("Comum, usado ou importado (c,u,i)? ");
			char p = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (p == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				Date data = sdf.parse(sc.next());
				Produto produto = new ProdutoUsado(nome, preco, data);
				list.add(produto);
			} else if (p == 'i') {
				System.out.print("Taxa de alfândega: ");
				double taxa = sc.nextDouble();
				Produto produto = new ProdutoImportado(nome, preco, taxa);
				list.add(produto);
			} else {
				Produto produto = new Produto(nome, preco);
				list.add(produto);
			}	
		}
		
		System.out.println();
		System.out.println("Preços marcados:");
		for (Produto produto: list) {
			System.out.println(produto);
		}
		sc.close();

	}

}
