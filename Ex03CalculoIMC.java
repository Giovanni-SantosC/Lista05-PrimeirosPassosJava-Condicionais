package lista05;

import java.util.Scanner;

public class Ex03CalculoIMC {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo IMC: ");
		System.out.println("Digite o Seu Peso (em kg): ");
		float peso = sc.nextFloat();
		System.out.println("Digite Sua Altura (em metros):");
		float altura = sc.nextFloat();
		
		double calculoImc = peso / Math.pow(altura, 2); 

		
		if(calculoImc < 18.5) {
			System.out.println("Você esta abaixo do peso.");
		}
		
		else if(calculoImc > 18.5 && calculoImc < 25) {
			System.out.printf(" Esta Ideal. %.2f" , calculoImc  );
		}
		
		else if (calculoImc > 24 && calculoImc < 30) {
			System.out.printf("Esta com SobrePeso. %.2f" , calculoImc);
		}
		
		else if (calculoImc > 29 && calculoImc < 35) {
			System.out.printf(" Esta com Obesidade Grau I.  %.2f" , calculoImc  );
		}
		
		else if (calculoImc > 34 && calculoImc < 40) {
			System.out.printf(" Esta com Obesidade Grau II.  %.2f" ,  calculoImc);
		}
		
		else if (calculoImc > 40) {
			System.out.printf(" Esta com Obesidade Grau III. %.2f" , calculoImc );
		}
		
		sc.close();
	}
	
}
