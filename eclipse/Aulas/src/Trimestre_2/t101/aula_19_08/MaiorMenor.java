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
			System.out.print("Informe a " + contador + "ª nota: ");
			notaAtual = entrada.nextFloat();
			//se (condição) { //executa o que está dentro das chaves }
			if (notaAtual > notaMaxima) {
				notaMaxima = notaAtual;
				System.out.println("A nota máxima foi alterada!!!");
			}
			//serve para a condição
			contador++;
			//contador = contador + 1;
		}
		
		System.out.println("A maior nota digitada foi: " + notaMaxima);
	}

}
