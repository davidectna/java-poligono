package geometria;

public class Rombo implements Poligono {

	private static int numeroDiLati = 4;

	@Override
	public void calcolaPerimetro(int lunghezzaLato) {
		System.out.println("Il perimetro del rombo � uguale a -->  "+ numeroDiLati*lunghezzaLato);
	}

	@Override
	public void calcolaArea(int lunghezzaLato,int altezza) {
		System.out.println("L'area del rombo � uguale a -->  "+lunghezzaLato*altezza);
	}
	

}
