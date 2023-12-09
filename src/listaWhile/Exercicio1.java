package listaWhile;

import java.util.Scanner;

public class Exercicio1 {
	
    public static void main(String[] args) {
        int idade = 0, pessMenor21 = 0, pessMaior50 = 0;
        Scanner leia = new Scanner(System.in);

        while (idade >= 0) {
            System.out.println("Digite uma idade: ");
            idade = leia.nextInt();
            
            if (idade >= 0) { 
                if (idade < 21) {
                    pessMenor21++;
                }
                if (idade > 50) {
                    pessMaior50++;
                }
            }
        }
        
        System.out.println("Total de pessoas menores de 21 anos: " + pessMenor21 + " / Total de pessoas maiores 50 anos: " + pessMaior50);
        leia.close();
    }
}