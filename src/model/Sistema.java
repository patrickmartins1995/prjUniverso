package model;

public class Sistema {
	
	private String nomeSistema;
	private Galaxia galaxiaSistema; 
	
	
	public Sistema(String nomeSistema) {
		super();
		this.nomeSistema = nomeSistema;
	}

	public String getNomeSistema() {
		return nomeSistema;
	}

	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}

	public Galaxia getGalaxiaSistema() {
		return galaxiaSistema;
	}

	public void setGalaxiaSistema(Galaxia galaxiaSistema) {
		this.galaxiaSistema = galaxiaSistema;
	}
	
	
	
}
