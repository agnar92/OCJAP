package klasy;

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
	
	public String kimJestem() {
		return "Jestem Osoba";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataUrodzenia == null) ? 0 : dataUrodzenia.hashCode());
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((nazwisko == null) ? 0 : nazwisko.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (dataUrodzenia == null) {
			if (other.dataUrodzenia != null)
				return false;
		} else if (!dataUrodzenia.equals(other.dataUrodzenia))
			return false;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (nazwisko == null) {
			if (other.nazwisko != null)
				return false;
		} else if (!nazwisko.equals(other.nazwisko))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object o) {
//		return true;
//	}
	
	
	
	
	

}
