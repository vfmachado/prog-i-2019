package Trimestre_3.t102.aula_07_10;

import java.util.Scanner;

public class Vetores03 {
	/*
	 * Exemplos de criação de vetores!
	 */
	public static void main(String[] args) {

		int [] vetorA;
		vetorA = new int[10];
		
		int [] vetorB = new int[20];
				
		int tamanhoDoVetor = 1256;
		int [] vetorC = new int[tamanhoDoVetor];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe quantos valores serão armazenados no vetor");
		int quantidade = entrada.nextInt();
		
		int [] vetorD = new int[quantidade];
		
		//criando o vetor e já colocando os valores dele!
		float [] moedas1 = {1f, 0.5f, 0.25f, 0.1f, 0.05f};
		
		//moedas1[0] = 0.8f;
		
		float [] moedas2;
		moedas2 = new float[5];
		moedas2[0] = 1;
		moedas2[1] = 0.5f;
		moedas2[2] = 0.25f;
		moedas2[3] = 0.1f;
		moedas2[4] = 0.05f;
		
		
		for (int posicao = 0; posicao < moedas1.length; posicao++) {
			System.out.println(
				"Na posicao " + posicao + " tem o valor " + moedas1[posicao]);
		}
		
	}

}
