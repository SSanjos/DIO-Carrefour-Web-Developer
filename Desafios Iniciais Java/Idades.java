package exercicios.dio_carrefour_web_developer;

import java.io.IOException;
import java.util.Scanner;

public class Idades {	

	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int n = 1;
        double soma = 0;        
        
        while (n >= 1) {
            n = leitor.nextInt();           
            if (n > 0) { 
            	soma += n; 
            	 cont ++;
            }
        }
        leitor.close();
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
    }

}
