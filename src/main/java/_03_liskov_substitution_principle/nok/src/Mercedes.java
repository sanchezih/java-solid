package _03_liskov_substitution_principle.nok.src;

public class Mercedes extends Coche {

	@Override
	int precioMedioCoche() {
		return 27000;
	}
}