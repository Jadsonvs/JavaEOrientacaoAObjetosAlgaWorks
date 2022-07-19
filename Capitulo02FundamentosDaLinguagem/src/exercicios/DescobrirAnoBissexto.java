package exercicios;

import java.util.Scanner;

public class DescobrirAnoBissexto {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println("O ano \"" + ano + "\" é uma ano bissexto");
		} else if (ano % 2 == 0) {
			if (ano % 100 != 0) {
				System.out.println("O ano \"" + ano + "\" é uma ano bissexto");
			}else {
				System.out.println("O ano \"" + ano + "\" não é uma ano bissexto");
			}
		} else {
			System.out.println("O ano \"" + ano + "\" não é uma ano bissexto");
		}
	}

}
