package javaBeans;

public class TesteJavaBean {
	
	public static void main(String[] args) {
		PessoaBean pessoa = new PessoaBean();
		
//		pessoa.nome = "Maria"; Dessa maneira n�o conseguimos por o nome, por que o atributo nome est� como privado
		pessoa.SetNome("Maria");
		pessoa.setIdade(21);
		
		System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
		
		
		
		
	}

}
