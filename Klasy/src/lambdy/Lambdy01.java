package lambdy;

import java.util.Arrays;

public class Lambdy01  {

	public static void main(String[] args) {
		
		// klasa anonimowa, skladnia dostepan prawie od poczatku Javy
		FunkcjaLiczbowa f0 = new FunkcjaLiczbowa() {
			public int apply(int arg) {
				return arg + 1;
			}
		};

		// wyrazenie lambda, dostepne od Javy 8
		FunkcjaLiczbowa f1 = arg -> arg+1;
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(a));
		Zastosowania.zmienTablice(a, f1);
		System.out.println(Arrays.toString(a));
		
		Zastosowania.zmienTablice(a, y -> 2*y);
		System.out.println(Arrays.toString(a));
		
	}

}
