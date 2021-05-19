package Ejercicio_Herencia2;

public class Satelites extends Astros  {
	
	//Artributos clase Stelites
	
	private double distancia_planeta;
	
	private double orbita_planetaria;
	
	private String nombre_planeta;
	
	//Constructores
	
	public Satelites () {
		super();
	}
	
	public Satelites(String nombre, double radio_ecuatorial, int rotacion_eje, int masa, double temp_media, double gravedad, double distancia_planeta, double orbita_planetaria, String nombre_planeta) {
		super(nombre, radio_ecuatorial, rotacion_eje, masa, temp_media, gravedad);
		
		this.distancia_planeta=distancia_planeta;
		
		this.orbita_planetaria=orbita_planetaria;
		
		this.nombre_planeta=nombre_planeta;
	}

	//Getters y setters
	
	public double getDistancia_planeta() {
		return distancia_planeta;
	}

	public double getOrbita_planetaria() {
		return orbita_planetaria;
	}

	public String getNombre_planeta() {
		return nombre_planeta;
	}

	public void setDistancia_planeta(double distancia_planeta) {
		this.distancia_planeta = distancia_planeta;
	}

	public void setOrbita_planetaria(double orbita_planetaria) {
		this.orbita_planetaria = orbita_planetaria;
	}

	public void setNombre_planeta(String nombre_planeta) {
		this.nombre_planeta = nombre_planeta;
	}

	//To String
	@Override
	public String toString() {
		return "Satelites [distancia_planeta=" + distancia_planeta + ", orbita_planetaria=" + orbita_planetaria
				+ ", nombre_planeta=" + nombre_planeta + ", nombre=" + nombre + ", radio_ecuatorial=" + radio_ecuatorial
				+ ", rotacion_eje=" + rotacion_eje + ", masa=" + masa + ", temp_media=" + temp_media + ", gravedad="
				+ gravedad + "]";
	}

	
	
	
	
}
