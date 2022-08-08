package desafioComArrayProgramaEstoque;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Estoque estoque = new Estoque();
		int quantidadeDeProdutos = 0;
		
		System.out.println(">> ------>> SYSTEMA DE ESTOQUE  << ------ <<\n");
		System.out.println(">>>>>>>> BEM VINDO(A) AO ESTOQUE <<<<<<<<");
		
		for(int i = 1; i > 0; i++) {
			System.out.println("\n[A] - Adicionar produto \n[B] - Buscar produto \n[C] - Listar produtos \n[D] - Total de produto no estoque \n[F] - Finalizar");
			System.out.print("\nOpção selecionada -> ");
			String opcoes = entrada.next();	
				
			if(opcoes.equalsIgnoreCase("A")) {
				estoque.adicionarProduto(entrada, estoque, quantidadeDeProdutos);
			}else if(opcoes.equalsIgnoreCase("B")) {
				estoque.buscarProduto(entrada);
			}else if(opcoes.equalsIgnoreCase("C")) {
				estoque.listarProdutos(estoque);
			}else if(opcoes.equalsIgnoreCase("D")) {
				estoque.somarTotalDeProdutos();
			}else if(opcoes.equalsIgnoreCase("F")) {
				break;
			}
			
		}
		
		System.out.println();
		System.out.println(">> ------>> SYSTEMA DE ESTOQUE  << ------ <<");
		
	}

}


