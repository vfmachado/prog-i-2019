import java.util.Scanner;

public class TiposDadosFloat {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		//FAÇA UM PROGRAMA QUE RECEBA A BASE E A ALTURA
		//DE UM TRIANGULO E CALCULE SUA AREA

		//DECLARACAO
		float base, altura, area;

		System.out.println("Oi user... tudo bem? Vou calcular uma area de triangulo...");
		
		System.out.print("Informe a base do triangulo: ");
		base = entrada.nextFloat();
		
		System.out.println("Informe a altura: ");
		altura = entrada.nextFloat();
		
		area = base * altura / 2;
		
		System.out.println("Nossa, este triangulo tem " + area + " de area");
	}
}



