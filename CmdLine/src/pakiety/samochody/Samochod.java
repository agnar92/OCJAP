package pakiety.samochody;

import pakiety.osoby.*;

public class Samochod {
	String marka;
	Osoby wlasciciel;
	
	void wypiszDane() {
		System.out.println("Marka samochodu: " + marka);
		System.out.println("Wlasciciel... ");
		wlasciciel.przedstawSie();
	}
}
