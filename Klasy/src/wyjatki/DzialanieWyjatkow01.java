package wyjatki;

public class DzialanieWyjatkow01 {
	
	static void metoda(String arg) {
		System.out.println("Poczatek Metody");
		
		int n = arg.length();
		System.out.println("length = "+ n);
		
		char c = arg.charAt(5);
		System.out.println("Szosta litereo to: " + c);
		
		if("ERROR".equals(arg)) {
			int[] t = new int[1_000_000_000];
			System.out.println("Mega Tablica");
		}
		
		System.out.println("Koniec Metody");
	}
	
	public static void main(String[] args) {
		System.out.println("Poczatek main");
		//metoda("Alicja");
		try {
			//metoda(null);
			//metoda("ola");
			metoda("ERROR");
			System.out.println("Przed catch");
		} catch(NullPointerException e){
			System.out.println("Wylapalem NPE");
			//throw e; zle
		
		} catch (Exception e) {
			System.out.println("Wylapalem Exception " + e);
		} finally {
			System.out.println("FINALLY");
		}
		//NK} catch(NullPointerException e){
		//NK	//e.printStackTrace("Wylapalem NPE");
		//NK	//System.out.println("Wylapalem NPE");	
		//NK }
	
		
		System.out.println("Koniec Main");
		
	}

}
