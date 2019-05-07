package model;

public class Meteoro extends Meteoroide {
	private int velocidadedeQueda;
	
	public Meteoro(String nomeMeteoroide, int velocidadedeQueda) {
		super(nomeMeteoroide);
		this.velocidadedeQueda = velocidadedeQueda;
	}

	public int getVelocidadedeQueda() {
		return velocidadedeQueda;
	}


	public void setVelocidadedeQueda(int velocidadedeQueda) {
		this.velocidadedeQueda = velocidadedeQueda;
	}

}
