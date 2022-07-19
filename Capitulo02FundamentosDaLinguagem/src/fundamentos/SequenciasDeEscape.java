package fundamentos;

public class SequenciasDeEscape {
	
	public static void main(String[] args) {
		System.out.println("Olá \"galera\"");//Usado os caracteres de escape(CONTRA BARRA) para permitir a visualização das aspas.
		
	}
	
//	public static void main(String[] args) {		
//		String rna = dnaToRna("GCAU");
//		
//	}
//	
//	public static String dnaToRna(String dna) {  
//		dna = dna.replaceAll("U","T");
//		
//		return dna;  // Do your magic!
//	}	 
}

/*
 --------------------------------------------------------------- PARTE TEÓRICA --------------------------------------------------------------- 
 
 SEQUENCIAS/CARACTER DE ESCAPE ->
 
 O caractere de escape pode ser considerado um caracter especial, permitindo inserir uma nova linha dentro dos métodos print e println do objeto System.out.
 
 Sequência de escape	                Descrição
         \n	                            Nova linha. Posiciona o cursor de tela no início da próxima linha
         
         \t	                            Tabulação horizontal. Move o cursor de tela para a próxima parada de tabulação.
         
         \r	                            Posiciona o cursor da tela no início da linha atual - não avança para a próxima linha. Qualquer saída de caracteres gerada depois de 
                                        algum retorno já gerado é sobrescrito os caracteres anteriores gerados na linha atual.
                                        
         \\	                            Barras invertidas. Utilizada para imprimir um caractere de barra invertida.
         
         \”	                            Aspas duplas. Utilizada para imprimir um caractere de aspas duplas. Exemplo, System.out.println(“\”aspas\””); exibe “aspas”
         
LINK: https://www.devmedia.com.br/system-out-objeto-de-saida-em-java/25240
 
 
 
 */
