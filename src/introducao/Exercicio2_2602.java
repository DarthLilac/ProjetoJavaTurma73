package introducao;

import java.util.Scanner;

public class Exercicio2_2602 {

	public static void main(String[] args) {

	double pi = 3.14159;
	double raio;
	double area;
	
	Scanner leia = new Scanner(System.in);
	System.out.print("Raio: " );
	raio= leia.nextDouble();
			
	area = pi * (raio * raio);
	System.out.printf("Area: %.4f" , area);
	
	leia.close();


	}

}
