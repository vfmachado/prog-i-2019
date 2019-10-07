package Trimestre_3.EO;

import java.util.Scanner;

public class L06Ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe quantos dados serão lançados?");
		int n = entrada.nextInt();
		
		int lados[]  = new int[6];
		//lado1, lado2, lado3, lado4, lado5, lado6
		
		int lancamento = 0;
		
		while (lancamento < n) {
			
			System.out.print("Informe qual lado caiu: ");
			int ladoQueCaiu = entrada.nextInt();
			
			//o -1 é da posicao dentro do vetor
			// ++ é para somar no valor
			lados[ladoQueCaiu-1]++;
			
			lancamento++;
		}
		
		for (int  i = 0; i < 6; i++) {
			
			System.out.println("O lado " +  (i+1) + " caiu " + lados[i]);
			
		}
	}

}
