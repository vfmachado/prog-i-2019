package Trimestre_3.t101.aula_16_09;

import java.util.Scanner;

public class ExemploSwitch02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		char letra = entrada.next().toLowerCase().charAt(0);
		
		System.out.println("A letra digitada foi: " + letra);
		
		//vamos fazer um programa que diga se uma letra � vogal ou consoante.
		//CONSIDERANDO que o usu�rio ir� digitar, obrigatoriamente, uma letra.
		
		switch (letra) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("� uma vogal! =P");
			
			//trechos com c�digo e l�gica e todo o resto que j� aprendemos.
			
			break;
			
		default:
			System.out.println("Consoante detectada!!!");
			
		}
		
	}

}
