package Trimestre_3.t102.aula_16_09;

import java.util.Scanner;

public class ExemploChar01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		 * Operadores l�gicos
		 * 
		 * >=	<=	> 	<	!=	==
		 * 
		 * while (teste for verdadeiro) {
		 * 	//bloco 1
		 * }
		 * 
		 *	ex da recupera��o:
		 *
		 *	cont = 1;
		 *	while (cont == 100) {
		 * 		cont++;
		 * 	}
		 * 	ISTO EST� INCORRETO
		 * 
		 * 
		 */
		
		//TIPOS DE DADOS
		
		//valores numericos
		int numerosInteiros = 10;
		float decimais = 12.1234f; //6 casas
		double decimaisPrecisos = 12.1236535654234;
		
		//verdadeiro / falso
		boolean valorLogico = true;
		
		boolean saoIguais = 5 == 0;
		System.out.println(saoIguais);
		
		if (saoIguais) {
			//isso funciona super bem!
		}
		
		//TEXTO
		String frase = "Que pode guardar uma frase inteira! ";
		String frase2 = "Final 1";
		String frase3 = "Final 2";
		
		System.out.println(frase + frase2);
		
		//s� que existe um outro tipo... igualmente �til que se chama
		//char
		
		//char s�o declarados com aspas simples!
		char letra = 'a';
		
		if (letra == 'a') {
			System.out.println("S�o iguais");
		}
		
		
		String strLetra = "a";
		// .equals => � uma a��o que pertence ao tipo String, 
		// que permite comparar duas Strings
		if (strLetra.equals("a")) {
			System.out.println("S�o iguais... ");
		}
		
		System.out.println("\n\n+++++++++++++++++\n\n");
		//essa linha serve para ...
		char letraPorCodigo = 65;
		
		//essa linha serve para...
		while (letraPorCodigo <= 90 ) {
			System.out.println("Letra do cod " + (int)letraPorCodigo + ": "  + letraPorCodigo++);
		}
		
		
		
	}
	
}
