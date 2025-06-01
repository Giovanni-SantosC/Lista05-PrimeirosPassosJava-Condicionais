package lista05;

import java.util.Scanner;

public class Ex09SinalDeNumero {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Sinal De Número: ");
		System.out.println("Digite um Numero: ");
		float numero = sc.nextFloat();
		
		if(numero == 0) {
			System.out.println("Numero Igual a Zero.");
		}
		
		else if(numero > 0) {
			System.out.println("Numero Positivo.");
		}
		
		else {
			System.out.println("Numero Negativo.");
		}
		
		sc.close();
	}
	
}
