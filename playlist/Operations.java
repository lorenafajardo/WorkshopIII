
/**
 * @author LORENA FAJARDO y DANIELA MONTANO 
 * 
 * Clase: Operations. En está clase se encuetran los métodos a implementar en el main,
 * segun las diferentes opciones del menú
 */

package playlist;

/**
 * Importación de librerias 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Operations {
	
	/**
	 * Instacia de clases
	 */
	Scanner sc = new Scanner(System.in);
	static Library library1 = new Library();
	static List<Song> library = library1.addSong();
	
	/**
	 * Método para mostrar libreria de canciones, mediante ciclo For
	 */
	public void showLibrary() {

		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}

	}
	
	/**
	 * Método para crear playlist, mediante ciclo For
	 */
	public List<Song> playlistCreate() {

		List<Song> playList = new ArrayList<Song>();
		System.out.println("Cuantas canciones desea ingresar: ");
		int songsNumber = sc.nextInt();
		sc.nextLine();

		for (int j = 1; j <= songsNumber; j++) {

			System.out.println("Escriba el nombre de la canción");
			String tittleSong = sc.nextLine();

			for (int k = 0; k < library.size(); k++) {
				if (library.get(k).getTitle().equals(tittleSong)) {
					playList.add(library.get(k));

				}
			}
		}
		for (int i = 0; i < playList.size(); i++) {
			System.out.println(playList.get(i));

		}
		return playList;
	}
	
	/**
	 * Método para filtrar libreria de canciones, con opción para filtrar por genero o por año, mediante ciclo for
	 */

	public void filter() {

		int filterOption = sc.nextInt();
		sc.nextLine();

		if (filterOption == 1) {
			System.out.println("Escriba el genero que desea buscar");
			String generFind = sc.nextLine();

			for (int k = 0; k < library.size(); k++) {

				if (library.get(k).getGender().equals(generFind)) {
					System.out.println(library.get(k));
				}
			}

		} else if (filterOption == 2) {

		} else {
			System.out.println("Opción incorrecta");
		}
	}

	/**
	 * Método para ordenar libreria de canciones, con opción de ordenar por fecha y por duracion de las canciones, utilizado mediante la
	 * sobreescritura del método compare.
	 */
	public void order() {

		int optionOrder = sc.nextInt();
		sc.nextLine();

		if (optionOrder == 1) {

			Collections.sort(library, new Comparator<Song>() {

				@Override
				public int compare(Song s1, Song s2) {
					return s1.getDate().compareTo(s2.getDate());
				}
			});

			for (Song s : library) {
				System.out.println(s);
			}
		} else if (optionOrder == 2) {

			Collections.sort(library, new Comparator<Song>() {

				@Override
				public int compare(Song s1, Song s2) {

					if (s1.getTime() > s2.getTime()) {
						return 1;
					} else if (s1.getTime() < s2.getTime()) {
						return -1;
					} else {
						return 0;
					}
				}

			});

			for (Song s : library) {
				System.out.println(s);
			}

		} else {
			System.out.println("Opción invalida");
		}
	}

}
