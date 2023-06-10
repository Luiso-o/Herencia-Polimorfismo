package n3ejercicio1;

public class notTenis extends Noticia{
	
	//atributos clase notTenis
	private String competicion;
	private String tenistas;
	
	//Constructor
	public notTenis(String titular, int puntuacion, int precio, String competicion, String tenistas) {
		super(titular, puntuacion, precio);
		this.competicion = competicion;
		this.tenistas = tenistas;
	}

	public String getCompeticion() {
		return competicion;
	}

	public String getTenistas() {
		return tenistas;
	}

	@Override
	protected int calcularPrecioNoticia() {

		int precioPorDeportista;
		
		if(tenistas.equalsIgnoreCase("Federer") || tenistas.equalsIgnoreCase("Nadal")
				|| tenistas.equalsIgnoreCase("Djokovic")) {
			
			precioPorDeportista = 100;
			
		}else {
			precioPorDeportista = 50;
		}

		return super.precio + precioPorDeportista;
	}

	@Override
	public int calcularPuntuacion() {
	
		int puntosPorDeportista = 0;
		
		if(tenistas.equalsIgnoreCase("Federer") || tenistas.equalsIgnoreCase("Nadal")
				|| tenistas.equalsIgnoreCase("Djokovic")) {
			
			puntosPorDeportista = 3;
			
		}
		
		
		return super.puntuacion + puntosPorDeportista;
	}

	@Override
	public String toString() {
		
		return "Noticias de Basquet:\n\n" +
		"\tCompeticion: "+ competicion + "\n" +
		"\tJugador del que se habla: " + tenistas + "\n";
		
	}
	
	
}
