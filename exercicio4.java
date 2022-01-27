package exerciciosJavaGeneration2;

import java.util.Scanner;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
*/

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num, raizQuadrada, elevadoAoQuadrado;
		
		System.out.println("Digite um número: ");
		num = leia.nextDouble();
		
		if (num % 2 == 0) {
			raizQuadrada = Math.sqrt(num);
			System.out.println("O número " + num + " é par e a raiz quadrada dele é " + raizQuadrada);
		}
		else {
			elevadoAoQuadrado = Math.pow(num, 2);
			System.out.println("O número " + num + " é ímpar e ele elevado ao quadrado é " + elevadoAoQuadrado);
		}
		
		leia.close();
	}
}
