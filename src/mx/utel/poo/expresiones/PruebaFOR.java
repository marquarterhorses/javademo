package mx.utel.poo.expresiones;

public class PruebaFOR {

	public static void main(String[] args) {
		PruebaFOR prog = new PruebaFOR();
		prog.imprimeDatos(5);
	}
	
	private void imprimeDatos(int limite) {
		for (int i = 0; i < limite; i++) {
			System.out.printf("%d) Hola gran familia UTEL!!!\n", i);
		}
	}
	

}
