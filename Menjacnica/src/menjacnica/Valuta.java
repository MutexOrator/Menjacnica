package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String punNaziv;
	private String skrNaziv;
	private LinkedList<Kurs> kurs = new LinkedList<Kurs>();
	public String getPunNaziv() {
		return punNaziv;
	}
	public void setPunNaziv(String punNaziv) {
		this.punNaziv = punNaziv;
	}
	public String getSkrNaziv() {
		return skrNaziv;
	}
	public void setSkrNaziv(String skrNaziv) {
		this.skrNaziv = skrNaziv;
	}
	public LinkedList<Kurs> getKurs() {
		return kurs;
	}
	public void setKurs(LinkedList<Kurs> kurs) {
		this.kurs = kurs;
	}
	
}
