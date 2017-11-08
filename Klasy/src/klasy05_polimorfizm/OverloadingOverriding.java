package klasy05_polimorfizm;

public class OverloadingOverriding {
	
	static void zbadaj(Osoba osoba) {
		System.out.println("Badam osobe");
		System.out.println(osoba);
		System.out.println();
	}
	//overloading
	static void zbadaj(Student student) {
		System.out.println("Badam studenta");
		System.out.println(student);
		System.out.println();
	}

	public static void main(String[] args) {
		
		Osoba[] osoby = {
				new Osoba("Ala", "Kowalska", "1992-04-04"),
				new Student("Ala", "Katowska", "2003-02-02", 2, "biologia")
			};
			
			for (Osoba osoba : osoby) {
				System.out.println("Kolejna osoba: " + osoba.getImie());
				System.out.println(osoba.kimJestem());
				zbadaj(osoba);
			}


	}

}
