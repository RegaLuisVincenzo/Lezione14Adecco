package com.adecco.persona;

public class Persona {
	
	private String cognome;
	private int eta;
	
	public Persona() {
		this("Rega",27 );
	}
	
	public Persona(String cognome, int eta) {
		setCognome(cognome);
		setEta(eta);
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Persona [cognome=" + cognome + ", eta=" + eta + "]";
	}

	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	

}
