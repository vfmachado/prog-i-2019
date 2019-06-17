import java.util.Scanner;

public class ExemploVar {

	//ponto de partida
	//método principal
	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		//variavel do tipo String - String com S maiusculo
		String nome;
				
		//tipo nomeVariavel ;		
		int idade;		
				
		System.out.println("Isto funciona!!! Aula 03 vai bombar"); 
		
		System.out.print("Me diga seu nome padawan: ");
		//leia-se: nome recebe a palavra digitada no teclado
		nome = entrada.next();
		
		System.out.println("Bem vindo " + nome + ". Que seu treino comece. Me diga a sua idade...");
		
		idade = entrada.nextInt();
		
		System.out.println("Vejo que com " + idade + " anos vc ainda tem uma longa jornada pela frente");
		
		
		
	}
}

