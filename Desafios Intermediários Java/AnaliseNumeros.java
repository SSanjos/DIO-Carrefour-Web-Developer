package exercicios.dio_carrefour_web_developer;

import java.util.Scanner;

public class AnaliseNumeros {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int par = 0;
		int impar = 0;
		int negativo = 0;
		int positivo = 0;
		int numero;		

		for(int i = 0; i <= 4; i++) {

			numero = leitor.nextInt();

			if (numero % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}
			if (numero < 0) {
				negativo += 1;
			}
			if (numero > 0) {
				positivo += 1;
			}
					
		}
		
		leitor.close();

		System.out.println(par + " par(es)");
		System.out.println(impar + " impar(es)");
		System.out.println(positivo + " positivo(s)");
		System.out.println(negativo + " negativo(s)");

	}


}
