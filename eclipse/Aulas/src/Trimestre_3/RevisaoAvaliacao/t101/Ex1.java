package Trimestre_3.RevisaoAvaliacao.t101;

import java.util.Scanner;

public class Ex1 {

	//13:49
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		char letra = in.next().charAt(0);
		
		switch (letra) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("A letra digitada é uma vogal");				
			break;
		default:
			System.out.println("Não é uma vogal!");
		
		}
		
	}
	//13:50

}
