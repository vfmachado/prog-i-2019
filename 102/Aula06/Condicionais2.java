import java.util.Scanner;

public class Condicionais2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	
		/*
		String - guarda texto
		int - inteiros. ... -2.4b até 2.4b
		float - guardar numeros com virgula, reais. (6 casas depois da virgula)
		*/

		String nome;
		int idade;
		float altura;
		
		System.out.print("Oii, gostaria de lhe chamar pelo seu nome... vc pode me dizer seu nome? ");
		nome = entrada.next();

		/*
			Simbolo		Significado
			   =			atribuir / colocar
		      ==			comparação (true/false)
		
		*/

		System.out.println(nome + ", quantos anos vc tem?");
		idade = entrada.nextInt();
		
		System.out.print("Para terminar seu cadastro, preciso saber sua altura. Informe em metros. Altura: ");
		altura = entrada.nextFloat();

		// IF / ELSE IF / IF ELSE / ELSE
		float valorIngresso = 15;
		float valorPago = valorIngresso;
		
		// adolescente / estudante - paga meia < 18
		// idoso - nao paga >= 65
		// pessoas com 25 anos tem 10% de desc
		// outras pessoas pagam normalmente
		
		/*
					> >= < <= == !=
			if (teste logico) {
				
			}
		*/
		
		if (idade < 18) {
			valorPago = valorIngresso/2;	
		} else if (idade >= 65) {
			valorPago = 0;
		} else if (idade == 25) {
			valorPago = valorIngresso * 0.9f;
		} else {
			valorPago = valorIngresso;
		}
		
		System.out.println("Chegou a hora da pipoquinha...");
		
		//os baixinhos tem direito a pipoca gratuita
		//altura abaixo de 1,2 ganha uma pipoca P
		
		//para o restante é oferecido pipoca
		/*
			1. Nao quero pipoca
			2. Pipoca P (3,00)
			3. Pipoca M (5,00)
			4. Pipoca G (8,00)
		*/
		
		
		
		System.out.println("COMPROVANTE DE VENDA");
		System.out.println("\t  Nome: " + nome);
		System.out.println("\t Idade: " + idade);
		System.out.println("\t    R$: " + valorPago);

		//Tipo de ingresso: 
		//Pipoca: 
		//Valor Total: 

	}
}