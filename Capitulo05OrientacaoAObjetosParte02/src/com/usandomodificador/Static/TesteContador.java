package com.usandomodificador.Static;

public class TesteContador {
	
	public static void main(String[] args) {
//		Contador.count++;
//		int valorDoCount = 6;
//		System.out.println("Valor do Count: " + valorDoCount);
		
		Contador c = new Contador();
		c.incrementar();
//		System.out.println(Contador.COUNT);
//		
		Contador.COUNT++;
//		System.out.println(Contador.COUNT);
		
		Contador.imprimirContador();
	}
	
	

}

