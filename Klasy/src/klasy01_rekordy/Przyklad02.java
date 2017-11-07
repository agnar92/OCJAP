package klasy01_rekordy;

import java.time.LocalDate;

public class Przyklad02 {

	public static void main(String[] args) {
		Osoba a = new Osoba("Ala", "Kowalka", LocalDate.of(2002, 7, 30));
		
		System.out.println(a);
		System.out.println(a.imie + " " + a.dataUrodzenia);
		
		Osoba b = new Osoba("Ola", "Malinowska", "1994-04-04");
		

	}

}
