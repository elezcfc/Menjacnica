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
	
}
