package _03_liskov_substitution_principle.ok.src;

public class Main {
	public static void main(String[] args) {
		Coche[] arrayCoches = { new Renault(), new Audi(), new Mercedes(), new Ford() };
		imprimirNumAsientos(arrayCoches);
	}

	/**
	 * Para que este metodo cumpla con el principio, seguiremos estos principios:
	 * 
	 * Si la superclase (Coche) tiene un metodo que acepta un parametro del tipo de
	 * la superclase (Coche), entonces su subclase (Renault) deberia aceptar como
	 * argumento un tipo de la superclase (Coche) o un tipo de la subclase
	 * (Renault).
	 * 
	 * Si la superclase devuelve un tipo de ella misma (Coche), entonces su subclase
	 * (Renault) deberia devolver un tipo de la superclase (Coche) o un tipo de la
	 * subclase (Renault).
	 * 
	 * Ahora al metodo no le importa el tipo de la clase, simplemente llama al
	 * metodo numAsientos() de la superclase. Solo sabe que el parametro es de tipo
	 * coche, ya sea Coche o alguna de las subclases.
	 * 
	 * el metodo imprimirNumAsientos() no necesita saber con que tipo de coche va a
	 * realizar su logica, simplemente llama al metodo numAsientos() del tipo Coche,
	 * ya que por contrato, una subclase de Coche debe implementar dicho metodo.
	 * 
	 * @param arrayCoches
	 */
	public static void imprimirNumAsientos(Coche[] arrayCoches) {
		for (Coche coche : arrayCoches) {
			System.out.println(coche.numAsientos());
		}
	}

}
