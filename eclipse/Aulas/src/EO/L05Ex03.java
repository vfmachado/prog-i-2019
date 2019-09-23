package EO;

import java.util.Scanner;

public class L05Ex03 {

	public static void main(String[] args) {
		
		//System.out.println("Funciona este programa!!!");
		Scanner entrada = new Scanner(System.in);
		
		//int habA, habB;
		float x, y;
		int tempo = 0;
		
		System.out.println("Informe o numero de habitantes da cidade A: ");
		x = entrada.nextInt();
		
		System.out.println("Informe o numero de habitantes da cidade B: ");
		y = entrada.nextInt();
				
		System.out.println("A cidade A tem: " + x);
		System.out.println("A cidade B tem: " + y);
		
		//aumentou 3%
		while (x < y) {
			
			x = x * 1.03f;
			y = y * 1.02f;
			tempo++; // tempo = tempo + 1
			
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
		}
		
		System.out.println("Anos necessários pasra que X >= Y são " + tempo);
	}

}
