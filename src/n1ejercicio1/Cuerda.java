package n1ejercicio1;

//clase hija Cuerda
	class Cuerda extends Instrumento{
		
		//bloque de inicializacion de la clase Cuerda
		{
			tocar();
		}
		
		//constructor
		Cuerda(String nombre, int precio) {
			super(nombre, precio);
		}
	
		@Override
		protected void tocar() {
		System.out.println("Se está tocando un instrumento de cuerda\n");
			
		}
		
	}