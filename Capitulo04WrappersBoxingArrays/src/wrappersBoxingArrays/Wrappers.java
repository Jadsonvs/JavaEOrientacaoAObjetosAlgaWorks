package wrappersBoxingArrays;

import java.io.InputStream;
import java.io.PrintStream;

public class Wrappers {
	
	public static void main(String[] args) {
		//byte, short, int, long, float, double, char
		//Byte, Short, Integer, Long, Floar, Double, Character
		
		//Tipos primitivos e Tipo Class
		
				byte bytePrimitivo = 1;//Não tem método.
				Byte byteTipoClass;//Tem métodos
				
				short shortPrimitivo;
				Short shortTipoClassShort;
				
				int intPrimitivo;
				Integer intTipoClass;
				
				long longPrimitivo;
				Long longTipoClass;
				
				float floatPrimitivo;
				Float floatTipoClass;
				
				double doublePrimitivo;
				Double doubleTipoClass;
				
				char charPrimitibo;
				Character charTipoClass;
				
				boolean booleanPrimitivo;
				Boolean booleanTipoClass;
				
//-----------------  MANEIRA ANTIGA DE CONVERTER O TIPO WRAPPERS PARA O TIPO PRIMITIVO  -----------------
//				A PARTIR DA VERSÃO 9 DO JAVA OS CONSTRUTORES DAS CLASSES WRRAPER FORAM DEPRECIADOS.
				
				int x = 5;
				Integer i = new Integer(5);
			
		//XXXValue(); -> Para conversão de um WRAPPERS em um TIPO PRIMITIVO com o método XXXValue().	
				byte y = i.byteValue();
			
		//Dessa maneira conseguimos converter uma String para um tipo WRAPPERS(FLOAT)		
				String valor = "15.5";
				Float v = new Float(valor);
				System.out.println(v + 3);
				
				
				//O WRAPPER CHARACTER -  argumento somente aceita do tipo char, por isso que é usado aspas simples
				Character conversaoChar = Character.valueOf('a');
				System.out.println("Char: " + conversaoChar);
				
				//O WRAPPER BOOLEAN não diferencia letras maiúsculas de minúsculas(CASE SENSITIVE), e só aceita o TIPO PRIMITIVO BOOLEAN e STRING 
				boolean flag1 = true;
				boolean flag2 = false;
				String flag3 = "true";
				
				Boolean b1 = Boolean.valueOf("truE");
				Boolean b2 = Boolean.valueOf("TRUE");
				Boolean b3 = Boolean.valueOf("tue");
				Boolean b4 =  Boolean.valueOf(flag3);
				
		        if(b1){
		            System.out.println("B1 é verdadeiro!");
		        }
		         
		        if(flag1 == b2){
		            System.out.println("flag1 == b2: Igual");
		        }else{
		            System.out.println("flag1 == b2: Diferente");
		        }
		 
		        System.out.println(flag1 == b1 ? "flag1 == b1: Igual" : "flag1 == b1: Diferente");
		        System.out.println(flag1 == b3 ? "flag1 == b3: Igual" : "flag1 == b3: Diferente");
		        System.out.println(flag1 == b4 ? "flag1 == b4: Igual" : "flag1 == b4: Diferente");
				
//-----------------   MANEIRA ATUAL DE CONVERTER O TIPO WRAPPERS PARA O TIPO PRIMITIVO SEM CONSTRUTURES   -----------------		
// 		TODOS OS WRAPPERS POSSUI MÉTODOS DE CONVERSÃO PARA TIPO PRIMITIVOS e vise e versa, ENTRE OUTROS MÉTODOS				
				
//----------	XXXValue(); -> Esse tipo de método não contém argumentos e é utilizado quando precisa realizar uma conversão do valor de um OBJETO WRAPPER para um TIPO PRIMITIVO.
				//XXXValue() - WRAPPER PARA TIPO PRIMITIVO	
		        
//		        A forma adotada para a conversão de tipos primitivos em wrrapers é:
//		        <WrapperType>.valueOf(<primitiveType>)
		        
				Integer seis = 6;//OBJETO WRAPPERS
				int numero6Int = seis.intValue();
				short numero6Short = seis.shortValue();
				double numero6Double = seis.doubleValue();
				float numero6Float = seis.floatValue();
				byte numero6Byte = seis.byteValue();
				System.out.println("Wrappers convertidos em tipos primitivos  -> " + numero6Int + " e "+ numero6Short);
				
				
//------------	parseXXX(String s) -> Método do tipo primitivo usado para converter um objeto String para um tipo primitivo, sendo que retorna um primitivo nomeado.
				
				//Conversão de uma String para o tipo primitivo.
				int idade = Integer.parseInt("27");
				System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos.");
				
				
				double custo = Double.parseDouble("23.5");
				System.out.println("Custo total: " + custo);
				
			try {
				double total = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
				System.out.println("Custo total: " + total);	
			} catch(NumberFormatException e) {
				System.err.println("Número inválido para conversão.");
			}
			
			Double f = Double.valueOf(valor);
			System.out.println(Double.valueOf(valor) + 3);
			System.out.println(f + 3);
				
				
//------------	valueOf(String s) -> Método do tipo wrapper usado para converter um objeto String para um objeto wrapper, sendo que retorna um objeto wrapper recém criado do tipo que chamou o método.
			
				//Objeto Wrapper String convertido em Objeto Wrapper Integer
				String dez = "10";
				Integer numero10 = Integer.valueOf(dez);
				//Conversão de um tipo primitivo para um Objeto Wrapper
				double vinte = 20.5;
				Double numero20 = Double.valueOf(vinte);
				
				System.out.println("Objeto Wrapper String convertido em Objeto Wrapper Integer -> " + numero10);
				String numeroString = "20.5";
				double conversaoString = Double.valueOf(numeroString);
				int valorStringNove = Integer.valueOf("9");
				System.out.println("Wrapper String convertido em tipo primitivo double -> " + numeroString + " e tipo primitivo int -> "+ valorStringNove);
				
						
				
	}

}
