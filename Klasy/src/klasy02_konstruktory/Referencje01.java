package klasy02_konstruktory;

public class Referencje01 {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", "1984-04-04");
		Osoba ola = new Osoba("Ola", "Nowacka", "1974-07-07");
		
		Konto a = new Konto(1, 1000, ala);
		Konto b = new Konto(1, 1000, ola);
		Konto c = b;
		
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println();
		
		b.wplata(200);
		c.wyplata(2);
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println();
		
		b = a;
		b.wyplata(1);
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println();
		
		a = null;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println();
		
		b = a;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		System.out.println("c: "+ c);
		System.out.println();
		
 
	}

}
