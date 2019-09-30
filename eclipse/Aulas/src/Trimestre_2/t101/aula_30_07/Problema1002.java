package Trimestre_2.t101.aula_30_07;

import java.util.Scanner;

public class Problema1002 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double n = 3.14159;
		double area, raio;
		
		raio = entrada.nextDouble();
		
		area = n * raio * raio;
		
		//System.out.println("A=" + area);
		System.out.printf("A=%.4f\n", area);
		// %.4f é onde vai a variavel
		// \n pula de linha (final de linha)
	}
	
}
