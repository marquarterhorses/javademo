package mx.utel.poo.objetos;

public class Procesador {
	
	private float velocidad;
	private int nucleos;
	private String modelo, marca;
	
	public Procesador() {
//		this.velocidad = 2.4298f;
//		this.nucleos = 8;
//		this.marca = "SnapDragon";
//		this.modelo = "855+";
		this(2.4298f, 8, "855+", "SnapDragon");
	}

	public Procesador(float velocidad, int nucleos, String modelo, String marca) {
		this.velocidad = velocidad;
		this.nucleos = nucleos;
		this.modelo = modelo;
		this.marca = marca;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		if(velocidad > 0) {
			this.velocidad = velocidad;
		}
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return String.format("CPU: %s (%s), corriendo a %.2f Ghz, con %d núcleos", marca, modelo, velocidad, nucleos);
	}
	

}
