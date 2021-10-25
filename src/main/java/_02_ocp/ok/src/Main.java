package _02_ocp.ok.src;

/**
 * Cada coche extiende la clase abstracta Coche e implementa el metodo abstracto
 * precioMedioCoche().
 * 
 * Asi, cada coche tiene su propia implementacion del metodo precioMedioCoche(),
 * por lo que el metodo imprimirPrecioMedioCoche() itera el array de coches y
 * solo llama al metodo precioMedioCoche().
 * 
 * Ahora, si aniadimos un nuevo coche, precioMedioCoche() no tendra que ser
 * modificado. Solo tendremos que aniadir el nuevo coche al array, cumpliendo
 * asi el principio abierto/cerrado.
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
