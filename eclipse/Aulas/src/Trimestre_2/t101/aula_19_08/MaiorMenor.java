package Trimestre_2.t101.aula_19_08;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador = 1;
		int repeticoes;
		float notaAtual, notaMaxima = 0;
		
		System.out.println("Quantas vezes iremos repetir?");
		repeticoes = entrada.nextInt();
		
		while (contador <= repeticoes) {
			System.out.print("Informe a " + contador + "� nota: ");
			notaAtual = entrada.nextFloat();
			//se (condi��o) { //executa o que est� dentro das chaves }
			if (notaAtual > notaMaxima) {
				notaMaxima = notaAtual;
				System.out.println("A nota m�xima foi alterada!!!");
			}
			//serve para a condi��o
			contador++;
			//contador = contador + 1;
		}
		
		System.out.println("A maior nota digitada foi: " + notaMaxima);
	}

}
