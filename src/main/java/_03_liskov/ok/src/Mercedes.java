package _03_liskov.ok.src;

public class Mercedes extends Coche {

	@Override
	int numAsientos() {
		System.out.println("Imprimiendo el numero de asientos de un " + this.getClass().getSimpleName());
		return 4;
	}
}