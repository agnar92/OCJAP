package klasy;

public class TestWyjatkow {

	public static void main(String[] args) {
		Osoba ala = new Osoba( "ala" ,"Kowalas", "1999-03-03");
		Konto k = new Konto(1, 1000, ala);
		
		System.out.println(k);
		
		k.wplata(200);
		System.out.println(k);
		
		try {
			k.wplata(-50);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println(k);
		
		try {
		k.wyplata(100);
		System.out.println(k);
		} catch (BrakSrodkow e){
			e.printStackTrace();
		}
	}

}
