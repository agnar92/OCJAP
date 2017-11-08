package abstrakcyjne;

public abstract class Nadklasa {
	
	abstract int ile();
	
	abstract String nazwa() throws Exception ;
	
	abstract void nic();
	
	int m() { return 8; }
	
}

// Kada klasa nie abstrakcyjna dzidziczca z klasy abstrakcyjnej musi posiadac deklaracjie metod ( ciala ) z klasy abstrakcyjnej.

abstract class Podklasa1 extends Nadklasa{
	// nie trzeba implementowac metod, abstract daje taka mozliwosc
	// implementacja ciala metody ile().
	 int ile() { return 15; }
	 // zmniejszenie widocznosci
	 public abstract String nazwa();
}

class Podklasa11 extends Podklasa1 {
	// ile() nie wymagane bo cialo zostalo okreslone w Podklasa1.
	public String nazwa() {
		return "Ala";
	}
	
	// wychywywanie bledu na poziome kompilacji ( zla nazwa metody, zmiennych )
	@Override
	void nic() {
		
	}
}