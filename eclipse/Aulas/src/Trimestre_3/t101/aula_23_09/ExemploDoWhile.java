package Trimestre_3.t101.aula_23_09;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		//IDEIA BÁSICA:
		/*
		 * EXISTEM 3 ESTRUTURAS DE REPETIÇÃO
		 * 
		 * 		WHILE (serve para todas as coisas...)
		 * 		DO ... WHILE  (
		 * 		FOR (eu sei quantas vezes quero executar, 
		 * 			sei como inicia, sei qual o incremento/decrementoL)
		 * 
		 * CADA UMA DELAS DEVE SER UTILIZADA E ENTENDIDA DE MANEIRA CORRETA.
		 */
		
		
		//faça um programa para verificar a senha digitada pelo usuario é admin
		
		Scanner entrada = new Scanner(System.in);
		String digitou = "";
		String senha = "admin";
		
		//equals => retorna verdadeiro se forem iguais.
		//			retorna falso se forem diferentes.
		
		// negação em java '!' (ponto de exclamação)	
		
		do {
			
			System.out.println("Informe a senha:");
			digitou = entrada.next();
			
		} while (!digitou.equals(senha));
		
		System.out.println("Terminei!!!");
		
		
		//do .. while garante que executará pelo menos uma vez!!!
		
		// do { BLOCO DE CODIGO } while(teste);
		
		do {
		
			System.out.println("Mensagem....");
		
		} while(false);
		
		
	}

}
