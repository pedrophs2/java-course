package desafio;

public class Transito {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		Carro civic = new Civic();
		
		ferrari.acelerar(3);
		civic.acelerar(3);
		
		ferrari.getVelocidade();
		civic.getVelocidade();
		
		ferrari.frear();
		civic.frear();
		ferrari.frear();
		civic.frear();
		ferrari.frear();
		civic.frear();
		ferrari.frear();
		civic.frear();
		ferrari.frear();
		civic.frear();
		ferrari.frear();
		civic.frear();
		ferrari.frear();
		civic.frear();
		
		ferrari.getVelocidade();
		civic.getVelocidade();
	}
}
