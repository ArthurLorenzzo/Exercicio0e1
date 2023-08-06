package exercicios1;

public class Exercicio7 {
	
public static void main(String[] args) {

		
		for(int i = 0; i<=100; i++) {
			if ( i % 3 == 0) {
				int resultadoInt = i/2;
				double resultadoDouble = (double) i/2;
				
				System.out.println(resultadoInt);
				System.out.println(resultadoDouble);
				System.out.println();
			}
		}
		
	}


}
