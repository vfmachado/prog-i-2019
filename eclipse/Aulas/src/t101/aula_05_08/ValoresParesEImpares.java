package t101.aula_05_08;

import java.util.Scanner;

public class ValoresParesEImpares {

	public static void main(String[] args) {
		
		//PASSO 0: MOSTRE 10 VEZES A MSMA MENSAGEM
		//Passo 1: leia 10 numeros
		//Passo 2: crie uma variavel chamados quantNegativos, quantPositivos
		//Passo 3: dentro do While, verifique se o numero é positivo ou negativo
		//e adicione na variavel correta;
		
		//NO final, fora do while, mostre a quantidade de numeros positivos e negativos
		
		Scanner entrada = new Scanner(System.in);
		int qtd, valor;
		int contador = 0;
		int positivos = 0;
		int negativos = 0;
		
		System.out.println("Quantos valores vc irá digitar?");
		qtd = entrada.nextInt();
		
		while (contador < qtd) {
			contador++;
			System.out.print("Informe o " + contador + "º numero: ");
			valor = entrada.nextInt();
			
			if (valor >= 0) {
				positivos = positivos + 1;
			} else {
				negativos++;
			}
		}
		
		System.out.println("Foram digitados " + qtd + " valores... dentre eles "
				+ positivos + " eram positivos e " + negativos + " eram negativos, menores que zero.");
	}

}
