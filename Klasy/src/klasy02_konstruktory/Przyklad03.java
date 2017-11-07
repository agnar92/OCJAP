package klasy02_konstruktory;

import java.time.LocalDate;

public class Przyklad03 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalka", LocalDate.of(1999, 11, 11));
		Konto k = new Konto(1, 1000, ala);
		
		Osoba ola = new Osoba("Ola", "Malinowska", "1994-04-04");
		Konto k2 = new Konto(2, 2000, ola);
		
		System.out.println(k);
		System.out.println(k2);
		
		k.wplata(500);
		
		System.out.println(k);
		System.out.println();
		
		System.out.println("Przed przelewm: ");
		System.out.println(k);
		System.out.println(k2);
		
		k.przelew(k2, 400);
				
		System.out.println("Po przelewm: ");
		System.out.println(k);
		System.out.println(k2);
		
		Konto.przelew(k, k2, 600);
		
		System.out.println("Po przelewm: ");
		System.out.println(k);
		System.out.println(k2);
		
		

	}

}
