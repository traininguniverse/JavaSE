package net.traininguniverse.typ_wyliczeniowy.main;

public class Human {

	private String imie;
	private int wiek;
	private KolorOczu kolorOczu;
	private KolorWlosow kolorWlosow;

	public Human() {
	}

	public Human(String imie, int wiek, KolorOczu kolorOczu, KolorWlosow kolorWlosow) {
		super();
		this.imie = imie;
		this.wiek = wiek;
		this.kolorOczu = kolorOczu;
		this.kolorWlosow = kolorWlosow;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public KolorOczu getKolorOczu() {
		return kolorOczu;
	}

	public void setKolorOczu(KolorOczu kolorOczu) {
		this.kolorOczu = kolorOczu;
	}

	public KolorWlosow getKolorWlosow() {
		return kolorWlosow;
	}

	public void setKolorWlosow(KolorWlosow kolorWlosow) {
		this.kolorWlosow = kolorWlosow;
	}

	@Override
	public String toString() {
		return "Human [imie=" + imie + ", wiek=" + wiek + ", kolorOczu=" + kolorOczu + ", kolorWlosow=" + kolorWlosow
				+ "]";
	}

}
