package desafioComArrayProgramaEstoque;

import java.util.Scanner;

public class Estoque {
	
	Produto[] produtos;
	
	void adicionarProduto(Scanner entrada, Estoque estoque, int quantidadeDeProdutos) {
		System.out.println();
		System.out.print("[ QUANTIDADE DE PRODUTO ] -> ");
		int quantidaDeProdutos = entrada.nextInt();
		entrada.nextLine();
		
		estoque.produtos = new Produto[quantidaDeProdutos];
		for(int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();
			
			System.out.println("\n [Produto " + (i + 1) + "]");
			System.out.println("------------------------");
			
			System.out.print("Descrição: ");
			estoque.produtos[i].descricao = entrada.nextLine();
				
			System.out.print("Quantidade de itens: ");
			estoque.produtos[i].quantidade = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("------------------------");	
		}
	}
	
	 void listarProdutos(Estoque estoque) {
		System.out.println("\n[PRODUTOS EM ESTOQUE]");
		System.out.println("------------------------");
		
		for(int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i].descrever();
		}
	}
	
	void somarTotalDeProdutos() {
		System.out.println();
		System.out.println("[TOTAL DE PRODUTOS EM ESTOQUE]");
		System.out.println("------------------------");
		int total = 0;
		
		for(int i = 0; i < produtos.length; i++) {
			total = total + produtos[i].quantidade;
		}
		System.out.println("Total - " + total);
	}
	
	void buscarProduto(Scanner entrada) {
		System.out.println();
		System.out.println("[PESQUISA DE PRODUTO]");
		System.out.println("------------------------");
		
		System.out.print("Buscar: ");
		String produtoPesquisado = entrada.next();
		
		for(int i = 0; i < produtos.length; i++) {
			
			if(produtos[i].descricao.equalsIgnoreCase(produtoPesquisado)) {
				System.out.println();
				produtos[i].descrever();;
				System.out.println();
				System.out.println("------------------------");
			}
		}
	}
	
//	void deletaProdutor(Estoque estoque) {
//		for(int i = 0; i < produtos.length; i++) {
//			estoque.produtos[i];
//		}
//	}

}
