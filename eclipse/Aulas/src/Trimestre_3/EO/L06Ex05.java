package Trimestre_3.EO;

public class L06Ex05 {

	public static void main(String[] args) {
		
		int valores [] = {10, 20, 30, 40, 50, 60, 70, 80};
		//na posicao 0 tem o valor 10.
		//na posicao 7 tem o valor 80
		
		//TROCAR O VALOR DA POSICAO 2 COM A 5
		int caixaExtra;
		
		caixaExtra = valores[2];
		valores[2] = valores[5];
		valores[5] = caixaExtra;
		
		for (int i = 0; i < 8; i++) {
			System.out.print(valores[i] + "\t");
		}
		System.out.println("\nBYE BYE");
		
	}

}
