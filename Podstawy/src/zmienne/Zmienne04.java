package zmienne;

public class Zmienne04 {
	
	static int x = 10;

	public static void main(String[] args) {
		
		System.out.println(x);
		metoda();
		System.out.println(x);
	}
	
	static void metoda() {
		x++;
		System.out.println(x);
		
		int x = 50;
		x++;
		System.out.println(x);
	}

}
