package lambdy;

// Dodatkowa kontorola, nie wymagana do dzialania jak Override.
@FunctionalInterface
public interface FunkcjaLiczbowa {
	
	int apply(int agr);
	
	//mozna miec metode default, nadal dziala lambda dla metody apply.
	default String napisz () { return "OK"; } 

}
