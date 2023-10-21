package _05_dependency_inversion_principle.nok.src;

public class Main {

	public static void main(String[] args) {
		PersonaService personaService= new PersonaService();
		personaService.guardarPersona(new Persona("Maria"));

	}

}
