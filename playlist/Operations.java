package playlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {

	Scanner sc = new Scanner(System.in);
	static Library library1 = new Library();
	static List<Song> library = library1.addSong();
	public void showLibrary() {

		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}

	}

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
}
