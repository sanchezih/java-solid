package _05_depInv.ok.src;

public class Oracle implements IPersistence {

	public void save(Object object) {
		System.out.println("Guardando en Oracle...");
	}

}
