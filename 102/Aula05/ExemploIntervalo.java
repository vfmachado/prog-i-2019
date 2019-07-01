import java.util.Scanner;
public class ExemploIntervalo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;
		
		//verificar se um numero esta entre 0 e 10.
		System.out.print("Informe um numero: ");
		numero = entrada.nextInt();
		
		if (numero >= 0) {
			if (numero <= 10) {
				System.out.println("O numero esta dentro do intervalo [0, 10]");
			} else {
			System.out.println("Nao faz parte do intervalo");
			}
		} else {
			System.out.println("Nao faz parte do intervalo");
		}
	
		//TESTES COM E / OU
		// E EM JAVA  => &&
		// OU EM JAVA => ||
		if (numero >= 0 && numero <= 10) {
			System.out.println("O numero esta dentro do intervalo [0, 10]");
		} else {
			System.out.println("O numero nao esta no intervalo [0, 10]");
		}
	}
}