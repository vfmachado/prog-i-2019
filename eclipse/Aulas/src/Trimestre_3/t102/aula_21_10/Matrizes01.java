package Trimestre_3.t102.aula_21_10;

public class Matrizes01 {

	public static void main(String[] args) {
		
		//declarar a matriz
		int [][] matriz;	//o número de colchetes determina
							//quantas dimensões ela tem.
		
		//iniciar a matriz com os tamanhos
		//linha e coluna
		matriz = new int[2][3]; //neste exemplo, 2 linhas e 3 colunas
		
		
		matriz[0][0] = 0;
		matriz[0][1] = 1;
		matriz[0][2] = 2;
		
		matriz[1][0] = 10;
		matriz[1][1] = 11;
		matriz[1][2] = 12;
		
		
		//for para mostrar
		for (int linha  = 0; linha < 2; linha++) {
			
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");
			}
			System.out.println("\n");
		}
		
		
		
	}

}
