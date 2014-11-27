package lab12;

import lab13.TextIO;

public class DugiZadatak {
	
	/**
	 * Funkcija kreira jednu matricu sa yadanom visinom i širinom
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
	 * Funkcija ispisuje yadanu matricu
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
		System.out.println();
		ispisiMatricu(matrica);
	}

}
