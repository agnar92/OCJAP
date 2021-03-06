package klasy04_dziedziczenie;

import java.time.LocalDate;

public class Student extends Osoba {
	private int rokStudiow;
	private String kierunek;
	
	public Student() {
		super();	
	}

	public Student(String imie, String nazwisko, LocalDate data, int rokStudiow, String kierunek) {
		super(imie, nazwisko, data);
		this.rokStudiow = rokStudiow;
		this.kierunek = kierunek;
	}

	public Student(String imie, String nazwisko, String data, int rokStudiow, String kierunek) {
		super(imie, nazwisko, data);
		this.rokStudiow = rokStudiow;
		this.kierunek = kierunek;
	}

	public int getRokStudiow() {
		return rokStudiow;
	}

	public void setRokStudiow(int rokStudiow) {
		this.rokStudiow = rokStudiow;
	}

	public String getKierunek() {
		return kierunek;
	}

	public void setKierunek(String kierunek) {
		this.kierunek = kierunek;
	}
	
	
}
