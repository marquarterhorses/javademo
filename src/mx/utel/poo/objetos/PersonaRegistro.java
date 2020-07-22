package mx.utel.poo.objetos;

// EXCLUSIVO DEL JDK 14 EN ADELANTE!!!!
public record PersonaRegistro(String nombre, String apellidos) {
	
	@Override
	public String toString() {
		return String.format("Registro Persona: %s %s",  nombre, apellidos);
	}
	
}
