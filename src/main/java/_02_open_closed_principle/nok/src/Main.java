package _02_open_closed_principle.nok.src;

/**
 * Las entidades software (clases, modulos y funciones) deberian estar abiertos
 * para su extension, pero cerrados para su modificacion. Si quisieramos iterar
 * a traves de una lista de coches e imprimir sus marcas por pantalla: Esto no
 * cumpliria el principio abierto/cerrado, ya que si decidimos aniadir un nuevo
 * coche de otra marca: Tambien tendriamos que modificar el metodo que hemos
 * creado anteriormente: Como podemos ver, para cada nuevo coche habria que
 * a�adir nueva logica al metodo precioMedioCoche().
 * 
 * Esto es un ejemplo sencillo, pero imagina que tu aplicacion crece y crece...
 * cuantas modificaciones tendriamos que hacer?
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {
		Coche[] arrayCoches = { //
				new Coche("Renault"), //
				new Coche("Audi"), //
				new Coche("Mercedes") };

		imprimirPrecioMedioCoche(arrayCoches);
	}

	/**
	 * 
	 * @param arrayCoches
	 */
	public static void imprimirPrecioMedioCoche(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			if (coche.marca.equals("Renault")) {
				System.out.println(18000);
			}
			if (coche.marca.equals("Audi")) {
				System.out.println(25000);
			}
			if (coche.marca.equals("Mercedes")) {
				System.out.println(27000);
			}
		}
	}
}
