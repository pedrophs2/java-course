package desafio;

public class Civic extends Carro implements IModelo {
	
	private static final int ACELERACAO = 10;
	private static final int FRENAGEM = 5;
	private static final String MODELO = "Civic";
	
	public Civic() {
		buildModelo();
	}
	
	public void buildModelo() {
		setAceleracao(ACELERACAO);
		setFrenagem(FRENAGEM);
		setModelo(MODELO);
	}

}
