package lab12;

import lab13.TextIO;

public class PostaviVrijednostMatrice {

	/**
	 * Funkcija kreira matricu sa zadanom visinom i širinom, svi članovi su 0
	 * @param vis
	 * @param sir
	 * @return matrica
	 */
	
	public static int[][] kreirajMatricu (int vis, int sir)
	{
		int[][] matrica = new int[vis][sir];
		return matrica;
	}
	
	/**
	 * Funkcija traži unos koordinata jednog člana i unos nove vrijednosti tog člana
	 * @param matrica
	 * @return matrica
	 */
	
	public static int[][] postaviVrijednost(int[][] matrica)
	{
		System.out.println("Unesite koordinate broja kojeg želite promijeniti: ");
		int x = TextIO.getInt();
		int y = TextIO.getInt();
		while (x < 0 || x > matrica.length-1 || y < 0 || y > matrica[x].length-1)
		{
			System.out.println("Niste unijeli validne koordinate! Ponovite unos: ");
			x = TextIO.getInt();
			y = TextIO.getInt();
		}
		System.out.println("Unesite novu vrijednost: ");
		matrica[x][y]=TextIO.getInt();
		return matrica;
	}
	
	/**
	 * Funkcija ispisuje matricu
	 * @param matrica
	 */
	
	public static void ispisiMatricu(int[][] matrica)
	{
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				System.out.print(matrica[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite visinu matrice: ");
		int visina = TextIO.getInt();
		System.out.println("Unesite visinu matrice: ");
		int sirina = TextIO.getInt();
		int[][] matrica = kreirajMatricu(visina, sirina);
		matrica = postaviVrijednost(matrica);
		ispisiMatricu(matrica);

	}

}
