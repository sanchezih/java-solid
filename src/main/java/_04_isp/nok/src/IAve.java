package _04_isp.nok.src;

public interface IAve {
	void volar(); // ERROR: Este metodo no lo deberia implementar un pinguino

	void comer();

	void nadar(); // ERROR: Este metodo solo lo deberia implementar un pinguino
}