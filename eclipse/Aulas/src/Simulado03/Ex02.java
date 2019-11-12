package Simulado03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int lados[] = new int[6];
		
		System.out.println("Informe quantos lançamentos serão executados:");
		int lancamentos = in.nextInt();
		int contador = 0;
		
		System.out.println("Informe a o valor da face voltada para cima a cada lançamento:");
		//for (int contador = 0; contador < lancamentos; contador++)
		while (contador < lancamentos) {
			
			int face = in.nextInt();
			int pos = face -1;
			
			lados[pos]++;
			
			contador++;
		}
		
		System.out.println("O resultado para este dado é: ");
		for (int i = 0; i < lados.length; i++) {
			System.out.println("Face " + (i+1) + ": " + lados[i]);
		}
	}

}
