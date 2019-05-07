package model;

public class Asteroide extends CorpoCeleste {
	private String nomeAsteroide;
	private int diametroAsteroide;
	
	public Asteroide(String nomeAsteroide, int diametroAsteroide) {
		super();
		this.nomeAsteroide = nomeAsteroide;
		this.diametroAsteroide = diametroAsteroide;
	}


	public String getNomeAsteroide() {
		return nomeAsteroide;
	}


	public void setNomeAsteroide(String nomeAsteroide) {
		this.nomeAsteroide = nomeAsteroide;
	}


	public Asteroide(int diametroAsteroide) {
		this.diametroAsteroide = diametroAsteroide;
	}


	public int getDiametroAsteroide() {
		return diametroAsteroide;
	}


	public void setDiametroAsteroide(int diametroAsteroide) {
		this.diametroAsteroide = diametroAsteroide;
	}
	
	
	
}
