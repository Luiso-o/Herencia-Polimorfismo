package n2ejercicio1;

public class Principal {

	public static void main(String[] args) {
	
	//creo un objeto Smartphone
	Smartphone miMovil = new Smartphone("Samsung","Galaxi 8");
	
	//llamo el metodo de la interfaz Reloj
	miMovil.alarma();
	
	//llamo el metodo de la interfaz Camara
	miMovil.fotografiar();
	
	//Realizo una llamada
	miMovil.llamar("123456789");
		

	}

}
