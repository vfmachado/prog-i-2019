//IMPORTAR UMA FERRAMENTA!!!
//DIZER QUE NOSSO CÓDIGO VAI UTILIZAR UM CONJUNTO DE CODIGOS QUE ESTAO PRONTOS EM JAVA.UTIL.SCANNER
import java.util.Scanner;

public class LendoDoTeclado {

	public static void main(String[] args) {
		
		//string eh o tipo de variavel... 
		// nome eh o nome da variavel
		String nome;
		
		//DECLARAR A VARIAVEL DO TIPO SCANNER
		Scanner entrada;
		
		//DIZER PARA A VARIAVEL DE ONDE ELA VAI LER
		//NO NOSSO CASO DO TECLADO DO COMPUTADOR
		//INICIAR A VARIAVEL
		entrada = new Scanner(System.in);
							//TECLADO!!!
	
		System.out.println("DIGITE SEU NOME PARA INICIAR: ");
		
		// entrada.next() = pega a proxima palavra que o usuario digitar
		nome = entrada.next();
		//MUDE A VARIAVEL NOME PARA RESPOSTA
		
		System.out.println("Oi, muito prazer " + nome);
	}
}