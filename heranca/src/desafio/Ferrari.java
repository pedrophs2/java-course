package desafio;

public class Ferrari extends Carro implements IModelo {
	
	private static final int ACELERACAO = 30;
	private static final int FRENAGEM = 15;
	private static final String MODELO = "Ferrari";
	
	public Ferrari() {
		buildModelo();
	}
	
	public void buildModelo() {
		setAceleracao(ACELERACAO);
		setFrenagem(FRENAGEM);
		setModelo(MODELO);
	}

}
