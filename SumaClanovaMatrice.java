package lab12;

import lab13.TextIO;

public class SumaClanovaMatrice {

	/**
	 * Funkcija kreira matricu sa zadanim dimenzijama
	 * @param vis
	 * @param sir
	 * @return matrica
	 */
	
	public static int[][] kreirajMatricu (int vis, int sir)
	{
		int[][] matrica = new int[vis][sir];
		for (int i=0; i<vis; i++)
		{
			for (int j=0; j<sir; j++)
			{
				System.out.println("Unesite član (" + i + "," + j + "): ");
				matrica[i][j] = TextIO.getInt();
			}
		}
		return matrica;
	}
	
	/**
	 * Funkcija sabira sve članove jednog reda matrice
	 * @param niz
	 * @return suma
	 */
	
	public static int sumaClanova (int[] niz)
	{
		int suma = 0;
		for (int i=0; i<niz.length; i++)
		{
			suma += niz[i];
		}
		return suma;
	}
	
	/**
	 * Funkcija sabira sve članove jedne kolone matrice
	 * @param matrica
	 * @param broj
	 * @return suma
	 */
	
	public static int sumaKolone (int[][] matrica, int broj)
	{
		int suma = 0;
		for (int i=0; i<matrica.length; i++)
		{
			suma += matrica[i][broj];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite dimenzije matrice: ");
		int visina = TextIO.getInt();
		int sirina = TextIO.getInt();
		int[][] matrica = kreirajMatricu(visina, sirina);
		int suma = sumaClanova(matrica[0]);
		System.out.println("Suma članova niza: " + suma);
		int suma2 = sumaKolone(matrica, 1);
		System.out.println("Suma članova jedne kolone: " + suma2);
		
	}

}
