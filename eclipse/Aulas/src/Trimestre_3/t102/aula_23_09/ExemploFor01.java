package Trimestre_3.t102.aula_23_09;

public class ExemploFor01 {

	public static void main(String[] args) {
		
		/*
		int contador = 0;
		while (contador < 10) {
			System.out.println("Teste: " + contador);
			contador++;
		}
		*/
		
		
		/*
		 * FOR - � UMA ESTRUTURA DE REPETI��O QUE PERMITE COLOCAR / ESCREVER
		 * TODOS PAR�METROS EM UM �NICA LINHA
		 * 
		 * DENTRO DOS () V�O TR�S INFORMA��ES
		 * 	1. INICIO - int nomeVar = 0;
		 * 	2. TESTE L�GICO - nomeVar < 10;
		 * 	3. INCREMENTO/DECREMENTO  (PASSO)
		 */
		
		for (int valor = 0; valor < 10; valor++) {
			System.out.println("Teste valor: " + valor);
		}
		
		//fazer um for que fa�a uma contagem regressiva de 5 a 0
		for (int contagem = 5; contagem >= 0; contagem--) {
			System.out.println(contagem);
		}
		
		//FAZER UM PROGRAMA QUE RECEBA UM VALOR N E MOSTRE 
		//TODOS OS VALORES PARES DE 0 AT� N
		int n = 20;
		for (int pares = 0; pares <= n; pares = pares + 2) {
			System.out.println(pares);
		}
		
		
	}

}
