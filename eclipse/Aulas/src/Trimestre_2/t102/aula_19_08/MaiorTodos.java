package Trimestre_2.t102.aula_19_08;

import java.util.Scanner;

public class MaiorTodos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		int repeticoes;
		int valores, maior = 0;
		System.out.print("Quantos valores você irá informar? ");
		repeticoes = entrada.nextInt();
		//repete enquanto o contador for menor que repeticoes
		while (contador < repeticoes) {
			System.out.println("Informe um valor: ");
			valores = entrada.nextInt();
			
			if (valores > maior) {
				System.out.println("OII... troquei o maior valor");
				maior = valores;
			}
			
			contador++;
		}
		
		System.out.println("O maior valor informado foi: " + maior);
		
		/*
		int x = 0;
		int y = 0;
		while (x < 5) {
			y = 0;
			while (y < 5) {
				if (x == y) {
					System.out.print("O");
				} else {
					System.out.print("X");
				}
				y++;
			}
			System.out.println();
			x++;
		}
		*/
	}

}
