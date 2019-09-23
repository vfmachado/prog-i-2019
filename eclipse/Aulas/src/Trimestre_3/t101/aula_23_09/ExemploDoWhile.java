package Trimestre_3.t101.aula_23_09;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {

		//IDEIA B�SICA:
		/*
		 * EXISTEM 3 ESTRUTURAS DE REPETI��O
		 * 
		 * 		WHILE (serve para todas as coisas...)
		 * 		DO ... WHILE  (
		 * 		FOR (eu sei quantas vezes quero executar, 
		 * 			sei como inicia, sei qual o incremento/decrementoL)
		 * 
		 * CADA UMA DELAS DEVE SER UTILIZADA E ENTENDIDA DE MANEIRA CORRETA.
		 */
		
		
		//fa�a um programa para verificar a senha digitada pelo usuario � admin
		
		Scanner entrada = new Scanner(System.in);
		String digitou = "";
		String senha = "admin";
		
		//equals => retorna verdadeiro se forem iguais.
		//			retorna falso se forem diferentes.
		
		// nega��o em java '!' (ponto de exclama��o)	
		
		do {
			
			System.out.println("Informe a senha:");
			digitou = entrada.next();
			
		} while (!digitou.equals(senha));
		
		System.out.println("Terminei!!!");
		
		
		//do .. while garante que executar� pelo menos uma vez!!!
		
		// do { BLOCO DE CODIGO } while(teste);
		
		do {
		
			System.out.println("Mensagem....");
		
		} while(false);
		
		
	}

}
