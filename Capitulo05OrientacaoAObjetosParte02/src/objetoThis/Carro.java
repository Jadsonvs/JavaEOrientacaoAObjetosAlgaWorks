package objetoThis;

public class Carro {
//	Criando atributos  	
	public String fabricante;// String são inicializadas como NULL
	
	public String modelo;
	
	public String cor;
	
	public int anoFabricacao;// Variável inicializada com o valor de 0.
	
	boolean flex;//Vriável inicializada com valor FALSE.
	
//	Tipos personalizados são inicializados como NULL.
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
