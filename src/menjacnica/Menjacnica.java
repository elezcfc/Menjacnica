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

	@Override
	public String toString() {
		return "Menjacnica [naziv je " + naziv + ", mesto je " + mesto+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mesto == null) ? 0 : mesto.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (mesto == null) {
			if (other.mesto != null)
				return false;
		} else if (!mesto.equals(other.mesto))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	
	
}
