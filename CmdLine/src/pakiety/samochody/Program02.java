package pakiety.samochody;

public class Program02 {

	public static void main(String[] args) {
		Samochod samochod = new Samochod();
		samochod.marka = "Opel";
		
		pakiety.osoby.Osoby osoba = new pakiety.osoby.Osoby();
//NK		osoba.imie = "Jan";
//NK		osoba.nazwisko = "Kowaslki";
		
		osoba.ustawDane("Jan", "Kowaslki");
		
		samochod.wlasciciel = osoba;
		
		samochod.wypiszDane();
		
		
		

	}

}
