package argumentosPorValorOuReferencia;

public class Produto {

//	void definirpreco(double precoCusto) {
//	Adiciona 20% ao preço de custo
//		precoCusto = precoCusto + 1.20;	
//	}
	
	void definirPreco(Preco preco, double percentualImposto, double margemLucro) {
		preco.valorImpostos = preco.valorCustos * (percentualImposto /100);
		preco.valorLucro = preco.valorCustos * (margemLucro / 100);
		preco.precoVenda = preco.valorCustos + preco.valorImpostos + preco.valorLucro;
	}

}
