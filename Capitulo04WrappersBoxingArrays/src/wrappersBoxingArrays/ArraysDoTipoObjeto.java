package wrappersBoxingArrays;


public class ArraysDoTipoObjeto {
	
	public static void main(String[] args) {
		
//----------------- ARRAY DO TIPO PRIMITIVO	-----------------
		Carro[] carros = new Carro[4];	
		
		carros[0] = new Carro();
		carros[0].anoFabricacao = 2021;
		
		System.out.println("Ano de fabricação -> " + carros[0].anoFabricacao);
		
		
	}

}

