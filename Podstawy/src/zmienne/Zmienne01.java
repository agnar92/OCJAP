package zmienne;

public class Zmienne01 {
	// zmienne deklarowane na poziomie klasy, czyli "pola" albo "atrybuty"
	// moga byc "insancyjne" lub "statyczne"
	String pole;
	
	static String poleStatyczne;

	public static void main(String[] args) {
		//Pola mozna odczytywac "od razu"; jest in nadawana wartosc domyslna
		System.out.println(poleStatyczne);
		
		//deklaracja zmiennej ( tu : zmiennej lokalnej, bo deklaracja jest wewnatrz metody )
		int x;
		
		// nie mozna odczyctac zmiennych lokalnych dopoki nie nadamy wartosci
//NK		System.out.println(x);
//NK		x++;
//NK		x += 10;
		
		// deklaracja z inicjalizacja ( i nie ma problemu z brakiem wartosci)
		int y = 5;
		System.out.println(y);
		
		if(y > 0) {
			x = 100;
		}
		
		//kompilator nadal "nie ma pewnosci czy zmienna zostala zainicjowana, wiec nie pozwala czytac zminnej
		//NK System.out.println(x);
		
		if (y > 0) {
			x = 100;
		} else {
			x = 200;
		}
		
		// W obu przypadkach na x wpisana wartoœæ - ju¿ na pewno jest zainicjowany
		System.out.println(x);

	}

}
