package desafio3PacotesEEnumeracoesSistemaDeContasAPaga;

public class ContasAPagar {

	private String descricao;
	private double valor;
	private String dataVencimento;

	Fornecedor fornecedor;

	SituacaoConta situacaoConta;

	ContasAPagar() {
		situacaoConta = SituacaoConta.PENDENTE;
	}

	ContasAPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		this();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void exibir() {
		System.out.println("Fornecedor: " + fornecedor.getNome() + " \nDescrição: " + descricao + " \nValor: " + valor
				+ " \nData de vencimento: " + dataVencimento + "\nSituação da conta: " + getSituacaoConta() + "\n");
	}

	public void pagar() {
		if(situacaoConta == SituacaoConta.PENDENTE) {
			situacaoConta = SituacaoConta.PAGA;
			System.out.println("Fornecedor: " + fornecedor.getNome() + " \nDescrição: " + descricao + " \nValor: " + valor
					+ " \nData de vencimento: " + dataVencimento + "\nSituação da conta: " + getSituacaoConta() + "\n");
		}else{
			String erro = "PAGA OU CANCELADA";
			System.out.println("Fornecedor: " + fornecedor.getNome() + " \nDescrição: " + descricao + " \nValor: " + valor
					+ " \nData de vencimento: " + dataVencimento + "\nSituação da conta: " + erro + "\n");
		}
	}
	
	public void cancelar() {
		if(situacaoConta == SituacaoConta.PENDENTE) {
			situacaoConta = SituacaoConta.CANCELADA;
			System.out.println("Fornecedor: " + fornecedor.getNome() + " \nDescrição: " + descricao + " \nValor: " + valor
					+ " \nData de vencimento: " + dataVencimento + "\nSituação da conta: " + getSituacaoConta() + "\n");
		}else {
			String erro = "PAGA OU CANCELADA";
			System.out.println("Fornecedor: " + fornecedor.getNome() + " \nDescrição: " + descricao + " \nValor: " + valor
					+ " \nData de vencimento: " + dataVencimento + "\nSituação da conta: " + erro + "\n");
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

}
