package lacos_condicionais;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
        numero = leia.nextInt();
        
        if (numero % 2 == 0) {
            System.out.print("O Número " + numero + " é par ");
        } else {
            System.out.print("O Número " + numero + " é ímpar ");
        }
        
        if (numero > 0) {
            System.out.println("e positivo!");
        } else if (numero < 0) {
            System.out.println("e negativo!");
        } else {
            System.out.println("e é zero!");
        }
        
        leia.close();

	}

}
