package exerciciosJavaGeneration2;

import java.util.Scanner;

/* 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
			System.out.println("O maior número é: " + maior);
		}
		else if (num2 > num1 && num2 > num3) {
			maior = num2;
			System.out.println("O maior número é: " + maior);
		}
		else if (num3 > num1 && num3 > num2) {
			maior = num3;
			System.out.println("O maior número é: " + maior);
		}
		
		leia.close();

	}

}
