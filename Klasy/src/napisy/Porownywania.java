package napisy;

public class Porownywania {

	public static void main(String[] args) {
		String a = "Ala";
		String b = "Ala";
		String c = new String("Ala");
		String d = "A" + "la";
		String e = "A";
		e += "la";
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(a == e);
		System.out.println();
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));

	}

}
