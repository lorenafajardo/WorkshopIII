package playlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {

	public List<Song> addSong() {

		List<Song> library = new ArrayList<Song>();

		LocalDate hoy = LocalDate.parse("2020-07-06");

		Song song1 = new Song("La Herida", 1, hoy, 5, "Rock", "Album1", "Simpre la misma funcion el mismo espectador.");
		library.add(song1);
		hoy = LocalDate.parse("2021");
		Song song2 = new Song("Me Rehuso", 2, hoy, 3, "Regaeton", "Album2", "Me rehuso a darte el ultimo beso");
		library.add(song2);

		hoy = LocalDate.parse("2021");
		Song song3 = new Song("Lady Blue", 3, hoy, 2, "Rock", "Album3",
				"Sin control y si direccion la luz se fue a donde voy");
		library.add(song3);

		hoy = LocalDate.parse("2018");
		Song song4 = new Song("Una vez", 4, hoy, 2, "Regaeton", "Album Ultimo Tour",
				"Con cara de niña buena pero bellaquita");
		library.add(song4);

		hoy = LocalDate.parse("2017");
		Song song5 = new Song("Nada", 5, hoy, 6, "Rock", "Album Zoe", "Nada que no pueda hacer");
		library.add(song5);

		hoy = LocalDate.parse("2021");
		Song song6 = new Song("Gasolina", 6, hoy, 2, "Regaeton", "Album Daddy", "Dame mas gasolina");
		library.add(song6);

		hoy = LocalDate.parse("2017");
		Song song7 = new Song("Sorry", 7, hoy, 9, "Pop", "Album Justin Bieber", "Sorry");
		library.add(song7);

		return library;
	}

}
