package klasy04_dziedziczenie;

public class Konto {
	private final int numer;
	private int saldo;
	Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		super();
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
	}
	
	public Osoba getWlasciciel() {
		return wlasciciel;
	}

	public void setWlasciciel(Osoba wlasciciel) {
		this.wlasciciel = wlasciciel;
	}

	public int getNumer() {
		return numer;
	}
	
	public int getSaldo() {
		return saldo;
	}

	public void wplata(int saldo) {
		this.saldo += saldo;
	}
	
	public void wyplata(int saldo) {
		this.saldo -= saldo;
	}
	
	public static void przelew(Konto a, Konto b, int kwota ) {
		a.wyplata(kwota);
		b.wplata(kwota);
	}
	
	public void przelew(Konto cel, int kwota ) {
		this.saldo -= kwota;
		cel.saldo += kwota;
	}
	
	@Override
	public String toString() {
		return "Konto nr " + numer + ", saldo: " + saldo + " wl. " + wlasciciel;
	}
	
	
	

}
