package mx.utel.poo.expresiones;

import java.util.Scanner;

public class PruebaIF {
	
	public static void main(String[] args) {
		PruebaIF prog = new PruebaIF();
		Scanner scn = new Scanner(System.in);
		System.out.print("Escribe tu edad: ");
		int edad = scn.nextInt();
//		prog.condicionalSimple(edad);
//		prog.condicionalAnidado(edad);
		String mensaje = prog.operadorTernario(edad);
		System.out.println(mensaje);
	}
	
	private void condicionalSimple(int edad) {
		if(edad < 18) {
			System.out.printf("Eres menor de edad, porque tienes %d años \n", edad);
		} else {
			System.out.println("Eres mayor de edad");
		}
	}
	
	private void condicionalAnidado(int edad) {
		if(edad < 18) {
			if(edad < 12) System.out.println("Eres un niño(a)");
			else System.out.printf("Eres menor de edad, porque eres un adolscente de %d años \n", edad);
		} else {
			System.out.println("Eres mayor de edad");
		}
	}
	
	private String operadorTernario(int edad) {
		return edad < 18 ? "Eres menor de edad" : "Eres mayor de edad";
	}
	
	
}
