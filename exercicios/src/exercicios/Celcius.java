package exercicios;

import java.util.Scanner;

public class Celcius {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a sua temperatura em Fahrenheit? ");
		Double temperaturaCelcius = entrada.nextDouble();
		double formula = (temperaturaCelcius * 9/5) + 32;
		
		System.out.println("O resultado da sua convers�o �: " + formula);
//		(0 �C � 9/5) + 32 = 32 �F

		
		entrada.close();
		
		
	};

}
