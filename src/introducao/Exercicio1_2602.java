package introducao;

import java.util.Scanner;

public class Exercicio1_2602 {

	public static void main(String[] args) {
		
		float a, b, soma, diferenca, multiplicacao, divisao;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");	
		a = leia.nextFloat();
		
		System.out.println("Digite o valor de B: ");	
		b = leia.nextFloat();
		
		soma = a + b;
		diferenca = a - b;
		multiplicacao = a * b;
		divisao = a / b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Diferença: " + diferenca);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		
		if (a > b) {
		    System.out.println("A é maior que B");
		}else if (a==b) {
			System.out.println("A é igual a B");	
		}else {
		    System.out.println("B é maior que A");
		}
		
		leia.close();

	}

}
