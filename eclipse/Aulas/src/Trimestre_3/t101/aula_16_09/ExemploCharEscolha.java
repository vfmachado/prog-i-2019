package Trimestre_3.t101.aula_16_09;

import java.util.Scanner;

public class ExemploCharEscolha {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Voc� aceita uma key de jogo por uma nota 10?");
		System.out.println("Digite S para sim e N para n�o");
		
		//String � um tipo de dados Composto!
		//significa que n�o podemos utilizar operadores como ==
		String resposta = entrada.next().toUpperCase();
		
		//.toUpperCase();
		//.toLowerCase();
		
		//para comparar utilizamos um m�todo do tipo STRING chamada equals
		if (resposta.equals("S")) {
			System.out.println("Ent�o estude bastante pq o prof ama vcs <3");
		} else if (resposta.equals("N")) {
			System.out.println("Que pena... mas tudo bem nem todos amamos programar...");
		} else {
			System.out.println("N�o entendo sua resposta.");
		}
		
		//UTILIZANDO CHAR
		char letra = resposta.charAt(0);
		
		//char => � um tipo de dados para guardar uma letra
		//.charAt => � uma a��o que podemos fazer com String para buscar uma letra.
		
		if (letra == 'S') {
			System.out.println("Ent�o estude bastante pq o prof ama vcs <3");
		} else if (letra == 'N') {
			System.out.println("Que pena... mas tudo bem nem todos amamos programar...");
		} else {
			System.out.println("N�o entendo sua resposta.");
		}
		
		
		
	}

}
