package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class List2_set_ex3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();

		System.out.println("Digite 10 valores inteiros não repetidos:");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			int numero = leia.nextInt();
			if (!numeros.contains(numero)) {
				numeros.add(numero);
			} else {
				System.out.println("Número repetido. Digite outro.");
				i--;
			}
		}
		System.out.println();
		System.out.println("Dados do set:");
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		leia.close();

	}
}
