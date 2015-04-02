package menjacnicaInterface;

import java.util.GregorianCalendar;

public interface MenjacnicaInterface {

	public void dodajKurs(int prodajni, int srednji, int kupovni);
	public void izbrisiKurs();
	public int pronadjiKurs(GregorianCalendar datum);
}
