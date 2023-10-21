package _05_dependency_inversion_principle.ok.src;

public class MySql implements IPersistence {

	public void save(Object object) {
		System.out.println("Guardando en MySQL...");
	}
}