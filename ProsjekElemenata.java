package lab13;

public class ProsjekElemenata {

	/**
	 * Funckija traži unos niza i vraća taj niz
	 * @return niz
	 */
	
	public static int[] unosNiza()
	{
		System.out.println("Unesite broj elemenata niza: ");
		int n = TextIO.getInt();
		int niz [] = new int [n];
		for (int i=0; i<n; i++)
		{
			System.out.println("Unesite " + (i+1) + ". član niza: ");
			niz[i]=TextIO.getInt();
		}
		return niz;
	}
	
	/**
	 * Funkcija prima niz i računa sumu
	 * @param niz
	 * @return suma
	 */
	
	public static double sumaNiza(int[] niz)
	{
		double suma = 0;
		for (int i=0; i<niz.length; i++)
		{
			suma += niz[i];
		}
		return suma;
	}
	
	/**
	 * Funkcija prima niz i sumu njegovih članova i vraća prosjek
	 * @param suma
	 * @param niz
	 * @return prosjek
	 */
	
	public static double prosjekNiza(double suma, int[] niz)
	{
		double prosjek = suma / niz.length;
		return prosjek;
	}
	
	public static void main(String[] args) {
		int array[] = unosNiza(); 
		double zbir =  sumaNiza(array);
		System.out.println("Suma članova niza je: " + zbir + ", a prosjek: " + prosjekNiza(zbir, array));

	}

}
