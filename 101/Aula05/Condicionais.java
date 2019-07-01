import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;
		
		//carteira de motorista..
		System.out.println("Qual a sua idade?");
		idade = entrada.nextInt();
		
		
		//se a idade e maior ou igual a 18
		if (idade >= 18) {
			System.out.println("Muito bem.. vamos seguir com a documentacao");
		}
		//SENAO - E O CONJUNTO COMPLEMENTAR
		else {
			System.out.println("Sinto muito, vc ainda nao preenche os requisitos");
		}

	}
}	