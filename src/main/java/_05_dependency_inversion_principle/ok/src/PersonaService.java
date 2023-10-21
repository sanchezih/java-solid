package _05_dependency_inversion_principle.ok.src;

public class PersonaService {

	private IPersistence persistence;

	public PersonaService(IPersistence persistence) {
		this.persistence = persistence;
	}

	public void savePerson(Persona person) {
		persistence.save(person);
	}

}