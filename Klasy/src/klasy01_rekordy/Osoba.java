package klasy01_rekordy;

import java.time.*;

public class Osoba {
	
	String imie, nazwisko;
	LocalDate dataUrodzenia;
	
	Osoba(){
		
	}
	
	Osoba(String imie, String nazwisko, LocalDate data){
		// tutaj trzeba this, bo argument przeslania pole imie
		this.imie = imie;
		this.nazwisko = nazwisko;
		//jezeli argument nazwywa ie inczaje od pola, to odwolan do pola nie trzeba 
		dataUrodzenia = data;
	}
	
	//Osoba(String imie, String nazwisko, String data){
	//	this.imie = imie;
	//	this.nazwisko = nazwisko;
	//	dataUrodzenia = LocalDate.parse(data);
	//}
	
	Osoba(String imie, String nazwisko, String data){
		this(imie, nazwisko, LocalDate.parse(data));
	}
	
	

}
