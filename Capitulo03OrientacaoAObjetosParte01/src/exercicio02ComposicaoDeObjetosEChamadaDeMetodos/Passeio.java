package exercicio02ComposicaoDeObjetosEChamadaDeMetodos;

public class Passeio {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Jadson";
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Fabiana";
		
		Cachorro cachorro01 = new Cachorro();
		cachorro01.nome = "James";
		cachorro01.idade = 2;
		cachorro01.raca = "Pintch";
		cachorro01.sexo = "F";
		pessoa2.cachorro = cachorro01;
		
		
		/* Esse trecho de código comentado, 
		 poderia ser utilizado para substituir 
		 o código "p1.cachorro = new Cachorro();"
		 Cachorro cachorro = new Cachorro()
		 p1.cachorro = cachorro;
		*/
		
		pessoa1.cachorro =  new Cachorro();
		
		pessoa1.cachorro.nome = "Bobo";
		pessoa1.cachorro.idade = 3;
		pessoa1.cachorro.raca = "Caramelo";
		pessoa1.cachorro.sexo = "M";
		
		Caminhada caminha = new Caminhada();
		caminha.andar(pessoa1);
	}

}
