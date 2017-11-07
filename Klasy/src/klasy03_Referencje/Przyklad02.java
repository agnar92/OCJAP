package klasy03_Referencje;

import java.time.LocalDate;

public class Przyklad02 {

	public static void main(String[] args) {
		Osoba a = new Osoba("Ala", "Kowalka", LocalDate.of(1999, 11, 11));
		Osoba b = new Osoba("Ola", "Malinowska", "1994-04-04");
		
		System.out.println("Osoba a:");
		System.out.println(a);
		System.out.println(a.imie + " " + a.dataUrodzenia);
		System.out.println(a.getWiek());
		Sklep.zakupy(a);
		System.out.println();
		
		System.out.println("Osoba b:");
		System.out.println(b);
		System.out.println(b.imie + " " + b.dataUrodzenia);
		System.out.println(b.getWiek());
		Sklep.zakupy(b);
		System.out.println();
		
		
		

	}

}
