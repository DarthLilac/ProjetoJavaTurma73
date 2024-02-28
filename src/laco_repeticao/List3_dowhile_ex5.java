package laco_repeticao;

import java.util.Scanner;

public class List3_dowhile_ex5 {

	public static void main(String[] args) {

		int numero, somaPositivos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				somaPositivos += numero;
			}
		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " + somaPositivos);
		
		leia.close();
	}

}
