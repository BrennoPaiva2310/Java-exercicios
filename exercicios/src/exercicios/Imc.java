package exercicios;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		
		String p = JOptionPane.showInputDialog("Digite o seu peso: ");
		String a = JOptionPane.showInputDialog("Digite a sua altura: ");
		
	
		double resultado =  Double.parseDouble(p)/ (Double.parseDouble(a) * Double.parseDouble(a));
		
		if(resultado < 18.5) {
			System.out.println("Magreza");
		
		}
		
		else if(resultado >= 18.5 && resultado <= 24.9) {
				System.out.println("Normal");
				;
			}	
		else if(resultado >= 24.9 && resultado <= 30) {
				System.out.println("Sobrepeso");
				
			}
		else if(resultado > 30) {
					System.out.println("Obesidade");
					
				}


		
	
	
	
	
	
	
	}
}
