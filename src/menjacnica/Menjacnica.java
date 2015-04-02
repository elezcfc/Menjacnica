package menjacnica;

import java.util.LinkedList;

public class Menjacnica {

	private String naziv;
	private String mesto;
	private LinkedList<Valuta> valute;
	
	public Menjacnica(String naziv, String mesto){
		naziv = this.naziv;
		mesto = this.mesto;
		valute = new LinkedList<Valuta>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	
}
