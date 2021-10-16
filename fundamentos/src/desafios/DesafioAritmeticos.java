package desafios;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		double p1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		System.out.println(p1);
		
		double p2 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
		System.out.println(p2);
		
		double res = Math.pow((p1 - p2), 3) / Math.pow(10, 3);
		System.out.println((int) res);
	}

}
