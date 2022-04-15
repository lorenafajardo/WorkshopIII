package playlist.app;

/**
 * @author Daniela Y Lorena 
 * 
 * La clase Main es el controlador del programa, aqui invocamos todos los metos implementados en la clase Operaciones 
 * y nuestro Menu de opciones.
 */

import java.util.Scanner;
import playlist.Menu;
import playlist.Operations;
import playlist.Song;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Operations operations = new Operations();
		int option = 0;
		do {
			menu.mostrar(); // Inicialmente se muestra el menu de opciones.
			option = sc.nextInt();

			switch (option) {

			case 1:
				operations.showLibrary(); // Mostramos el playList completo de la clase Library
				break;

			case 2:
				operations.playlistCreate(); // Se muestra el playlist añadido por el usuario
				break;

			case 3:
				menu.filterShow(); // Filtramos canciones por genero y año
				operations.filter();
				break;

			case 4:
				menu.orderShow(); // Ordenamos canciones por facha y duracion
				operations.order();
				break;
			}

		} while (option != 5);
		System.out.println("El programa ha finalizado");
	}

}

