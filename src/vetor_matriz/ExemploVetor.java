package vetor_matriz;

import java.util.Scanner; //ctrl + shift + o

public class ExemploVetor {

	public static void main(String[] args) {

		String cachorros[] = new String[3];
		
		Scanner leia = new Scanner (System.in);
		int indice;
		
		for(indice = 0; indice < 3; indice++) {
			
			//sysout e pressionar CTRL + espaço
			
			System.out.println("Digite o " + (indice + 1) + "° nome");
			cachorros[indice] = leia.nextLine();	
		}

		//cachorros.lenght = 3
		
		//lista os nomes
		for(indice = 0; indice < 3; indice++) {
			System.out.println("Cachorros[" + indice + "]: " + cachorros[indice]);
		}
	}

}
