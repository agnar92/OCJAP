package petle;

public class TabliczkaMnozenia {

	public static void main(String[] args) {
		int N = 10;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++ ) {
				System.out.print(i*j+"\t");	
			}
			System.out.println();
		}

	}

}
