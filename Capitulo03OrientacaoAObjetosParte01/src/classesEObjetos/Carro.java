package classesEObjetos;

public class Carro {
//	Criando atributos  	
	public String fabricante;// String s�o inicializadas como NULL
	
	public String modelo;
	
	public String cor;
	
	public int anoFabricacao;// Vari�vel inicializada com o valor de 0.
	
	boolean flex;//Vri�vel inicializada com valor FALSE.
	
//	Tipos personalizados s�o inicializados como NULL.
	ProprietarioCarro dono;//Relacionamento com a Classe ProprietarioCarro
	
	void ligar() {
		if(modelo != null) {
			System.out.println("Ligando o carro: " + modelo);		
		}
	}	
}
