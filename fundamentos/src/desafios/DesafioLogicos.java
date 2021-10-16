package desafios;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		if(trabalho1 && trabalho2)
			System.out.println("A TV Comprada será a de 50\"");
		else if(trabalho1 ^ trabalho2)
			System.out.println("A TV Comprada será a de 32\"");
		else
			System.out.println("Nenhuma TV será comprada... :(");
	}
}
