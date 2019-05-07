package model;

public class Satelite extends  CorpoCeleste {
	private String nomeSatelite;
	private float distanciadoPlaneta;
	private Planeta planetaSatelite;

	public Satelite(String nomeSatelite, float distanciadoPlaneta) {
		super();
		this.nomeSatelite = nomeSatelite;
		this.distanciadoPlaneta = distanciadoPlaneta;
	}

	public String getNomeSatelite() {
		return nomeSatelite;
	}


	public void setNomeSatelite(String nomeSatelite) {
		this.nomeSatelite = nomeSatelite;
	}

	public float getDistanciadoPlaneta() {
		return distanciadoPlaneta;
	}

	public void setDistanciadoPlaneta(float distanciadoPlaneta) {
		this.distanciadoPlaneta = distanciadoPlaneta;
	}

	public Planeta getPlanetaSatelite() {
		return planetaSatelite;
	}

	public void setPlanetaSatelite(Planeta planetaSatelite) {
		this.planetaSatelite = planetaSatelite;
	}

}
