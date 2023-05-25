package n3ejercicio1;

import java.util.ArrayList;

public abstract class Noticia {//clase madre
	
	//Atributos 
	protected String titular;
	protected String texto;
	protected int puntuacion;
	protected int precio;
	protected ArrayList<Redactor>redactores;
	
	//Constructor
	public Noticia(String titular, int puntuacion, int precio) {
		this.titular = titular;
		this.texto = "";
		this.puntuacion = puntuacion;
		this.precio = precio;
		redactores = new ArrayList<Redactor>();
		
	}
	
	//Getters and Setters
	public String getTitular() {
		return titular;
	}

	public String getTexto() {
		return texto;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public int getPrecio() {
		return precio;
	}
	
	//Metodos abstractos
	abstract protected int calcularPrecioNoticia();
	
	abstract protected int calcularPuntuacion();
	
}
