package klasy;

import java.time.LocalDate;

public class Sklep {
	
	public static void zakupy (Osoba klient) {
		System.out.print(klient.imie + " moze kupic: ");

		if(LocalDate.now().getYear() - klient.dataUrodzenia.getYear() >= 18 ) {
			System.out.println("Tak, piwo");
		} else {
			System.out.println("Nie");
		}
	}

}
