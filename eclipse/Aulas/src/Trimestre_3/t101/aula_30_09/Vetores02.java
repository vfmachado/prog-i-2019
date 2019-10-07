package Trimestre_3.t101.aula_30_09;

import java.util.Random;
import java.util.Scanner;

public class Vetores02 {

	/* DESENVOLVER UM PROGRAMA QUE DADO V�RIOS N�MEROS EM UM VETOR,
	 *  O USU�RIO DEVE TENTAR DESCOBRIR OS N�MERO 
	 */
	public static void main(String[] args) {

		//random � um tipo de dados para criar valores aleat�rios
		Random aleat = new Random();
		
					//sorteia um n�mero de 0 a 9 e salva na variavel valor.
		int valor = aleat.nextInt(10);
		
		//System.out.println(valor);
		
		Scanner entrada = new Scanner(System.in);
		
		int senhas [] = new int[10];
		
		//for com o valor i come�ando em zero e indo at� 9;
		//tamanho do meu vetor � 10. as posi��es s�o de 0 a 9.
		for (int i = 0; i < 10; i++) {
			senhas[i] = aleat.nextInt(100); //sorteia um valor entre 0 e 99
		}
		
		boolean acertou = false;
		int tentativas = 0;
		System.out.println("Vamos ver se voc� � bom de adivinha��o..");
		do {
			tentativas++;
			System.out.println("Informe um n�mero entre 0 e 99");
			int numero = entrada.nextInt();
			//i++ � o mesmo que i = i + 1;
			for (int i = 0; i < 10; i++) {
				
				if (numero == senhas[i]) {
					System.out.println("Acertou!!!");
					acertou = true;
				}
				
			}
			
		} while(acertou == false);
		
		System.out.println("Precisou de " + tentativas + " vezes para acertar");
		System.out.println("Os n�meros da senha eram: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(senhas[i] + "\t");
		}
		
	}

}
