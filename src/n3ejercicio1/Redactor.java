package n3ejercicio1;

import java.util.ArrayList;

public class Redactor {
	
	//Atributos
	private String nombre;
	private String dni;
	private int sueldo;
	private ArrayList<Noticia> noticias;
	
	//constructor
	public Redactor(String nombre, String dni, int sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = 1500;
		noticias = new ArrayList<Noticia>();
		
	}

	//Metodos publicos
	public String getNombre() {
		return nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getDni() {
		return dni;
	}

	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}

	@Override
	public String toString() {
		return "Redactor " + nombre + 
				"\n" + noticias;
	}

}
