package klasy01_rekordy;

import java.time.LocalDate;

public class Sklep {
	
	public static void zakupy (Osoba klient) {
		System.out.print(klient.imie + " moze kupic: ");
		
		int rok = 2017;
		
		
		if(LocalDate.now().getYear() - klient.dataUrodzenia.getYear() >= 18 ) {
			System.out.println("Tak, piwo");
		} else {
			System.out.println("Nie");
		}
	}

}
