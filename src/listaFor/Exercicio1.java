package listaFor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num, i, contPar = 0, contImpar = 0;
		Scanner leia = new Scanner(System.in);
		
		for (i = 1; i <= 10; i++) {
			System.out.println("\nDigite o " + i + "º número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				contPar++;
			} else if (num % 2 == 1) {
				contImpar++;
			}
			leia.close();
		}
		
		System.out.println("Total números pares: " + contPar + " / Total números ímpares: " + contImpar);
	}
}
