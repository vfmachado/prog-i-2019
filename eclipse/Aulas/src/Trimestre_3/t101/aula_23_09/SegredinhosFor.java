package Trimestre_3.t101.aula_23_09;

import java.util.Scanner;

public class SegredinhosFor {

	public static void main(String[] args) {


		//ESCOPO DE VARIÁVEL
		//determinar onde a variável existe!
		
		//por exemplo, se eu declarar a variavel dentro do for...
		//ela só vai existir ALI!
		
		for (int x = 0; x < 5; x++) {
			//repete... 5 vezes
		}
		
		//com o mesmo nome x
		for (int x = 0; x < 10; x++) {
			//repete... 10 vezes
		}
		
		// x não é reconhecido aqui fora... pois foi declarado dentro do for!
		//System.out.println(x);
		
		
		//==============================
		
		int i; //declaracao fora do FOR... permite o acesso fora do for!
		
		for (i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		//quero poder acessar o valor de i aqui fora...
		System.out.println("Valor de i fora do for: " + i);
		
		
		// ==============================
		// parando / ou continuando a execução do for com break / continue
		
		//FAÇA UM PROGRAMA QUE LEIA 10 VALORES MAS, PARE SE O VALOR DIGITADO FOR ZERO
		Scanner entrada = new Scanner(System.in);
		
		for (int v = 0; v < 10; v++) {
			
			System.out.println("Informe um valor, vou avisando, se digitar 0 vai parar...");
			int digitado = entrada.nextInt();
			
			//para parar a execução de um for, existe o break
			if (digitado == 0) {
				break;
			}
			
		}
		
		System.out.println("Terminei o FOR! =D");
		
	}

}
