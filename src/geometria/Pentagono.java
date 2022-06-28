package geometria;

public class Pentagono implements Poligono {
	
	private static int numeriDiLati = 5;
	
	private static double costantePentagono = 1.72;

	@Override
	public void calcolaPerimetro(int lunghezzaLato) {
		System.out.println("Il perimetro del pentagono è uguale a -->  "+numeriDiLati * lunghezzaLato);
		
	}

	@Override
	public void calcolaArea(int lunghezzaLato, int apotema) {
		System.out.println("L'area del pentagono è uguale a -->  "+Math.pow(lunghezzaLato,2)*costantePentagono);
	}

}
