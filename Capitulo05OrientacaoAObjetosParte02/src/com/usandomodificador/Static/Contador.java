package com.usandomodificador.Static;

public class Contador {
	
	//quando utilizamos o STATIC a vari�vel fica pertecendo apenas a classe e n�o ao OBJETO, ou seja, se criarmos 2 objetos, 
	//teremos apenas 1 variavel count dividida para os dois objetos.
	public static int COUNT = 0;
	
	public final static double PI = 3.14;
	
	public void incrementar() {
		COUNT++;
	}
	
	public static void imprimirContador() {
		System.out.println("O valor do contador agora �: " + Contador.COUNT);
	}

}
