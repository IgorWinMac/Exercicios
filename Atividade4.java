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
		
		System.out.println("Quanto voc� ganha por hora? ");
		valorHora = entrada.nextDouble();
		
		System.out.println("Informe o n�mero de horas trabalhadas no m�s: ");
		horaTrabalhada =  entrada.nextInt();

		salario = valorHora * horaTrabalhada;
		
		System.out.println("O sal�rio � de: "+formatador.format(salario)+" reais");
		
		entrada.close();
	}

}
