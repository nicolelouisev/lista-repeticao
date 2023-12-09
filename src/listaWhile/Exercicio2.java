package listaWhile;

import java.util.Scanner;

public class Exercicio2 {

	    public static void main (String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int pessoasBackend = 0;
	        int mulheresFront = 0;
	        int homensAcima40 = 0;
	        int naoBiAbaixo30 = 0;
	        int totalPessoas = 0;
	        int somaIdades = 0;

	        char continuar;

	        do {
	            System.out.print("Digite a idade: ");
	            int idade = leia.nextInt();

	            System.out.print("Escolha o número correspondente à identidade de gênero: ");
	            int genero = leia.nextInt();

	            System.out.print("Escolha o número correspondente à pessoa desenvolvedora: ");
	            int desenvolvedor = leia.nextInt();

	            totalPessoas++;
	            somaIdades += idade;

	            switch (desenvolvedor) {
	                case 1:
	                    pessoasBackend++;
	                    break;
	                case 2:
	                    if (genero == 1 || genero == 4) {
	                        mulheresFront++;
	                    }
	                    break;
	                case 3:
	                    if ((genero == 2 || genero == 5) && idade > 40) {
	                    	homensAcima40++;
	                    }
	                    break;
	                case 4:
	                    if (genero == 3 && idade < 30) {
	                    	naoBiAbaixo30++;
	                    }
	                    break;
	                default:
	                    System.out.println("Opção inválida para pessoa desenvolvedora.");
	            }

	            System.out.print("Deseja continuar a leitura dos dados de um novo colaborador?");
	            System.out.println("\nDigite s para sim OU digite n para não: ");
	            continuar = leia.next().charAt(0);

	        } while (continuar == 'S' || continuar == 's');

	        leia.close();

	        System.out.println("\nResultados da Pesquisa:");
	        System.out.println("Número de pessoas desenvolvedoras Backend: " + pessoasBackend);
	        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFront);
	        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensAcima40);
	        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBiAbaixo30);
	        System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
	        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + (float) somaIdades / totalPessoas);
	    }

}

