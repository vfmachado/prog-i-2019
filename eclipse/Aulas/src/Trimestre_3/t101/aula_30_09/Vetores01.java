package Trimestre_3.t101.aula_30_09;

import java.util.Scanner;

public class Vetores01 {

	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VETOR
		//tipo símbolo nome
		int [] valores;
		
		int valores2 [];
		
		
		//INICIAR O VETOR
		// dizer qual o tamanho dele.
		valores = new int[5];
		
				//dentro dos colchetes colocamos um valor inteiro que representa
				//o tamanho deste vetor!!!
		
		//para acessar os valores
		//utilizamos a posição
		//ATENÇÃO!! COMEÇA EM ZERO!!!
		valores[0] = 10;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da segunda posição (pos = 1): ");
		valores[1] = entrada.nextInt();
		
		valores[2] = valores[0] + valores[1];
		
		valores[3] = 30;
		
		valores[4] = 40;
		
		/*
		System.out.println("Na posicao 0: " + valores[0]);
		System.out.println("Na posicao 1: " + valores[1]);
		System.out.println("Na posicao 2: " + valores[2]);
		System.out.println("Na posicao 3: " + valores[3]);
		System.out.println("Na posicao 4: " + valores[4]);
		*/
		
		//FOR - ESTRUTURA DE REPETIÇÃO!!!
		for (int pos = 0; pos < 5; pos++) {
			System.out.println("Na posicao " + pos + " está o valor " + valores[pos]);
		}
		
		
		
	}
	
}
