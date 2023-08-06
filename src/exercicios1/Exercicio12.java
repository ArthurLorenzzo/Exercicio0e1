package exercicios1;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalQuilometros = 0;
        int totalLitros = 0;
        int tanque = 1;
        
        while (true) {
            System.out.print("Digite os quilômetros dirigidos no tanque " + tanque + " (ou -1 para sair): ");
            int quilometros = scanner.nextInt();
            
            if (quilometros == -1) {
                break;
            }
            
            System.out.print("Digite os litros de gasolina consumidos no tanque " + tanque + ": ");
            int litros = scanner.nextInt();
            
            double consumo = (double) quilometros / litros;
            System.out.printf("Consumo do tanque %d: %.2f km/l%n", tanque, consumo);
            
            totalQuilometros += quilometros;
            totalLitros += litros;
            tanque++;
        }
        
        if (tanque > 1) {
            double consumoMedio = (double) totalQuilometros / totalLitros;
            System.out.printf("Consumo médio total: %.2f km/l%n", consumoMedio);
            System.out.println("Total de quilômetros: " + totalQuilometros);
            System.out.println("Total de litros consumidos: " + totalLitros);
        } else {
            System.out.println("Nenhum dado inserido.");
        }
        
        scanner.close();
    }


}
