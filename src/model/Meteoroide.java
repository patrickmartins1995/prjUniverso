package model;

 public abstract class Meteoroide extends CorpoCeleste  {
	 private String nomeMeteoroide;
	 
	public Meteoroide(String nomeMeteoroide) {
		this.nomeMeteoroide = nomeMeteoroide;
	}
	public String getNomeMeteoroide() {
		return nomeMeteoroide;
	}
	public void setNomeMeteoroide(String nomeMeteoroide) {
		this.nomeMeteoroide = nomeMeteoroide;
	}
}
