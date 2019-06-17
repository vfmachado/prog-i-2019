import java.util.Scanner;

public class ExemploVar {

	public static void main(String[] args) {
		//VARIAVEIS
		String nome;
		
		//declarar um numero inteiro
		int idade;
		int idadeMae;
		
		//declarar varias variaveis do mesmo tipo
		//int idade, idadeMae;
		
		//declaracao do Scanner
		Scanner entrada;		
		
		//inicializacao
		entrada = new Scanner(System.in);
		
		System.out.println("Aula 03 vai bombar!!!");

		System.out.print("Digite seu nome para comecar: ");
		//a variavel nome recebe a palavra que a pessoa digitar
		nome = entrada.next();
		
		System.out.println("Eii " + nome + " vc eh um bom programador");
		
		System.out.println(nome + ", que idade voce tem?");
		
		//ler um variavel do tipo int
		idade = entrada.nextInt();
		
		System.out.println("Ok, entao vc tem " + idade + " anos");
		
		System.out.print("Qual a idade da sua mae?");
		idadeMae = entrada.nextInt();
		
		System.out.println("Poxaa, " + idadeMae + "anos. Que mae nova que vc tem");
		
	}
}


