package Trimestre_3.t101.aula_07_10;

import java.util.Scanner;

public class Vetores03 {

	public static void main(String[] args) {

		System.out.println("Foram passados " + args.length + " parametros");
		
		int [] vetorA = new int[10];
		
		int [] vetorB;
		vetorB = new int[10];
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor");
		int tamanho = entrada.nextInt();
		
		int [] vetorTamUsuario = new int[tamanho];
		
		float [] vetorDefinido = {0.5f, 0.25f, 0.1f, 0.05f, 0.01f};
		//é o mesmo que
		float [] vetorD;
		vetorD = new float[5];
		vetorD[0] = 0.5f;
		vetorD[1] = 0.25f;
		vetorD[2] = 0.1f;
		vetorD[3] = 0.05f;
		vetorD[4] = 0.01f;
		
		
		
		
		//para extrair o tamanho do vetor existe a propriedade .length
		
		System.out.println("O tamanho do vetor definido é: " + vetorDefinido.length);
		
	}

}
