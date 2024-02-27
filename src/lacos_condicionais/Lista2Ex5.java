package lacos_condicionais;

import java.util.Scanner;

public class Lista2Ex5 {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		double preco, total;
		String produto = "";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código do produto (1 a 6):");
        codigo = leia.nextInt();
        
        System.out.println("Digite a quantidade comprada:");
        quantidade = leia.nextInt();
        
        switch (codigo) {
        case 1:
            preco = 10.00;
            produto = "Cachorro Quente";
            break;
        case 2:
            preco = 15.00;
            produto = "X-Salada";
            break;
        case 3:
            preco = 18.00;
            produto = "X-Bacon";
            break;
        case 4:
            preco = 12.00;
            produto = "Bauru";
            break;
        case 5:
            preco = 8.00;
            produto = "Refrigerante";
            break;
        case 6:
            preco = 13.00;
            produto = "Suco de laranja";
            break;
        default:
            System.out.println("Código de produto inválido!");
            return;
    }
        
        total = quantidade * preco;
        
        System.out.println("Produto comprado: " + produto);
        System.out.println("Valor total da conta: R$" + total);

	}

}
