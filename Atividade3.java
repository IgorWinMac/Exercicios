package exercicios;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("CALCULANDO NOTAS");
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = entrada.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = entrada.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média é: "+ media);
		
		entrada.close();

	}

}
