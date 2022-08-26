package com.usandoPackage.Animal;

public class Cachorro {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void sentar() {
		System.out.println("Eu, " + nome + ", vou sentar.");
	}
	
	/*
	 MAIS SOBRE PACKAG -> https://www.devmedia.com.br/compreendendo-o-uso-de-pacotes-ou-packages/27478
	 */

}
