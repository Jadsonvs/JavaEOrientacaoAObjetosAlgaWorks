package classesEObjetos;

public class CriandoNomeandoChamandoMetodos {
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Palio";
		
		Carro seuCarro = new Carro();
		seuCarro.modelo = "Civic";
		
		meuCarro.ligar();//Chamando o m�todo ligar()(m�todo sem returno) que pertence classe Carro para o objeto meuCarro.
		seuCarro.ligar();
	}

}
