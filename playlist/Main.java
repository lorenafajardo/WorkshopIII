package playlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Menu menu = new Menu();
	static List<Song> library = new ArrayList<Song>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Operations operations = new Operations();
		int option = 0;
		do {
			menu.mostrar();
			option = sc.nextInt();

			switch (option) {

			case 1:
				operations.addSong();
				break;

			case 2:
				operations.playlistCreate();
				break;
			}
			
		} while (option != 5);

	}

}
