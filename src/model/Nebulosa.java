package model;

public class Nebulosa {

	private String nomeNebulosa,tipoNebulosa;
	private Universo u2;
	
	public Nebulosa(String nomeNebulosa, String tipoNebulosa) {
		super();
		this.nomeNebulosa = nomeNebulosa;
		this.tipoNebulosa = tipoNebulosa;
		}

	public String getNomeNebulosa() {
		return nomeNebulosa;
	}

	public void setNomeNebulosa(String nomeNebulosa) {
		this.nomeNebulosa = nomeNebulosa;
	}

	public String getTipoNebulosa() {
		return tipoNebulosa;
	}

	public void setTipoNebulosa(String tipoNebulosa) {
		this.tipoNebulosa = tipoNebulosa;
	}

	public Universo getU2() {
		return u2;
	}

	public void setU2(Universo u2) {
		this.u2 = u2;
	}
	
	
	
}

	