package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		int valor = 5;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o salário bruto: ");	
		salarioBruto = leia.nextFloat();
		
		System.out.println("Insira o adicional noturno: ");	
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Insira aa horas extras: ");	
		horasExtras = leia.nextFloat();
		
		System.out.println("Insira os descontos: ");	
		descontos = leia.nextFloat();
		
		leia.close();
		
		
		float calculo = horasExtras * valor;
		
		float salarioLiquido = salarioBruto + adicionalNoturno + calculo - descontos;
		
		System.out.println("O salário líquido é : " + salarioLiquido);

	}

}
