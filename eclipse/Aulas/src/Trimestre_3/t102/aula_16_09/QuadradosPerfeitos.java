package Trimestre_3.t102.aula_16_09;

import java.util.Scanner;

public class QuadradosPerfeitos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 1;
		
		while (valor > 0) {
			System.out.println("Digite um valor:");
			valor = entrada.nextInt();
			
			int mult = 1, eh = 0; 
			while (mult * mult <= valor) {
				if (mult * mult == valor) {
					System.out.println("É quadrado perfeito");
					eh = 1;
				}
				mult++;
			}
			
			if (eh == 0) {
				System.out.println("Não é quadrado perfeito");
			}
		}
		
		System.out.println("FIM");
		
	}

}
