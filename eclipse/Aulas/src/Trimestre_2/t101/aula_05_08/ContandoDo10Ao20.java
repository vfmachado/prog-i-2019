package Trimestre_2.t101.aula_05_08;

import java.util.Scanner;

public class ContandoDo10Ao20 {

	public static void main(String[] args) {
		
		//Passo 1: leia 10 numeros
		//Passo 2: crie uma variavel chamados quantNegativos, quantPositivos
		//Passo 3: dentro do While, verifique se o numero é positivo ou negativo
		//e adicione na variavel correta;
		
		//NO final, fora do while, mostre a quantidade de numeros positivos e negativos
		
		Scanner entrada = new Scanner(System.in);
		
		int contando = 10;
		
		while (contando >= 0 ) {
			System.out.println("Lançando em: " + contando);
			contando = contando - 1;
			//contando++
			//contando += 1

		}
		
		System.out.print("Foiii...");
		
	}

}
