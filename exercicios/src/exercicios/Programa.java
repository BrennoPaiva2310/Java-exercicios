package exercicios;

import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[] args) {
		String num01 = JOptionPane.showInputDialog("Digite um número: ");
		Double cubo = Math.pow(Double.parseDouble(num01), 3);
		Double quadrado = Math.pow(Double.parseDouble(num01), 2);
		
		System.out.println("Cubo: " + cubo);
		System.out.println("Quadrado: "+ quadrado);
	}

}
