package exercicios;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int temperaturaF, temperaturaC;
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		temperaturaF = entrada.nextInt();
		
		temperaturaC = 5 *((temperaturaF - 32) / 9);
		
		System.out.println("O resultado em Celsius é: "+ temperaturaC+" graus");
		
		entrada.close();

	}

}
