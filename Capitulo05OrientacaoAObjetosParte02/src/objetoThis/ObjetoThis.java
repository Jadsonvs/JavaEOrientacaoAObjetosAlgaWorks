package objetoThis;
public class ObjetoThis {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Palio";
		
		System.out.println("Modelo antes: " + carro.modelo);
		
		carro.alterarModelo("Civic");
		
		System.out.println("Modelo depois: " + carro.modelo);
	}
	/*
	 O Objeto this aponta para o objeto que estamos inseridos.
	 O this referencia a classe atual onde ele est� sendo chamado no Java..
	 */

}
