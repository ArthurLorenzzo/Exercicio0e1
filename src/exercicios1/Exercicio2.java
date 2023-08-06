package exercicios1;

public class Exercicio2 {

	public static int retornaMaior(int a, int b) {
		if (a > b) {
			System.out.print("O primeiro valor é maior: ");
			return a;
		} else {
			System.out.print("O segundo valor é maior: ");
			return b;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		
		System.out.print(retornaMaior(5, 4));

	}

}
