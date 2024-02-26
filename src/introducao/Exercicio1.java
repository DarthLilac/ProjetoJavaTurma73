package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");	
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");	
		abono = leia.nextFloat();
		
		leia.close();
		
		float novoSalario = salario + abono;
		
		System.out.println("O novo salário é " + novoSalario);
		
	}

}
