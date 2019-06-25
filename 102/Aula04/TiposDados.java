import java.util.Scanner;

public class TiposDados {

	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		String nome;
		int idade, maisVelho, tempo;
				
		System.out.println("Qual seu nome pequeno gafanhoto?");
		//exemplo para ler uma String
		nome = entrada.next(); //le a prox palavra do teclado
		
		System.out.println("Prazer muito eu tenho em lhe conhecer, jovem " + nome);
		
		//ler uma variavel do tipo inteiro
		//int 
		System.out.print("Me diga jovem " + nome + ". Com quantos anos vc esteve pela primeira vez?" );
		idade = entrada.nextInt();
		
		System.out.println("Jovem, e agora, quantos anos vc tem?");
		maisVelho = entrada.nextInt();
		
		//saber quanto tempo passou...
		tempo = maisVelho - idade;
		
		System.out.println("Nem parece que passaram " + tempo + " anos");
		
	}
}




