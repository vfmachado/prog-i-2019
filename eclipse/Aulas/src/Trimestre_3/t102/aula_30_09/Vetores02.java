package Trimestre_3.t102.aula_30_09;

import java.util.Random;
import java.util.Scanner;

public class Vetores02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//VARIAVEL aleat DO TIPO Random
		Random aleat = new Random();	//serve para sortear números
		
		//int numeroSorte = aleat.nextInt(10); //sortear um número entre 0 e 9
		
		//System.out.println("Número da sorte foi: " + numeroSorte);
		
		
		int [] senhas = new int[10];
		
		//index = i // posicao
		for (int i = 0; i < 10; i++) {
			senhas[i] = aleat.nextInt(100); //valor aleatorio de 0 a 99
		}
		
		boolean acertou = false;
		int tentativas = 0;
		do {
			
			tentativas++;	//tentativas = tentativas + 1;
			
			System.out.print("Informe um valor (tentativa " + tentativas + "): ");
			int digitado = entrada.nextInt();
			
			for (int i = 0; i < 10; i++) {
				if (digitado == senhas[i]) {
					System.out.println("Acertou!!!");
					acertou = true;
				}
			}
			
		} while (acertou == false);
		
		if (tentativas < 5) {
			System.out.println("Você é uma pessoa de sorte!!!");
		} else if (tentativas < 10) {
			System.out.println("É... não deves contar só com a sorte");
		} else {
			System.out.println("Uma dica: Estude!!!");
		}
		
		System.out.println("As senhas foram: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(senhas[i] + "\t");
		}
		
	}

}
