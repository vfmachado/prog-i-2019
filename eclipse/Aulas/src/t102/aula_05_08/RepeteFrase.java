package t102.aula_05_08;

import java.util.Scanner;

public class RepeteFrase {

	public static void main(String[] args) {
		
		String frase = "O IFRS é demais!!!";
		Scanner entrada = new Scanner(System.in);
		
		int quant, contador;
		
		System.out.println("Ei... seu usuario, me diga quantas vezes preciso repetir para vc entender?");
		quant = entrada.nextInt();
		
		contador = 0;
		while (contador < quant) {
			System.out.println(frase);
			contador++;
		}
		
				
	}

}
