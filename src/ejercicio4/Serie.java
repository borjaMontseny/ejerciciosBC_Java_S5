package ejercicio4;

public class Serie {

	// Atributos
	private String titulo;
	private int numeroTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	// Constructores
	public Serie() {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
}
