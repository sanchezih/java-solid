package _04_interface_segregation_principle.nok.src;

/**
 * Principio de segregaci�n de interfaz: Este principio establece que los
 * clientes no deberian verse forzados a depender de interfaces que no usan.
 * 
 * cuando un cliente depende de una clase que implementa una interfaz cuya
 * funcionalidad este cliente no usa, pero que otros clientes s� usan, este
 * cliente estar� siendo afectado por los cambios que fuercen otros clientes en
 * dicha interfaz.
 * 
 * Los pinguinos son aves, pero ademas tienen la habilidad de nadar. El problema
 * es que el loro no nada, y el pinguino no vuela, por lo que tendriamos que
 * a�adir una excepci�n o aviso si se intenta llamar a estos m�todos. Adem�s, si
 * quisi�ramos a�adir otro m�todo a la interfaz IAve, tendr�amos que recorrer
 * cada una de las clases que la implementa e ir a�adiendo la implementaci�n de
 * dicho m�todo en todas ellas. Esto viola el principio de segregaci�n de
 * interfaz, ya que estas clases (los clientes) no tienen por qu� depender de
 * m�todos que no usan.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
