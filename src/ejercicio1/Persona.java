package ejercicio1;

public class Persona {

	// Las constantes
	private final char HOMBRE = 'H';
	private final char MUJER = 'M';

	// Los objetos tendrán estos atributos llenos así por defecto
	private String nombre;
	private int edad;
	private String codigoDNI;
	private char sexo;
	private double peso;
	private double altura;

	// Aquí definimos Los constructores
	public Persona() { // El constructor por defecto (sin parámetros) creará el objeto con estos
						// valores

		this.nombre = "";
		this.edad = 0;
		this.sexo = HOMBRE;
		this.peso = 0;
		this.altura = 0;

	}

	public Persona(String nombre, int edad, char sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;

	}

	public Persona(String nombre, int edad, String codigoDNI, char sexo, double peso, double altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.codigoDNI = codigoDNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;

	}

}
