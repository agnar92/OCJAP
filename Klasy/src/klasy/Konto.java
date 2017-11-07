package klasy;

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

	public void wplata(int kwota) {
		if( kwota <= 0) {
			throw new IllegalArgumentException("Ujemna kwota wplata");			
		}
		
		this.saldo += kwota;
		
	}
	
	public void wyplata(int kwota) throws BrakSrodkow {
		if( kwota <= 0) {
			throw new IllegalArgumentException("Ujemna kwota wplata");			
		}
		
		if(kwota > saldo) {
			throw new BrakSrodkow("Za malo Kasy na koncie " + numer);
		}
		this.saldo -= kwota;
	}
	
	public static void przelew(Konto a, Konto b, int kwota ) throws BrakSrodkow {
		if( kwota <= 0) {
			throw new IllegalArgumentException("Ujemna kwota wplata");			
		}
		a.wyplata(kwota);
		b.wplata(kwota);
	}
	
	public void przelew(Konto cel, int kwota ) {
		if( kwota <= 0) {
			throw new IllegalArgumentException("Ujemna kwota wplata");			
		}
		this.saldo -= kwota;
		cel.saldo += kwota;
	}
	
	@Override
	public String toString() {
		return "Konto nr " + numer + ", saldo: " + saldo + " wl. " + wlasciciel;
	}
	
	
	

}
