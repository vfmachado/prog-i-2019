package Trimestre_3.t101.aula_16_09;

import java.util.Scanner;

public class ExemploCharEscolha {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Você aceita uma key de jogo por uma nota 10?");
		System.out.println("Digite S para sim e N para não");
		
		//String é um tipo de dados Composto!
		//significa que não podemos utilizar operadores como ==
		String resposta = entrada.next().toUpperCase();
		
		//.toUpperCase();
		//.toLowerCase();
		
		//para comparar utilizamos um método do tipo STRING chamada equals
		if (resposta.equals("S")) {
			System.out.println("Então estude bastante pq o prof ama vcs <3");
		} else if (resposta.equals("N")) {
			System.out.println("Que pena... mas tudo bem nem todos amamos programar...");
		} else {
			System.out.println("Não entendo sua resposta.");
		}
		
		//UTILIZANDO CHAR
		char letra = resposta.charAt(0);
		
		//char => é um tipo de dados para guardar uma letra
		//.charAt => é uma ação que podemos fazer com String para buscar uma letra.
		
		if (letra == 'S') {
			System.out.println("Então estude bastante pq o prof ama vcs <3");
		} else if (letra == 'N') {
			System.out.println("Que pena... mas tudo bem nem todos amamos programar...");
		} else {
			System.out.println("Não entendo sua resposta.");
		}
		
		
		
	}

}
