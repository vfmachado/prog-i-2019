package Trimestre_3.t101.aula_23_09;

public class ExemploFor {

	public static void main(String[] args) {
		
		/*
		int contador = 0;
		
		while (contador < 10) {
			System.out.println();
			contador++;
		}
		*/
		
		
		/*
		 * for => para
		 * 	inicializa��o => int contador = 0;
		 * 	teste l�gico  => contador < 10;
		 *  incremento/decremento => contador++
		 */
		for  (int contador = 0; contador < 10; contador++) {
			System.out.println(contador + " ... oi");
		}
		
		// for (	inicio	;	teste	;	passo	) { }
		
		//FA�A UM PROGRAMA QUE MOSTRE TODOS OS VALORES PARES DE 0 AT� N
		int n = 25;
		for (int valor = 0; valor <= n; valor = valor + 2) {
			System.out.print(valor + "\t");
			
			if (valor % 6 == 0) {
				System.out.println();
			}
			
		}
		
		System.out.println("Contagem regressiva iniciada");
		for (int contagem = 5; contagem >= 0; contagem--) {	
			System.out.println(contagem);
		}
		System.out.println("Iniciado com sucesso");
	}

}
