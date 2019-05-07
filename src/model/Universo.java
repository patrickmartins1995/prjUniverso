package model;

import java.util.ArrayList;

public class Universo {
	
	private String nomeUniverso,dataCriacao;
	
	private ArrayList<Nebulosa> nebulosas;
	private ArrayList<Galaxia> galaxias;
	
	public Universo() {
		
	}
	
	public Universo(String nomeUniverso, String dataCriacao) {
		this.nomeUniverso = nomeUniverso;
		this.dataCriacao = dataCriacao;
		nebulosas = new ArrayList<Nebulosa>();
		galaxias = new ArrayList<Galaxia>();
		
	}

	public String getNomeUniverso() {
		return nomeUniverso;
	}

	public void setNomeUniverso(String nomeUniverso) {
		this.nomeUniverso = nomeUniverso;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public ArrayList<Nebulosa> getNebulosas() {
		return nebulosas;
	}


	public ArrayList<Galaxia> getGalaxias() {
		return galaxias;
	}


	public void addGalaxia(Galaxia novaGalaxia) {
		galaxias.add(novaGalaxia);
	//	novaGalaxia.setU1(this);
	}
	
	public void addNebulosa(Nebulosa novaNebulosa) {
		nebulosas.add(novaNebulosa);
		//novaNebulosa.setU2(this);
	}
	
	public void removeGalaxia(Galaxia exGalaxia) {
		galaxias.remove(exGalaxia);
		//exGalaxia.setU1(null);
	}
		
		public void removeNebulosa(Nebulosa exNebulosa) {
			nebulosas.remove(exNebulosa);
			//exNebulosa.setU2(null);
	}
	
}



