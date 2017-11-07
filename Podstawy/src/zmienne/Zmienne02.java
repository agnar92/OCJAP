package zmienne;

public class Zmienne02 {

	public static void main(String[] args) {
		int x;
		final int y = 5;
		System.out.println(y);
		
		if(y > 0) {
			x = 100;
		}
		
		// Dzieki "final" y potraktowane jako stala i kompilator ma pewnosc, ze program wszedl do if-a i zainicjowal x-a
		System.out.println(x);
	}

}
