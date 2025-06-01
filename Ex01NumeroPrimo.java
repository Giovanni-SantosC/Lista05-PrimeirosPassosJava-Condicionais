package lista05;

import java.util.Scanner;

public class Ex01NumeroPrimo {

	public static void main(String[]args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Numero Primo: ");
		System.out.println("Digite um Numero Inteiro");
		int numero = sc.nextInt();
		
		boolean primo = true;
		
		if(numero <= 1) {
			primo = false;
		}
		
		else if(numero == 2) {
			primo = true;
		}
		
		else {
			for(int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
				if(numero % divisor == 0) {
					primo = false;
					break;
				}
			}
		}
		
		if(primo) {
			System.out.println(numero + " é um numero primo.");
		}
		else {
			System.out.println(numero + " não é um numero primo.");
		}
		sc.close();
	}
	
	
}
