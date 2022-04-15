package playlist.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import playlist.Menu;
import playlist.Operations;
import playlist.Song;

public class Main {

	static Menu menu = new Menu();
	static List<Song> library = new ArrayList<Song>();
	static LocalDate hoy = LocalDate.parse("");
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Operations operations = new Operations();
		int option = 0;
		do {
			menu.mostrar();
			option = sc.nextInt();

			switch (option) {

			case 1:
				operations.showLibrary();
				break;

			case 2:
				operations.playlistCreate();
				break;
			
			case 3:
				menu.filterShow();
				operations.filter();
				break;
			
			case 4:
				menu.orderShow();
				operations.order();
				break;
			}

		} while (option != 5);
		hoy.getYear();
	
	}

    

}
