package klasy02_konstruktory;

public class Referencje02 {
	
	static void metoda(Konto a, Konto b, Konto c, int x ) {
		
		x += 55;
		b.wplata(200);
		//a = c;
		a = new Konto(2, a.saldo, a.wlasciciel);
		a.wplata(100);
		a.wlasciciel.imie = "Alicja";
		
		System.out.println("Na koncu metody: ");
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println("x: "+ x);
		System.out.println();
	}

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", "1984-04-04");
		Osoba ola = new Osoba("Ola", "Nowacka", "1974-07-07");
		
		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(1, 1000, ola);
		Konto c = b;
		int x = 5000;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println("x: "+ x);
		System.out.println();
		
		metoda(a, b, c, 5000);
		
		System.out.println("Po powrocie od main: ");
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println("x: "+ x);
		System.out.println();
		
 
	}

}
