package lista05;

import java.util.Scanner;

public class Ex05MediaEClassificacao {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Media e Classificação de 3 Notas!");
		double somaNotas = 0;
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println("Digite a " + (i + 1) + "º Nota:");
			double nota = sc.nextDouble();
			somaNotas += nota;
		}
		
		double media = somaNotas / 3;
		System.out.printf("Media %.2f\n" , media );
		
		if(media >= 7) {
			System.out.println("Aprovado.");
		}
		
		else if(media >= 5 && media < 7) {
			System.out.println("Recupeção");
		}
		
		else{
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
	
}
