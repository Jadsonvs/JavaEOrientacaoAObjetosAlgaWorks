package exercicios;

import java.util.Scanner;

public class MultaVeiculo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Tipo do veiculo (passeio, caminhao): ");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.print("Velocidade máxima da via: ");
		int velocidaMaxima = entrada.nextInt();
		
		System.out.print("Velocidade do veiculo: ");
		int velocidadeVeiculo = entrada.nextInt();
		
//		 veiculo de passeio com velocidade maior que 10% da velocidade da via
//		 e caminhao com velocidade maior que 5% deve receber multa
//		Utilizando o operador lógico &&(E)
//		if((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidaMaxima * 1.1) || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidaMaxima * 1.05))  {
//				System.out.println("Multa");
//		}else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidaMaxima * 1.05) {
//				System.out.println("Multa");
//		}
		
		
		// veiculo de passeio com velocidade maior que 10% da velocidade da via
		// e caminhao com velocidade maior que 5% deve receber multa
//		Utilizando o operador lógico ||(OU)
		if((tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidaMaxima * 1.1) || (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidaMaxima * 1.05))  {
			System.out.println("Multa");
	}
	
	}

}
