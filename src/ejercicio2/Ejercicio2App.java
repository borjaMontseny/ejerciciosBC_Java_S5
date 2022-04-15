package ejercicio2;

import java.util.Scanner;

public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Introduce la longitud de la contraseña generada: "); // Pediremos la longitud por teclado
		Scanner sc = new Scanner(System.in);
		int longitudDeseada = sc.nextInt();
		
		Password contrasena1 = new Password(longitudDeseada);
		
		System.out.println(contrasena1.getContraseña());
	}

}
