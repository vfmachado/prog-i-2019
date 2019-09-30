package Trimestre_2.ExemploExtra;

import java.util.Random;

public class NumeroAleatorio {

	public static void main(String[] args) {
		
		Random aleat = new Random();
		
		//sorteia um numero entre 0 e 9
		int numero = aleat.nextInt(10);
		
		System.out.println(numero);
		
	}

}
