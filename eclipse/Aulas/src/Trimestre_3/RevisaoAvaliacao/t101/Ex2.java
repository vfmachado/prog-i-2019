package Trimestre_3.RevisaoAvaliacao.t101;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		//13:53
		Scanner in = new Scanner(System.in);
		String senha = "1234";
		
		String digitado;
		int tentativas = 0;
		
		do  {
			
			System.out.println("Informe a senha");
			digitado = in.next();
			tentativas++;
			if (digitado.equals(senha)) {
				System.out.println("Vc acertou!!!");
				break;
			}
			
		} while (tentativas < 3);
		
		if (tentativas == 3) {
			System.out.println("Vc não pode continuar...");
		}
	}

	//13:58
}
