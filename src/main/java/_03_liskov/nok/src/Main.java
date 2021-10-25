package _03_liskov.nok.src;

/**
 * Esto viola tanto el principio de substitucion de Liskov como el de
 * abierto/cerrado. El programa debe conocer cada tipo de Coche y llamar a su
 * metodo numAsientos() asociado.
 * 
 * Asi, si aniadimos un nuevo coche (Ford), el metodo debe modificarse para aceptarlo.
 * 
 * @author ihsanch
 *
 */
public class Main {
	public static void main(String[] args) {
		Coche[] arrayCoches = { new Renault(), new Audi(), new Mercedes(), new Ford() };
		imprimirNumAsientos(arrayCoches);
	}

	public static void imprimirNumAsientos(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			if (coche instanceof Renault) {
				System.out.println(numAsientosRenault(coche));
			}
			if (coche instanceof Audi) {
				System.out.println(numAsientosAudi(coche));
			}
			if (coche instanceof Mercedes) {
				System.out.println(numAsientosMercedes(coche));
			}
			if (coche instanceof Ford) {
				System.out.println(numAsientosFord(coche));
			}
		}
	}

	private static int numAsientosFord(Coche coche) {
		System.out.println("Imprimiendo el numero de asientos de un Ford");
		return 4;
	}

	private static int numAsientosMercedes(Coche coche) {
		System.out.println("Imprimiendo el numero de asientos de un Mercedes");
		return 4;
	}

	private static int numAsientosAudi(Coche coche) {
		System.out.println("Imprimiendo el numero de asientos de un Audi");
		return 4;
	}

	private static int numAsientosRenault(Coche coche) {
		System.out.println("Imprimiendo el numero de asientos de un Renault");
		return 4;
	}
}
