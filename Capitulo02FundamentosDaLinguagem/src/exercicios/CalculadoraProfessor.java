package exercicios;

public class CalculadoraProfessor {
	
	public static void main(String[] args) {
//		Constante do PI
		final float VALOR_DO_PI = 3.14F;
		
//		Raio informado pelo professor
		float raio = 10.3F;
		
//		Area � igual ao raio ao quadrado multiplicado por Pi
		float area = raio * raio * VALOR_DO_PI; 		
		int areaSemCasasDecimais = (int) area;
		
		System.out.println("�rea do circulo: " + area);
		System.out.println("Resultado da �rea do circulo sem casas decimais: " + areaSemCasasDecimais);
	}

}
