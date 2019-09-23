package Trimestre_3.t102.aula_23_09;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		
		//FAÇA UM PROGRAMA QUE PERGUNTA A PALAVRA 
		//SECRETA ATÉ QUE O USUÁRIO ACERTE
		
		Scanner entrada = new Scanner(System.in);
		String senha = "admin";
		String digitou = "";
		
		// '!' é  a negação de uma sentença.
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
