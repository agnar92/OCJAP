package operatory;

public class Ternary {

	public static void main(String[] args) {
		
		int x = 20;
		String s = (x > 10) ? "Duzo" : "Malo";
		System.out.println(s);
		
		s = x > 10 ? "Duzo " : 
			(x % 2 == 0) ? "Maly parzysyt " : "Maly nieparzysty"; 
		System.out.println(s);
		
		s = x > 10 ? 
				(x % 10 == 0 ? "duzy dziesietny" : "duzy niedziesietny") : 
					( x % 2 == 0 ? "Maly parzysyt " : "Maly nieparzysty"); 
		System.out.println(s);
	}

}
