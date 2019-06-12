//IMPORTAR AS FERRAMENTAS NECESSARIAS
import java.util.Scanner;


public class LendoDoTeclado {

	public static void main(String[] args) {
	
		//declarar as variaveis
		//variavel de texto
		String nome;
	
		System.out.println("Meu programa funciona!");
	
		//ADICIONAR O SCANNER DENTRO DO MEU CÓDIGO
		//COMO UMA VARIAVEL
		
		//DECLARACAO DA VARIAVEL
		Scanner entrada;
		
		//INICIAR A VARIAVEL DO TIPO SCANNER
		entrada = new Scanner(System.in);
							//entrada do teclado
							
		//escreva("Oi eu sou o seu programa em java");
		System.out.println("Oi, eu sou Jarvis, ao seu dispor");
		System.out.print("Qual seu nome? ");
		
		//leia
		//para ler uma palavra!
		nome = entrada.next(); //a variavel nome recebe a entrada de texto
		
		System.out.println("Muito prazer " + nome);
		
	}
}




