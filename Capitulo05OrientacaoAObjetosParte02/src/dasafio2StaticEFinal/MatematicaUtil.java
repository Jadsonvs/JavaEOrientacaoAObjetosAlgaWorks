package dasafio2StaticEFinal;

public class MatematicaUtil {
	public final static double PI = 3.14;
	
	public static int calcularFibonacci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
	}
	
	public static double calcularAreaCirculo(double raio) {
		double areDoCirculo = (raio * raio) * PI;
		
		return areDoCirculo;
	}

}
