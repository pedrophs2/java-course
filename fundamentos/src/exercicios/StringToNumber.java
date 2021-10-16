package exercicios;

import javax.swing.JOptionPane;

public class StringToNumber {
	public static void main(String[] args) {
		double primeiroValor = Double.parseDouble(input());
		double segundoValor = Double.parseDouble(input());
		
		System.out.println(primeiroValor + segundoValor);
	}
	
	private static String input() {
		return JOptionPane.showInputDialog("Digite um valor: ");
	}
}
