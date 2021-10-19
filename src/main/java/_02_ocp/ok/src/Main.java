package _02_ocp.ok.src;

/**
 * Cada coche extiende la clase abstracta Coche e implementa el m�todo abstracto
 * precioMedioCoche().
 * 
 * As�, cada coche tiene su propia implementaci�n del m�todo precioMedioCoche(),
 * por lo que el m�todo imprimirPrecioMedioCoche() itera el array de coches y
 * solo llama al m�todo precioMedioCoche().
 * 
 * Ahora, si a�adimos un nuevo coche, precioMedioCoche() no tendr� que ser
 * modificado. Solo tendremos que a�adir el nuevo coche al array, cumpliendo as�
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
