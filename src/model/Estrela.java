package model;

public class Estrela extends  CorpoCeleste {
	private String nomeEstrela;
	private int intensidadedeBrilho;
	private Constelacao constelacaoEstrela;

	public Estrela(String nomeEstrela, int intensidadedeBrilho) {
		this.nomeEstrela = nomeEstrela;
		this.intensidadedeBrilho = intensidadedeBrilho;
		}

	
	
	public String getNomeEstrela() {
		return nomeEstrela;
	}

	public void setNomeEstrela(String nomeEstrela) {
		this.nomeEstrela = nomeEstrela;
	}

	public int getIntensidadedeBrilho() {
		return intensidadedeBrilho;
	}

	public void setIntensidadedeBrilho(int intensidadedeBrilho) {
		this.intensidadedeBrilho = intensidadedeBrilho;
	}

	public Constelacao getConstelacaoEstrela() {
		return constelacaoEstrela;
	}

	public void setConstelacaoEstrela(Constelacao constelacaoEstrela) {
		this.constelacaoEstrela = constelacaoEstrela;
	}


}
