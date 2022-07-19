package fundamentos;

import java.util.Scanner;

public class OperadorTernario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
/*
 OPERADOR TERN�RIO ->  (Express�o Boolean) ? "ValorCasoverdadeiro" : "ValorCasoFalso"
 
 O valor pode ser uma String ou numeral.
 */
		
//		                    Express�o boolean   ValorCasoVerdadeiro      ValorCasoVerdadeiro
		String indicacao =   (idade >= 18)    ?      "adulto"        :  "crianca/adolescente";
		
//		int x = (idade >= 18) ? 1 : 2;
		
//		if (idade >= 18) {
//			indicacao = "adulto";
//		}else {
//			indicacao = "crianca/adolescente";
//		}
//		
		System.out.println("Resultado: " + indicacao);
		
	}


}
