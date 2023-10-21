package _05_dependency_inversion_principle.nok.src;

public class PersonaService {

	/**
	 * Problema: Instanciar la clase MySql genera un fuerte acoplamiento, lo que
	 * implica tener que rehacer el codigo al momento de cambiar el motor de BBDD.
	 * Tambien evita la reutilizacion.
	 * 
	 * @param persona
	 */
	public void guardarPersona(Persona persona) {
		MySql mysql = new MySql();
		mysql.savePersona(persona);
	}

}