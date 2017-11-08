package lambdy;

import java.util.Comparator;
import java.util.function.Predicate;

public class Lambdy02 {

	public static void main(String[] args) {
		
		Comparator<String> c = (s1, s2) -> s1.length() - s2.length();
		
		//wiele argumentow - trzeba wizac w nawiaz
		//NK Comparator<String> c = s1, s2 -> s1.length() - s2.length();
		
		// jezeli podajemy typ to wszystkich
		// NK Comparator<String> c = (String s1, s2) -> s1.length() - s2.length();
		
		Comparator<String> c2 = (String s1, String s2) -> s1.length() - s2.length();
		
		Runnable r1 = () -> {
			System.out.println("lalala");
			while(true){
				System.out.println("lolooo");
			}
		};
		
		Runnable r2 = () -> System.out.println("lolooo");
		
		Predicate<String> p1 = (String s) -> { 
			if(s.length() > 10) {
				return true;
			} else {
				return false;
			}
		};
		
		
		Predicate<String> p2 = (String s) -> s.length() > 10;
		
		Predicate<String> p3 = (s) -> s.length() > 10;
		
		Predicate<String> p4 = s -> s.length() > 10;
		
		
		
		
		

	}

}
