package lista05;

import java.util.Scanner;

public class Ex02TiposTriangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tipos de Triângulos: ");
		System.out.println("Digite o Primeiro Lado do Triângulo: ");
		int lado01 = sc.nextInt();
		System.out.println("Digite o Segundo Lado do Triângulo: ");
		int lado02 = sc.nextInt();
		System.out.println("Digite o Terceiro Lado do Triângulo: ");
		int lado03 = sc.nextInt();
		
		if(lado01 == lado02 && lado02 == lado03) {
			System.out.println("Triângulo Equilátero!");
		}
		
		else if(lado01 == lado02 || lado02 == lado03 || lado01 == lado03){
			System.out.println("Triângulo Isósceles!");
		}
		
		else {
			System.out.println("Triângulo Escaleno!");
		}
		
		sc.close();
	}
	
}
