package Simulado03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int lados[] = new int[6];
		
		System.out.println("Informe quantos lan�amentos ser�o executados:");
		int lancamentos = in.nextInt();
		int contador = 0;
		
		System.out.println("Informe a o valor da face voltada para cima a cada lan�amento:");
		//for (int contador = 0; contador < lancamentos; contador++)
		while (contador < lancamentos) {
			
			int face = in.nextInt();
			int pos = face -1;
			
			lados[pos]++;
			
			contador++;
		}
		
		System.out.println("O resultado para este dado �: ");
		for (int i = 0; i < lados.length; i++) {
			System.out.println("Face " + (i+1) + ": " + lados[i]);
		}
	}

}
