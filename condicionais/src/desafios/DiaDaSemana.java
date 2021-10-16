package desafios;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dia da semana !!");
		System.out.print("Digite o dia para saber a posição dele na semana: ");
		String day = s.nextLine();
		
		int nDay = checkDay(day.toLowerCase());
		
		System.out.printf("O dia %s é o %d dia da semana", day, nDay);
	}
	
	private static int checkDay(String day) {
		if(day == "domingo")
			return 1;
		else if(day.equals("segunda"))
			return 2;
		else if(day.equals("terça") || day.equals("terca"))
			return 3;
		else if(day.equals("quarta"))
			return 4;
		else if(day.equals("quinta"))
			return 5;
		else if(day.equals("sexta"))
			return 6;
		else if(day.equals("sábado") || day.equals("sabado"))
			return 7;
		else
			return -1;
	}
}
