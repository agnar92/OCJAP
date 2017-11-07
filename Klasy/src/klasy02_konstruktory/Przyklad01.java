package klasy02_konstruktory;

import java.time.*;

public class Przyklad01 {

	public static void main(String[] args) {
		Osoba a = new Osoba();
		System.out.println(a.imie);
		
		a.imie = "Ala";
		a.nazwisko = "Kowalska";
		a.dataUrodzenia = LocalDate.of(1989, 3, 14);
		
		System.out.println(a.imie);
		System.out.println(a);
		
		
		Osoba b; //nie zainicjalizowane
		//NK System.out.println(b);
		//NK System.out.println(b.imie);
		//NK b.imie = "Ola";   odczytanie zmienne b
		
		b = new Osoba();
		b.imie = "Ola";
		b.dataUrodzenia = LocalDate.parse("2001-07-19");
		
		System.out.println(a.imie + " " + a.dataUrodzenia);
		System.out.println(b.imie + " " + b.dataUrodzenia);
		
		Sklep.zakupy(a);
		Sklep.zakupy(b);

	}

}
