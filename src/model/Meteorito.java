package model;

public class Meteorito extends Meteoroide {
	
	private String dataQueda;

	public Meteorito(String nomeMeteoroide, String dataQueda) {
		super(nomeMeteoroide);
		this.dataQueda = dataQueda;
	}

	public String getDataQueda() {
		return dataQueda;
	}

	public void setDataQueda(String dataQueda) {
		this.dataQueda = dataQueda;
	}
	

}
