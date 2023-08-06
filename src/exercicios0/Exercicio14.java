package exercicios0;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        System.out.println("Digite 50 números:");

        while (contador < 50) {
            int numero = scanner.nextInt();
            soma = soma + numero;
            contador++;
        }

        double media = (double) soma / 50;

        System.out.println("A média aritmética dos 50 números é: " + media);
        
        scanner.close();

	}

}
