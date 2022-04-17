package ejercicio3;

public class Electrodomestico {

	// Atributos
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;

	// Constantes
	private final double PRECIODEFECTO = 100.0;
	private final String COLORDEFECTO = "BLANCO";
	private final char CONSUMODEFECTO = 'F';
	private final double PESODEFECTO = 5.0;

	// Constructores
	public Electrodomestico() {
		this.precioBase = PRECIODEFECTO;
		this.color = COLORDEFECTO;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.color = COLORDEFECTO;
		this.consumoEnergetico = CONSUMODEFECTO;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, char consumo, double peso) {
		this.precioBase = precio;
		this.color = color.toUpperCase();
		this.consumoEnergetico = consumo;
		this.peso = peso;
	}
}
