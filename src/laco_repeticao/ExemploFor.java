package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		int contador;
		Scanner leia = new Scanner(System.in);

		// contador++ -> contador = contador + 1

		for (contador = 0; contador <= 2; contador++) {

			System.out.println("Digite o " + (contador + 1) + "° nome: ");
			nome = leia.nextLine();
			System.out.println("O " + (contador + 1) + "° nome é: " + nome);


		}
		
		leia.close();
	}
}
