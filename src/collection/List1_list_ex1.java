package collection;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class List1_list_ex1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite 5 cores");
		System.out.println();

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "° cor:");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		System.out.println();
		System.out.println("Todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println();
		System.out.println("Cores em ordem crescente:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();
	}

}
