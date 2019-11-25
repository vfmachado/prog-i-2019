package AvII_102;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Defina o tamanho da matriz: ");
		int tam = in.nextInt();
		
		int mat[][] = new int[tam][tam];
		
		//colocar 1 nas colunas pares e 0 nas colunas ímpares
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if (j % 2 == 0) {
					mat[i][j] = 1;
				}
				
				System.out.print(mat[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
