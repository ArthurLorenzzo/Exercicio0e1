package exercicios0;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
	
	        int contador = 0;
	        int soma = 0;
	
	        System.out.println("Digite 50 números:");
	
	        
	        do {
	        	int numero = scanner.nextInt();
	            soma = soma + numero;
	            contador++;
	        } while (contador < 50);
	        
	
	        double media = (double) soma / 50;
	
	        System.out.println("A média aritmética dos 50 números é: " + media);
	        
	        scanner.close();
	
		}

}
