package Trimestre_3.t101.aula_16_09;

import java.util.Scanner;

public class ExemploSwitch01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero para representar o dia desejado");
		int dia = entrada.nextInt();
		
		
		//escolha / switch
		switch(dia) {
		
		//opcoes = case
		case 1:
			System.out.println("Domingo");
			break; //para dizer que terminou esta opcao
		
		case 2:
			System.out.println("Segunda-feira");
			break;
		
		case 3:
			System.out.println("Terça-feira");
			break;
			
		case 4:
			System.out.println("Quarta-feira");
			break;
			
		case 5:
			System.out.println("Quinta-feira");
			break;
			
		case 6:
			System.out.println("Sexta-feira");
			break;
			
		case 7:
			System.out.println("Sábado");
			break;
			
		
		//default - não caiu em nenhum case anterior
		default:
			System.out.println("Dia inválido");
		
		}
		
	
	}

}
