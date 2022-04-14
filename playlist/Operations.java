package playlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {

	static Scanner sc = new Scanner(System.in);
	static List<Song> library = new ArrayList<Song>();

	public List<Song> addSong() {

		LocalDate hoy = LocalDate.parse("2020-07-06");

		Song song1 = new Song("La Herida", 1, hoy, 5, "Rock", "Album1", "Simpre la misma funcion el mismo espectador.");
		library.add(song1);
		hoy = LocalDate.parse("2021-08-01");
		Song song2 = new Song("Me Rehuso", 2, hoy, 3, "Regaeton", "Album2", "Me rehuso a darte el ultimo beso");
		library.add(song2);

		hoy = LocalDate.parse("2021-10-02");
		Song song3 = new Song("Lady Blue", 3, hoy, 2, "Rock", "Album3",
				"Sin control y si direccion la luz se fue a donde voy");
		library.add(song3);

		hoy = LocalDate.parse("2018-11-05");
		Song song4 = new Song("Una vez", 4, hoy, 2, "Regaeton", "Album Ultimo Tour",
				"Con cara de niña buena pero bellaquita");
		library.add(song4);

		hoy = LocalDate.parse("2017-12-05");
		Song song5 = new Song("Nada", 5, hoy, 6, "Rock", "Album Zoe", "Nada que no pueda hacer");
		library.add(song5);

		hoy = LocalDate.parse("2011-01-02");
		Song song6 = new Song("Gasolina", 6, hoy, 2, "Regaeton", "Album Daddy", "Dame mas gasolina");
		library.add(song6);

		hoy = LocalDate.parse("2017-12-05");
		Song song7 = new Song("Sorry", 7, hoy, 9, "Pop", "Album Justin Bieber", "Sorry");
		library.add(song7);

		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}
		return library;
	}

	public ArrayList<Song> playlistCreate() {

		ArrayList<Song> playList = new ArrayList<Song>();
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
			
		}return playList;
	}
}
