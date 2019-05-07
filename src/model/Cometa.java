package model;

public class Cometa extends CorpoCeleste {
	private String nomeCometa;

	
	public Cometa(String nomeCometa) {
		super();
		this.nomeCometa = nomeCometa;
	}

	public String getNomeCometa() {
		return nomeCometa;
	}

	public void setNomeCometa(String nomeCometa) {
		this.nomeCometa = nomeCometa;
	}
	
	
}
