package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila_ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<>();

		int opcao;

		do {
			System.out.println("*********************************");
			System.out.println("            Menu:");
			System.out.println("\n1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar uma pessoa");
			System.out.println("0 - Sair");
			System.out.println("\n*********************************");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do Cliente a ser adicionado na fila: ");
				String nomeCliente = leia.nextLine();
				clientes.add(nomeCliente);
				System.out.println("\nCliente adicionado!\n");
				break;
			case 2:
				if (clientes.isEmpty()) {
					System.out.println("\nA fila está vazia.");
				} else {
					System.out.println("\nClientes na fila:");
					for (String cliente : clientes) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (clientes.isEmpty()) {
					System.out.println("\nA fila está vazia.\n");
				} else {
					String clienteChamado = clientes.poll();
					System.out.println("\nCliente chamado: " + clienteChamado + "\n");
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
