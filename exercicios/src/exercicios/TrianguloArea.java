package exercicios;

import javax.swing.JOptionPane;

public class TrianguloArea {
	public static void main(String[] args) {
		
		String altura = JOptionPane.showInputDialog("Digite a altura do triangulo: ");
		String base = JOptionPane.showInputDialog("Digite a base do triangulo: ");
		
		System.out.println("A area do seu triangulo �: "+ (Double.parseDouble(altura) * Double.parseDouble(base))/2 );
	}

}
