package _02_ocp.nok.src;

/**
 * Las entidades software (clases, módulos y funciones) deberían estar abiertos
 * para su extensión, pero cerrados para su modificación. Si quisiéramos iterar
 * a través de una lista de coches e imprimir sus marcas por pantalla: Esto no
 * cumpliría el principio abierto/cerrado, ya que si decidimos añadir un nuevo
 * coche de otra marca: También tendríamos que modificar el método que hemos
 * creado anteriormente: Como podemos ver, para cada nuevo coche habría que
 * añadir nueva lógica al método precioMedioCoche().
 * 
 * Esto es un ejemplo sencillo, pero imagina que tu aplicación crece y crece…
 * ¿cuántas modificaciones tendríamos que hacer? Mejor evitarnos esta pérdida de
 * tiempo y dolor de cabeza, ¿verdad?
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
