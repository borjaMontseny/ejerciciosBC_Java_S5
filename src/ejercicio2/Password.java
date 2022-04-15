package ejercicio2;

public class Password {

	private int longitud;
	private String contraseña;

	// Constructores
	public Password() {

		this.longitud = 8; // La longitud por defecto usando este constructor será 8
		this.contraseña = "";

	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = "";
		for (int i = 0; i < longitud; i++) {
			this.contraseña += String.valueOf((int) (Math.random()*10));
		}
		
	}
	
	// Método getter
	public String getContraseña() {
		return contraseña;
	}
	
}
