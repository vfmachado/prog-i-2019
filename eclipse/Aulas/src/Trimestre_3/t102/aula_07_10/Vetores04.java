package Trimestre_3.t102.aula_07_10;

import java.util.Scanner;

public class Vetores04 {

	public static void main(String[] args) {
		
		String[] possiveisPalavras = {"amor", "escola", "valente", "forte", "coragem"};
		
		Scanner entrada = new Scanner(System.in);
		String palavra;
		
		System.out.println("Informe a palavra que será ocultada");
		palavra = entrada.next();
		
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		
		//.length() de strings não caem em avaliações!
		int tam = palavra.length();
		char [] letras = new char[tam];
		boolean [] acertos = new boolean[tam];
		
		for (int i = 0; i < tam; i++) {
			acertos[i] = false;
		}
		
		
		//ISSO NÃO VAI CAIR NA AVALIAÇÃO!
		palavra.getChars(0, tam, letras, 0); //transforma minha String em um
												//vetor de char
		
		/*
		System.out.println("As letras ficaram da seguinte forma: ");
		for (int i = 0; i < tam; i++) {
			System.out.println("Na posicao " + i + " tem a letra " + letras[i]);
		}
		*/
		
		int vidas = 3;
		
		do {
			boolean ganhou = true;
			
			System.out.println("\n ======================== \n");
			for (int i = 0; i < tam; i++) {
				if (acertos[i] == true) {
					System.out.print(letras[i] + "  ");
				} else {
					System.out.print("-  ");
					ganhou = false;
				}
			}
			System.out.println("\n\n ======================== \n");
			
			if (ganhou == true) {
				break;
			}
			
			System.out.println("Digite uma letra");
			char digitado = entrada.next().charAt(0); //pega uma letra digitada pelo usuario
						
			
			boolean tem = false;
			for (int i = 0; i < tam; i++) {
				if (digitado == letras[i]) {
					System.out.println("Esta na posicao " + i);
					acertos[i] = true;
					tem = true;
				} 
			}
		
			//fora do for, dentro do do ... while
			if (tem == false) {
				System.out.println("Oops... perdeu uma vida...");
				vidas--;
				
				if (vidas < 0) {
					break;
				}
			}
			
		} while(true);
		
		if (vidas < 0) {
			System.out.println("Sinto muito.. o jogo acabou para vc");
		} else {
			System.out.println("Parabéns vc terminou o jogo!");
		}
	}

}
