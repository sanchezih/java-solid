package _05_depInv.nok.src;

public class PersonaService {

	public void guardarPersona(Persona persona) {
		MySql mysql = new MySql();
		mysql.savePersona(persona);
	}

}