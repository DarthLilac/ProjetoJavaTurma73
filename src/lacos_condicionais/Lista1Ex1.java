package lacos_condicionais;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		
		int a, b, c, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
        a = leia.nextInt();
        
        System.out.println("Digite o valor de B: ");
        b = leia.nextInt();
        
        System.out.println("Digite o valor de C: ");
        c = leia.nextInt();
        
        soma = a + b;
        
        if (soma > c) {
            System.out.println("A soma de A + B é maior do que C.");
        } else if (soma < c) {
            System.out.println("A soma de A + B é menor do que C.");
        } else {
            System.out.println("A soma de A + B é igual a C.");
        }
        
        leia.close();
        
	}

}
