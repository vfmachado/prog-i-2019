package Trimestre_3.EO;

import java.util.Scanner;

public class L06Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos valores serão digitados");
		int n = entrada.nextInt();
				
		//vetor
		//tipo do vetor
		// símbolo []
		//nome
		int [] numeros;
		
		//new para novo
		//dizer o tamanho deste vetor
		numeros = new int[n];
		
		System.out.println("Informe o conjunto de " + n + " valores");
		// i é a abreviação de index
		for (int posicao = 0; posicao < n; posicao++) {
			System.out.print("Digite o " + (posicao+1) + "º valor: ");
			numeros[posicao] = entrada.nextInt();
		}
		
		System.out.println("Mostrando em ordem inversa");
		
		for (int posicao = n - 1; posicao >= 0; posicao--) {
			System.out.print(numeros[posicao] + "\t");
		}
		
		System.out.println("\nBye!!");
	}
	
	//sugestão de estudo - comentar todas as linhas de código!

}
