package classesEObjetos;

import exercicio01InstanciandoEAcessandoAtributosDoObjeto.Cachorro;

public class PrincipalProprietario {
	
	public static void main(String[] args) {
/*		ProprietarioCarro dono = new ProprietarioCarro();
		dono.nome = "Jadson Viana dos Santos";
		dono.cpf = "000.000.000-00";
		dono.idade = 28;
		dono.logadouro = "Rua João Pineheiro, 10";
		dono.bairro = "Paraisópolis";
		dono.cidade = "São Paulo";
		
		Carro meuCarro = new Carro();
		meuCarro.anoFabricacao = 2011;
		meuCarro.cor = " Vermelho";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.dono = dono;
		
		OU PODE FAZER DE OUTRA MANEIRA
		
		Carro meuCarro = new Carro();
		meuCarro.anoFabricacao = 2011;
		meuCarro.cor = " Vermelho";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		
		meuCarro.dono = new ProprietarioCarro();
		meuCarro.dono.nome = "João";
		meuCarro.dono.bairro = "taboão";
*/		
		
//		-----------------------------------------------
		
/*		Carro seuCarro = new Carro();
		seuCarro.anoFabricacao = 2009;
		seuCarro.cor = "Preto";
		
		seuCarro.dono.nome = "José Pereira"; Se não instanciarmos nosso objeto não conseguiremos acessar a classe e dará erro.
		
		seuCarro.dono = new ProprietarioCarro();//Devemos sempre instanciar o objeto primeiro par então usar-lo, ou seja acessar sua a classe.
		seuCarro.dono.nome = "Kayky";
*/
		
//		------------------------- Variáveis referenciam objetos ----------------------
		
/*		EXEMPLO 01
		
		ProprietarioCarro dono1 = new ProprietarioCarro();
		dono1.nome = "João da Silva";
		
		Carro carro1 = new Carro();
		carro1.modelo = "Palio";
		
		carro1.dono = dono1;// Dessa maneira ligamos o objeto dono1 ao objeto carro1. Assim o carro1 pertece ao dono1.
		
		carro1.dono.nome = "Maria Joaquina";
		
		System.out.println("carro1.dono.nome: " + carro1.dono.nome);
		System.out.println("dono1.nome: " + dono1.nome);
		
		EXEMPLO 2
		
		ProprietarioCarro dono2 = new ProprietarioCarro();
		dono2.nome = "João da Silva";
		
		Carro carro2 = new Carro();
		carro2.modelo = "Palio";
		
		Carro carro3 = new Carro();
		carro3.modelo = "Civic";
		
		carro2.dono = dono2;
		carro3.dono = dono2;
		
		System.out.println("Antes da mudança");
		System.out.println(carro2.dono.nome);
		System.out.println(carro3.dono.nome);
		System.out.println(dono2.nome);
		
		carro2.dono.nome = "Sebastião";
		
		System.out.println("Depois da mudança");
		System.out.println(carro2.dono.nome);
		System.out.println(carro3.dono.nome);
		System.out.println(dono2.nome);
*/		
		
		
		
		
		
	}

}
