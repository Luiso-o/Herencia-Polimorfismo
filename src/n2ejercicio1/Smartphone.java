package n2ejercicio1;

public class Smartphone extends Telefono implements Reloj, Camara{

	//constructor
	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}

	@Override
	public void alarma() {
		System.out.println("Está sonando la alarma!!! clin clon clin clon XoX");
		
	}

	@Override
	public void fotografiar() {
		System.out.println("Se está tomando una foto");
		
	}

}
