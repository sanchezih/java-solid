package _05_dependency_inversion_principle.ok.src;

public class SQLServer implements IPersistence {

	public void save(Object object) {
		System.out.println("Guardando en SQL Server...");
	}

}
