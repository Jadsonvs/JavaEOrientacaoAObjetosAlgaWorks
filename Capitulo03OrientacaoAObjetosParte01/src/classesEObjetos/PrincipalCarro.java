package classesEObjetos;

public class PrincipalCarro {
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro();//Instanciando um Objeto.
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";//Acessando atributos do objeto e atribuindo valor.
		meuCarro.anoFabricacao = 2021;
		meuCarro.cor = "Prata";
		
		Carro seuCarro = new Carro();
		seuCarro.fabricante = "Honda";
		seuCarro.modelo = "Civic";
		seuCarro.anoFabricacao = 2009;
		seuCarro.cor = "Preto";
		
		System.out.println("Meu carro");
		System.out.println("-------------------------------");
		System.out.println("Modelo: " + meuCarro.modelo);
		System.out.println("Ano: " + meuCarro.anoFabricacao);
		
		System.out.println();
		System.out.println("Seu carro");
		System.out.println("-------------------------------");
		System.out.println("Modelo: " + seuCarro.modelo);
		System.out.println("Ano: " + seuCarro.anoFabricacao);
		
	}

}
