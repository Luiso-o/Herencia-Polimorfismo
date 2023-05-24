package n3ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MetodosMenu {

	//Introducir
	static void IntroducirRedactor(ArrayList<Redactor>misRedactores) {
		
		//Redactor(String nombre, String dni, int sueldo)
		
		String nombre = JOptionPane.showInputDialog("Introduce el nombre del redactor:");
		String dni = JOptionPane.showInputDialog("Introduce su DNI");
		String sueldo =JOptionPane.showInputDialog("Introduce su salario");
		int sueldoEntero = Integer.parseInt(sueldo); 
		
		misRedactores.add(new Redactor(nombre, dni, sueldoEntero));
		
		JOptionPane.showMessageDialog(null, nombre + " con dni " + dni + "\nha sido introducido a la base de datos :)");
		
	}
	
	static void IntroducirNoticiaAUnRedactor(ArrayList<Redactor>misRedactores, ArrayList<Noticia>misNoticias) {
		
		String titularNoticia = JOptionPane.showInputDialog("Introduce el tituar de la noticia");
		int indiceNoticia = encuentraIndiceNoticia(titularNoticia,misNoticias);
		
			if(indiceNoticia == -1) {
				JOptionPane.showMessageDialog(null, "El titular de la noticia no fue encontrado.");
			}else {
				
				String dniRedactor = JOptionPane.showInputDialog("Introduce el dni del redactor");
				int indiceRedactor = encuentraIndiceRedactor(dniRedactor,misRedactores);
				
					if(indiceRedactor == -1) {
						JOptionPane.showMessageDialog(null, "El dni del redactor no fue encontrado.");
						
					}else {
						
						misRedactores.get(indiceRedactor).getNoticias().add(misNoticias.get(indiceNoticia));
						JOptionPane.showMessageDialog(null, "Se ha agregado la noticia al redactor " + misRedactores.get(indiceRedactor).getNombre());
					}
			}
		
	}

	//Eliminar
	static void eliminarRedactor(ArrayList<Redactor>misRedactores) {
		
		String dni = JOptionPane.showInputDialog("Introduce el dni del Redactor");
		
		int indice = encuentraIndiceRedactor(dni, misRedactores);
		
		if(indice == -1) {
			JOptionPane.showMessageDialog(null, "No existe ningun redactor con este DNI!!");
			
		}else {
			JOptionPane.showMessageDialog(null, misRedactores.get(indice).getNombre() + " Ha sido eliminado"
					+ " correctamente :)." );
			misRedactores.remove(indice);
		}
			
	}
	
	static void eliminarNoticia(ArrayList<Redactor>misRedactores,ArrayList<Noticia>misNoticias) {
		
		String dniRedactor = JOptionPane.showInputDialog("Introduce el dni del redactor");
		int indiceRedactor = encuentraIndiceRedactor(dniRedactor,misRedactores);
		
			if(indiceRedactor == -1) {
				JOptionPane.showMessageDialog(null, "El dni del redactor no fue encontrado.");
				
			}else {
				
				String titularNoticia = JOptionPane.showInputDialog("Introduce el tituar de la noticia");
				int indiceNoticia = encuentraIndiceNoticia(titularNoticia, misNoticias);
				
					if(indiceNoticia == -1) {
						JOptionPane.showMessageDialog(null, "El titular de la noticia no fue encontrado.");
						
					}else {
						
						misRedactores.get(indiceRedactor).getNoticias().remove(indiceNoticia);
						
						JOptionPane.showMessageDialog(null, "Se ha eliminado la noticia " + titularNoticia 
						+" al redactor " + misRedactores.get(indiceRedactor).getNombre());
					}
			}
	}
	
	//Buscar
	static int encuentraIndiceRedactor(String dni, ArrayList<Redactor>misRedactores) {
		
		int indice = -1;
		int contador = 0;
		
		while(contador < misRedactores.size() && indice == -1) {
			
			if(misRedactores.get(contador).getDni().equalsIgnoreCase(dni)) {
				
				indice = contador;
				
			}
			
			contador++;
		}
		
		return indice;
		
	}
	
	static int encuentraIndiceNoticia(String titular, ArrayList<Noticia> misNoticias) {
	    int indice = -1;
	    int contador = 0;
	    
	    while (contador < misNoticias.size() && indice == -1) {
	        if (misNoticias.get(contador).getTitular().equalsIgnoreCase(titular)) {
	            indice = contador;
	        }
	        
	        contador++;
	    }
	    
	    return indice;
	}
	
	//mostrar
	static void mostrarNoticiasPorRedactor(ArrayList<Redactor>misRedactores) {
		
		for (int i = 0; i < misRedactores.size(); i++) {
			
			System.out.println(misRedactores.get(i));
		}
		
	}
	
	static void mostrarPuntuacionDeLaNoticia(ArrayList<Noticia>misNoticias) {
		
	for (int i = 0; i < misNoticias.size(); i++) {
			
			System.out.println("Puntuacion de la noticia con titular: "+ misNoticias.get(i).getTitular() + ": " + misNoticias.get(i).calcularPuntuacion() + " puntos.\n");
		}	
		
	}
	
	static void mostrarPrecioNoticia(ArrayList<Noticia>misNoticias) {
		
	for (int i = 0; i < misNoticias.size(); i++) {
				
		System.out.println("Precio de la noticia con titular: "+ misNoticias.get(i).getTitular() + ": " + misNoticias.get(i).calcularPrecioNoticia() + " euros.\n");
		}	
	}
}
