package _05_depInv.ok.src;

public class MySql implements IPersistence {

	public void save(Object object) {
		System.out.println("Guardando persona en MySQL...");
	}
}