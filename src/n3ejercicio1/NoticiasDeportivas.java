package n3ejercicio1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NoticiasDeportivas {

	public static void main(String[] args) {
		
		//almacenamiento local 
		ArrayList<Noticia> misNoticias = new ArrayList<>();
		ArrayList<Redactor> misRedactores = new ArrayList<>();
		
		//Redactores de prueba
		Redactor redactor1 = new Redactor("Mario", "12345678G", 1300);
		Redactor redactor2 = new Redactor("Daniela", "98765432J", 1300);
		misRedactores.add(redactor1);
		misRedactores.add(redactor2);
		
		//noticias de prueba
		notFutbol noticia1 = new notFutbol("Gol de Ferran Torres", 5, 300, "Liga de Campeones", "Madrid", "Ferran Torres");	
		notBasquet noticia2 = new notBasquet("Juega Final", 4, 250, "Euroliga", "Barsa","Pedro Bazques");
		notTenis noticia3 = new notTenis("Final Tenis", 4, 150, "Torneo de Roland Garros", "Federer");	
		notF1 noticia4 = new notF1("Carrera Montmelo", 4, 100, "Ferrari");
		notMotociclismo noticia5 = new notMotociclismo("MotoGp final", 3, 100, "Yamaha");
		
		misNoticias.add(noticia1);
		misNoticias.add(noticia2);
		misNoticias.add(noticia3);
		misNoticias.add(noticia4);
		misNoticias.add(noticia5);
						
		String opcion = "";
		int eleccion = 0;
		
		do {
			
			opcion = JOptionPane.showInputDialog("Elige una opcion:\n\n"
					+ "\t1)-Introducir redactor\n"
					+ "\t2)-Eliminar Redactor\n"
					+ "\t3)-Introducir noticia a un redactor\n"
					+ "\t4)-Eliminar noticia a un redactor\n"
					+ "\t5)-Mostrar todas las noticias por redactor\n"
					+ "\t6)-Calcular puntuacion de la noticia\n"
					+ "\t7)-Calcular precio notícia\n"
					+ "\t0)-Salir.");
			
			eleccion = Integer.parseInt(opcion);
			
			switch(eleccion) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "Hasta Pronto!!");
				eleccion = 0;
				break;
				
			case 1:
				MetodosMenu.IntroducirRedactor(misRedactores);
				break;
				
			case 2:
				MetodosMenu.eliminarRedactor(misRedactores);
				break;
			
			case 3:
				MetodosMenu.IntroducirNoticiaAUnRedactor(misRedactores, misNoticias);
				break;
				
			case 4:
				MetodosMenu.eliminarNoticia(misRedactores,misNoticias);
				break;
			
			case 5:
				MetodosMenu.mostrarNoticiasPorRedactor(misRedactores);
				break;
				
			case 6:
				MetodosMenu.mostrarPuntuacionDeLaNoticia(misNoticias);
				break;
				
			case 7:
				MetodosMenu.mostrarPrecioNoticia(misNoticias);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no encontrada.");
			
			}
			
			
		}while(!(eleccion < 1 || eleccion > 7));
		
	
		System.out.println("FIN DEL PROGRAMA");
	}
	
}
