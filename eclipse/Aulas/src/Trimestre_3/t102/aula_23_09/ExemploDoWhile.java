package Trimestre_3.t102.aula_23_09;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		
		//FA�A UM PROGRAMA QUE PERGUNTA A PALAVRA 
		//SECRETA AT� QUE O USU�RIO ACERTE
		
		Scanner entrada = new Scanner(System.in);
		String senha = "admin";
		String digitou = "";
		
		// '!' �  a nega��o de uma senten�a.
		// igual filosofia.
		//while (!digitou.equals(senha)) {
		//while (true) {
		
		//DO ... WHILE
		do {
			System.out.println("Informe a senha:");
			digitou = entrada.next();
			
			if (digitou.equals(senha)) {
				break;
			}
		} while (!digitou.equals(senha));
		//.equals => retorna Verdadeiro ou falso
		//if (digitou.equals(senha) == false) {}
		System.out.println("Voce acertou a senha");
		
	}

}
