package desafio1SistemaDeContasAPagar;

public class ContasAPagar {
	
	private String descricao;
	private double valor;
	private String dataVencimento;
	
	Fornecedor fornecedor;
	
	ContasAPagar(){
		
	}
	
	ContasAPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento){
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void pagar() {
		System.out.println("Fornecedor: " + fornecedor.getNome() + " \nDescrição: " + descricao + " \nValor: " + valor + " \nData de vencimento: " + dataVencimento);
		System.out.println();
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
		this.fornecedor =  fornecedor;
	}

}
