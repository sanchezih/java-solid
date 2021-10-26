package _05_depInv.ok.src;

public class Main {

	public static void main(String[] args) {

		ServicePerson servicePerson = new ServicePerson(new MySql());
		servicePerson.savePerson(new Persona("Lucas"));

	}

}
