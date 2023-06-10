package n3ejercicio1;

public class notFutbol extends Noticia{
		
	//Atributos clase notFutbol heredando atributos de noticias	
	private String competicion;
	private String club;
	private String jugador;
	
	//constructor
	public notFutbol(String titular, int puntuacion, int precio, String competicion, String club, String jugador) {
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
	public int calcularPrecioNoticia() {
		
		int precioPorLiga;
		int precioPorEquipo;
		int precioPorDeportista;
		
		if(competicion.equalsIgnoreCase("Liga De Campeones")) {
			precioPorLiga = 100;
		}else {
			precioPorLiga = 50;
		}
		
		if(club.equalsIgnoreCase("Barsa") || club.equalsIgnoreCase("Madrid")){
			precioPorEquipo = 100;
		}else {
			precioPorEquipo = 50;
		}
		
		if(jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			precioPorDeportista = 50;
		}else {
			precioPorDeportista = 25;
		}
		
		return super.precio + precioPorLiga + precioPorEquipo + precioPorDeportista;
	}

	@Override
	public int calcularPuntuacion() {
		
		int puntosPorLiga = 0;
		int puntosPorEquipo = 0;
		int puntosPorJugador = 0;
		
		if(competicion.equalsIgnoreCase("Liga De Campeones")) {
			 puntosPorLiga = 3;
		
		}else if(competicion.equalsIgnoreCase("Liga")) {
			puntosPorLiga = 2;
		}
		
		if(club.equalsIgnoreCase("Barsa") || club.equalsIgnoreCase("Madrid")){
			puntosPorEquipo = 1;
		}
		
		if(jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
			puntosPorJugador = 1;
		}
		
		return super.puntuacion + puntosPorLiga + puntosPorEquipo + puntosPorJugador;
	}

	@Override
	public String toString() {
		
		return "Noticias de Futbol:\n\n" +
		"\tCompeticion: "+ competicion + "\n" +
		"\tClub: " + club + "\n" +
		"\tJugador del que se habla: " + jugador + "\n";
	
	}

}
