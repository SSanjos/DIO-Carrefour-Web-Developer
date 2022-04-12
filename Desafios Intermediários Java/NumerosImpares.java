package exercicios.dio_carrefour_web_developer;

import java.util.Scanner;

public class NumerosImpares {
	
	public static void main(String[] args) {
		
		 Scanner leitor = new Scanner(System.in);
	        int x = leitor.nextInt();
	        leitor.close();
	        int cont = 0;
	        int aux = 0;	

	        while (cont <  6   ) {	        	
	        	x += aux;
	        	aux = 1;
	        	if (x % 2 == 1) {
	        		System.out.println(x);
	        		cont++;	        		
	        	}
	        }       
		
	}

}
