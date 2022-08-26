package com.enumeracoes;

public class TesteOperacaoEnum {

	public static void main(String[] args) {
		OperacaoAritmetica soma = OperacaoAritmetica.ADICAO;
		
		int resultado = soma.operacao(5, 5);
		System.out.println("O resultado é: " + resultado);
		
		//FOR avançado
		for(OperacaoAritmetica oa : OperacaoAritmetica.values()) {
			System.out.println(oa + " -> " + oa.operacao(4, 3));
		}
	}
	
}
