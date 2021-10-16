package desafios;

import java.util.Scanner;

public class DesafioWhile {
	
	static int qtdNotas = 0;
	static double soma = 0;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		double nota = 0;
		
		System.out.println("Calculadora de notas");
		do {
			System.out.print("Digita uma nota ou -1 para calcular o total: ");
			nota = validNota(s.nextDouble());
		} while(nota != -1);
		
		System.out.printf("O total das notas do aluno é de %.2f e a média é de %.2f", soma, soma/qtdNotas);
	}
	
	private static double validNota(double nota) {
		if(nota > 10) {
			System.out.println("Os valores válidos são 0 até 10");
			nota = 0;
		}else if(nota >= 0){
			soma += nota;
			qtdNotas++;
		}
		
		return nota;
	}
	
}
