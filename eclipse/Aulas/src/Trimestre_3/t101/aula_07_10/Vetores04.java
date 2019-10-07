package Trimestre_3.t101.aula_07_10;

import java.util.Scanner;

public class Vetores04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String[] palavras = {"amor", "solidao", "pao", "morcego", "coringa", "churrasco"};
		
		char [] letras;
		boolean[] acertos;
		String palavra;
		
		System.out.println("Digite a palavra");
		palavra = entrada.next();
		
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		
		letras = new char[palavra.length()];
		int tam = palavra.length(); //guarda o tamanho da palavra, a quantidade de letras
		//transformar a palavra num vetor de letras
		palavra.getChars(0, palavra.length(), letras, 0);
		acertos = new boolean[tam];
		for (int pos = 0; pos < tam; pos++) {
			acertos[pos] = false;			
		}
		
		
		//EXISTE UM VETOR DE LETRAS QUE CONTEM A PALAVRA
//		for (int pos = 0; pos < tam; pos++) {
//			System.out.println("Na posicao " + pos + " tem a letra " + letras[pos]);
//		}
		
		boolean jaGanhou = false;
		int vidas = 3;
		do {
			
			jaGanhou = true;
			
			System.out.println("\n ============== \n");
			for (int pos = 0; pos < tam; pos++) {
				if (acertos[pos] == true) {
					System.out.print(letras[pos] + "  ");
				} else {
					jaGanhou = false;
					System.out.print("-  ");
				}
			}
			System.out.println("\n");
			if (jaGanhou) {
				break;
			}
			
			System.out.println("Digite uma letra");
			char digitado = entrada.next().charAt(0);
			
			boolean acertou = false;
			for (int i = 0; i < tam; i++) {
				//bloco
				if (letras[i] == digitado) {
					System.out.println("Tem a letra na posicao " + i);
					acertos[i] = true;
					acertou = true;
				}
			}
			
			if (acertou == false) {
				vidas--;
				
				if (vidas < 0) {
					break;
				}
			}
			
		} while (!jaGanhou);
		
		if (vidas < 0) {
			System.out.println("Vc não ganhou...");
		} else {
			System.out.println("Mandou bem!!!");
		}
	}

}
