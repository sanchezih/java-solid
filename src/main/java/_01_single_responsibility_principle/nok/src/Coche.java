package _01_single_responsibility_principle.nok.src;

/**
 * La clase Coche permite tanto el acceso a las propiedades de la clase como a
 * realizar operaciones sobre la BBDD, por lo que la clase ya tiene mas de una
 * responsabilidad.
 * 
 * Suponiendo que debamos realizar cambios en los metodos que realizan las
 * operaciones a la BBDD, ademas de estos cambios, probablemente tendriamos que
 * tocar los nombres o tipos de las propiedades, metodos, etc, cosa que no
 * parece muy eficiente porque solo estamos modificando cosas que tienen que ver
 * con la BBDD
 * 
 * @author ihsanch
 *
 */
class Coche {
	String marca;

	Coche(String marca) {
		this.marca = marca;
	}

	String getMarcaCoche() {
		return marca;
	}

	void guardarCocheDB(Coche coche) {
	}
}