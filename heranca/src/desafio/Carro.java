package desafio;

public class Carro implements ICarro {
	
	private static final int VELOCIDADE_INICIAL = 0;
	
	private int aceleracao = 10;
	private int frenagem = 5;	
	private int velocidade;
	private String modelo;

	public boolean acelerar() {
		velocidade += aceleracao;
		return false;
	}
	
	public boolean acelerar(int quantidade) {
		velocidade += aceleracao * quantidade;
		return false;
	}

	public boolean frear() {
		if(velocidade > frenagem) {
			velocidade -= frenagem;
			return true;
		} else if(velocidade == frenagem) {
			velocidade = 0;
			return true;
		} else {
			return false;
		}
	}

	public void getVelocidade() {
		System.out.printf("A velocidade do veículo %s é de %dKm/h\n", modelo, velocidade);
	}

	public int getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(int aceleracao) {
		this.aceleracao = aceleracao;
	}

	public int getFrenagem() {
		return frenagem;
	}

	public void setFrenagem(int frenagem) {
		this.frenagem = frenagem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
