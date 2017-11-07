package klasy04_dziedziczenie;

public class Przyklad01 {
	public static void main(String[] args) {
		Student st = new Student("Adam", "Abacki", "1997-07-07", 3, "informatyka");
		
		// dziedzicenie jako rozszerzanie: student ma te same metody co osoba a dodatkowo definiuje wlasne
		System.out.println(st);
		System.out.println(st.getImie());
		System.out.println(st.getKierunek());
		
		// Student jest "podtypem" Osoby, tzn. student moze byc uzyty wszedzie tam gdzie oczekiwan jest osoba
		// Mozna studenta wpisac na zmienna typu Osoba

		Osoba jakoOsoba = st;
		System.out.println(jakoOsoba.getImie());
		
		// NK System.out.println(jakoOsoba.getKierunek());
		
		// Mozna tez przekazac jako parametr oczekujacej Osoby
		Sklep.zakupy(st);
		Sklep.zakupy(jakoOsoba);
		
	}

}
