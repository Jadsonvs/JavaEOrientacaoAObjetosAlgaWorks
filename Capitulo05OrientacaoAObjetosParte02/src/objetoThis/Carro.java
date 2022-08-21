package objetoThis;

public class Carro {
//	Criando atributos  	
	public String fabricante;// String s�o inicializadas como NULL
	
	public String modelo;
	
	public String cor;
	
	public int anoFabricacao;// Vari�vel inicializada com o valor de 0.
	
	boolean flex;//Vri�vel inicializada com valor FALSE.
	
//	Tipos personalizados s�o inicializados como NULL.
	ProprietarioCarro dono;//Relacionamento com a Classe ProprietarioCarro
	
	void alterarModelo(String modelo) {
		if(modelo != null) {
			this.modelo = modelo;// O this aponta para o objeto que estamos inseridos
		}
		
	}
	
	void ligar() {
		if(modelo != null) {
			System.out.println("Ligando o carro: " + modelo);		
		}
	}	
}
