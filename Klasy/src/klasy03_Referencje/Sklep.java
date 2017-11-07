package klasy03_Referencje;


public class Sklep {
	
	public static void zakupy (Osoba klient) {
		System.out.print(klient.imie + " moze kupic: ");
		
		if( klient.getWiek() >= 18 ) {
			System.out.println("Tak, piwo");
		} else {
			System.out.println("Nie");
		}
	}

}
