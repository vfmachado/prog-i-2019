import java.util.Scanner;

public class CondicaoSeSenao {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		//declaracao das variaveis
		
		/*
		String - texto
		int - numeros inteiros ... -3, -2, -1, 0, 1, 2...
		float - numeros reais, numeros com virgula. 6 casas apos a virgula
		
		*/
		
		String nome;
		int idade;
		float altura;
		
		System.out.println("Me diga seu nome...");
		nome = entrada.next(); //le uma String
		
		System.out.print(nome + ", que idade vc tem? ");
		idade = entrada.nextInt();
		
		System.out.print(nome + " com incriveis " + idade + " anos, me informe sua altura: ");
		altura = entrada.nextFloat();

		System.out.println("FICHA PERSONAGEM:");
		System.out.println("\t  Nome: " + nome);
		System.out.println("\t Idade: " + idade);
		System.out.println("\tAltura: " + altura);

		//exemplos de IF / IF ELSE / ELSE IF / ELSE
		
		//exemplos && (e) e || (ou)
		
		//vamos supor que o usuario quer comprar um ingresso para ir no cinema.
		//se for maior que 65 anos entrada franca
		//se for estudante (< 18)
		//senao preco cheio.
		//idade igual ao numero do final do telefone do cinema (10%) (termina com 25)
		
		//valor do ingresso inteiros
		//valor pago pela pessoa
		float valorIngresso = 19.90f;
		float valorPago;
		
		if (idade < 18) {
			valorPago = valorIngresso/2;
		} else if (idade >= 65) {
			valorPago = 0;
		} else if (idade == 25) {
			//10% de desconto (1 - 0.1) = 0.9
			valorPago = valorIngresso * 0.9f;
		} else {
			valorPago = valorIngresso;
		}
		
		System.out.println("Vc deve pagar R$" + valorPago + " ao caixa. Obrigado por escolher o CineVini"); 


		//regras de pipoca =D
		//os baixinhos tem direito a pipoca gratuita
		//altura abaixo de 1,5 ganha uma pipoca M
		
		//para o restante é oferecido pipoca
		/*
		1. Nao quero pipoca
		2. Pipoca P (3,00)
		3. Pipoca M (5,00)
		4. Pipoca G (8,00)
		*/
		

	}

}