package exercicios1;

public class Exercicios6 {

	public static void main(String[] args) {
		
		for (int i = 15; i < 30 ; i++) {
			
			if ( i % 2 == 1) {
				int produtoInt = i * i;
				float produtoFloat = (float) i * i;
				
				System.out.println("Resultado Int: " + produtoInt);
				System.out.println("Resultado Float: " + produtoFloat);
				System.out.println();
			}
		}

	}

}
