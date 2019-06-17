import java.util.Scanner;

public class ExemploOp {
	public static void main(String[] args) {
	
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		int valorA;
		int valorB;
		int resultado;
		//ou
		//int valorA, valorB, resultado;
	
		//atribuindo um valor a uma variavel
		//utilizem o simbolo =
		System.out.println("Informe dois valores inteiros");
		valorA = entrada.nextInt();
		valorB = entrada.nextInt();
		
		//operacoes
		resultado = valorA + valorB;
		System.out.println("O resultado foi: " + resultado);
	}
}



