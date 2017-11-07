package liczby;

public class LiczenieKontrolowane {

	public static void main(String[] args) {
		int x = 5;
		int y = 1_000_000_000;
		
		int wynik = x * y;
		System.out.println("Wynik bez kontroli: " + wynik);
		
		try {
			int wynik2 = Math.multiplyExact(x,y);
			System.out.println("wynik z kontrola: " + wynik2);
		} catch (Exception e) {
			System.out.println("Nastapil wyjatek: " + e);
		}
		
		
	}

}
