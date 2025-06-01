package lista05;

import java.util.Scanner;

public class Ex07VerificacaoNotaConceito {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Nota para Letras de (0 A 100)");
		System.out.println("Digite a Nota:");
		int nota = sc.nextInt();
		
		if(nota > 100) {
			System.out.println("Valor Inserido Maior que 100.");
		}
		
		else if(nota <= 0) {
			System.out.println("Numero Igual ou Menor que Zero.");
		}
		
		else {
		
		if(nota > 89) {
			System.out.println(nota + " A(Excelente Desempenho)");
		}
		
		else if (nota > 79 && nota < 90) {
			System.out.println(nota + " B(Bom Desempenho)");
		}
		
		else if(nota > 69 && nota < 80 ){
			System.out.println(nota + " C(Desempenho Regular)");
		}
		
		else if (nota > 59 && nota < 70) {
			System.out.println(nota + " D(Desempenho Baixo)");
		}
		
		else {
			System.out.println(nota + " F(Desempenho Insatisfatório)");
		}
		}
		sc.close();
	}
}
