package construtores;

public class Pessoa {
	
	String nome;
	int idade;
	
	//CONSTRUTOR VAZIO. � criado por DEFAULT pela pelo compilador.
	//Podemos cria-lo ou n�o que n�o faz diferen�a no programa.
//	Pessoa(){
//		
//	}
	
	
	//INICIALIZANDO UM CONSTRUTOR.
	Pessoa(String nome){
		this.nome = nome;
		//Inicializa��o bem complicada de fazer...	
	}
	
	//SOBRECARGA DE CONSTRUTORES
	//A diferencia��o dos construtores ocorre pela quantidade de par�metros passados em cada construtor
	Pessoa(String nome, int idade){
		this(nome);//Aten��o! Deve ser a primeira instru��o dentro do construtor. Fazendo assim chamaremos outro construtor j� criado.
		this.idade = idade;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 CARACTER�STICAS DE UM CONSTRUTOR:
	 
	 1� - N�o tem um tipo de retorno
	 2� - Deve ter o mesmo nome da classe
	 
	 */

}
