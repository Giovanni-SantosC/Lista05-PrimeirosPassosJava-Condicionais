package lista05;

import java.util.Scanner;

public class Ex06VerificacaoParidadeEPositividade {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Paridade e Positividade: ");
		System.out.println("Digite um Numero Inteiro: ");
		int numero = sc.nextInt();
		
		if(numero == 0) {
			System.out.println("Numero Igual a Zero.");
		}
		
		else{
		if(numero % 2 == 0){
			System.out.println(numero + " é Par.");
			if(numero  > 0) {
				System.out.println(numero + " Positivo.");
			}
		
			else {
				System.out.println(numero + " Numero Negativo.");
			}
			
		}
		
		else{
			System.out.println(numero + " é Impar.");
			if(numero  > 0) {
				System.out.println(numero + " Positivo.");
			}
		
			else {
				System.out.println(numero + " Numero Negativo.");
			}
			
		}
	}
	
		sc.close();
	}
	
	
}
