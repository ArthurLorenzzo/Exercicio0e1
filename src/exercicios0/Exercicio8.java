package exercicios0;

import java.util.Scanner;

public class Exercicio8 {

	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva um numero de sua preferencia: ");
		int a = scanner.nextInt();
		
		if (a % 2 == 0) {
			System.out.print("Esse numero é PAR");
		} else {
			System.out.print("Esse numero é IMPAR");
		}
		
		scanner.close();
		
	}

}
