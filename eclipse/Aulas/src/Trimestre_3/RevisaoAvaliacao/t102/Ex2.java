package Trimestre_3.RevisaoAvaliacao.t102;

import java.util.Scanner;

public class Ex2 {

	//16:58
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String senha = "1234";
		
		String digitado;
		int tentativas = 0;
		
		do {
			System.out.println("Informe a senha");
			digitado = in.next();
			tentativas++;
			if (senha.equals(digitado)) {
				System.out.println("Vc acertou!");
				break;
			}
		} while (tentativas < 3);
		
		if (tentativas == 3) {
			System.out.println("Sua entrada foi barrada");
		}
		
	} //17:02

}
