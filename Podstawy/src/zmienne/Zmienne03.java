package zmienne;

public class Zmienne03 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		
		// blok kodu wrzucony "luzem" do metody
		{
			int y= 2 * x;
			System.out.println(x+y);
			
			// nie mozna "zakryc" zmiennej x nowa delklaracja
			//NK int x = 33;
			//NK String x = "Ala";
		}
		// nie ma dostepy do y - poza zasiegiem
		//NK System.out.println(y);
		
		//kolejny zagniezdzony blok - tym razem w naturalny sposob
		if (x > 0) {
			// moge ponownie zadeklarowac y
			String y = "Ala ma kota";
			System.out.println(y);
			System.out.println(x);
		}
		// znowu y poza zasiegiem, moge ponownie zadeklarowac
		long y = x * x;
		System.out.println(y);

	}

}
