package n3ejercicio1;

public class notF1 extends Noticia{
	
	//atributos
	private String escuderia;

	//constructor
	public notF1(String titular, int puntuacion, int precio, String escuderia) {
		super(titular, puntuacion, precio);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	@Override
	public int calcularPrecioNoticia() {
		
		int precioPorEscuderia;
		
		if(escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedez")) {
			precioPorEscuderia = 100;
			
		}else {
			precioPorEscuderia = 50;
		}
		
		return super.precio + precioPorEscuderia;
	}

	@Override
	public int calcularPuntuacion() {
	
		int puntajePorEscuderia = 0;
		
		if(escuderia.equalsIgnoreCase("Merrari") || escuderia.equalsIgnoreCase("Mercedez")) {
			puntajePorEscuderia = 2;
			
		}
		
		return super.puntuacion + puntajePorEscuderia;
	}
	
	@Override
	public String toString() {
		
		return "Noticias de Basquet:\n\n" +
		"\tEscuderia en competición: " + escuderia + "\n";
	
	}
}
