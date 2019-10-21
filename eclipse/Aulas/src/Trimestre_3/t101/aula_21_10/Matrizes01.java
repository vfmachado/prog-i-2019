package Trimestre_3.t101.aula_21_10;

public class Matrizes01 {

	public static void main(String[] args) {
		
		//declarando uma matriz
		int [][] matriz; 	//os colchetes determinam que é um vetor bidimensional
		
		
		//determinar o tamanho da matriz (linhas e colunas)
		matriz = new int[5][8]; //neste exemplo, 2 linhas e 3 colunas
		
		//valores da primeira linha
		matriz[0][0] = 0;
		matriz[0][1] = 1;
		matriz[0][2] = 2;
		
		//valores da segunda linha
		matriz[1][0] = 10;
		matriz[1][1] = 11;
		matriz[1][2] = 12;
		
		//mostrar uma matriz de maneira bonitinha!
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				//nao usamos ln aqui
				System.out.print(matriz[linha][coluna] + "\t");
			}
			//aqui trocamos a linha para mostrar
			System.out.println("\n");
		}
		
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 8; coluna++) {
			
				matriz[linha][coluna] = linha * 10 + coluna;				
			}
		}
		
		System.out.println("MATRIZ GRANDE\n+++++++++++++++\n");
		//com whiles
		int linha = 0;
		while (linha < 5) {
			
			int coluna = 0;
			
			while (coluna < 8) {
				System.out.print(matriz[linha][coluna] + "\t");
				coluna++;
			}
			
			System.out.println("\n");
			linha++;
		}
		
		
	}

}
