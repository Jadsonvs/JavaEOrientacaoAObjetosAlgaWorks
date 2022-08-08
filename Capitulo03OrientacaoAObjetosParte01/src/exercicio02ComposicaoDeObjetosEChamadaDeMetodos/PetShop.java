package exercicio02ComposicaoDeObjetosEChamadaDeMetodos;

public class PetShop {
	
	public static void main(String[] args) {
		Cachorro cachorro01 = new Cachorro();
		cachorro01.nome = "Bidu";
		cachorro01.idade = 1;
		cachorro01.raca = "Boxer";
		cachorro01.sexo = "M";
		
		Cachorro cachorro02 = new Cachorro();
		cachorro02.nome = "Cleberson";
		cachorro02.idade = 4;
		cachorro02.raca = "Caramelo";
		cachorro02.sexo = "M";
		
		System.out.println("Cachorro 01");
		System.out.println(cachorro01.nome);
		System.out.println(cachorro01.idade);
		System.out.println(cachorro01.raca);
		System.out.println(cachorro01.sexo);
		
		System.out.println("---------------------");
		
		System.out.println("Cachorro 02");
		System.out.println(cachorro02.nome);
		System.out.println(cachorro02.idade);
		System.out.println(cachorro02.raca);
		System.out.println(cachorro02.sexo);
	}

}
