package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {

		String nome;
		int idade;
		
		Scanner leia = new Scanner(System.in);  // entrada de dados
		
		System.out.println("Insira o nome: ");	
		nome = leia.next();
		
		System.out.println("Insira a idade: ");	
		idade = leia.nextInt();
				
		System.out.println("Nome: " + nome); // saída
		System.out.println("Idade: " + idade);
		
	}

}
