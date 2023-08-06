package exercicios0;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva o código do produto que deseja: ");
		
		if( scanner.hasNextInt()) {
			
			int codigo = scanner.nextInt();
			
			if (codigo == 001)
				System.out.println("Parafuso");
			else if ( codigo == 002)
				System.out.println("Porca");
			else if (codigo == 003 )
				System.out.println("Prego");
			else
				System.out.println("Diversos");
		} else { 
			System.out.println("Digite um codigo valido");
		}
		
		scanner.close();
		
		
	}
}
