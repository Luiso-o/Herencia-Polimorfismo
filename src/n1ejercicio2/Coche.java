package n1ejercicio2;

public class Coche {
	
	//creamos los atributos
	static final String marca = "Audi";
	static String modelo;//este atrubuto se puede inicializar en el constructor
	final String potencia = "400 caballos de potencia";
	
	//constructor
	public Coche(String modelo) {
		this.modelo = modelo;
	}

	//Metodos publicos
	public static String getModelo() {
		return modelo;
	}

	public static String getMarca() {
		return marca;
	}

	public String getPotencia() {
		return potencia;
	}
	
	//metodo que hace acelerar el coche
	public void acelerar() {
		System.out.println("El coche está acelerando");
	}
	
	//metodo estatico que hace frenar el coche
	public static void frenar() {
		System.out.println("El coche está frenando");
	}
	
	//metodo main
	public static void main(String[] args) {
		
		//instanciamos un objeto de la clase coche y llamamos a uno de sus metodos publicos
		new Coche("A4").acelerar();
			
		//lamamos un metodo estatico de la clase Coche
		Coche.frenar();

	}
	
	//Salida en consola
	//El coche está acelerando
	//El coche está frenando
		
}
