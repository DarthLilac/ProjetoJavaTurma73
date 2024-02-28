package laco_repeticao;

import java.util.Scanner;

public class List1_for_ex1 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo:");
		n1 = leia.nextInt();

		System.out.println("Digite o último número do intervalo:");
		n2 = leia.nextInt();

		leia.close();

		if (n1 > n2) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.println("Múltiplos de 3 e 5 no intervalo [" + n1 + ", " + n2 + "]:");
			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " " + "é múltiplo de 3 e 5!");
				}
			}
		}
	}
}