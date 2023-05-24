package n1ejercicio1;


// clase hija Percusion
class Percusion extends Instrumento{
	
	//bloque de inicializacion de la clase Percusion
	{
		tocar();
	}
	
	//constructor
	Percusion(String nombre, int precio) {
		super(nombre, precio);
		
	}

	@Override
	void tocar() {
	System.out.println("Se está tocando un instrumento de percusión\n");
		
	}
}
