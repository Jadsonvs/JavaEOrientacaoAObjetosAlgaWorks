package javaBeans;

public class PessoaBean {
	
	private String nome;
	private int idade;
	
	// Setter and Getter
	
	public String getNome() {
		return nome;
	}
	
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

}

/*
 Na contru��o de uma classe com o padr�o JavaBeans devemos obrigatoriamente ter os ATRIBUTOS COMO PRIVATE, UM CONTRUTOR VAZIO
 E UTILIZAR OS M�TODOS GETTERS E SETTERS PARA ACESSAR E MODIFICAR NOSSOS ATRIBUTOS
 */
