package Trimestre_3.t101.aula_16_09;

import java.util.Scanner;

public class ExemploSwitch02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		char letra = entrada.next().toLowerCase().charAt(0);
		
		System.out.println("A letra digitada foi: " + letra);
		
		//vamos fazer um programa que diga se uma letra é vogal ou consoante.
		//CONSIDERANDO que o usuário irá digitar, obrigatoriamente, uma letra.
		
		switch (letra) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("É uma vogal! =P");
			
			//trechos com código e lógica e todo o resto que já aprendemos.
			
			break;
			
		default:
			System.out.println("Consoante detectada!!!");
			
		}
		
	}

}
