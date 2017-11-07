package klasy02_konstruktory;

public class Konto {
	int numer, saldo;
	Osoba wlasciciel;
	
	public Konto(int numer, int saldo, Osoba wlasciciel) {
		super();
		this.numer = numer;
		this.saldo = saldo;
		this.wlasciciel = wlasciciel;
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
	
	
	public Konto getSaldo(Konto a) {
		return a;
	}
	
	@Override
	public String toString() {
		return "Konto nr " + numer + ", saldo: " + saldo + " wl. " + wlasciciel;
	}
	
	
	

}
