package _05_depInv.ok.src;

public class SQLServer implements IPersistence {

	public void save(Object object) {
		System.out.println("Guardando en SQL Server...");
	}

}
