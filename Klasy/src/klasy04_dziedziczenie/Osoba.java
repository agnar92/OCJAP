package klasy04_dziedziczenie;

import java.time.*;

public class Osoba {
	
	private String imie, nazwisko;
	private LocalDate dataUrodzenia;
	
	public Osoba() {
		
	}
	
	public Osoba(String imie, String nazwisko, LocalDate data){
		// tutaj trzeba this, bo argument przeslania pole imie
		this.imie = imie;
		this.nazwisko = nazwisko;
		//jezeli argument nazwywa ie inczaje od pola, to odwolan do pola nie trzeba 
		dataUrodzenia = data;
	}
	
	
	public Osoba(String imie, String nazwisko, String data){
		this(imie, nazwisko, LocalDate.parse(data));
	}
	
	int getWiek() {
		//return LocalDate.now().getYear() - this.dataUrodzenia.getYear();
		Period wiekDokladnie = Period.between(dataUrodzenia, LocalDate.now());
		//System.out.println("Wiek dokladnie:" + wiekDokladnie);
		return wiekDokladnie.getYears();
	}
	@Override
	public String toString() {
		return imie + " " + nazwisko + " ur: " + dataUrodzenia;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public LocalDate getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(LocalDate dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	
	
	
	

}
