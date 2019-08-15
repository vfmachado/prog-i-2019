package t101.aula_30_07;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		float numero = 0;
		
		System.out.println("Sem printf: " + numero);

		// o printf funciona como o print melhorado.
		// ele permite criarmos um formato especifico para a saida
		
		// quantas casas queremos mostrar um valor decimal
		System.out.printf("Com printf: %.4f", numero);
		
	}
}
