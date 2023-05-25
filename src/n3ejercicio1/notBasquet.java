package n3ejercicio1;

public class notBasquet extends Noticia{
	
	//Atributos clase notBasquet
	private String competicion;
	private String club;
	private String jugador;
	
	//constructor
	public notBasquet(String titular, int puntuacion, int precio, String competicion, String club, String jugador) {
		super(titular, puntuacion, precio);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;
	}

	//Metodos
	public String getCompeticion() {
		return competicion;
	}

	public String getClub() {
		return club;
	}

	public String getJugador() {
		return jugador;
	}

	@Override
	protected int calcularPrecioNoticia() {
		
		int precioPorLiga;
		int precioPorEquipo;
		
		if(competicion.trim().equalsIgnoreCase("euroliga")) {
			precioPorLiga = 100;
		}else {
			precioPorLiga = 50;
		}
		
		if(club.equalsIgnoreCase("Barsa") || club.equalsIgnoreCase("Madrid")){
			precioPorEquipo = 100;
		}else {
			precioPorEquipo = 50;
		}
		
		return super.precio + precioPorLiga + precioPorEquipo;
	}

	@Override
	protected int calcularPuntuacion() {
	
		int puntosPorLiga = 0;
		int puntosPorEquipo = 0;
		
	if(competicion.trim().equalsIgnoreCase("Euroliga")) {
		puntosPorLiga = 3;
		
	}else if(competicion.equalsIgnoreCase("ACB")) {
		puntosPorLiga = 2;
	}
	
	if(club.equalsIgnoreCase("Barsa") || club.equalsIgnoreCase("Madrid")){
		puntosPorEquipo = 1;
	}
		
		return super.puntuacion + puntosPorLiga + puntosPorEquipo;
	}

	@Override
	public String toString() {
		
		return "Noticias de Basquet:\n\n" +	
		"\tCompeticion: "+ competicion + "\n" +
		"\tClub: " + club + "\n" +
		"\tJugador del que se habla: " + jugador + "\n";
	}

}
