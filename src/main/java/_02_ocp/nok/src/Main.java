package _02_ocp.nok.src;

/**
 * Las entidades software (clases, m�dulos y funciones) deber�an estar abiertos
 * para su extensi�n, pero cerrados para su modificaci�n. Si quisi�ramos iterar
 * a trav�s de una lista de coches e imprimir sus marcas por pantalla: Esto no
 * cumplir�a el principio abierto/cerrado, ya que si decidimos a�adir un nuevo
 * coche de otra marca: Tambi�n tendr�amos que modificar el m�todo que hemos
 * creado anteriormente: Como podemos ver, para cada nuevo coche habr�a que
 * a�adir nueva l�gica al m�todo precioMedioCoche().
 * 
 * Esto es un ejemplo sencillo, pero imagina que tu aplicaci�n crece y crece�
 * �cu�ntas modificaciones tendr�amos que hacer? Mejor evitarnos esta p�rdida de
 * tiempo y dolor de cabeza, �verdad?
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {
		Coche[] arrayCoches = { new Coche("Renault"), new Coche("Audi"), new Coche("Mercedes") };
		imprimirPrecioMedioCoche(arrayCoches);
	}

	public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			if (coche.marca.equals("Renault"))
				System.out.println(18000);

			if (coche.marca.equals("Audi"))
				System.out.println(25000);

			if (coche.marca.equals("Mercedes"))
				System.out.println(27000);
		}
	}
}
