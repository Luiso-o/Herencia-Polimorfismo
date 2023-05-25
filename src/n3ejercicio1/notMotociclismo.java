package n3ejercicio1;

public class notMotociclismo extends Noticia{
	
	//Atributos
	private String equipo;

	public notMotociclismo(String titular, int puntuacion, int precio, String equipo) {
		super(titular, puntuacion, precio);
		this.equipo = equipo;
	}

	public String getequipo() {
		return equipo;
	}

	@Override
	protected int calcularPrecioNoticia() {
		
		int precioPorEscuderia;
		
		if(equipo.equalsIgnoreCase("honda") || equipo.equalsIgnoreCase("yamaha")) {
			precioPorEscuderia = 50;
			
		}else {
			precioPorEscuderia = 25;
		}
		
		return super.precio + precioPorEscuderia;
	}

	@Override
	protected int calcularPuntuacion() {
		
		int puntajePorEscuderia = 0;
		
		if(equipo.equalsIgnoreCase("honda") || equipo.equalsIgnoreCase("yamaha")) {
			puntajePorEscuderia = 3;
			
		}
		
		return super.puntuacion + puntajePorEscuderia;
	}
	
	@Override
	public String toString() {
		
		return "Noticias de Basquet:\n\n" +
		"\tEquipo en competición: " + equipo + "\n";
		
	}
		
}
