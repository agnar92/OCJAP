package klasy;

public class Polimorfizm {
	
	static void zbadaj(Osoba osoba) {
		System.out.println(osoba);
		System.out.println(osoba.kimJestem());
		// NK System.out.println(osoba.getKierunek());
		
		//System.out.println(osoba.getClass().getName());
		if(osoba.getClass() == Osoba.class) {
			// mozna uzyc equals, ale tutaj nie trzeba (dla kazdej klasy jest jedna isntacja obiektu class)
			System.out.println("to jest zwykla osoba");
		}
		
		if(osoba instanceof Student) {
			System.out.println("To jest student");
			Student jakoStudent = (Student) osoba;
			System.out.println(jakoStudent.getKierunek() + ", rok "+ jakoStudent.getRokStudiow());
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		Osoba[] osoby = {
			new Osoba("Ala", "Kowalska", "1992-04-04"),
			new Osoba("Ola", "Nowacka", "1997-04-04"),
			new Osoba("Jan", "Kowalski", "1975-05-05"),
			new Student("Adam", "Abacki", "1999-09-09", 2, "budownictwo"),
			new Student("Ula", "Abacka", "1999-09-09", 3, "kucharstwo"),
			new Student("Ala", "Katowska", "2003-02-02", 2, "biologia"), // przecineka nie musi byc
		};
		
		for (Osoba osoba : osoby) {
			System.out.println("Kolejna osoba: " + osoba.getImie());
			zbadaj(osoba);
			//System.out.println(osoba);
		}

	}

}
