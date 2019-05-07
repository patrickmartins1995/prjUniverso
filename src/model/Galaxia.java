package model;

import java.util.ArrayList;

public class Galaxia {

	private String nomeGalaxia, morfologiaGalaxia;
	private Universo u1;

	private ArrayList<Sistema> sistemas;

	public Galaxia(String nomeGalaxia, String morfologiaGalaxia) {
		super();
		this.nomeGalaxia = nomeGalaxia;
		this.morfologiaGalaxia = morfologiaGalaxia;
		sistemas = new ArrayList<Sistema>();
	}


	public String getNomeGalaxia() {
		return nomeGalaxia;
	}


	public void setNomeGalaxia(String nomeGalaxia) {
		this.nomeGalaxia = nomeGalaxia;
	}


	public String getMorfologiaGalaxia() {
		return morfologiaGalaxia;
	}


	public void setMorfologiaGalaxia(String morfologiaGalaxia) {
		this.morfologiaGalaxia = morfologiaGalaxia;
	}


	public Universo getU1() {
		return u1;
	}


	public void setU1(Universo u1) {
		this.u1 = u1;
	}


	public ArrayList<Sistema> getSistemas() {
		return sistemas;
	}


	public void addSistema(Sistema novoSistema) {
		sistemas.add(novoSistema);	
	}

	public void removeSistema(Sistema exSistema) {
		sistemas.remove(exSistema);
	}

}


