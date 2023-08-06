package exercicios1;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] diaSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
		
		System.out.print("Digite um numero de 1 a 7: ");
		int entrada = scanner.nextInt();
		
		if (entrada < 1 || entrada > 7) 
			System.out.println("digite um numero valido: ");	
		else
			System.out.println(diaSemana[entrada - 1]);
		
		scanner.close();
		
	}
	
}
