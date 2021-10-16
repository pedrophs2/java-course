package desafios;

public class DesafioTemperatura {
	private static final double FST_PARAM = 5;
	private static final double SCN_PARAM = 9;
	private static final int MEASURE = 32;
	
	public static void main(String[] args) {
		toCelsius(86);
	}
	
	private static void toCelsius(double far) {
		double celsius = (far - MEASURE) * (FST_PARAM / SCN_PARAM);
		System.out.println(celsius + "°C");
	}
}
