package exercicios1;

public class Exercicio10 {

	
	public static void main(String[] args) {
        String input = "Quantas vogais tem aqui";
        int[] counts = countCharacters(input);
        
        System.out.println("Vogais: " + counts[0]);
        System.out.println("Espaços em branco: " + counts[1]);
        System.out.println("Consoantes: " + counts[2]);
        
    }

    public static int[] countCharacters(String palavra) {
        int[] contador = new int[3];
        
        palavra = palavra.toLowerCase();  
        
        for (int i = 0; i < palavra.length(); i++) {
            char ch = palavra.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contador[0]++;  //Vogal
            } else if (ch == ' ') {
                contador[1]++;  //Espaço em branco
            } else if (Character.isLetter(ch)) {
                contador[2]++;  //Consoante
            }
        }
        
        return contador;
    }
	
	
}