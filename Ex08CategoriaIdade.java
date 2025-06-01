package lista05;

import java.util.Scanner;

public class Ex08CategoriaIdade {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificacão de Idade Para Categoria:");
		System.out.println("Digite sua Idade (Somente Anos):");
		int idade = sc.nextInt();

		if(idade > 0 && idade < 12) {
			System.out.println(idade + " Criança");
		}
		
		else if(idade > 11 && idade < 18) {
			System.out.println(idade + " Adolescente");
		}
		
		else if(idade > 18 && idade < 60) {
			System.out.println(idade + " Adulto");
		}
		
		else {
			System.out.println(idade + " Idoso");
		}
		
		sc.close();
	}
}
