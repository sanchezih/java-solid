package _04_isp.nok.src;

/**
 * Principio de segregación de interfaz: Este principio establece que los
 * clientes no deberian verse forzados a depender de interfaces que no usan.
 * 
 * cuando un cliente depende de una clase que implementa una interfaz cuya
 * funcionalidad este cliente no usa, pero que otros clientes sí usan, este
 * cliente estará siendo afectado por los cambios que fuercen otros clientes en
 * dicha interfaz.
 * 
 * Los pinguinos son aves, pero ademas tienen la habilidad de nadar. El problema
 * es que el loro no nada, y el pinguino no vuela, por lo que tendriamos que
 * añadir una excepción o aviso si se intenta llamar a estos métodos. Además, si
 * quisiéramos añadir otro método a la interfaz IAve, tendríamos que recorrer
 * cada una de las clases que la implementa e ir añadiendo la implementación de
 * dicho método en todas ellas. Esto viola el principio de segregación de
 * interfaz, ya que estas clases (los clientes) no tienen por qué depender de
 * métodos que no usan.
 * 
 * @author ihsanch
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
