package klasy;

import java.time.LocalDate;

public class Wypisywanie {

	public static void main(String[] args) {
		Osoba a = new Osoba ("Ala", "Kowalska", LocalDate.of(199, 11, 11));
		
		System.out.println(a);
		
		String s = a.toString();
		System.out.println(s);
		
		System.out.println(String.valueOf(a));
		
		s = "a: " + a;
		System.out.println(s);
		
		System.out.printf("%s\n", a);
		
		Object obj = a;
		s = obj.toString();
		System.out.println(s);
	}

}
