package Trimestre_3.t101.aula_16_09;

import java.util.Scanner;

public class ExemploChar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//estudar operadores l�gicos
		// <= >= != == > <
		
		//dentro de um IF ou de um WHILE o teste
		//deve ser VERDADEIRO para executar
		
		//contador = 0;
		//while (contador == 100)
			//ISTO EST� INCORRETO!!!!
		
		String texto = "Qualquer frase que n�o seja feia! =P";
		int numeroInteiro = 10;
		float numeroDecimal = 7.5f; //at� 6 casas.
		double numeroDecimalPreciso = 7.1234635412;
		
		char letra;
		
		//aspas simples
		letra = 'J';
		
		System.out.println("Letra: " + letra);
		
		if (letra == 'j') {
			System.out.println("as letras s�o iguais.");
		} else {
			System.out.println("as letras diferentes");
		}
		
		
		//com while.
		int codLetra = 33; //tabela ascii
		char letraComCod;
		
		while (codLetra < 128) {
			letraComCod = (char) codLetra; //transforma um codigo em letra!
			System.out.println("Codigo: " + codLetra + "\tLetra:" + letraComCod);
			codLetra++;
		}
		
		
		
		
		
		
		
		
		
	}

}
