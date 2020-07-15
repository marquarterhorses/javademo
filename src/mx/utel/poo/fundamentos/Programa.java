package mx.utel.poo.fundamentos;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Operaciones oper = new Operaciones();
//		Scanner scn = new Scanner(System.in);
//		System.out.print("Escribe el primer valor: ");
//		int val1 = scn.nextInt();
//		System.out.print("Escribe el segundo valor: ");
//		int val2 = scn.nextInt();
//		
//		int resultado = oper.suma(val1, val2);
//		
//		System.out.printf("El resultado de la suma es: %d \n", resultado);
//		
//		float res2 = oper.divide(val1, val2);
//		System.out.printf("El resultado de la división es: %.2f \n", res2);
		
		boolean b1 = oper.esFalso() & oper.esVerdadero();
		
		System.out.println(b1);
		
	}
}
