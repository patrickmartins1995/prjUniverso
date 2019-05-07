package model;

import java.util.ArrayList;

public class Planeta extends  CorpoCeleste{
	
	private boolean habitavel;
	private ArrayList<Satelite> satelites;
	private String nomePlaneta;
	
	public Planeta(String nomePlaneta ,boolean habitavel) {
		this.habitavel = habitavel;
		this.nomePlaneta = nomePlaneta;
	}


	public String getNomePlaneta() {
		return nomePlaneta;
	}


	public void setNomePlaneta(String nomePlaneta) {
		this.nomePlaneta = nomePlaneta;
	}


	public boolean isHabitavel() {
		return habitavel;
	}

	public void setHabitavel(boolean habitavel) {
		this.habitavel = habitavel;
	}
	
	public void addSatelite(Satelite novoSatelite) {
		satelites.add(novoSatelite);
	}
	
	public void removeSatelite(Satelite exSatelite) {
		satelites.remove(exSatelite);
	}


	public ArrayList<Satelite> getSatelites() {
		return satelites;
	}
	
}
