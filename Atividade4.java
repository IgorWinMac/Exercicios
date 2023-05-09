package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("00.00");
		
		double valorHora, salario; 
		int horaTrabalhada;
		
		System.out.println("Quanto você ganha por hora? ");
		valorHora = entrada.nextDouble();
		
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		horaTrabalhada =  entrada.nextInt();

		salario = valorHora * horaTrabalhada;
		
		System.out.println("O salário é de: "+formatador.format(salario)+" reais");
		
		entrada.close();
	}

}
