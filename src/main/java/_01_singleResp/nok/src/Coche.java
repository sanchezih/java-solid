package _01_singleResp.nok.src;

/**
 * La clase Coche permite tanto el acceso a las propiedades de la clase como a
 * realizar operaciones sobre la BBDD, por lo que la clase ya tiene mas de una
 * responsabilidad.
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