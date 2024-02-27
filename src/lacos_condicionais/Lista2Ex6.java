package lacos_condicionais;

import java.util.Scanner;

public class Lista2Ex6 {

	public static void main(String[] args) {

		String nome = "";
		String cargo = "";
		int codigo;
		float salario, reajuste, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador:");
        nome = leia.nextLine();

        System.out.println("Digite o código do cargo do colaborador (1 a 6):");
        codigo = leia.nextInt();

        System.out.println("Digite o salário do colaborador:");
        salario = leia.nextFloat();
        
        switch (codigo) {
        case 1:
            cargo = "Gerente";
            reajuste = 0.10f;
            break;
        case 2:
            cargo = "Vendedor";
            reajuste = 0.07f;
            break;
        case 3:
            cargo = "Supervisor";
            reajuste = 0.09f;
            break;
        case 4:
            cargo = "Motorista";
            reajuste = 0.06f;
            break;
        case 5:
            cargo = "Estoquista";
            reajuste = 0.05f;
            break;
        case 6:
            cargo = "Técnico de TI";
            reajuste = 0.08f;
            break;
        default:
            System.out.println("Código de cargo inválido!");
            return;
    }

        novoSalario = salario + (reajuste * salario);

        System.out.println("Nome do colaborador: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Novo salário reajustado: R$ %.2f", novoSalario);


	}

}
