package exercicios1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();
        
        System.out.println("Números primos menores que " + number + ":");
        for (int i = 2; i < number; i++) {
            if (numerosPrimos(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    public static boolean numerosPrimos (int n1) {
        if (n1 <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n1); i++) {
            if (n1 % i == 0) {
                return false;
            }
        }
        
        return true;
    }

}
