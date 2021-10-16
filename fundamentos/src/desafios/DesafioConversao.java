package desafios;

import java.util.Scanner;

public class DesafioConversao {
	private static final Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		double fstQuat = inputSal();
		double scndQuat = inputSal("Insira outro valor: ");
		double thrQuat = inputSal("Insira outro valor: ");
		
		calcMedia(fstQuat, scndQuat, thrQuat);	
		
		k.close();
	}
	
	private static void calcMedia(double val1, double val2, double val3) {
		double media = (val1 + val2 + val3) / 3;
		System.out.printf("A média salarial do colaborador é de R$ %.2f", media);
	}
	
	private static double inputSal() {
		return inputSal("Insira um valor: ");
	}
	
	private static double inputSal(String message) {		
		System.out.print(message);
		double val = Double.parseDouble(k.nextLine().replace(",", "."));
		System.out.println();
		
		return val;		
	}

}
