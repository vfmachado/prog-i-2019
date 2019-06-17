import java.util.Scanner;
public class ExemploAdicao {
	public static void main(String[] args) {
		Scanner entrada;
		entrada = new Scanner(System.in);
		int valorA;
		int valorB;
		int resultado;
		//mostrem uma msg para o usuario, pedindo para informar 2 valores.
		//ler os dois valores: usar Scanner (entrada)
		System.out.println("Ei... sei somar, quer ver? Me diga dois valores...");
		valorA = entrada.nextInt();
		valorB = entrada.nextInt();
		
		resultado = valorA + valorB;
		System.out.println("Resultado foi: " + resultado);
	}
}