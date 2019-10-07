package Trimestre_3.t102.aula_30_09;

import java.util.Scanner;

public class Vetores01 {

	public static void main(String[] args) {
		
		//DECLARAR UM VETOR PRECISAMOS UTILIZAR O OPERADOR []
		//tipo simbolo nome
		int [] valores;
		
		//segunda forma
		//tipo nome simbolo
		int valores2[] = {1, 2, 3, 4};
		
		//INICIAR A VARIÁVEL
		valores = new int[5];
		
		//acessando as posições e alterando o valor
		valores[0] = 10;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor que será atribuído a pos 1");
		valores[1] = entrada.nextInt();
		
		valores[2] = valores[0] + valores[1];
		
		valores[3] = 43;
		
		valores[4] = 18;
		
		
		//MOSTRANDO MEU VETOR
		System.out.println("Na posicao 0: " + valores[0]);
		
		System.out.println("Informe a posicao desejada:");
		int pos = entrada.nextInt();
		
		System.out.println("Na posição " + pos + " temos o valor " + valores[pos]);
		
		System.out.println("\n\n===== TODOS OS VALORES =====\n");
		
		/*
		System.out.println("Na posicao 0: " + valores[0]);
		System.out.println("Na posicao 1: " + valores[1]);
		System.out.println("Na posicao 2: " + valores[2]);
		System.out.println("Na posicao 3: " + valores[3]);
		System.out.println("Na posicao 4: " + valores[4]);
		*/
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Na posicao " + i + " tem o valor " + valores[i]);
		}
		
	}
	
}
