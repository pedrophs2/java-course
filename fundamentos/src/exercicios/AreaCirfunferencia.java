package exercicios;

public class AreaCirfunferencia {
	private static final double PI = 3.15159;
	
	public static void main(String[] args) {
		calcArea(3.4);
		calcArea(10);
	}
	
	private static void calcArea(double raio) {
		System.out.println("O valor da área é de: " + PI * (raio * raio) + "m²");
	}
}
