package laco_repeticao;

import java.util.Scanner;

public class List2_while_ex3 {

	public static void main(String[] args) {
		
		int idade, menores21 = 0, maiores50 = 0, entre21e50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade:");
		idade = leia.nextInt();
		
		while (idade >=0) {
			if (idade < 21) {
				menores21++;
			} else if (idade > 50) {
				maiores50++;
			} else {
				entre21e50++;
			}
			idade = leia.nextInt();
		}
		
		leia.close();
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
        System.out.println("Total de pessoas maiores de 50 anos: " + entre21e50);

	}

}
