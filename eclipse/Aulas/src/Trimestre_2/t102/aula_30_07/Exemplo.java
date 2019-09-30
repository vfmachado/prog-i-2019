package Trimestre_2.t102.aula_30_07;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valorReal;
		
		System.out.println("Eclipse facilitador da minha vida <3");

		System.out.println("Informe um numero com varias casas depois da virgula");
		valorReal = entrada.nextDouble();
		
		System.out.println("O numero digitado foi: " + valorReal);
		
		System.out.printf("Número: %f\n", valorReal);
		System.out.println();
		System.out.printf("Número: %.2f olha que legal...", valorReal);
		
		String nome = "Vinícius Fritzen Machado";
		
		System.out.printf("\nO prof %s é muito legal...", nome);
		
	}

}
