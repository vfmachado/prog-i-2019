package t101.aula_12_08;

import java.util.Scanner;

public class VerificaPar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um numero");
		int num = entrada.nextInt();

		int resto = num % 2;

		if (resto == 0) {
			System.out.println("Este número é par");
		} else {
			System.out.println("Este número é ímpar");
		}

	}

}
