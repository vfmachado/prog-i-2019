package Trimestre_3.t102.aula_16_09;

import java.util.Scanner;

public class ExemploChar02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Você quer uma key de jogo Steam (S/N)?");
		
		String resposta = entrada.next();
		
		//ações de String que facilitam nosso trabalho
		
		// .toUpperCase()
		String maiusculas = resposta.toUpperCase();
		System.out.println(maiusculas);
		
		// .toLowerCase()
		String minusculas = resposta.toLowerCase();
		System.out.println(minusculas);
		
		if (resposta.equals("S")) {
			System.out.println("Basta tirar 10 na próxima prova.");
		} else if (resposta.equals("N")) {
			System.out.println("Você ainda será recompensado de outra forma... mas estude");
		} else {
			System.out.println("Não sei o que quer dizer.");
		}
		
		
		System.out.println("Você aceita? (S/N)");
		//lendo e transformando ao mesmo tempo
		String res = entrada.next().toUpperCase();
		
		// outra ação... .charAt(posicao);
			//pega um string inteira e busca 1 única e exclusiva LETRA (char)
		char letraPrimeiraPosicao = res.charAt(0);
		char ch = letraPrimeiraPosicao;
		System.out.println(letraPrimeiraPosicao);
		
		if (ch == 'S') {
			System.out.println("Resposta foi sim");
		} else if (ch == 'N') {
			System.out.println("Resposta foi um nao");
		} else {
			System.out.println("Sei lá..");
		}
		
		
	}

}
