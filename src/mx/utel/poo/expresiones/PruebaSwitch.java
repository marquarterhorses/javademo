package mx.utel.poo.expresiones;

public class PruebaSwitch {
	
	public static void main(String[] args) {
		PruebaSwitch prog = new PruebaSwitch();
		prog.seleccionaModelo(3);
		prog.seleccionaTalla(Talla.GRANDE);
		String resultado = prog.expresionSwitch(4);
		System.out.printf("El modelo es %s \n", resultado);
	}
	
	/**
	 * Utilizamos las nuevas expresiones switch introducidas en el JDK 12
	 * @param mod El modelo
	 * @return La cadena que representa el modelo.
	 */
	private String expresionSwitch(int mod) {
		String cadena = switch(mod) {
			case 1 -> "2011";
			case 2 -> "2012";
			case 3 -> "2013";
			case 4 -> "2014";
			default -> "Indefinido";
		};
		return cadena;
	}
	
	private void seleccionaModelo(int mod) {
		// La expresión del switch pueden ser del tipo: int, byte, short, enumeración, String, char
		switch (mod) {
			case 2:
				System.out.println("Es el modelo 2012");
				break;
			case 3:
				System.out.println("Es el modelo 2013");
				break;
			case 4:
				System.out.println("Es el modelo 2014");
				break;
			default:
				System.out.println("No se identifica el modelo");
				break;
		}
	}
	
	/**
	 * Utilizamos el switch con enumeraciones que fueron introducidas en el JDK 5
	 * @param t1 La {@code Talla} seleccionada
	 */
	private void seleccionaTalla(Talla t1) {
		switch (t1) {
			case CHICA:
				System.out.println("Seleccionaste la talla chica");
				break;
			case MEDIANA:
				System.out.println("Seleccionaste la talla mediana");
				break;
			case GRANDE:
				System.out.println("Seleccionaste la talla grande");
				break;
			case EXTRA_GRANDE:
				System.out.println("Seleccionaste la talla extra grande");
				break;
		}
	}
	
	
	
	
}
