package klasy;

import java.time.LocalDate;

public class Porownywanie {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1992, 01, 01));
		Osoba ala1 = new Osoba("Ala", "Kowalska", LocalDate.of(1992, 01, 01));
		Osoba ola = new Osoba("Ola", "Nowacka", LocalDate.of(1989, 02, 02));
		
		System.out.println(ala.equals(ala1));
		System.out.println(ala1.equals(ala));
		System.out.println(ala1.equals(ola));
		
	}

}
