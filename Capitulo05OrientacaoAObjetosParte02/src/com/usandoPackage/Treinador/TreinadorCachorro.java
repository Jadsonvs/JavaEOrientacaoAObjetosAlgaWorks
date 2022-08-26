package com.usandoPackage.Treinador;

import com.usandoPackage.Animal.Cachorro;
public class TreinadorCachorro {
	
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();	
		cachorro1.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro1);
		
	}

}
