package argumentosPorValorOuReferencia;

public class Principal2 {
	/*
	 * Quando utilizamos um TIPO PRIMITIVO para referenciar uma valor, ele faz uma
	 * cópia desse valor, e quando Utilizamos um OBJETO para referenciar, ele apenas
	 * indica o OBJETO
	 */

	public static void main(String[] args) {
		Preco preco = new Preco();
		preco.valorCustos = 140;

		Produto produto = new Produto();
		produto.definirPreco(preco, 20, 15);

		System.out.println("Valor custos: " + preco.valorCustos);
		System.out.println("Valor impostos: " + preco.valorImpostos);
		System.out.println("Valor lucro: " + preco.valorLucro);
		System.out.println("Preço venda: " + preco.precoVenda);
	}

}
