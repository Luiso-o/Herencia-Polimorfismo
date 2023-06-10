package n1ejercicio1;

//clase hija Viento
class Viento extends Instrumento{

	//bloque de inicializacion de la clase Viento
	{
		tocar();
	}
	
	//constructor
	Viento(String nombre, int precio) {
		super(nombre, precio);
	
	}

	@Override
	public void tocar() {
	System.out.println("Se está tocando un instrumento de viento\n");
		
	}
	
}
	
	
	
