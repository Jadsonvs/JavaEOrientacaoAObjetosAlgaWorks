package desafio3PacotesEEnumeracoesSistemaDeContasAPaga;

public class Principal {

	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Neg�cios Imobili�rios");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do Jo�o");

		ContasAPagar conta1 = new ContasAPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);

		ContasAPagar conta2 = new ContasAPagar(mercado, "Compras do m�s", 390d, "19/05/2012");

		ContasAPagar conta3 = new ContasAPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");

		// pagamento de conta pendente 
		conta1.pagar();

		// tentativa de pagar uma conta cancelada (n�o deve aceitar pagamento)
		conta2.cancelar();
		conta2.pagar();

		// tentativa de pagar uma conta duas vezes (n�o deve aceitar na segunda vez)
		conta3.pagar();
		conta3.pagar();
	}

}
