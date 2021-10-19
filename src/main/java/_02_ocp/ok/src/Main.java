package _02_ocp.ok.src;

/**
 * Cada coche extiende la clase abstracta Coche e implementa el método abstracto
 * precioMedioCoche().
 * 
 * Así, cada coche tiene su propia implementación del método precioMedioCoche(),
 * por lo que el método imprimirPrecioMedioCoche() itera el array de coches y
 * solo llama al método precioMedioCoche().
 * 
 * Ahora, si añadimos un nuevo coche, precioMedioCoche() no tendrá que ser
 * modificado. Solo tendremos que añadir el nuevo coche al array, cumpliendo así
 * el principio abierto/cerrado.
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {

		Coche[] arrayCoches = { new Renault(), new Audi(), new Mercedes() };

		imprimirPrecioMedioCoche(arrayCoches);
	}

	public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			System.out.println(coche.precioMedioCoche());
		}
	}
}
