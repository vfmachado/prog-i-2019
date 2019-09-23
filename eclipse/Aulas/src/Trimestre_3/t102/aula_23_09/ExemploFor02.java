package Trimestre_3.t102.aula_23_09;

import java.util.Scanner;

public class ExemploFor02 {

	public static void main(String[] args) {
		
		//ESCOPO DE VARI�VEL
		//determinar onde a vari�vel existe!
		
		//por exemplo, se eu declarar a variavel dentro do for...
		//ela s� vai existir ALI!
		
		for (int x = 0; x < 5; x++) {
			//repete... 5 vezes
			System.out.println("X: " + x);
		}
		
		//FORA DO FOR, x DEIXA DE EXISTIR!!! POR CAUSA DO ESCOPO!!!
		
		//agora podemos utilizar nomes de vari�veis bem pequenos, x, y, i, p, v
		for (int c  = 0; c < 10; c++ ) {
			//A VARIAVEL c s� existe aqui dentro
		}
		
		
		//NORMALMENTE UTILIZAMOS O FOR COM N�MEROS PQ QUEREMOS CONTAR/REPETIR
		//UMA QUANTIDADE VEZES PR�-DETERMINADA
		
		for (char letra = 'a'; letra <= 'z'; letra++) {
			System.out.println("Letra atual: " + letra);
		}
		
		
		// ==============================================
		int contador; //como contador foi declarado fora do for.
		//o escopo do contador � a partir daqui!
		
		for (contador = 0; contador < 5; contador++) {
			System.out.println("Mensagem com contador fora do escopo do for! " + contador);
		}
		
		System.out.println("Valor do contador ap�s o for: " + contador);
		
		
		// ===============================================================
		
		//FA�A UM PROGRAMA QUE LEIA 10 VALORES MAS, 
		//TERMINE CASO O VALOR DIGITADO SEJA 0
		Scanner entrada = new Scanner(System.in);
		int i;
		for (i = 0; i < 10; i++) {
			
			System.out.println("Digite um valor: ");
			int digitado = entrada.nextInt();
			
			//com break, podemos parar o for a qualquer momento...
			if (digitado == 0) {
				break; //continue
			}
			
			System.out.println("N�o parei!!!");		
			//podiam ter v�rias linhas aqui =D
		}
		
		System.out.println("TERMINEI, o valor de i �: " + i);
		
	}

}
