package napisy;

public class Szok {

	public static void main(String[] args) {
		Integer a = new Integer(100);
		Integer b = new Integer(100);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a+0 == b+0 ); // jako int
		System.out.println();
		
		Integer c = 100;
		Integer d = 100;
		d = Integer.valueOf(100);
		System.out.println(c == d);
		System.out.println(a.equals(d));
		System.out.println();
		
		Integer f = 200;
		Integer g = 200;
		System.out.println(f == g);
		System.out.println(f.equals(g));
		System.out.println();
		
		
	}

}
