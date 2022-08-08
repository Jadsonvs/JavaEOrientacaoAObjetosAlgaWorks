package classesEObjetos;

public class Carro {
//	Criando atributos  	
	public String fabricante;// String são inicializadas como NULL
	
	public String modelo;
	
	public String cor;
	
	public int anoFabricacao;// Variável inicializada com o valor de 0.
	
	boolean flex;//Vriável inicializada com valor FALSE.
	
//	Tipos personalizados são inicializados como NULL.
	ProprietarioCarro dono;//Relacionamento com a Classe ProprietarioCarro
	
	void ligar() {
		if(modelo != null) {
			System.out.println("Ligando o carro: " + modelo);		
		}
	}	
}
