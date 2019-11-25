package AvII_101;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Defina o tamanho da matriz: ");
		int tam = in.nextInt();
		
		int mat[][] = new int[tam][tam];
		
		for (int lin = 0; lin < tam; lin++) {
			for (int col = 0; col < tam; col++) {
				
				if (col % 2 == 0) {
					mat[lin][col] = 1;
				}
				
			}
		}
		
		
		for (int lin = 0; lin < tam; lin++) {
			for (int col = 0; col < tam; col++) {
				System.out.print(mat[lin][col]);
			}
			System.out.println();
		}
	}

}
