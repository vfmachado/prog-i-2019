import java.util.Scanner;

public class TiposDados {
	public static void main(String[] args) {
	
		Scanner entrada;
		entrada = new Scanner(System.in);
	
		int n1, n2, res;
			
		System.out.print("Informe dois valores: ");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		
		//mostrar a soma dos valores
		res = n1 + n2;
		System.out.println("A soma dos valores resulta em: " + res);
	}
}



