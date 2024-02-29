package vetor_matriz;

import java.util.Scanner;

public class List1_vetor_ex1 {

	public static void main(String[] args) {

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		int numero = leia.nextInt();

		int posicao = -1;

		for (int indice = 0; indice < vetor.length; indice++) {
			if (vetor[indice] == numero) {
				posicao = indice;
				break;
			}

		}

		if (posicao != -1) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}

		leia.close();
	}

}
