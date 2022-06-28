package geometria;

public class Main {

	public static void main(String[] args) {
		
		int lunghezzaStandardLato = 8;
		
		Pentagono ilPentagono = new Pentagono();
		ilPentagono.calcolaPerimetro(lunghezzaStandardLato);
		ilPentagono.calcolaArea(lunghezzaStandardLato,0);
		
		System.out.println("\n");
		
		Rombo ilRombo = new Rombo();
		ilRombo.calcolaPerimetro(lunghezzaStandardLato);
		ilRombo.calcolaArea(lunghezzaStandardLato,5);
	}
}
