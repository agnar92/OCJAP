package lambdy;

public class Zastosowania {
	
	public static void zmienTablice (int[] t, FunkcjaLiczbowa f) {
		for (int i = 0; i < t.length; i++) {
			t[i] = f.apply(t[i]);
		}
	}

}
