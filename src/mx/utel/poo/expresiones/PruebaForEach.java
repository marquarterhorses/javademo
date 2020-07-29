package mx.utel.poo.expresiones;

public class PruebaForEach {

	public static void main(String[] args) {
		System.out.println("#### CICLO FOR-EACH OCUPANDO ARREGLOS");
		String[] arreglo = {"Benito Bodoque", "Don Gato", "Espanto", "Cucho", "Demóstenes", "Panza"};
		PruebaForEach prog = new PruebaForEach();
		prog.imprimeDatos(arreglo);
		
		// TODO: Implementar ciclo FOR-EACH con listas!!!
		
		
	}
	
	/**
	 * Ocupamos el ciclo for-each introducido en el JDK 5
	 * @param cadenas Arreglo de cadenas
	 */
	private void imprimeDatos(String[] cadenas) {
		for (String nombre : cadenas) {
			System.out.printf("Nombre: %s \n", nombre);
			// System.out.println("Nombre: " + nombre);
		}
	}

}
