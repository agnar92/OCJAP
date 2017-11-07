package pakiety.osoby;

public class Osoby {
	String imie, nazwisko;
	
	public void przedstawSie() {
		System.out.println("Nazwyam sie "+ imie + " " + nazwisko);
	}
	
	public void ustawDane(String i, String n) {
		imie = i;
		nazwisko = n;
	}
}
