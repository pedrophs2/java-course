package strings;

public class MarcaModelo {
	
	public static void main(String[] args) {
		String marcaModelo = "HONDA/CIVIC";
		System.out.printf("Marca: %s | Modelo: %s", marcaModelo.split("/")[0], marcaModelo.split("/")[1]);
	}

}
