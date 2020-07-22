package mx.utel.poo.objetos;

public class SmartPhone {
	
	private Procesador cpu;
	private int memoria;
	private String modelo, color, marca;
	
	public SmartPhone() {		
		this.memoria = 128;
		this.modelo = "P30";
		this.color = "Plata";
		this.marca = "Huawei";
	}	
	
	public SmartPhone(int memoria, String modelo, String color, String marca) {		
		this.memoria = memoria;
		this.modelo = modelo;
		this.color = color;
		this.marca = marca;
	}
	
	public void instalarProcesador(Procesador cpu) {
		this.cpu = cpu;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return String.format("SmartPhone: %s %s con %d GB, %s\n", marca, modelo, memoria, cpu);
	}
	
	
}
