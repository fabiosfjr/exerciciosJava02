package exerciciosJavaGeneration2;

import java.util.Scanner;

/* 1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
			System.out.println("O maior n�mero �: " + maior);
		}
		else if (num2 > num1 && num2 > num3) {
			maior = num2;
			System.out.println("O maior n�mero �: " + maior);
		}
		else if (num3 > num1 && num3 > num2) {
			maior = num3;
			System.out.println("O maior n�mero �: " + maior);
		}
		
		leia.close();

	}

}
