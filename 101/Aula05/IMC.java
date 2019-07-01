import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		String nome;
		float massa, altura, imc;

		//PERGUNTAR A ALTURA E A MASSA
		//SALVAR EM VARIAVEIS DO TIPO FLOAT
		//CALCULAR O IMC
		System.out.println("Bem Vindo ao IFMed - O centro Medico do IF");
		System.out.print("Qual seu nome?" );
		nome = entrada.next();
			
		System.out.print(nome + ", qual seu peso? ");
		massa = entrada.nextFloat();
		
		System.out.print("E para terminar, sua altura? ");
		altura = entrada.nextFloat();

		imc = massa / (altura * altura);
		
		System.out.println("Oi " + nome + ", pelos meus calculos, seu IMC: " + imc);
 
		//condicoes multiplas
		/*
		if (imc  <= 18.5f) {
			System.out.println("Vc esta abaixo do peso");
		}
		
		if (imc > 18.5f && imc < 25) {
			System.out.println("Peso ideal");	
		}
		*/
		
		if (imc  <= 18.5f) {
			System.out.println("Vc esta abaixo do peso");
		}
		
		else if (imc < 25) {
			System.out.println("Peso ideal");	
		}
		
		//TERMINAR EM CASA
	}
}

