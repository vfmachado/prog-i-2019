package Trimestre_3.t102.aula_16_09;

import java.util.Scanner;

public class ExemploSwich01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero:");
		
		int dia = entrada.nextInt();
		
		/*
		if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda-feira");
		}
		... continua
		*/
		
		
		//ESTRUTURA NOVA!!! SWITCH / escolha
		switch (dia) {
		
		case 1:
			//bloco de codigo
			//while
			System.out.println("Domingo");
			break;
			
		case 2:
			//bloco de codigo
			//if else
			System.out.println("Segunda");
			break;
			
		case 3:
			//bloco de codigo
			//qlqr coisa
			System.out.println("Terca");
			break;
			
		case 4:
			//bloco de codigo
			System.out.println("Quarta");
			break;
		
		case 5:
			//bloco de codigo
			System.out.println("Quinta");
			break;
			
		case 6:
			//bloco de codigo
			System.out.println("Sexta");
			break;
			
		case 7:
			//bloco de codigo
			System.out.println("Sábado");
			break;	
			
		default:
			System.out.println("Dia inválido!");
			
		}
		
		
		if (dia == 5); {
			System.out.println("Exemplo de erro com ; .. vai funcionar com qualquer valor para dia!");
		}
	}

}
