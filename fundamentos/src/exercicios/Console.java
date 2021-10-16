package exercicios;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		String val = k.nextLine();
		System.out.println(val);
		
		k.close();
	}
}
