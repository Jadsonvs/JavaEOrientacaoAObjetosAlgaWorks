package fundamentos;

public class SequenciasDeEscape {
	
	public static void main(String[] args) {
		System.out.println("Ol� \"galera\"");//Usado os caracteres de escape(CONTRA BARRA) para permitir a visualiza��o das aspas.
		
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
 --------------------------------------------------------------- PARTE TE�RICA --------------------------------------------------------------- 
 
 SEQUENCIAS/CARACTER DE ESCAPE ->
 
 O caractere de escape pode ser considerado um caracter especial, permitindo inserir uma nova linha dentro dos m�todos print e println do objeto System.out.
 
 Sequ�ncia de escape	                Descri��o
         \n	                            Nova linha. Posiciona o cursor de tela no in�cio da pr�xima linha
         
         \t	                            Tabula��o horizontal. Move o cursor de tela para a pr�xima parada de tabula��o.
         
         \r	                            Posiciona o cursor da tela no in�cio da linha atual - n�o avan�a para a pr�xima linha. Qualquer sa�da de caracteres gerada depois de 
                                        algum retorno j� gerado � sobrescrito os caracteres anteriores gerados na linha atual.
                                        
         \\	                            Barras invertidas. Utilizada para imprimir um caractere de barra invertida.
         
         \�	                            Aspas duplas. Utilizada para imprimir um caractere de aspas duplas. Exemplo, System.out.println(�\�aspas\��); exibe �aspas�
         
LINK: https://www.devmedia.com.br/system-out-objeto-de-saida-em-java/25240
 
 
 
 */
