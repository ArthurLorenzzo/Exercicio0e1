package exercicios1;

public class Exercicio8 {

	public static boolean palavraInvertida(String palavra) {
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	
        String entrada = "arara";
        
        if (palavraInvertida(entrada)) {
            System.out.println(entrada + " Pode ser lida de tras pra frente");
        } else {
            System.out.println(entrada + " não pode ser lida");
        }
    }

}
