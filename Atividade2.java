package exercicios;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("SOMANDO N�MEROS");
		System.out.println();
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		num2 = entrada.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("O resultado da soma �: "+soma);
		
		entrada.close();

	}

}
