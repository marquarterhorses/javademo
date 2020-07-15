package mx.utel.poo.fundamentos;

public class Operaciones {
	
	public int suma(int x, int y) {
		return x+y;
	}
	
	public int resta(int x, int y) {
		return x-y;
	}
	
	public int multiplica(int x, int y) {
		return x*y;
	}
	
	public float divide(float x, float y) {
		return x/y;
	}
	
	public int residuo(int x, int y) {
		return x%y;
	}
	
	public boolean esFalso() {
		System.out.println("Este método regresa falso");
		return false;
	}
	
	public boolean esVerdadero() {
		System.out.println("Este método regresa verdadero");
		return true;
	}
		
}
