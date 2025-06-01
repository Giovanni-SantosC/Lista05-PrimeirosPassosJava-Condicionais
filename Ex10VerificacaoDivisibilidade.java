package lista05;

import java.util.Scanner;

public class Ex10VerificacaoDivisibilidade {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Divisibilidade: ");
		System.out.println("Digite um Numero Inteiro: ");
		int numero = sc.nextInt();
		
		if(numero == 0) {
			System.out.println("Numero Igual a Zero.");
		}
		
		else if( numero % 5 == 0 && numero % 3 == 0) {
			System.out.println(numero + " Numero Dividido por Três e Cinco.");
		}
		
		else if(numero % 3 == 0) {
			System.out.println(numero + " Numero Dividido Somente por Três. ");
		}
		
		else if(numero % 5 == 0) {
			System.out.println(numero + " Numero Dividido Somente por Cinco. ");
		}
		
		
		else {
			System.out.println("Numero Invalido.");
		}
		
		
		sc.close();
	}
	
}
