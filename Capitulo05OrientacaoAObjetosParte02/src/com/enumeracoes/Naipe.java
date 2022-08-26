package com.enumeracoes;

public enum Naipe {
	
	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADA("Preto"),
	COPAS("Vermelho");
	
	Naipe(String cor){
		this.cor = cor;
	}
	
	private String cor;
	
	public String getCor() {
		return cor;
	}
}

/*
 Enum s�o usados para declarar valores absolutos que n�o mudam tanto.
 Podemos ter no enum construtores, atributos e m�todos.
 */