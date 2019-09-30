package Trimestre_2.ExemploExtra;

public class Durma {

	public static void por(int segundos) {
		try {
		Thread.sleep(segundos * 1000);
		} catch (Exception e) {}
	}
	
}
