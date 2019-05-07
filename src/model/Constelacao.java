package model;

import java.util.ArrayList;

public class Constelacao extends CorpoCeleste {

	private String nomeConstelacao,descricaoConstelacao;
	private ArrayList<Estrela> estrelas;

	public Constelacao(String nomeConstelacao, String descricaoConstelacao) {
		super();
		this.nomeConstelacao = nomeConstelacao;
		this.descricaoConstelacao = descricaoConstelacao;
		estrelas = new ArrayList<Estrela>();
	}

	public String getNomeConstelacao() {
		return nomeConstelacao;
	}

	public void setNomeConstelacao(String nomeConstelacao) {
		this.nomeConstelacao = nomeConstelacao;
	}

	public String getDescricaoConstelacao() {
		return descricaoConstelacao;
	}

	public void setDescricaoConstelacao(String descricaoConstelacao) {
		this.descricaoConstelacao = descricaoConstelacao;
	}

	public ArrayList<Estrela> getEstrelas() {
		return estrelas;
	}

	public void addEstrela(Estrela novaEstrela) {
		estrelas.add(novaEstrela);
	}

	public void removeEstrela(Estrela exEstrela) {
		estrelas.remove(exEstrela);
	}



}
