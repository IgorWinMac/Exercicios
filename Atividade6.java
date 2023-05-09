package exercicios;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double temperaturaF, temperaturaC;
		
		System.out.println("Informe a temperatura em Celsius: ");
		temperaturaC = entrada.nextInt();
		
		temperaturaF = temperaturaC * 1.8 + 32;
		
		System.out.println("O resultado em Fahrenheit é: "+temperaturaF);
		
		entrada.close();

	}

}
