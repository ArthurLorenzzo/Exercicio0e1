package exercicios1;

import java.text.DecimalFormat;

public class Exercicio4 {

	
public static void converteMilhas(double milhas) {
		
		double km = milhas * 1.609;
		
		 DecimalFormat decimalFormat = new DecimalFormat("#.##");
	     String kmFormatted = decimalFormat.format(km);

	     System.out.println(kmFormatted + " Km/h");
	}
	
	public static void main(String[] args) {
		
		converteMilhas(60);

	}
}
