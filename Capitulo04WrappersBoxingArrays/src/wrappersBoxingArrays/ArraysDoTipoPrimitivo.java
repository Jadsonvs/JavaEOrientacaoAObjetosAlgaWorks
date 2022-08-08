package wrappersBoxingArrays;

public class ArraysDoTipoPrimitivo {
	
	public static void main(String[] args) {
		
//----------------- ARRAY DO TIPO PRIMITIVO	-----------------	
		
		int[] exemplo;//Criando Array			
		exemplo = new int[4];////Inicializando e informando quantas posições queremos dentro do nosso Array. No caso 4.
		
		
		int[] notas = new int[5];
		notas[0] = 10;//Adicionando valor dentro de uma posição do Array. No caso a posição 0.
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		notas[4] = 0;
		
		//Todo Array é inicializado com o valor 0, caso não usemos todas as posições dele.
		
		System.out.println("Nota do primeiro aluno: " + notas[0]);//Para exibir o valor de dentro de uma posição. No caso a posição 0.
		System.out.println("Tamanho do Array -> " + notas.length);
		
		//Para imprimir todo os valores do nosso Array
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Posição[ " + i + " ]" + " equivale a nota -> " + notas[i]);
		}
//		System.out.println(notas);
	}

}
