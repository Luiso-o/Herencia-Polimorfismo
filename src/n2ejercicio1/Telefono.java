package n2ejercicio1;

public class Telefono {
	
	//atributos de la clase Telefono
	protected String marca;
	protected String modelo;
	
	//Constructor
	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//metodos publicos
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	//metodo que recibe una llamada
	public void llamar(String numero) {
		System.out.println("Se está llamando al teléfono " + numero);
	}
	

	
}
