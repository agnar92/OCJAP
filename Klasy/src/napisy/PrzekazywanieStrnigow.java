package napisy;

import java.util.concurrent.atomic.AtomicInteger;

public class PrzekazywanieStrnigow {
	
	static void metoda(String s) {
		s += " ma kota";
		// tworzony nowy obiekt, wykonywanie operacji na kopi, nie na orginale.
		System.out.println(s);
	}
	
	static void metoda(StringBuilder s) {
		s.append(" ma Kota");
		System.out.println(s);
	}
	
	static void metoda(Integer i) {
		i += 10;
		// dzialanie na kopii, nie na orginale.
		System.out.println(i);
	}
	
	static void metoda(AtomicInteger ai) {
		ai.addAndGet(10);
		System.out.println(ai);
	}

	public static void main(String[] args) {
		
		String a = "Ala";
		metoda(a);
		System.out.println(a);
		
		Integer i = 5;
		metoda(i);
		System.out.println(i);
		
		System.out.println();
		AtomicInteger atom = new AtomicInteger(33);
		System.out.println(atom);
		metoda(atom);
		System.out.println(atom);

	}

}
