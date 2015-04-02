package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceni_naziv;
	private GregorianCalendar datum;
	private int prodajni;
	private int srednji;
	private int kupovni;
	
	public Valuta (String naziv, String skraceni_naziv, int godina, int mesec, int dan, int prodajni, int srednji, int kupovni){
		naziv = this.naziv;
		datum = new GregorianCalendar();
		datum.set(godina, mesec-1, dan);
		prodajni = this.prodajni;
		srednji = this.srednji;
		kupovni = this.kupovni;
		skraceni_naziv = this.skraceni_naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceni_naziv() {
		return skraceni_naziv;
	}

	public void setSkraceni_naziv(String skraceni_naziv) {
		this.skraceni_naziv = skraceni_naziv;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public int getProdajni() {
		return prodajni;
	}

	public void setProdajni(int prodajni) {
		this.prodajni = prodajni;
	}

	public int getSrednji() {
		return srednji;
	}

	public void setSrednji(int srednji) {
		this.srednji = srednji;
	}

	public int getKupovni() {
		return kupovni;
	}

	public void setKupovni(int kupovni) {
		this.kupovni = kupovni;
	}

	@Override
	public String toString() {
		return "Valuta [naziv je: " + naziv + ", skraceni naziv je " + skraceni_naziv
				+ ", datum je " + datum + ", prodajni kurs je " + prodajni + ", srednjikurs je:"
				+ srednji + ", kupovni kurs je: " + kupovni + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + kupovni;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + prodajni;
		result = prime * result
				+ ((skraceni_naziv == null) ? 0 : skraceni_naziv.hashCode());
		result = prime * result + srednji;
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
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (kupovni != other.kupovni)
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (prodajni != other.prodajni)
			return false;
		if (skraceni_naziv == null) {
			if (other.skraceni_naziv != null)
				return false;
		} else if (!skraceni_naziv.equals(other.skraceni_naziv))
			return false;
		if (srednji != other.srednji)
			return false;
		return true;
	}
	
	
}
