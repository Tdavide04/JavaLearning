

//Calcolo dell'ipotenusa di un triangolo rettangolo

 /*

 * Sia dato un triangolo rettangolo i cui cateti misurano rispettivamente 10.345 e 20.415 cm

 * Calcolare

 * 1) la lunghezza dell'ipotenusa

 * 2) il perimetro del triangolo rettangolo

 * 3) L'area del triangolo rettangolo

 * NB:

 * a) Teorema di pitagora

 * dati c1 w c2 cateti di un triangolo rettangolo, l'ipotenusa è la radice quadrata della somma dei quadrati dei cateti

 * b) In java la rqdica quadrata si calcola con Math.sqrt(numero)

 */

public class Pitagora {

	public static void main(String[] args) {
		double cateto1, cateto2, ipotenusa, perimetro, area;
		cateto1 = 10.345;
		cateto2 = 20.415;
		ipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		perimetro = cateto1 + cateto2 + ipotenusa;
		area = (cateto1 * cateto2) / 2;
		System.out.println(ipotenusa);
		System.out.println(perimetro);
		System.out.println(area);
				
				

	}

}
