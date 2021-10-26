package _05_depInv.ok.src;

public class ServicePerson {
	
	
	private IPersistence persistence;
	
	public ServicePerson(IPersistence persistence) {
		this.persistence = persistence;
	}

	public void savePerson(Persona person) {
		persistence.save(person);
	}

}