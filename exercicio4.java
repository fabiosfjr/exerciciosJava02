package exerciciosJavaGeneration2;

import java.util.Scanner;

/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
*/

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num, raizQuadrada, elevadoAoQuadrado;
		
		System.out.println("Digite um n�mero: ");
		num = leia.nextDouble();
		
		if (num % 2 == 0) {
			raizQuadrada = Math.sqrt(num);
			System.out.println("O n�mero " + num + " � par e a raiz quadrada dele � " + raizQuadrada);
		}
		else {
			elevadoAoQuadrado = Math.pow(num, 2);
			System.out.println("O n�mero " + num + " � �mpar e ele elevado ao quadrado � " + elevadoAoQuadrado);
		}
		
		leia.close();
	}
}
