package n1ejercicio1;

//Clase madre
abstract class Instrumento{
	
	//atributos de la clase madre
	protected String nombre;
	protected int precio;
	
	//constructor
	Instrumento(String nombre, int precio){
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	//determina que tipo de instrumento se está tocando
	abstract void tocar();
	
	}




