package Trimestre_3.t102.aula_23_09;

import java.util.Scanner;

public class ExemploSwitch02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//primeira letra da palavra digitada pelo usuário
		char letra = entrada.next().charAt(0);
		
		
		switch (letra) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("É uma vogal!");
			break;
		
		//caso padrão
		default:
			System.out.println("É uma consoante!");
			break;
		}
		
		
	}

}
