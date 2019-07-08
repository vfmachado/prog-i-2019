import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		float massa, altura, imc;

		//PERGUNTAR A ALTURA E A MASSA
		System.out.println("Qual seu peso e sua altura?");
		
		//SALVAR EM VARIAVEIS DO TIPO FLOAT
		massa = entrada.nextFloat();
		altura = entrada.nextFloat();
		
		//CALCULAR O IMC (imc = massa / altura²)
		imc = massa / (altura * altura);
		
		System.out.println("Seu IMC eh : " + imc);
		/*
		if (imc <= 18.5f) {
			System.out.println("Vc esta abaixo do peso ideal");
		}
		if (imc > 18.5 && imc <= 25) {
			System.out.println("Vc esta no peso ideal!");
		}
		*/
		
		if (imc <= 18.5f) {
			System.out.println("Vc esta abaixo do peso ideal");
		}
		 else if (imc <= 25) {
			System.out.println("Vc esta no peso ideal!");
		} 
		//varios else ifs sao permitidos
	}
}