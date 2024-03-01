package collection;

import java.util.Stack;
import java.util.Scanner;

public class Pilha_ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<>();

		int opcao;

		do {
			System.out.println("*********************************");
			System.out.println("            Menu:");
			System.out.println("\n1 - Adicionar um novo livro");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar um livro");
			System.out.println("0 - Sair");
			System.out.println("\n*********************************");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do livro a ser adicionado: ");
				String nomeLivro = leia.nextLine();
				livros.add(nomeLivro);
				System.out.println("\nLivro adicionado!\n");
				break;
			case 2:
				if (livros.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					System.out.println("\nTodos os livros:");
					for (String livro : livros) {
						System.out.println(livro);
					}
				}
				break;
			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nA pilha está vazia.\n");
				} else {
					String livroRetirado = livros.pop();
					System.out.println("\nLivro Retirado: " + livroRetirado + "\n");
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado.\n");
				break;
			default:
				System.out.println("\nOpção inválida. Tente novamente.\n");
			}
		} while (opcao != 0);
		
		leia.close();
	}
}

//Arrumar opção 3 de retirar um livro, não está mostrando qual livro retira

