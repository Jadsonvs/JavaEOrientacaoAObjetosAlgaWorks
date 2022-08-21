package construtores;

public class Pessoa {
	
	String nome;
	int idade;
	
	//CONSTRUTOR VAZIO. É criado por DEFAULT pela pelo compilador.
	//Podemos cria-lo ou não que não faz diferença no programa.
//	Pessoa(){
//		
//	}
	
	
	//INICIALIZANDO UM CONSTRUTOR.
	Pessoa(String nome){
		this.nome = nome;
		//Inicialização bem complicada de fazer...	
	}
	
	//SOBRECARGA DE CONSTRUTORES
	//A diferenciação dos construtores ocorre pela quantidade de parâmetros passados em cada construtor
	Pessoa(String nome, int idade){
		this(nome);//Atenção! Deve ser a primeira instrução dentro do construtor. Fazendo assim chamaremos outro construtor já criado.
		this.idade = idade;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 CARACTERÍSTICAS DE UM CONSTRUTOR:
	 
	 1º - Não tem um tipo de retorno
	 2º - Deve ter o mesmo nome da classe
	 
	 */

}
