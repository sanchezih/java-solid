package _05_depInv.ok.src;

public class Main {

	/**
	 * Como aplicamos correctamente el Principio de Inversion de dependencias?
	 * 
	 * 1. Creamos una Interfaz IPersitence para abstraer la clase Mysql.
	 * 
	 * 2. Modificamos la Clase Mysql para que implemente dicha Interface.
	 * 
	 * 3. Y modificamos la clase ServicePerson para evitar que se cree una instancia
	 * de la clase Mysql y así evitar el fuerte acoplamiento de las clases.
	 * 
	 * 4. En este ejemplo podemos observar que el constructor de la clase
	 * ServicePerson recibe una Instancia de una clase de tipo IPersitence. De este
	 * modo ServicePerson puede recibir la clase Mysql y realizar el guardado de la
	 * información como ya lo definimos y si en un futuro se requiere crear otra
	 * manera de persistir la información solo debemos crear una nueva clase que
	 * implemente IPersistence y enviarla en el constructor reemplazando la clase
	 * Mysql.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		PersonaService personaService = new PersonaService(new MySql());
		personaService.savePerson(new Persona("Lucas"));

	}

}
