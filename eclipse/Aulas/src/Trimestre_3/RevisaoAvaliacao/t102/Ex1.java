package Trimestre_3.RevisaoAvaliacao.t102;

import java.util.Scanner;

public class Ex1 {

	//16:52
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Informe uma letra/digito");
		char letra = in.next().charAt(0);
		
		switch (letra) {
		
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println("� um d�gito num�rico");
			break;
		default:
			System.out.println("N�o � um d�gito num�rico");
		
		}
	}

	//16:54
}
