package _01_single_responsibility_principle.ok.src;

class Coche {
	String marca;

	Coche(String marca) {
		this.marca = marca;
	}

	String getMarcaCoche() {
		return marca;
	}
}