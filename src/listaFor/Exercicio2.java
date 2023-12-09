package listaFor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int i, priNum = 0, ultNum = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		priNum = leia.nextInt();
		
		System.out.println("\nDigite o último número do intervalo: ");
		ultNum = leia.nextInt();
		
		if (priNum < ultNum) {
			for(i = priNum; i <= ultNum; i++) {
				
				if(i % 3 == 0 && i % 5 ==0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
				leia.close();
			}
		} else System.out.println("Intervalo inválido!");
		
	}
}
