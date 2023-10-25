package Practica5;
import java.util.Scanner;

public class Controladora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejecutor e = new Ejecutor("calc", 1);
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe un comando para ejecutar");			
		e.comando = leer.next();
		if (e.necesitaEjecucion()) {
			e.ejecutarTarea();
		}
	}
}
