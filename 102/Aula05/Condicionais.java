import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		//COMO UTILIZAR O SE / SENAO
		//E / OU
		//OPERADORES LÓGICOS
		
		/*operadores logicos
		
			> maior que
			>= maior ou igual a 
			< menor que
			<= menor ou igual a 
			== iguais?
			!= diferente?
			
			operadores logicos tem um resultado
				que pode ser verdadeiro / falso
				true / false
				
			se idade >= 18
			
			if (expressao logica) {
				
			}
		*/
	
		//verificar se uma pessoa pode tirar a carteira de motorista
		
		int idade;
		
		System.out.println("Qual a sua idade?");
		idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Vamos dar sequencia... me de seu dinheiro para comecar...");
		}
		//SENAO
		//o senao so pode existir depois de um IF
		else {
			System.out.println("Vc ainda eh muito jovem... volte quando completar a idade minima");
		}
	}
}