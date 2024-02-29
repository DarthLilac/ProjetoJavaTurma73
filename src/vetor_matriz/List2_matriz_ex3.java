package vetor_matriz;

import java.util.Scanner;

public class List2_matriz_ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		System.out.println("Digite uma matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = leia.nextInt();
			}
		}

		System.out.println("Elementos da diagonal principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][i] + " ");
		}

		System.out.println("Elementos da diagonal secundária: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][2 - i] + " ");
		}

		int somaDiagP = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagP += matriz[i][i];
		}
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagP);

		int somaDiagS = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagS += matriz[i][2 - i];
		}
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagS);

		leia.close();
	}

}
