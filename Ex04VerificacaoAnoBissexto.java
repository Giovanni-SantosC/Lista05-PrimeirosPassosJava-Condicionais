package lista05;

import java.util.Scanner;

public class Ex04VerificacaoAnoBissexto {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean teste = false;
		
		System.out.println("Verificação de Ano Bissexto: ");
		System.out.println("Digite um Ano para Fazer a Verificação:");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0 ) {
			if(ano % 100 != 0 || ano % 400 ==0 ) {
				teste = true;
			}
		}
		
		if(teste) {
			System.out.println(ano + " é um ano Bissexto!");
		}
		
		else {
			System.out.println(ano + " não e um ano Bissexto!");
		}
		
		sc.close();
	}
	
}
