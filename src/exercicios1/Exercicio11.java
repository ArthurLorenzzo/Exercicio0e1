package exercicios1;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();
        
        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Palavras em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else {
            System.out.println("Palavras em ordem alfabética: " + palavra2 + ", " + palavra1);
        }
        
        if (palavra1.length() > palavra2.length()) {
            System.out.println("A primeira palavra tem mais caracteres.");
        } else if (palavra2.length() > palavra1.length()) {
            System.out.println("A segunda palavra tem mais caracteres.");
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
        
        scanner.close();
    }

}

